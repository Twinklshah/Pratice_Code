package first_java_project;

public class my_mainclass {
	
	public static void main(String[] args) {
		
		//Employ emp=new Employ();
		//System.out.println("salary of the employ is " +(emp.salary=1000));
		//System.out.println("hourly rate of employ is "+(emp.hourly_rate=10));
		//int wage=emp.Calculate_wage(30);
		//System.out.println("wage of the employ is " + wage);
		
		getter_setter gs=new getter_setter();
		gs.setRoll_no(12);
		gs.setName("neha");
		
		System.out.println(gs.getRoll_no());
		System.out.println(gs.getName());
		
		
	}

}
