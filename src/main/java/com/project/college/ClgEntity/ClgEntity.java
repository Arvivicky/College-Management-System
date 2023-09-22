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
	private Long Rollno;
	private String Name;
	private String Dept;
	private String Section;
	private int Year;
	private float Cgpa;
	@Value("0")
	private int Backlogs;
	@Value("0")
	private int HistoryOfArrear;

}
