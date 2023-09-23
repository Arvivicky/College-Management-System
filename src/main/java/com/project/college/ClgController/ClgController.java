package com.project.college.ClgController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.college.ClgEntity.ClgEntity;
import com.project.college.ClgService.ClgService;

@RestController
@RequestMapping(value = "/college")
public class ClgController
{
	@Autowired
	public ClgService clgService;
	
	@GetMapping
	public String welcome()
	{
		return "Welcome to College Management System.!";
	}
	
	@GetMapping(value="/getAllStudents")
	public List<ClgEntity> getAllStudents()
	{
		List<ClgEntity> clglist=new ArrayList<ClgEntity>();
		clglist=clgService.getAllStudents();
		return clglist;
	}
	
	@GetMapping(value = "/searchById/{id}")
	public ClgEntity searchById(@PathVariable Long id)
	{
		ClgEntity clgEntity=new ClgEntity();
		clgEntity=clgService.searchById(id);
		return clgEntity;
	}
	
	@GetMapping(value = "/getByDept/{dept}")
	public List<ClgEntity> getByDept(@PathVariable String dept)
	{
		List<ClgEntity> list1=new ArrayList<ClgEntity>();
		list1=clgService.getByDept(dept);
		return list1;
		
	}
	
	@GetMapping(value = "/getPlacementInterested/{placementInterested}")
	public List<ClgEntity> getPlacementInterested(@PathVariable String placementInterested)
	{
		List<ClgEntity> list1=new ArrayList<ClgEntity>();
		list1=clgService.getPlacementInterested(placementInterested);
		return list1;
		
	}
	
	@PostMapping(value = "/insert")
	public ClgEntity insert(@RequestBody ClgEntity clgEntity)
	{
		ClgEntity clgEntity2=new ClgEntity();
		clgEntity2=clgService.insert(clgEntity);
		return clgEntity2;
	}
	
	@PutMapping(value = "/update/{id}")
	public ClgEntity update(@PathVariable Long id,@RequestBody ClgEntity clgEntity)
	{
		ClgEntity clgEntity2= new ClgEntity();
		clgEntity2=clgService.update(id, clgEntity);
		return clgEntity2;
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public String delete(@PathVariable Long id)
	{
		String str;
		str=clgService.delete(id);
		return str;
	}

}
