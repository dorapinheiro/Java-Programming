package sessao.dois;

public class Manager extends Employee {

	private String deptName;
	
	public Manager(){
		super(1, null, null, 0.0);
	}
	
	public Manager(int empid, String name, String ssn, double salary,
			String dept) {
		super(empid, name, ssn, salary);
		this.deptName=dept;
	}
	
	

	
	public String getDeptName() {
		return deptName;
	}
	
	
	
	public void setName(int i)
	{
		super.setName(i + "!!!!");
	}
}
