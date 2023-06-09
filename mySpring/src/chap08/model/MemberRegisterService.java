package chap08.model;

import java.time.LocalDateTime;

import chap08.exception.DuplicateMemberException;
import chap08.exception.MemberNotFoundException;

public class MemberRegisterService {
	
	private MemberDao memberDao;
	
	public MemberRegisterService() {
		
	}
	
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public long regist(RegisterRequest req) {
		
		Member member = memberDao.selectByEmail(req.getEmail());
		
		if(member != null) {
			throw new DuplicateMemberException();
		}
		
		member = new Member(req.getEmail(), req.getPassword(), req.getName(), LocalDateTime.now());
		memberDao.insert(member);
		
		return member.getId();
	}

}
