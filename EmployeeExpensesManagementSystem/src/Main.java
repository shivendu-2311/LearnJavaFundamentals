
public class Main {

	public static void main(String[] args) {
  Employee employee1 = new Employee();
  employee1.setId(1);
  employee1.setFirstName("Shivendu");
  employee1.setSurname("Kumar");
  employee1.setTitle("Kumar");
  
  Employee employee2 = new Employee(2,"Manager");
  
 System.out.println(employee1.getMailingName());
 System.out.println(employee1.getMailingName(true));
 System.out.println(employee1.getMailingName(false));
 
 Department financeDept= new Department("Finance", "Sally Green");
 System.out.println(financeDept.getName());
 System.out.println(financeDept.getManagerName());
 
	}

}
