package com.callor.student.service.impl;

import com.callor.student.models.StdIndex;
import com.callor.student.models.StudentDto;

public class StudentServiceImplV3 extends StudentServiceImplV2 {

	public StudentServiceImplV3() {
		super();
	}
	
	@Override
	public boolean inputStudent() {
		// TODO:한 학생의 정보 입력받기

		String[] inputStr = new String[StdIndex.values().length];
		for(StdIndex item : StdIndex.values()) {
			while(true) {
				System.out.printf("%s 입력(QUIT:종료) >> ",item);
				String str = keyBD.nextLine();
				if(str.equals("QUIT")) return false;
				// 학번을 입력하는 경우 학번의 중복검사를 실시한다
				if(item.toString().equals("학번") && this.selectStdNum(str) != null) {
					System.out.println("학번 중복");
					continue;
				}
				inputStr[item.getIndex()] = str;
				break;
			}
		}
		StudentDto stDto = new StudentDto();
		stDto.num = inputStr[StdIndex.학번.getIndex()];
		stDto.name = inputStr[StdIndex.이름.getIndex()];
		stDto.dept = inputStr[StdIndex.학과.getIndex()];
		stDto.grade = inputStr[StdIndex.학년.getIndex()];
		stDto.tel = inputStr[StdIndex.전화번호.getIndex()];
		stDto.addr = inputStr[StdIndex.주소.getIndex()];
		students.add(stDto);
		return true;
	}

}
