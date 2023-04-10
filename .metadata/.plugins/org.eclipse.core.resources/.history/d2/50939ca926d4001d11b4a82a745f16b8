package sample01;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class MessageBeanImpl implements MessageBean {
	@NonNull
	private String fruit;
	@Setter
	private int cost, qty;
	
	
	//Constructor Injection - fruit 생성자 이용
//	public MessageBeanImpl(String fruit) {
//		super();
//		this.fruit = fruit;
//	}
	
	//Setter Injection - cost, qty setter 이용
//	public void setFruit(String fruit) {
//		this.fruit = fruit;
//	}
//
//	public void setQty(int qty) {
//		this.qty = qty;
//	}
	
	
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
