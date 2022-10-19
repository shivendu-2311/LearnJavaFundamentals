
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
 
 //Practical Exercise
 System.out.println(" ");
 System.out.println("**************************************************");
 System.out.println("Practical Exrecise");
 
 
 ExpenseClaim exp = new ExpenseClaim(2,18141349,"19-10-2022",5000.0);
 exp.setApproved(true);
 exp.setPaid(true);
 System.out.println("Id - " +exp.getId());
 System.out.println("Employee Id - " +exp.getEmployeeID());
 System.out.println("DateOfClaim - " +exp.getDateOfClaim());
 System.out.println("Total Amount to Approved - " +exp.getTotalAmount());
 System.out.println("Is Expense Approved - " +exp.isApproved());
 System.out.println("Is Expense is Paid - " +exp.isPaid());
 
 System.out.println(" ");
 System.out.println("**************************************************");
 
 ExpenseItem emp = new ExpenseItem(1,11,"Tour","Went to Banglore offce for business meeting", 10000.0);
 System.out.println("Id - " +emp.getId());
 System.out.println("Claim ID - " +emp.getClaimId());
 System.out.println("Type Of Expense - " +emp.getExpenseType());
 System.out.println("Description - " +emp.getDescription());
 System.out.println("Amount - " +emp.getAmount());
 
 
	}

}
