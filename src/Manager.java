import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Manager {

	//Declare Hashmap here
	
	 static Map <Integer, Employee> hm = new HashMap<Integer, Employee>();
	


	public void UpdateEmp(Employee emp) {
		hm.replace(emp.getId(), emp);
		
	}

	public void DeleteEmp(int id) {
		// Removing the existing key mapping 
	    Employee v = (Employee)hm.remove(id); 
	  
	    // Verifying the returned value 
	    System.out.println("Returned value is: "+ v.getId()); 
		
	}

	public void getAllEmp() {
		 System.out.println("Inside method");
		 
	 	//hm.forEach((k, v) -> System.out.println("account: " + k + ", password: " + v));   
		
		
		 
		 for (Map.Entry<Integer, Employee> entry : hm.entrySet()) {
			    //  iterates over every entry in the map, creates a variable called "entry"

			    int key = entry.getKey();
			    Employee value = entry.getValue();

			    //  now you can print with whatever formatting you want. e.g.:
			    System.out.println("account: " + key + ", password: " + value);

			}
	    
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hm == null) ? 0 : hm.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		if (hm == null) {
			if (other.hm != null)
				return false;
		} else if (!hm.equals(other.hm))
			return false;
		return true;
	}

	public void getById(int id) {
		Employee employee=hm.get(id);
	     System.out.println("The Value mapped to Key 5 is:"+ employee.toString());
		
	}

	 
	

	public void Download() {
		 try {
		        File file=new File("fileMap.txt");
		        FileOutputStream fos=new FileOutputStream(file);
		        PrintWriter pw=new PrintWriter(fos);

		        for(Map.Entry<Integer,Employee> m :hm.entrySet()){
		            pw.println(m.getKey()+"="+m.getValue());
		        }

		        pw.flush();
		        pw.close();
		        fos.close();
		        System.out.println("End writting File");
		    } catch(Exception e) {}
		
	}

	public void CreateEmp(Employee emp) {
		System.out.println(emp.getId());
		 
		hm.put(emp.getId() , emp);
		 
		System.out.println(hm.entrySet());
	}

 
	 
 

}
