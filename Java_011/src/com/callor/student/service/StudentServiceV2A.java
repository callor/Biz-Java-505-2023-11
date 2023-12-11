package com.callor.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;

public class StudentServiceV2A {
	
	// 배열의 index 를 위한 변수 선언
	private int 학번 = 0;
	private int 이름 = 1;
	private int 학과 = 2;
	private int 학년 = 3;
	private int 전화번호 = 4;
	private int 주소 = 5;
	
	private Scanner scan = null;
	
	// 각 입력항목의 prompt 에 보여줄 제목을 담을 문자열 배열 선언
	private String[] stdTitle = null;
	
	private List<StudentDto> students = null;
	
	public StudentServiceV2A() {
		scan = new Scanner(System.in);
		
		// 각 입력항목의 제목을 배열로 생성하기
		stdTitle = new String[]{"학번","이름","학과","학년","전화번호","주소"};
		students = new ArrayList<StudentDto>();
	}
	
	public boolean inputStudent() {
		
		// 키보드로 입력한 문자열(각 요소의 값)을 저장할 배열
		// stdTitle 배열의 개수와 동일한 개수의 inputStr 배열을 생성
		String[] inputStr = new String[stdTitle.length];
		
		// for() 반복문을 이용하여 입력 받기를 코드 줄이기
		for(int index = 0 ; index < stdTitle.length ; index++) {
			System.out.print(stdTitle[index] + " 입력(QUIT:종료) >> ");
			// inputStr[index] = scan.nextLine();
			String str = scan.nextLine();
			if(str.equals("QUIT")) {
				return false;
			}
			inputStr[index] = str;
		}
		
		StudentDto stDto = new StudentDto();
		stDto.num = inputStr[학번];
		stDto.name = inputStr[이름];
		stDto.dept = inputStr[학과];
		stDto.grade = inputStr[학년];
		stDto.tel = inputStr[전화번호];
		stDto.addr = inputStr[주소];
		students.add(stDto);
		
		return true;
		
	} // end inputStudent()
	
	public void inputStudents() {
		boolean result = true;
		while(result) {
			result = inputStudent();
		}
		System.out.println("입력 종료 퇴근하자!!!");
	}
	
	

}
