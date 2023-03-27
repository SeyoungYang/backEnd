package ojdbc;

import java.sql.*;
import java.util.ArrayList;

public class SelectTestV2 {
		Connection conn;
		Statement stmt;
		PreparedStatement pstmt;
		ResultSet rs;
		String sql;
		
		public SelectTestV2() {
			String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
			String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "scott";
			String pwd = "tiger";
			
			try {
				Class.forName(jdbc_driver);
				this.conn = DriverManager.getConnection(jdbc_url, user, pwd);
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public ArrayList<JdbcTest> staticSelect() {
			this.sql = "select * from jdbc_test";
			ArrayList<JdbcTest> rows = new ArrayList<JdbcTest>();
			
			try {
				this.stmt = conn.createStatement();
				this.rs = this.stmt.executeQuery(sql);
				//사용자 이름이 고유하다고 가정!
				while(this.rs.next()) {
					rows.add(new JdbcTest(rs.getString("username"),rs.getString("email")));
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(!this.stmt.isClosed()) {
						this.stmt.close();
					}
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return rows;
			
		}
		
		public JdbcTest dynamicSelect(String username) {
			this.sql = "select * from jdbc_test where username = ?";
			JdbcTest jdbcTest = null;
			
			try {
				this.pstmt = conn.prepareStatement(sql);
				this.pstmt.setString(1, username);
		
				this.rs = this.pstmt.executeQuery();
				//사용자 이름이 고유하다고 가정!
				if(this.rs.next()) {
					jdbcTest = new JdbcTest(this.rs.getString("username"), this.rs.getString("email"));
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(!this.pstmt.isClosed()) {
						this.pstmt.close();
					}
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return jdbcTest;
			
		}
				
		
		public void closeConnection() {
			try {
				if(!this.conn.isClosed()) {
					this.conn.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}

	public static void main(String[] args) {
		SelectTestV2 st = new SelectTestV2();
		JdbcTest jdbcTest = st.dynamicSelect("양세영");
		ArrayList<JdbcTest> rows = st.staticSelect();
		
		System.out.println(jdbcTest.getUsername() + "\t"+ jdbcTest.getEmail());
		
		for(JdbcTest i : rows) {
			System.out.println(i.getUsername()+"\t"+ i.getEmail());
		}	
		
		//st.staticSelect();
		st.closeConnection();

	}

}
