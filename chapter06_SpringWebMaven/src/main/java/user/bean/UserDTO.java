package user.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Data: setter, getter대신 data로 잡아도 된다.
public class UserDTO {
	private String name;
	private String id;
	private String pwd;
}
