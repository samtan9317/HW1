package university.debug;

import java.util.ArrayList;

public class Course {
	private String name;
	private ArrayList<Integer> schedule;
	private ArrayList<Integer> courseNum;
	private ArrayList<Student> studentList;
	private Department dept;
/*	private String[] Week = {"Mon","Tue" , "Wed" , "Thu", "Fri"};
	private String[] Slot = {"8:00am to 9:15am",
							 "9:30am to 10:45am",
							 "11:00am to 12:15pm",
							 "12:30pm to 1:45pm",
							 "2:00pm to 3:15pm",
							 "3:30pm to 4:45pm"};

*/
	public Course(){
		name = "undefine";
		schedule = new ArrayList<Integer>();
		courseNum = new ArrayList<Integer>();
		studentList = new ArrayList<Student>();
		dept = new Department();
	}
	
	public void setName(String newName){
		name = newName;
	}
	public void setDepartment(Department newDept){
		dept = newDept;
	}
	public void setSchedule(Integer newSchedule){
			schedule.add(newSchedule);	
	}
	public void setCourseNumber(Integer newNum){
		courseNum.add(newNum);

	}
	public ArrayList<Student> getStudentRoster(){
		return studentList;
	}
	public String getName(){
		return name;
	}
	public Department getDepartment(){
		return dept;
	}

	public ArrayList<Integer> getSchedule(){
/*		int i = 0;
		String week;
		String time;
		int[] holder = new int[this.schedule.size()];
		for(i = 0;i < this.schedule.size();i++){
			holder[i] = this.schedule.get(i);			
		}
		for()*/
		return schedule;
	}
	public ArrayList<Integer> getCourseNumber(){
		return courseNum;
	}
	public void addStudent(Student newStudent){
			studentList.add(newStudent);
		
	}
	
	
}
