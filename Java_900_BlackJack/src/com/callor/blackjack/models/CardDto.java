package com.callor.blackjack.models;

/*
 * 개별 낱장 카드의 정보를 저장할 데이터 클래스
 * 카드이름, 카드의 점수를 저장할 변수를 포함하는 클래스
 */
public class CardDto extends Object{
	
	public String suit; // 카드의 모양
	public String denomiation; // 개별점수(문자열)
	public int value;  // 개별점수(정수형, 점수계산용)
	
	/*
	 * 클래스를 선언하면 객체를 생성하는
	 * "기본 생성자 method" 가 자동으로 만들어진다
	 * "기본 생성자"는 매개변수가 없다. 
	 * 		기본적으로 코드도 보이지 않는다
	 */
	public CardDto() {
		// TODO Auto-generated constructor stub
	}

	public String getPattern(int index) {
		return this.getPatterns()[index];
	}
	
	
	public String[] getPatterns() {
		String[] patterns = {
			String.format("┌─────────┐"),
			String.format("│         │"),
			String.format("│   %1s     │",this.suit ),
			String.format("│         │"),
			String.format("│         │"),
			String.format("│   %2d    │",this.value),
			String.format("│         │"),
			String.format("└─────────┘")
		};
		return patterns;
	}
	
	
	
	
	
	/*
	 * java 에서 어떤 클래스(코드)를 만들면
	 * 자동으로 extends Object 코드가 부착되고
	 * Object 클래스를 자동으로 상속받는다
	 * Object 클래스에는 여러가지 기본 method 가 있다
	 * 그중에 toString() method 는 클래스를 사용하여 생성된
	 * 객체의 System 정보를 문자열로 return 하는 코드가 만들어져 있다
	 * 
	 * 이 toString() method 를 재 정의하여(Override)
	 * 다른 용도로 사용하려고 한다
	 * 보통 Dto 클래스에서는 각 변수들의 값을 문자열로 생성하여
	 * return 해주는 코드로 만들어 사용한다
	 * eClipse 에서는 toString() method 를 자동으로 재 정의해주는
	 * 기능이 포함되어 있다
	 * 
	 */
	@Override
	public String toString() {
		return "CardDto [suit=" + suit + ", denomiation=" + denomiation + ", value=" + value + "]";
	}
	

	
	
	

}
