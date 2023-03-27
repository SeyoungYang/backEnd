package chap04.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import chap04.exception.MemberNotFoundException;

public class MemberInfoPrinter {
	
	@Autowired
	private MemberDao memberDao;
	

	
	@Autowired
	
//	=> 기본
//	private MemberPrinter memberPrinter;
	
//	=> 빈 이름으로 식별
//  private MemberPrinter memberPrinter1;
	
//	한정자를 필드의 이름으로 사용할 수 없다!
//	private MemberPrinter printerQ;
	
//	=> 한정자 사용	
//	@Qualifier("printerQ")
//	private MemberPrinter memberPrinter;
    
//	=> 한정자를 이용한 부모클래스(MemberPrinter) 빈 적용
	@Qualifier("printerP")
	private MemberPrinter memberPrinter;
	
	
	
	
    public MemberInfoPrinter() {
    	
    }
    
//    public void setMemberDao(MemberDao memberDao) {
//    	this.memberDao = memberDao;    	
//    }
//    
//    public void setMemberPrinter(MemberPrinter printer) {
//    	this.printer = printer;    	
//    }
    
    public void printMemberInfo(String email) {
    	Member member = this.memberDao.selectByEmail(email);
    	
    	if(member == null) {
    		throw new MemberNotFoundException();
    	}
    	
    	this.memberPrinter.print(member);
//    	this.memberPrinter1.print(member);
		System.out.println();
    
    	
    }

}
