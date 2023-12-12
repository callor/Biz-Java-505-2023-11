package com.callor.student.service;

import com.callor.student.utils.Line;

public class StartServiceA {
	
	public void mainMenu() {
		Line.dLine(50);
		System.out.println("한울 고교 학사관리");
		Line.dLine(50);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(50);
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 조회");
		System.out.println("3. 학생정보 출력");
		System.out.println("QUIT. 업무종료");
		Line.sLine(50);
	}

}
