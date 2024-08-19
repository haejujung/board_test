package com.tenco.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tenco.board.dto.SaveDTO;
import com.tenco.board.repository.model.User;

@Controller
@RequestMapping("/board")
public class BooardController {

	@GetMapping("/saveForm")
	public String saveForm(SaveDTO dto, User principal) {
		
		System.out.println("세이브폼1");
		return "board/saveForm";
	}

	@GetMapping("/board/{id}/updateForm")
	public String updateForm(@PathVariable int id) {
		return "board/updateForm";
	}

	@PostMapping("/board/save")
	public String save() {
		return "redirect:/";
	}

	@PostMapping("/board/{id}/update")
	public String update(@PathVariable int id) {
		return "redirect:/";
	}

	@PostMapping("/board/{id}/delete")
	public String delete(@PathVariable int id) {
		return "redirect:/";
	}

}
