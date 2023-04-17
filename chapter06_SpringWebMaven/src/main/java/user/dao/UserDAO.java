package user.dao;

import java.util.List;
import java.util.Map;

import user.bean.UserDTO;
import user.bean.UserImageDTO;

public interface UserDAO {

	public void write(UserDTO userDTO);

	public List<UserDTO> getUserList(Map<String, Integer> map);

	public UserDTO getUser(String id);

	public String isExistId(String id);

	public void update(UserDTO userDTO);

	public void delete(String id);

	public int getTotalA();

	public void upload(UserImageDTO userImageDTO, List<String> fileNameList);

	public List<UserImageDTO> getUploadForm_AJax_list();

}
