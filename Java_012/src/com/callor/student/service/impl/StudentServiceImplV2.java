package com.callor.student.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.callor.student.models.StdIndex;
import com.callor.student.models.StudentDto;

public class StudentServiceImplV2 extends StudentServiceImplV1 {

	protected String stDataFile = null;
	
	public StudentServiceImplV2() {
		// 두번째 생성자에게 파일의 정보를 전달하는 실행
		this("src/com/callor/student/data/student.txt");
	}
	public StudentServiceImplV2(String stDataFile) {
		// V1 의 생성자를 호출하여 키보드 scan 을 사용할수 있도록 준비
		super();
		this.stDataFile = stDataFile;
	}
	
	@Override
	public void loadStudent() {
		// 파일을 읽기 위한 준비를 하는 곳
		Scanner fileScan = null;
		InputStream is = null;
		try {
			is = new FileInputStream(stDataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileScan = new Scanner(is);
		
		// 파일에서 데이터를 읽어서 계속해서 add() 실행하면
		// 데이터가 계속 쌓이는 현상이 발생한다
		// load 를 할때는 기존의 list 를 새로 생성해서 초기화 해야 한다
		students = new ArrayList<StudentDto>();
		
		// student.txt 파일에서 학생정보 읽어 오기
		while(fileScan.hasNext()) {
			String line = fileScan.nextLine();
			String[] student = line.split(",");
			
			StudentDto stdDto = new StudentDto();
			stdDto.num = student[StdIndex.학번.getIndex()];
			stdDto.name = student[StdIndex.이름.getIndex()];
			stdDto.dept = student[StdIndex.학과.getIndex()];
			stdDto.grade = student[StdIndex.학년.getIndex()];
			stdDto.tel = student[StdIndex.전화번호.getIndex()];
			stdDto.addr = student[StdIndex.주소.getIndex()];
			students.add(stdDto);
			
		} // end while
		fileScan.close();
	}
	/*
	 * students 리스트에 보관중인 학생정보 리스트를
	 * student.txt 파일에 
	 * 		영구(영속적으로, persistence) 저장하는 method
	 * 
	 */
	@Override
	public void saveStudent() {
		
		// 데이터를 저장할 파일을 연결하기 위한 도구
		OutputStream fos = null;
		
		/*
		 *  System.out 과 형제간
		 *  System.out 에는 print**() method 들이 있고
		 *  이 method 를 사용하여 화면에 메모리 내용을 출력하였다
		 *  
		 *  PrintWriter 는 OutputStream 과 연결되어
		 *  print**() method 들을 사용하여 파일에 
		 *  데이터를 기록 할 수 있다(저장하기)
		 */
		PrintWriter fileOut = null;
		
		try {
			// 어떤 파일에 기록을 할 것인지 연결하는 절차
			fos = new FileOutputStream(stDataFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// 기록할 파일을 PrintWriter 에 연결하기
		fileOut = new PrintWriter(fos);
		
		// PrintWriter 가 준비되면
		// System.out.print**() 처럼 같은 방식으로
		// 파일에 "문자열"을 기록할 수 있다
		for(StudentDto dto : students) {
			fileOut.printf("%s,", dto.num);
			fileOut.printf("%s,", dto.name);
			fileOut.printf("%s,", dto.dept);
			fileOut.printf("%s,", dto.grade);
			fileOut.printf("%s,", dto.tel);
			fileOut.printf("%s\n", dto.addr);
		}
		// 파일에 내용 기록이 끝나면 반드시 PrintWriter 를
		// close() 해야 한다.
		// 이 과정을 생략하면 파일이 계속 열린 상태가 되고
		// 기록한 내용은 완전 저장(Ctrl+s)되지 않는다
		// 또한 이 상태의 파일은 삭제도 할수 없게 된다.
		// 다만 윈도우를 재 시작하기 전까지
		fileOut.close();
		
	}
}
