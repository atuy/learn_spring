package kr.ac.pcu.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.pcu.admin.dao.MemberMapper;
import kr.ac.pcu.admin.web.Member;

@Service
public class AdminMemberServiceImpl  implements AdminMemberService {

	// DAO 객체 를 사용하시면 됩니다.
	@Autowired
	private MemberMapper memberMapper ;
	
	@Override
	public List<Member> getMemberList() throws Exception {
		List<Member> list = memberMapper.selectMemberList();
		return list;
		// return memberMapper.selectMemberList();
	}

	@Override
	public Member getMember(String id) throws Exception {
		Member member = memberMapper.selectMember(id);
		return member;
	}

	@Override
	public boolean registMember(Member member) throws Exception {
		// 이미 등록된 회원인 경우에 대한 체크
		// 만약 있다면 ?? false 리턴할 건지 아니면 예외를 던질건지..
		
		int ret = memberMapper.insertMember(member);
		// 등록(insert)했는데.. 영향받은 행수가 0이면 ?? 
		return (ret > 0 ? true : false );
	}

	@Override
	public boolean modifyMember(Member member) throws Exception {
		int ret = memberMapper.updateMember(member);
		// 수정(update)했는데.. 영향받은 행수가 0이면 ?? 
		return (ret > 0 ? true : false );
	}

	@Override
	public Member getLoginCheck(Member member) throws Exception {
		Member r = memberMapper.selectMemberLogin(member);
		return r;
	}
	
}
