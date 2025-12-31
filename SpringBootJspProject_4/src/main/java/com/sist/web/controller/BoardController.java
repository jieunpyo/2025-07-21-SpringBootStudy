package com.sist.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sist.web.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
public class BoardController{
	
	@GetMapping("/board/list")
	public String board_list(Model model)
	{
		model.addAttribute("main_jsp", "../board/list.jsp");
		return "main/main";
	}
}
