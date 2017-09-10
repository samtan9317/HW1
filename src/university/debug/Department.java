package university.debug;

import java.util.ArrayList;

public class Department {
	private String name;
	private ArrayList<Course> courseArray;
	private ArrayList<Student> studentArray;

	
	
	
	public Department(){
		name = "undefine";
		courseArray = new ArrayList<Course>();
		studentArray = new ArrayList<Student>();
		
	}

	
	public void setDepartmentName(String newName){
		name = newName;
	}
	
	
	public void addCourse (Course newCourse){
			courseArray.add(newCourse);
			newCourse.setDepartment(this);
		
	}
	
	public void addStudent(Student newStudent){
			studentArray.add(newStudent);
			newStudent.setDepartment(this);
	}
	
	public ArrayList<Course> getCourse(){
		return courseArray;
	}
	
	public ArrayList<Student> getStudents(){
		return studentArray;
	}
	

	public String getDepartmentName(){
		return name;
	}
}
