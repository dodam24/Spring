package user.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserUpdateService implements UserService {
	@Autowired
	private UserDAO userDAO = null;
	
	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수정 할 아이디 입력 : ");
		String id = scan.next();
		
		//DB
		UserDTO userDTO = userDAO.getUser(id); //id에 해당하는 한 사람의 데이터를 가져온다.
		
		if(userDTO == null) {
			System.out.println("찾고자 하는 아이디가 없습니다.");
			return;
		}
		
		System.out.println(userDTO.getName() + "\t" + userDTO.getId() + "\t" + userDTO.getPwd());
		
		System.out.println();
		System.out.print("수정 할 이름 입력 : ");
		String name = scan.next();
		System.out.print("수정 할 비밀번호 입력 : ");
		String pwd = scan.next();
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("id", id);
		map.put("pwd", pwd);
		
		userDAO.update(map);
		
		System.out.println("DB의 내용을 수정하였습니다.");
	}
}


/*
수정 할 아이디 입력 : angetl
찾고자 하는 아이디가 없습니다.

수정 할 아이디 입력 : hong
홍길동	hong	111

수정 할 이름 입력 : 
수정할 비밀번호 입력 : 
		
DB의 내용을 수정하였습니다.	
*/