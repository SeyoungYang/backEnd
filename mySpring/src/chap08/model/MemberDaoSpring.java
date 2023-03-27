package chap08.model;

import java.util.*;
import java.sql.*;
import javax.sql.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import chap08.exception.MemberNotFoundException;

public class MemberDaoSpring extends MemberDao {

	
	private JdbcTemplate jdbcTemplate;
	private String sql;
	
	public MemberDaoSpring(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
	}
	/*
	1. RowMapper 인터페이스를 익명클래스로 구현하는 방법
	@Override
	public Member selectByEmail(String email) {
		this.sql = "select * from member where email = ?";
		
		List<Member> results = jdbcTemplate.query(this.sql,
					new RowMapper<Member>(){
						public Member mapRow(ResultSet rs, int rowNum) throws SQLException{
							Member member = new Member();
							member.setId(rs.getLong("id"));
							member.setEmail(rs.getString("email"));
							member.setPassword(rs.getString("password"));
							member.setName(rs.getString("name"));
							member.setRegisterDateTime(rs.getTimestamp("regdate").toLocalDateTime());
							return member;
							}
					},email);
		
		return results.isEmpty() ? null : results.get(0);
	}
	*/
	

	/*
//	 2. RowMapper 인터페이스를 람다 표현식(Lambda Expression)으로 구현하는 방법 
//	1,2 방식은 재사용이 안되는 단점이 있음
	@Override
	public Member selectByEmail(String email) {
		this.sql = "select * from member where email = ?";
		
		List<Member> results = jdbcTemplate.query(this.sql,
					(ResultSet rs, int rowNum) -> {
						Member member = new Member();
						member.setId(rs.getLong("id"));
						member.setEmail(rs.getString("email"));
						member.setPassword(rs.getString("password"));
						member.setName(rs.getString("name"));
						member.setRegisterDateTime(rs.getTimestamp("regdate").toLocalDateTime());
						
						return member;
					},email);
		
		return results.isEmpty() ? null : results.get(0);
	}
	*/
	
//	 3. RowMapper 인터페이스를 직접 구현하는 MemberRowMapper 클래스를 생성하여 구현하는 방법
//	@Override
//	public Member selectByEmail(String email) {
//		this.sql = "select * from member where email = ?";
//		List<Member> results = jdbcTemplate.query(this.sql,new MemberRowMapper(),email);
//		
//		return results.isEmpty() ? null : results.get(0);
//	}
	
	@Override
	public Member selectByEmail(String email) {
		this.sql = "select * from member where email = ?";
		Member member = null;
		try {
			member = jdbcTemplate.queryForObject(this.sql,new MemberRowMapper(),email);
		}
		catch(EmptyResultDataAccessException e) {
			//throw new MemberNotFoundException();
		}
		
		return member;
	}
	
	/* 1. PreparedStatementCreator 인터페이스 익명클래스로 구현(keyHolder 사용x)
	@Override
	public void insert(Member member) {
		this.sql = "insert into member (id, email, password, name) values (member_id_seq.nextval, ?, ?, ?)";
		
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement pstmt = conn.prepareStatement(sql);	
				pstmt.setString(1, member.getEmail());
				pstmt.setString(2, member.getPassword());
				pstmt.setString(3, member.getName());
					
				return pstmt;
			}
		});
	} 
	  
	 */
	
	/* 1. PreparedStatementCreator 인터페이스 익명클래스로 구현(keyHolder 사용)
	@Override
	public void insert(Member member) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		this.sql = "insert into member (id, email, password, name) values (member_id_seq.nextval, ?, ?, ?)";
		
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"ID"});	
				pstmt.setString(1, member.getEmail());
				pstmt.setString(2, member.getPassword());
				pstmt.setString(3, member.getName());
					
				return pstmt;
			}
		},keyHolder);
		
		Number keyValue = keyHolder.getKey();
		member.setId(keyValue.longValue());
	}
	*/
	
	/*
	  	PreparedStatementCreator를 구현한 MemberPreparedStatementCreator클래스를 이용함(KeyHolder 사용X)
		@Override
		public void insert(Member member) {				
			jdbcTemplate.update(new MemberPreparedStatementCreator(member));
		}
	*/
	
	
//	//PreparedStatementCreator를 구현한 MemberPreparedStatementCreator클래스를 이용함(KeyHolder 사용)
	@Override
	public void insert(Member member) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
				
		jdbcTemplate.update(new MemberPreparedStatementCreator(member,new String[] {"ID"}),keyHolder);
		
		Number keyValue = keyHolder.getKey();
		member.setId(keyValue.longValue());
	}
		
	@Override
	public void update(Member member) {
		this.sql = "update member set password = ? where email = ?";
		
		jdbcTemplate.update(sql,member.getPassword(),member.getEmail());
	}
	
	/*
	1. RowMapper 인터페이스를 익명클래스로 구현하는 방법
	@Override
	public List<Member> selectAll() {
		this.sql = "select * from member order by id";
		
		List<Member> results = jdbcTemplate.query(this.sql,
				new RowMapper<Member>(){
					public Member mapRow(ResultSet rs, int rowNum) throws SQLException{
							Member member = new Member();
							member.setId(rs.getLong("id"));
							member.setEmail(rs.getString("email"));
							member.setPassword(rs.getString("password"));
							member.setName(rs.getString("name"));
							member.setRegisterDateTime(rs.getTimestamp("regdate").toLocalDateTime());				
					return member;
				}
			});
		return results;
	}
	*/
	
//	 3. RowMapper 인터페이스를 직접 구현하는 MemberRowMapper 클래스를 생성하여 구현하는 방법
	@Override
	public Collection<Member> selectAll() {
		this.sql = "select * from member order by id";
		List<Member> results = jdbcTemplate.query(this.sql,new MemberRowMapper());
			
		return results;
	}
	
	
	
	
}

















