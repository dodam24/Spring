package sample04;

import org.springframework.stereotype.Component;

@Component
public class CalcMul implements Calc {

	@Override
	public void calculate(int x, int y) {
		System.out.println(x + " * " + y + " = " + (x*y));
	}
}
