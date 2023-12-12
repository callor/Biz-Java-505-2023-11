package com.callor.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;

/*
 * 키보드를 통해서 학생정보를 입력받고
 * StudentDto 에 추가한 다음 
 * List<StudentDto> students 리스트에 추가하기
 */
public class StudentServiceV3A {

	// 클래스 영역에 선언된 변수(객체)들
	// 인스턴스 변수, 맴버변수
	// 클래스 영역에 선언된 변수나 객체는 private 으로 선언한다
	// 다만 이 클래스를 누군가 상속하여 사용할 것으로 예상되면
	// protected 로 선언한다
	private Scanner scan = null;
	private List<StudentDto> students = null;

	// 클래스 영역에 선언된 변수는 생성자 method 에서
	// 값을 초기화 하여 사용할 준비를 한다
	public StudentServiceV3A() {
		scan = new Scanner(System.in);
		students = new ArrayList<StudentDto>();
	}

	private String itemInput(String title) {
		while (true) {
			System.out.print(title + " 입력(QUIT:종료) >> ");
			String inputStr = scan.nextLine();

			// 아무런 값도 입력하지 않고 Enter 누르기 금지
			if (inputStr.isBlank()) {
				System.out.printf("*** %s 값은 반드시 입력!!", title);
				continue;
			}

			// 키보드로 QUIT 를 입력하면?
			if (inputStr.equals("QUIT")) {
				return null;
			}
			return inputStr;
		}

	}

	// 한 학생의 정보를 입력받는 method
	public boolean inputStudent() {

		StudentDto stdDto = new StudentDto();
		while (true) {
			stdDto.num = this.itemInput("학번");
			if (stdDto.num == null)
				return false;

			for (StudentDto dto : students) {
				if (dto.num.equals(stdDto.num)) {
					System.out.println("*** 학번 중복");
					continue;
				}
			}
			break;
		}

		stdDto.name = this.itemInput("이름");
		if (stdDto.name == null)
			return false;

		stdDto.dept = this.itemInput("학과");
		if (stdDto.dept == null)
			return false;

		stdDto.grade = this.itemInput("학년");
		if (stdDto.grade == null)
			return false;

		stdDto.tel = this.itemInput("전화번호");
		if (stdDto.tel == null)
			return false;

		stdDto.addr = this.itemInput("주소");
		if (stdDto.addr == null)
			return false;

		students.add(stdDto);
		return true;

	} // end inputStudent()

	public void inputStudents() {
		while (true) {
			boolean bYes = this.inputStudent();
			// if(bYes == false) {
			// if(bYes != true ) {
			if (!bYes) {
				break;
			}
		}
		System.out.println("업무 종료@@");
	}

}
