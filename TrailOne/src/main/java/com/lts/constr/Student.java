package com.lts.constr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	String name;
	Integer studId;
	String dept;
	
	Course course;
	
	
	@Autowired
	public Student(Course course) {
		super();
		this.course = course;
	}
	
	public String getName() {
		return name;
	}
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStudId() {
		return studId;
	}
	@Value("${student.studId}")
	public void setStudId(Integer studId) {
		this.studId = studId;
	}
	public String getDept() {
		return dept;
	}
	@Value("${student.dept}")
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", studId=" + studId + ", dept=" + dept + ", course=" + course + "]";
	}
	

}
