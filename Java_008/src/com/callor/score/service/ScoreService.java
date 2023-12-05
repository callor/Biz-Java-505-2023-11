package com.callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.score.model.ScoreDto;

public class ScoreService {
	
	private ScoreDto[] scores = null; 
	private Scanner scan = null;

	/*
	 * 생성자 method(Constructor)
	 * 클래스를 사용하여 객체를 선언하고
	 * 객체를 (사용하기 위하여) 초기화 할때 호출(실행)하는 method
	 * 
	 * 클래스 이름과 같고(첫글자 대문자), return type 이 없다
	 * static 도 붙일 수 없다
	 * 
	 * 보통은 비어있는(blank) 코드가 자동으로 생성되지만
	 * 필요에 따라 변수, 객체 등을 만드는 코드를 추가할 수 있다
	 */
	public ScoreService() {
		String dataFile = "src/com/callor/score/service/data.txt";
		InputStream is = null;
		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is);
		scores = new ScoreDto[100];
	} // end ScoreService()
	
	// data.txt 파일에서 성적을 읽어 score 배열에 저장하기
	// 생성자에서 이미 data.txt 파일을 Open 하고
	// 읽어들일 준비가 되어 있다
	// 생성자에서 만들어둔 scan 객체를 사용하여 데이터를
	// 읽고 처리를 수행하면 된다
	public void loadScores() {
		int index = 0;
		while(scan.hasNext()) {
			String line = scan.nextLine();
			// System.out.println(line);
			// 읽어들인 한 라인의 데이터를 각 항목별로 분해하여
			// lines 배열에 담기
			String[] lines = line.split(",");
			ScoreDto scoreDto = new ScoreDto();
			scoreDto.stdNum = lines[0];
			
			scoreDto.kor = Integer.valueOf(lines[1]);
			scoreDto.eng = Integer.valueOf(lines[2]);
			scoreDto.math = Integer.valueOf(lines[3]);
			scoreDto.music = Integer.valueOf(lines[4]);
			scoreDto.art = Integer.valueOf(lines[5]);
			scoreDto.sw = Integer.valueOf(lines[6]);
			scoreDto.db = Integer.valueOf(lines[7]);
			scores[index++] = scoreDto;
		}
	} // end loadScores()
	
	public void printScores() {
		
	}
	
	

}
