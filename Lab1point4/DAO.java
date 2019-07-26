package Lab1point4;

import java.util.List;

public class DAO {
	private List<Employee> emplist;
	public DAO() {
		// TODO Auto-generated constructor stub
	}
	public List<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}
	public DAO(List<Employee> emplist) {
		super();
		this.emplist = emplist;
	}
	

}
