package university;

import java.util.ArrayList;

import university.debug.Department;

public class University {
	private ArrayList<Department> departmentArray;
	
	
	public University(){
		departmentArray = new ArrayList<Department>();
	}
	
	public void addDepartment(Department newDept){
			departmentArray.add(newDept);
		
	}
	
	public ArrayList<Department> getDepartment(){
		return departmentArray;
	}
	
}
