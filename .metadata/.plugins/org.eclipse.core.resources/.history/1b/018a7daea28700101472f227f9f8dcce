package com.kh.practice.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.controller.practiceController;
import com.kh.practice.model.vo.practiceVo;

public class practiceView {
	private Scanner sc = new Scanner(System.in);
	private practiceController pc = new practiceController();
	
	public void mainView() {
		while(true) {
			System.out.println("==== 나만의 테이블 메뉴입니다. ====");
			System.out.println("1. 테이블 조회하기");
			System.out.println("9. 프로그램 종료하기");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : findAll(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("없는 번호입니다.");
			}
			
		}
		
	}
	
	public void findAll() {
		System.out.println();
		System.out.println("테이블 전체조회");
		
		List<practiceVo> singer = pc.findAll();
		
	}
}
