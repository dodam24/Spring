package sample01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//@Component
public class MessageBeanImpl implements MessageBean {
	private String fruit;
	private int cost, qty;
	
	//Constructor Injection - fruit 생성자 이용
	public MessageBeanImpl(@Value("사과")String fruit) { //lombok이 아닌 spring으로 import
		super();
		this.fruit = fruit;
	}
	
	@Autowired
	//Setter Injection - cost, qty는 setter 이용
	public void setCost(@Value("5000")int cost) {
		this.cost = cost;
	}

	@Autowired
	public void setQty(@Value("3")int qty) {
		this.qty = qty;
	}
	
	@Override
	public void sayHello() {
		System.out.println(fruit + "\t" + cost + "\t" + qty);	
	}

	@Override
	public void sayHello(String fruit, int cost) {
		System.out.println(fruit + "\t" + cost + "\t" + qty);
	}

	@Override
	public void sayHello(String fruit, int cost, int qty) {
		System.out.println(fruit + "\t" + cost + "\t" + qty);	
	}

}
