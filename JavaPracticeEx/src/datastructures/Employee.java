package datastructures;

public class Employee {
	
	private String eName;
	private String eId;
	private String sal;
	
	
	
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	
	
	public String toString()
	{
		return eId+" "+eName+" "+" "+sal;
	}
	
	

}
