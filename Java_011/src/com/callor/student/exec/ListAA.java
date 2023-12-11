package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;

public class ListAA {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		for(int i = 0 ; i < 10 ; i++) {
			int num = (int)(Math.random() * 50) + 51;
			nums.add(num);
		}
		System.out.println(nums);
		
		int size = nums.size();
		for(int i = 0 ; i < size ; i++) {
			if(nums.get(i) == 77) {
				System.out.println("있다");
			}
		}
		int index = 0;
		for(index = 0 ; index < size ; index++) {
			// if(nums[index] == 77) break;
			if(nums.get(index) == 77) {
				break;
			}
		}
		if(index < size) {
			System.out.println(index + " 번째에서 찾음");
		} else {
			System.out.println("없음");
		}
		
		
	}

}
