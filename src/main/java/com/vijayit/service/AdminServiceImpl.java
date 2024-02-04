package com.vijayit.service;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vijayit.binding.TaskForm;
import com.vijayit.entity.AdminEntity;
import com.vijayit.repo.AdminRepo;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepo adminRepo;

	@Override
	public String addTask(TaskForm form) {
		AdminEntity entity = new AdminEntity();
		BeanUtils.copyProperties(form, entity);
		adminRepo.save(entity);
		return "task submitted";
	}
	
	@Override
	public List<AdminEntity> getAll() {
		return adminRepo.findAll();
	}

	@Override
	public String deleteById(Integer taskId) {
		if (adminRepo.existsById(taskId)) {
			adminRepo.existsById(taskId);
			return "task deleted";
		} else
			return "no task found";
	}

}