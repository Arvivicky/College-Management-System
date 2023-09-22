package com.project.college.ClgService;

import java.util.List;
import com.project.college.ClgEntity.ClgEntity;


public interface ClgServiceInterface
{
	public List<ClgEntity> getAllStudents();
	
	public ClgEntity insert(ClgEntity clgEntity);

	public ClgEntity update(Long id,ClgEntity clgEntity);

	public String delete(Long id);

	public ClgEntity searchById(Long id);

	public List<ClgEntity> getByDept(String dept);

}
