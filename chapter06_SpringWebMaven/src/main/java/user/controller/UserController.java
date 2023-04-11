package user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping(value="user")
public class UserController {

	@GetMapping(value="writeForm")
	public String writeForm() {
		return "user/writeForm";
	}
}
