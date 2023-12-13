package com.callor.student.service.impl;

import com.callor.student.models.MenuIndex;
import com.callor.student.utils.Line;

public class StartServiceImplV2 extends StartServiceImplV1 {
	public StartServiceImplV2() {
		// scan = new Scanner(System.in);
		// V1 의 생성자를 호출하여 V1 생성자에 있는
		// 코드를 그대로 실행하겠다
		super();
	}
	
	@Override
	public void mainMenu() {
		Line.dLine(50);
		System.out.println("한울 고교 학생정보 관리");
		Line.dLine(50);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(50);
		for(MenuIndex menu : MenuIndex.values()) {
			String item = menu.toString();
			item = item.replace("_", " ");
			System.out.printf("%d. %s\n",menu.getIndex(), item);
		}
		System.out.println("QUIT. 종료");
		Line.sLine(50);
	} // end mainMenu()
	
	
	@Override
	public Integer selectMenu() {
		Integer selectMenu = 0;
		while(true) {
			this.mainMenu();
			System.out.print("업무 선택 >> ");
			String str = scan.nextLine();
			if(str.equals("QUIT")) return null;
			
			try {
				selectMenu = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("업무선택은 정수값을 입력하세요");
				continue;
			}
			if(selectMenu < 1 
					|| selectMenu > MenuIndex.values().length) {
				System.out.printf("업무 선택은 1 ~ %d 범위의 값입니다\n",
						MenuIndex.values().length );
				continue;
			}
			return selectMenu;
		}
	} // end selectMenu
	
	@Override
	public void startApp() {
		while(true) {
			Integer selectMenu = this.selectMenu();
			if(selectMenu == null) break;
			else if(selectMenu == 1) {
				System.out.println("학생정보 입력");
			} else if(selectMenu == 2) {
				System.out.println("학생정보 조회");
			} else if(selectMenu == 3) {
				System.out.println("학생정보 가져오기");
			} else if(selectMenu == 4) {
				System.out.println("학생정보 출력");
			}
		}
		System.out.println("업무종료~!!");
		
	}
	
}
