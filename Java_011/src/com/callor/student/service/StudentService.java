package com.callor.student.service;

import java.util.Scanner;

import com.callor.student.models.StudentDto;

public class StudentService {
	
	private Scanner scan = null;
	public StudentService() {
		scan = new Scanner(System.in);
	}
	
	public void inputStudent() {
		
		System.out.print("학번을 입력하세요");
		String stdNum = scan.nextLine();
		
		System.out.println("이름을 입력하세요");
		String stdName = scan.nextLine();
	
		System.out.println("학과를 입력하세요");
		String stdDept = scan.nextLine();

		System.out.println("학년을 입력하세요");
		String stdGrade = scan.nextLine();

		System.out.println("전화번호를 입력하세요");
		String stdTel = scan.nextLine();

		System.out.println("주소를 입력하세요");
		String stdAddr = scan.nextLine();
		
		StudentDto studentDto = new StudentDto();
		studentDto.num = stdNum;
		studentDto.name = stdName;
		studentDto.dept = stdDept;
		studentDto.grade = stdGrade;
		studentDto.tel = stdTel;
		studentDto.addr = stdAddr;
		
	}
	
	
	
	
	

}
