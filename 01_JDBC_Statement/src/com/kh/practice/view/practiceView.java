package com.kh.practice.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.controller.PracticeController;
import com.kh.practice.model.vo.PracticeVO;

public class PracticeView {
	private Scanner sc = new Scanner(System.in);
	private PracticeController pc = new PracticeController();
	
	public void mainView() {
		while(true) {
			System.out.println(" ==== 나만의 테이블 ==== ");
			System.out.println("1. 정보 추가");
			System.out.println("2. 전체 조회");
			System.out.println("3. 가수명으로 조회");
			System.out.println("4. 이름 키워드로 조회");
			System.out.println("5. 가수 정보 변경");
			System.out.println("6. 가수 정보 삭제");
			System.out.println("9. 프로그램 종료");
			System.out.println("원하시는 번호를 입력해주세요 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : insert(); break;
			case 2 : findAll(); break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 6 : break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}
			
	}
		
	private void insert() {
		System.out.println("\n회원 추가하기 입니다");
		System.out.println("가수 이름을 입력해주세요");
		String singerName = sc.nextLine();
		System.out.println("가수 주요곡을 입력해주세요.");
		String singerMajor = sc.nextLine();
		System.out.println("가수 데뷔일을 입력해주세요.");
		String singerDate = sc.nextLine();
		System.out.println("가수 소속사를 입력해주세요.");
		String singerAgency = sc.nextLine();
		
		int result = pc.insert(singerName, singerMajor, singerDate, singerAgency);
		
		if (result > 0) {
			System.out.println("성공적으로 입력되었습니다.");
		} else {
			System.out.println("입력을 실패하였습니다.");
		}	
	}
	
	private void findAll() {
		System.out.println("\n전체 조회하기 입니다.");
		
		List<PracticeVO> pv = pc.findAll();
		
	}
}
