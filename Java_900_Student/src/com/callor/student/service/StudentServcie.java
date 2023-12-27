package com.callor.student.service;

import com.callor.student.model.StudentDto;

/*
 * 구현한 기능
* 1. 파일에서 학생정보를 Read 하여 메모리에 저장하기
* 2. 키보드를 통하여 학생이름 입력받기
* 3. 입력받은 학생이름을 학생리스트에서 검색하기
* 4. 검색된 학생정보를 화면에 보여주기
 */
public interface StudentServcie {

	public void loadStudent();
	public void inputStudent();
	
	// 학생이름을 매개변수로 전달받아 학생정보 검색하기
	// 검색된 학생정보를 Dto에 담아 return 하기
	public StudentDto searchStudent(String name);
	
	// 학생정보를 매개변수로 전달받아 화면에 출력하기
	public void printStudent(StudentDto stdDto);
	
}
