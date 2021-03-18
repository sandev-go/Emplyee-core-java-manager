import java.util.*;  

public class TestMain {

	public static void main(String[] args) {
		 char valeur;
		 String v;
		 int i;
		header();
		
				
		do {
		System.out.println("Select a number between 1-7?");
		 Scanner in = new Scanner(System.in); 
		   i = in.nextInt();
		 
		 Employee emp= new Employee();
		 Manager m=new Manager();
		 
		 switch (i) {
		  case 1:
			  Employee emp1 = setEmployeeValues(in);
			  m.CreateEmp(emp1);
		    break;
		  case 2:
			  m.UpdateEmp(emp);
		    break;
		  case 3:
			  
			  System.out.println("Enter Id that you want to delete?");
				  
			  i = in.nextInt();
			   
			  m.DeleteEmp(i);
		    break;
		  case 4:
			  System.out.println("before method");
			  m.getAllEmp();
		    break;
		  case 5:
			  System.out.println("Enter Id that you want to display?");
			  
			  i = in.nextInt();
		    m.getById(i);
		    break;
		  case 6:
		    m.Download();
		    break;
		  case 7:
			  System.exit(0);
		    break;
		}
		 
		 System.out.println("Do you want to continue ? Y/N");
		  
		  valeur = in.next().charAt(0);
		 v = Character.toString(valeur)  ;
		 
		 
		}while(v.equalsIgnoreCase("y"));
		
		
		

	}

	private static Employee setEmployeeValues(Scanner in) {
		 Employee emp=new Employee();
		System.out.println("Enter Employee Id:");
		  int id = in.nextInt();  
		  emp.setId(id);
		  
		  System.out.println("Enter Employee firstName:");
		  String fname = in.next();  
		  emp.setFirstName(fname);
		  
		  System.out.println("Enter Employee lastName:");
		  String lname = in.next();  
		  emp.setLastName(lname);
		  
		  System.out.println("Enter Employee Designation:");
		  String des = in.next();  
		  emp.setDesignation(des);
		  
		  System.out.println("Enter Employee Age:");
		  int age = in.nextInt();  
		  emp.setAge(age);
		  
		  return emp;
	}

	private static void header() {
		System.out.println("************** Employe Platform ****************");
		
		System.out.println("1- Create Employee");
		System.out.println("2- Update Employee");
		System.out.println("3- Delete Employee");
		System.out.println("4- Get all Employees");
		
		System.out.println("5- Get Employee by ID");
		System.out.println("6- Download");
		System.out.println("7- Exit");
	}

}
