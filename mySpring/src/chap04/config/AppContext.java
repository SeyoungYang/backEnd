package chap04.config;

import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chap04.model.*;

@Configuration
public class AppContext {
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		//return new MemberRegisterService(this.memberDao());
		return new MemberRegisterService();
	}

	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService();
//		pwdSvc.setMemberDao(this.memberDao());
		
		return pwdSvc;
	}
	

	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}


/*	@Bean 빈 이름으로 식별
	public MemberPrinter memberPrinter1() {
		return new MemberPrinter();
	}
	
	@Bean
	public MemberPrinter memberPrinter2() {
		return new MemberPrinter();
	}
*/
	
/* 
	// => 한정자 사용	
	@Bean
	@Qualifier("printerQ")
	public MemberPrinter memberPrinter1() {
		return new MemberPrinter();
	}
*/
	
	@Bean
	@Qualifier("printerP")
	public MemberPrinter memberPrinter1() {
		return new MemberPrinter();
	}
	
	@Bean
	@Qualifier("printerC")
	public MemberSummaryPrinter memberPrinter2() {
		return new MemberSummaryPrinter();
	}
	
	@Bean
	public MemberListPrinter listPrinter() {
		//return new MemberListPrinter(memberDao(), memberPrinter());
		return new MemberListPrinter();
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
//		infoPrinter.setMemberDao(this.memberDao());
//		infoPrinter.setMemberPrinter(this.memberPrinter());
		
		return infoPrinter;
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);		
		
		return versionPrinter;
	}
	
//	@Bean
//	public DateTimeFormatter dateTimeFormatter() {
//		return DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
//	}
//	
}
