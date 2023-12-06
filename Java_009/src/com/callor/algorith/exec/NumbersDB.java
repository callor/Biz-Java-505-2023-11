package com.callor.algorith.exec;

import com.callor.algorith.service.NumberService;
import com.callor.algorith.utils.Line;

public class NumbersDB {
	
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		
		int sum = 0;
		int count = 0;
		while(true) {
			int num = numService.inputNum("숫자를");
			sum += num;
			count++;
			if(sum >= 1000) {
				break;
			}
		}
		System.out.printf("%d 번 입력한 숫자 총합 : %d",count,sum);
		
		
		
	}

}
