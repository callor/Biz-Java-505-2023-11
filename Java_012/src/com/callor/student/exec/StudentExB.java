package com.callor.student.exec;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV1;
import com.callor.student.service.impl.StudentServiceimplV2;

public class StudentExB {
	
	public static void main(String[] args) {
		StudentService stService1 = new StudentServiceImplV1();
		stService1.printStudent();

		stService1 = new StudentServiceimplV2();
		stService1.printStudent();

	}
}
