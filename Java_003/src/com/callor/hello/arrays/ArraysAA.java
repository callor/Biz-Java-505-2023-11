package com.callor.hello.arrays;

public class ArraysAA {
	
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 50) + 51;
		int num2 = (int)(Math.random() * 50) + 51;
		int num3 = (int)(Math.random() * 50) + 51;
		int num4 = (int)(Math.random() * 50) + 51;
		int num5 = (int)(Math.random() * 50) + 51;
		
		int index = 1;
		System.out.printf("%d 번째 값 : %d\n",index++,num1);
		System.out.printf("%d 번째 값 : %d\n",index++,num2);
		System.out.printf("%d 번째 값 : %d\n",index++,num3);
		System.out.printf("%d 번째 값 : %d\n",index++,num4);
		System.out.printf("%d 번째 값 : %d\n",index++,num5);
		
		int sum = num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		System.out.println("합계 : " + sum);
		
		
		
		
		
	}

}
