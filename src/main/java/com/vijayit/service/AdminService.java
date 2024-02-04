package com.vijayit.service;
import java.util.List;

import com.vijayit.binding.TaskForm;
import com.vijayit.entity.AdminEntity;
public interface AdminService {

    public String addTask(TaskForm form);
	
	public List<AdminEntity> getAll();
	
	public  String deleteById(Integer taskId);


}
