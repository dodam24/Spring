package user.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value="user")
public class UserController2 {
	
	//파일 업로드
	@GetMapping(value="uploadForm")
	public String uploadForm() {
		return "user/uploadForm";
	}
	
	@PostMapping(value="upload")
	@ResponseBody
	public String upload(@RequestParam MultipartFile img, HttpSession session) {
		//가상폴더
		String filePath_virtual = "D:/Spring/workspace/chapter06_SpringWebMaven/src/main/webapp/WEB-INF/storage";
		
		String filePath = session.getServletContext().getRealPath("/WEB-INF/storage");
		System.out.println("실제 폴더 = " + filePath); //파일을 올릴 때 반드시 실제 폴더 위치에 올려야 파일이 업로드 된다.
		String fileName = img.getOriginalFilename();
		
		File file = new File(filePath, fileName); //파일 생성
		File file_virtual = new File(filePath_virtual, fileName);
		
		try {
			FileCopyUtils.copy(img.getInputStream(), new FileOutputStream(file_virtual)); //파일 복사
			img.transferTo(file);
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "<img src='../storage/" + fileName + "' width='300' height='300' />";
		
	}
	
}
