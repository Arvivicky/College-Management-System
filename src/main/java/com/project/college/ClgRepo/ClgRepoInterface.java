package com.project.college.ClgRepo;

import org.springframework.data.repository.CrudRepository;

import com.project.college.ClgEntity.ClgEntity;

public interface ClgRepoInterface extends CrudRepository<ClgEntity, Long>
{

}
