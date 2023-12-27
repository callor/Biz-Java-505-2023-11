package com.callor.student.exec;

import com.callor.student.service.StudentServcie;
import com.callor.student.service.impl.StudentServiceImplV1;

public class ExecC {
	
	public static void main(String[] args) {
		String stdFile = "src/student.csv";
		StudentServcie stdService = new StudentServiceImplV1(stdFile);
		stdService.loadStudent();
		stdService.inputStudent();
		
	}

}
