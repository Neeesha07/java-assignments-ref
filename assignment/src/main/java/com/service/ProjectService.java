package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.entity.Project;

@Component
public interface ProjectService {

	public void addProject(Project project);
	
	
	public List<Project> loadProjects();
	
	public Optional<Project> findProject(int pid);


	String deleteProject(int pid);
}
