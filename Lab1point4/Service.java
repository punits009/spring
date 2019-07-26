package Lab1point4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
	
	public Employee getAll(int eid)
	{
		List<Employee> elist=new ArrayList<Employee>();
		Employee e=new Employee();
		ApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");
		DAO dao=context.getBean("dao",DAO.class);
		elist=dao.getEmplist();
		for(Employee e1:elist)
		{
			if(e1.getEmployeeId()==eid)
			{
				e= e1;
				break;
			}
			else
			{
				e=null;
			}
			
		}
		return e;
		
	}

}
