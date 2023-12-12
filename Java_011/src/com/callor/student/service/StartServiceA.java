package com.callor.student.service;

import java.util.Scanner;

import com.callor.student.utils.Line;

public class StartServiceA {
	
	private StudentServiceV3A stService = null;
	private String[] menuItems = null; 
	private Scanner scan = null;
	
	public StartServiceA() {
		scan = new Scanner(System.in);
		menuItems = new String[] {
				"1. 학생정보 입력",
				"2. 학생정보 가져오기",
				"3. 학생정보 조회",
				"4. 학생정보 출력",
		};
		stService = new StudentServiceV3A();
	}
	
	public void mainMenu() {
		Line.dLine(50);
		System.out.println("한울 고교 학사관리");
		Line.dLine(50);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(50);
		
		// System.out.println("1. 학생정보 입력");
		// System.out.println("2. 학생정보 조회");
		// System.out.println("3. 학생정보 출력");
		for(String item : menuItems) {
			System.out.println(item);
		}
		
		System.out.println("QUIT. 업무종료");
		Line.sLine(50);
	} // end mainMenu()

	public int selectMenu() {
		while(true) {
			this.mainMenu();
			System.out.print("업무선택 >> ");
			String strMenuId = scan.nextLine();
			if(strMenuId.equals("QUIT")) return -1;
			
			int intMenuId = 0;
			try {
				intMenuId = Integer.valueOf(strMenuId);
			} catch (Exception e) {
				System.out.println("정수를 입력해 주세요");
				continue;
			}
			if(intMenuId < 1 || intMenuId > menuItems.length) {
				System.out.printf("업무 선택은 1 ~ %d까지 입니다\n",
						menuItems.length);
				continue;
			}
			//  여기에 코드가 다다르면
			// 정상적으로 업무를 선택 했다는 것
			return intMenuId;
		}
	} // end selectMenu()
	
	public void startApp() {
		
		while(true) {
			int menuId = this.selectMenu();
			if(menuId == -1) {
				break;
			} else if(menuId == 1) { // 학생정보 입력
				stService.inputStudents();
			} else if(menuId == 2) {
				stService.loadStudent();
			} else if(menuId == 4) { // 학생정보 출력 
				stService.printStudent();
			}
		}
	}
	
	
	
}
