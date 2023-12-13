package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.service.StartService;
import com.callor.student.service.StudentService;

public class StartServiceImplV1 implements StartService{

	protected Scanner scan = null;
	protected StudentService stService = null;
	
	public StartServiceImplV1() {
		scan = new Scanner(System.in);
		stService = new StudentServiceImplV1();
	}
	
	@Override
	public void mainMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer selectMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void startApp() {
		// TODO Auto-generated method stub
		
	}

}
