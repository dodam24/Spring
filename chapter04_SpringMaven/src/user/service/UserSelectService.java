package user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserSelectService implements UserService {
	@Autowired
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
