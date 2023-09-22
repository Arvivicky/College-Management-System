package com.project.college.ClgRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.college.ClgEntity.ClgEntity;

public interface ClgRepoInterface extends JpaRepository<ClgEntity, Long>
{
	@Query("select e from ClgEntity e WHERE e.dept = :dept")
	List<ClgEntity> getByDept(@Param("dept") String dept);
	
	@Query("select e from ClgEntity e WHERE e.placementInterested = :placementInterested")
	List<ClgEntity> getPlacementInterested(@Param("placementInterested")String placementInterested);


}
