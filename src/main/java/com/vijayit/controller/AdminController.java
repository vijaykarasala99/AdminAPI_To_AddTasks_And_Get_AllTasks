package com.vijayit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.vijayit.binding.TaskForm;
import com.vijayit.entity.AdminEntity;
import com.vijayit.service.AdminService;

@Controller
@RequestMapping("/")
public class AdminController {

	@Autowired
	private AdminService adminService;
    
	@GetMapping
	public String index(Model model) {
        model.addAttribute("tasks", new TaskForm());
		return "tasks";

	}

	@PostMapping("/tasks")
	public String addTask(@ModelAttribute("tasks") TaskForm form, Model model) {
		boolean status = adminService.addTask(form) != null;
		if (status) {
			model.addAttribute("succMsg", "Task Added");
		} else {
			model.addAttribute("errMsg", "Problem Occured");
		}
		return "tasks";
	}
	@GetMapping("/all")
	public String getAll(Model model) {
        List<AdminEntity> tasks = adminService.getAll();
        model.addAttribute("tasks", tasks);
		return "gettasks";

	}}