package com.callor.algorith.exec;

import com.callor.algorith.service.KeyInputService;

public class ScannrBC {
	
	public static void main(String[] args) {
		KeyInputService keyService = new KeyInputService();
		
		int num1 = keyService.inputNum("첫 번째 정수를");
		int num2 = keyService.inputNum("두 번째 정수를");
		
		System.out.printf("%d + %d = %d\n",
				num1, num2, num1 + num2);
		
				
	}

}
