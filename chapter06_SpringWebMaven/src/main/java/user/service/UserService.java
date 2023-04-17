package user.service;

import java.util.List;
import java.util.Map;

import user.bean.UserDTO;
import user.bean.UserImageDTO;

public interface UserService {

	public void write(UserDTO userDTO);

	public Map<String, Object> getUserList(String pg);

	public String isExistId(String id);

	public UserDTO getUser(String id);

	public void update(UserDTO userDTO);

	public void delete(String id);

	public void upload(UserImageDTO userImageDTO, List<String> fileNameList);

	public List<UserImageDTO> getUploadForm_AJax_list();


}
