package Lab1point4;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");
		SBU sbu = context.getBean("BU", SBU.class);

		System.out.println("SBU details");
		System.out.println("---------------------");
		System.out.println("SBU Id : "+sbu.getSbuId());
		System.out.println("SBU Head : "+sbu.getSbuHead());
		System.out.println("SBU Name : "+sbu.getSbuName());

		
		System.out.println("---------------------");
		System.out.println("Employee details");
		System.out.println("---------------------");
		List<Employee> e=sbu.getEmpList();
		for(Employee emp2:e){
			System.out.println("empId="+emp2.getEmployeeId()+" "+"empName="+emp2.getEmployeeName()+" "+"empSalary="+emp2.getSalary());
		}
        
		Service service=new Service();
		System.out.println("enter the employee id you want to search");
        int eid=Integer.parseInt(read.readLine());
		Employee e2=service.getAll(eid);
		if(e2!=null)
		{
			System.out.println(e2.getEmployeeId()+" "+e2.getEmployeeName()+" "+e2.getSalary());
		}
		else
		{
			System.out.println("No employee found"); 
			
		}
	}

}