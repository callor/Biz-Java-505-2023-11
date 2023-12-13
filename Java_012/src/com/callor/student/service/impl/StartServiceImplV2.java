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
			System.out.printf("%d. %s\n",menu.getIndex(), menu);
		}
		System.out.println("QUIT. 종료");
	}
}
