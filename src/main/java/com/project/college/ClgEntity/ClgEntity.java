package com.project.college.ClgEntity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Value;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonPropertyOrder({"rollno", "name", "dept","section","year","cgpa","backlogs","historyOfArrear"})
@Data
@Entity
public class ClgEntity
{
	@Id
	@GeneratedValue
	private Long rollno;
	private String name;
	private String dept;
	private String section;
	private int year;
	private float cgpa;
	@Value("0")
	private int backlogs;
	@Value("0")
	private int historyOfArrear;
	private String place;
	private String placementInterested;

}
