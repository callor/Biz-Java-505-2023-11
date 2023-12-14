package com.callor.student.exec;

import com.callor.student.service.StartService;
import com.callor.student.service.impl.StartServiceImplV3;

public class MainExB {
	
	public static void main(String[] args) {
		StartService startService = new StartServiceImplV3();
		startService.startApp();
	}

}
