package sample04;

import java.util.List;

import lombok.Setter;

public class SungJukOutput implements SungJuk {
	@Setter
	private List<SungJukDTO2> list = null;
	
	@Override
	public void execute() {
		System.out.println();
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO2 sungJukDTO2 : list) {
			System.out.println(sungJukDTO2);
		} //for
		
	}

}


/*
2번인 경우 - SungJukOutput.java
이름		국어		영어		수학		총점		평균
홍길동	95		100		97		xxx		xx.xx
또치		90		85		75		xxx		xx.xx
*/