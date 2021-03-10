package com.ms.assessment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.assessment.Entity.User_Project;
import com.ms.assessment.Service.IUserProjectService;

@RestController
@RequestMapping("userproject")
public class UserProjectController {
	
	@Autowired
	private IUserProjectService userProjectService;

	@PostMapping
	public User_Project saveUserProject(@RequestBody User_Project userProject)
	{
		
		return userProjectService.saveUserProject(userProject);
	}
	
	@GetMapping
	public List<User_Project> getUserProject() {
		return userProjectService.getUserProject();
		
	}
}
