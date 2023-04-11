package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.SungJukDTO;

@Controller
@RequestMapping(value="sungJuk")
public class SungJukController {
	
	@GetMapping(value="/sungJuk/input.do") //handlermapping이 어디로 가야할지 모르기 때문에 namespace(/sungJuk) 입력 필수
	public String input() {
		return "sungJuk/input";
	}
	
	@PostMapping(value="/sungJuk/result.do")
	public String result(@ModelAttribute SungJukDTO sungJukDTO, Model model) {
		int tot = sungJukDTO.getKor() + sungJukDTO.getEng() + sungJukDTO.getMath();
		double avg = tot / 3;
		
		sungJukDTO.setTot(tot);
		sungJukDTO.setAvg(avg);
		
		model.addAttribute("sungJukDTO", sungJukDTO); //이전에는 request.setAttribute 형태로 작성하던 것을 model.setAttribute 형태로 작성
		//SungJukDTO를 모델에 실어서 보낸다.
		return "sungJuk/result";
	}
}
