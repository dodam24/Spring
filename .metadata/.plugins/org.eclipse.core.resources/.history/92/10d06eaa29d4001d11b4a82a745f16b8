package sample03;

import java.util.Scanner;

public class SungJukImpl implements SungJuk {
	private SungJukDTO sungJukDTO = null; //SungJukDTO를 가져오기
	

	public SungJukImpl(SungJukDTO sungJukDTO) { //Constructor Injection 이용
		this.sungJukDTO = sungJukDTO;
	}

	@Override
	public void calcTot() {
		 sungJukDTO.setTot(sungJukDTO.getKor() + sungJukDTO.getEng() + sungJukDTO.getMath());

	}

	@Override
	public void calcAvg() {
		sungJukDTO.setAvg(sungJukDTO.getTot() / 3.);

	}

	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(sungJukDTO);
	}
	
	/*
	@Override
	public void display() {
		System.out.println(sungJukDTO.getName() + "\t"
						 + sungJukDTO.getKor() + "\t"
						 + sungJukDTO.getEng() + "\t"
						 + sungJukDTO.getTot() + "\t"
						 + String.format("%.3f", sungJukDTO.getAvg()));
	}
	*/

	@Override
	public void modify() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		sungJukDTO.setName(scan.next());
		System.out.print("국어 입력 : ");
		sungJukDTO.setKor(scan.nextInt());
		System.out.print("영어 입력 : ");
		sungJukDTO.setEng(scan.nextInt());
		System.out.print("수학 입력 : ");
		sungJukDTO.setMath(scan.nextInt());
		System.out.println();

	}

}
