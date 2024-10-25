package com.ssafy.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssafy.board.model.BoardDto;
import com.ssafy.board.model.service.BoardService;
import com.ssafy.util.PageNavigation;

import jakarta.servlet.ServletContext;

@Controller
public class MainController {
	


	
	private final BoardService boardService;

	public MainController(BoardService boardService) {
		super();
		this.boardService = boardService;
	}


	@GetMapping("/")
	public String index() {
		System.out.print("hey");
		return "index";
	}
	
	@GetMapping("/list")
	public ModelAndView write(@RequestParam Map<String, String> map, Model model) throws Exception {
		System.out.println("list 동작");
		ModelAndView mav = new ModelAndView();
		List<BoardDto> list = boardService.listArticle(map);
		System.out.println(list);
		PageNavigation pageNavigation = boardService.makePageNavigation(map);
		mav.addObject("items", list);
		mav.addObject("navigation", pageNavigation);
		mav.addObject("pgno", map.get("pgno"));
		mav.addObject("key", map.get("key"));
		mav.addObject("word", map.get("word"));
		mav.setViewName("/list");
		return mav;
	}
	
	
	@GetMapping("/login")
	public String login() {
		System.out.print("login");
		return "user/login";
	}
	

	@GetMapping("/regist")
	public String register() {
		System.out.print("register");
		return "regist";
	}
	
}
