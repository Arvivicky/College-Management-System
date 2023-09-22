package com.project.college.ClgService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.college.ClgEntity.ClgEntity;
import com.project.college.ClgRepo.ClgRepoInterface;

@Service
public class ClgService implements ClgServiceInterface 
{
	
	@Autowired 
	private ClgRepoInterface clgRepoInterface;
	
	@Override
	public List<ClgEntity> getAllStudents()
	{
		List<ClgEntity> clglist=new ArrayList<ClgEntity>();
		
		clglist=(List<ClgEntity>) clgRepoInterface.findAll();
		
		return clglist;
	}
	
	@Override
	public ClgEntity insert(ClgEntity clgEntity)
	{
		ClgEntity clgEntity2=new ClgEntity();
		try {
			clgEntity2=clgRepoInterface.save(clgEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clgEntity2;
	}
	
	@Override
	public ClgEntity update(Long id,ClgEntity clgEntity)
	{
		ClgEntity clgEntity2=new ClgEntity();
		try {
			if(id>0)
			{
				clgEntity2=clgRepoInterface.findById(id).get();
				if(clgEntity2!=null)
				{
					if(clgEntity.getName()!=null)
					{
						clgEntity2.setName(clgEntity.getName());
					}
					if(clgEntity.getDept()!=null)
					{
						clgEntity2.setDept(clgEntity.getDept());
					}
					if(clgEntity.getCgpa()!=0)
					{
						clgEntity2.setCgpa(clgEntity.getCgpa());
					}
					if(clgEntity.getSection()!=null)
					{
						clgEntity2.setSection(clgEntity.getSection());
					}
					if(clgEntity.getYear()!=0)
					{
						clgEntity2.setYear(clgEntity.getYear());
					}
					if(clgEntity.getBacklogs()!=0)
					{
						clgEntity2.setBacklogs(clgEntity.getBacklogs());
					}
					if(clgEntity.getHistoryOfArrear()!=0)
					{
						clgEntity2.setHistoryOfArrear(clgEntity.getHistoryOfArrear());
					}
					
					clgRepoInterface.save(clgEntity2);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clgEntity2;
	}
	
	@Override
	public String delete(Long id)
	{
		try {
			clgRepoInterface.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "Data Deleted";
	}
	
	@Override
	public ClgEntity searchById(Long id)
	{
		ClgEntity clgEntity=new ClgEntity();
		try {
			clgEntity=clgRepoInterface.findById(id).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return clgEntity;
	}
}
