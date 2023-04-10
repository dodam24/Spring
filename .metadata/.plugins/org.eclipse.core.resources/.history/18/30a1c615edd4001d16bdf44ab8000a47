package sample04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component
@Scope("prototype")
public class SungJukInput implements SungJuk {
	@Autowired
	private SungJukDTO2 sungJukDTO2 = null;
	@Autowired
	@Qualifier("arrayList") //부모(list)로 받을 경우, 자식 클래스(arrayList)를 정확하게 명시해주어야 함
	private List<SungJukDTO2> list = null; //부모로 받음(List)(O)
	//private ArrayList<SungJukDTO2> list = null; 자식 클래스로 받음(X)

	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		//데이터
		System.out.println("이름 입력 : ");
		String name = scan.next();
		System.out.println("국어 입력 : ");
		int kor = scan.nextInt();
		System.out.println("영어 입력 : ");
		int eng = scan.nextInt();
		System.out.println("수학 입력 : ");
		int math = scan.nextInt();
		System.out.println();
		
		int tot = kor + eng + math;
		double avg = tot / 3.;
		
		sungJukDTO2.setName(name);
		sungJukDTO2.setKor(kor);
		sungJukDTO2.setEng(eng);
		sungJukDTO2.setMath(math);
		sungJukDTO2.setTot(tot);
		sungJukDTO2.setAvg(avg);
		
		//ArrayList에 담기 (DB 대신에 ArrayList에 담음)
		//List<E> list = new ArrayList(); new 안 쓰고 Setter Injection으로 주소값 얻어오기
		list.add(sungJukDTO2);
		
		//출력
		System.out.println(name + "님의 데이터를 저장하였습니다.");
		
	}
}
