package com.day_0414.library.member.controller;

import java.util.ArrayList;
import com.day_0414.library.member.model.Member;
import com.day_0414.library.member.model.dao.MemberDao;
import com.day_0414.library.member.view.MemberView;



//사용자로부터의 입력에 대한 응답으로 모델 및/또는 뷰를 업데이트하는 로직을 포함
public class MemberController {
	MemberView view;
	MemberDao dao;

	public MemberController() {
		
		view = new MemberView();
		dao = new MemberDao();

	}

	public void main() {
		while(true) {
			int sel = view.showMemberMenu();
			switch(sel) {
			case 0:
				dao.close();
				return;

			  case 1:
                  // 회원전체조회
                  printAllUser();
                  break;
              case 2:
                  // 회원가입
            	  registerMember();
                  break;
              case 3:
                  // 회원 정보 변경
                  updateMember();
                  break;
              case 4:
                  // 회원 탈퇴
                  deleteMember();
                  break;
                  
          }
          //close
		}
	}

	private void deleteMember() {
		int member = view.selectOneMember();

		if (dao.deleteMember(member) == 0) {
			System.out.println("삭제가 완료되었습니다.");
		} else {
			System.out.println("삭제에 실패했습니다.");
		}
	}

	private void updateMember() {
		int MEMBER_NO = view.selectOneMember();
		// 번호 찾기
		Member member = dao.selectOneMember(MEMBER_NO);
		Member updateMember = view.updateMember(member);
		// 회원정보변경
		dao.updateMember(updateMember, MEMBER_NO);

	}

	private void registerMember() {
		Member member = view.registerMember();
		dao.registerMember(member);
	}

	private void printAllUser() {
		ArrayList<Member> list = dao.seletAllMember();
		if (list.size() == 0) {
			System.out.println("회원이 없음");
			// 회원이 한명도 없는경우
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getMEMBER_NO() + " " + list.get(i).getNAME() + " "
						+ list.get(i).getADDRESS() + " " + list.get(i).getPHONE_NUMBER() + " " + list.get(i).getBIRTH()
						+ " " + list.get(i).getJOIN_DATE());
			}
		}
		list.clear();
	}

}
