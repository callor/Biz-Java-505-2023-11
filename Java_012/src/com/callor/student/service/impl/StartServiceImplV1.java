package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.service.StartService;
import com.callor.student.service.StudentService;

public class StartServiceImplV1 implements StartService{

	protected Scanner scan = null;
	protected StudentService stService = null;
	
	/*
	 * StartService 에서는 StudentService 를 필수로 필요로 한다
	 * StartService 클래스의 기능을 추가 하는 코드가 계속 만들어질경우
	 * 또한 StudentService 클래스의 기능을 추가하는 코드가 계속 만들어질 경우
	 * 
	 * StartServiceV1, StartSeriviceV2 .. 등 으로 파일 생성되고
	 * StudentServiceV1, StudentServiceV2 .. 등 으로 파일 생성되고
	 * 
	 * 이 두개의 파일이 서로 연동되어 코드가 진행된다
	 * 
	 * 이 상황에서 어떤 StartService 와 어떤 StudentService 를
	 * 연결할 것인지 항상 고민해야 하고,
	 * 필요에 따라 StartService 코드를 변경해야 한다
	 * 
	 * 이러한 상활을 StartService 와 StudentService 간에
	 * 결합도가 높다 라고 한다
	 * 
	 * 그래서 StartService 의 생성자를 통하여
	 * StudentService 의 객체를 주입받은(Inject) 코드로
	 * 생성자를 변경하였다
	 * 
	 */
	public StartServiceImplV1(StudentService stService) {
		scan = new Scanner(System.in);
		this.stService = stService; // new StudentServiceImplV1();
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
