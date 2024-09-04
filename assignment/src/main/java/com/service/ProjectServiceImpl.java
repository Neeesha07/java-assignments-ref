package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Project;
import com.repo.ProjectRepository;
@Service
public class ProjectServiceImpl implements ProjectService {
	private List<Project> projectList=new ArrayList<Project>();

	@Autowired
	private ProjectRepository repo;
	@Override
	public void addProject(Project project) {
		repo.save(project);
		
	}

	@Override
	public List<Project> loadProjects() {
		projectList= (List<Project>) repo.findAll();
		return projectList;
	}

	@Override
	public Optional<Project> findProject(int pid) {
		
		return repo.findById(pid);
	}
	@Override
	public String deleteProject(int pid) {
		
		repo.deleteById(pid);
		return "Project deleted!";
	}
	

	
	

}
