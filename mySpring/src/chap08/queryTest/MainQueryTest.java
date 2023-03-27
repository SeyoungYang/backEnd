package chap08.queryTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainQueryTest {
	
	private static AnnotationConfigApplicationContext context;
	
	static {
		context = new AnnotationConfigApplicationContext(AppContext.class);
	}
	
	public static void main(String[] args) {
		MemberCountBean mc = context.getBean("memberCount",MemberCountBean.class);
		System.out.println("전체 회원 수 :" + mc.getMemberCount());
	}

}
