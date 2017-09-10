package university.debug;

import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Course> courseList;
	private Department dept;
	
	
	public Student(){
		name = "undefine";
		courseList = new ArrayList<Course>();
		dept = new Department();
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public void addCourse(Course newCourse){
			courseList.add(newCourse);
			newCourse.addStudent(this);
		
	}
	public ArrayList<Course> getCourse (){
		return courseList;
	}
	
	public void setDepartment(Department newDept){
		dept = newDept;
	}
	
	public Department getDepartment(){
		return dept;
	}
}
