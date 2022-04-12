package batch2pack;
import java.util.HashMap;
import java.util.Map;
class EmployeeDetails{
	private Integer id;
	private double salary;
	private String designation;
	
	public EmployeeDetail(Integer id,double salary,String designation) {
		this.id=id;
		this.salary=salary;
		this.designation=designation;
	}
	public Integer getId() {
		return id;
	}
	public void setId() {
		this.id=id;
	}
	public double getSalary() {
		return salary;
	}
	public void setsalary() {
		this.salary=salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation() {
		this.designation=designation;
	}
	public String toString() {
		'return "Employee{" + "Id=" + id + '\' + ", salary=""	+ salary+ '\' + ", Designation="" + designation + '\' +'}';
	
}
public class lab4program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,EmployeeDetails>employeeMap=new HashMap<>();
		employeeMap.put(1001, new EmployeeDetails(1001,4000,"Clerk"));
		employeeMap.put(1002, new EmployeeDetails(1002,40000,"Programmer"));
		
		sysout
		

	}

}
