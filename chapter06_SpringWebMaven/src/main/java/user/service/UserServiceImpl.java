package user.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.bean.UserImageDTO;
import user.bean.UserPaging;
import user.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private UserPaging userPaging = null;

	@Override
	public void write(UserDTO userDTO) {
		userDAO.write(userDTO);
	}

	@Override
	public Map<String, Object> getUserList(String pg) {
		
		int endNum = Integer.parseInt(pg) * 3;
		int startNum = endNum - 2;
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("startNum", startNum);
		map.put("endNum", endNum);
		
		List<UserDTO> list = userDAO.getUserList(map);
		
		//페이징 처리
		int totalA = userDAO.getTotalA(); //총글수
		
		userPaging.setCurrentPage(Integer.parseInt(pg));
		userPaging.setPageBlock(3);
		userPaging.setPageSize(3);
		userPaging.setTotalA(totalA);
		
		userPaging.makePagingHTML();
	
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("list", list);
		map2.put("userPaging", userPaging);
		
		return map2;
	}

	@Override
	public String isExistId(String id) {
		UserDTO userDTO = userDAO.getUser(id);
		
		if(userDTO == null)
			return "non_exist";
		else
			return "exist";
	}

	@Override
	public UserDTO getUser(String id) {
		return userDAO.getUser(id);
	}

	@Override
	public void update(UserDTO userDTO) {
		userDAO.update(userDTO);
	}

	@Override
	public void delete(String id) {
		userDAO.delete(id);	
	}

	@Override
	public void upload(UserImageDTO userImageDTO, List<String> fileNameList) {
		userDAO.upload(userImageDTO, fileNameList);
	}

	@Override
	public List<UserImageDTO> getUploadForm_AJax_list() {
		return userDAO.getUploadForm_AJax_list();
	}

}
