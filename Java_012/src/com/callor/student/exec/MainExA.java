package com.callor.student.exec;

import com.callor.student.service.StartService;
import com.callor.student.service.impl.StartServiceImplV2;

public class MainExA {

	public static void main(String[] args) {
		String studentDataFile = "src/com/callor/student/data/student.txt";
		StartService start = new StartServiceImplV2();
		start.startApp();
	}
	
	
}
