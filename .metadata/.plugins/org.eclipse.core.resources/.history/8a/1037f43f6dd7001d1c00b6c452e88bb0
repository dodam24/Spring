package user.service;

import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserInsertService implements UserService {
	@Setter
	private UserDTO userDTO = null;
	@Setter
	private UserDAO userDAO = null; //자식(UserDAOImpl) 대신 부모(UserDAO)로 잡는다.
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		
		//데이터
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = scan.next();
		
		userDTO.setName(name);
		userDTO.setId(id);
		userDTO.setPwd(pwd);
		
		//DB
		userDAO.write(userDTO);		
		
		System.out.println(name+"님의 데이터를 DB에 저장하였습니다.");

	}

}