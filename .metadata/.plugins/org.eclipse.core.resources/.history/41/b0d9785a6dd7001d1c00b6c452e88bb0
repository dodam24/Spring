package user.service;

import java.util.List;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserSelectService implements UserService {
	@Setter
	private UserDAO userDAO = null;
	
	@Override
	public void execute() {
		System.out.println();
		
		List<UserDTO> list = userDAO.getUserList();
		for(UserDTO userDTO : list) {
			System.out.println(userDTO.getName()+"\t"
							+ userDTO.getId()+"\t"
							+ userDTO.getPwd());
		} //for
		
	}

}
