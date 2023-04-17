package user.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import user.bean.UserImageDTO;
import user.service.UserService;

@Controller
@RequestMapping(value="user")
public class UserController2 {
	@Autowired
	private UserService userService;
	
	//파일 업로드
	@GetMapping(value="uploadForm")
	public String uploadForm() {
		return "user/uploadForm";
	}
	
	//파일 업로드
	@GetMapping(value="uploadForm_AJax")
	public String uploadForm_AJax() {
		return "user/uploadForm_AJax";
	}
	
	/*
	//----- name="img" 1개일 때 -----
	@PostMapping(value="upload", produces = "text/html; charset=UTF-8") //파일명에 있는 한글명 깨질 때, produces 설정
	@ResponseBody
	public String upload(@RequestParam MultipartFile img,
						 @ModelAttribute UserImageDTO userImageDTO, HttpSession session) {
		//가상폴더
		//String filePath_virtual = "D:/Spring/workspace/chapter06_SpringWebMaven/src/main/webapp/WEB-INF/storage";
		
		String filePath = session.getServletContext().getRealPath("/WEB-INF/storage");
		System.out.println("실제 폴더 = " + filePath); //파일을 올릴 때 반드시 실제 폴더 위치에 올려야 파일이 업로드 된다.
		String fileName = img.getOriginalFilename();
		System.out.println("파일명 = " + fileName);
		
		File file = new File(filePath, fileName); //파일 생성
		//File file_virtual = new File(filePath_virtual, fileName);
		
		try {
			//FileCopyUtils.copy(img.getInputStream(), new FileOutputStream(file_virtual)); //파일 복사
			img.transferTo(file);
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		userImageDTO.setImage1(fileName);
		
		//UserService -> UserDAO -> userMapper.xml
		
		return "<img src='../storage/" + fileName + "' width='300' height='300' />";
		
	}
	*/
	
	/*
	//----- name="img" 2개 이상일 때 -----
	@PostMapping(value="upload", produces = "text/html; charset=UTF-8") //파일명에 있는 한글명 깨질 때, produces 설정
	@ResponseBody
	public String upload(@RequestParam MultipartFile[] img,
						 @ModelAttribute UserImageDTO userImageDTO, 
						 HttpSession session) {
		
		String filePath = session.getServletContext().getRealPath("/WEB-INF/storage");
		System.out.println("실제 폴더 = " + filePath);
		
		String fileName;
		File file;
		
		if(img[0] != null) {
			fileName = img[0].getOriginalFilename();
			file = new File(filePath, fileName);
			
			try {
				img[0].transferTo(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		if(img[1] != null) {
			fileName = img[1].getOriginalFilename();
			file = new File(filePath, fileName);
			
			try {
				img[1].transferTo(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return "이미지 등록 완료";
	}
	*/
	
	//----- 한 번에 여러 개의 파일을 선택 -----
	@PostMapping(value="upload", produces = "text/html; charset=UTF-8") //파일명에 있는 한글명 깨질 때, produces 설정
	@ResponseBody
	public String upload(@RequestParam("img[]") List<MultipartFile> list,
						 @ModelAttribute UserImageDTO userImageDTO, 
						 HttpSession session) {
		
		String filePath = session.getServletContext().getRealPath("/WEB-INF/storage");
		System.out.println("실제 폴더 = " + filePath);
		
		String fileName;
		File file;
		
		List<String> fileNameList = new ArrayList<String>();
		
		for(MultipartFile img : list) {
			fileName = img.getOriginalFilename();
			file = new File(filePath, fileName);
			
			try {
				img.transferTo(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			fileNameList.add(fileName);
			
		}//for
		
		userService.upload(userImageDTO, fileNameList);
		
		return "이미지 등록 완료";
		
	}
	
	@GetMapping(value="uploadForm_AJax_list")
	public String uploadForm_AJax_list() {
		//DB를 거치지 않고 바로 화면에 틀만 띄운다.
		return "user/uploadForm_AJax_list";
	
	}
	
	@PostMapping(value="getUploadForm_AJax_list")
	@ResponseBody
	public List<UserImageDTO> getUploadForm_AJax_list(){
		return userService.getUploadForm_AJax_list();
	}
}
