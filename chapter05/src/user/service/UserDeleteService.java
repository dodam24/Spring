package user.service;

import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserDeleteService implements UserService {
	@Setter
	private UserDAO userDAO;
	
//	public void setUserDAO(UserDAO userDAO) {
//		this.userDAO = userDAO;
//	}

	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제 할 아이디 입력 : ");
		String id = scan.next();
		
		//DB
		UserDTO userDTO = userDAO.getUser(id); //id에 해당하는 한 사람의 데이터를 가져온다.
		
		if(userDTO == null) {
			System.out.println("찾고자 하는 아이디가 없습니다.");
			return;
		}

		userDAO.delete(id);
		
		System.out.println("DB의 내용을 삭제하였습니다.");
	}

}

/*
삭제 할 아이디 입력 : angel
찾고자 하는 아이디가 없습니다.
		
삭제 할 아이디 입력 : hong
DB의 내용을 삭제하였습니다.
*/ 
