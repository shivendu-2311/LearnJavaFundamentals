
public class ExpenseClaim {

	private int id;
	private int employeeID;
	private String dateOfClaim;
	private double totalAmount;
	private boolean approved;
	private boolean paid;
	public ExpenseClaim(int id, int employeeID, String dateOfClaim, double totalAmount) {
		super();
		this.id = id;
		this.employeeID = employeeID;
		this.dateOfClaim = dateOfClaim;
		this.totalAmount = totalAmount;
		approved = false;
		paid = false;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public void setPaid(boolean paid) {
		if(approved == false)
		{
			System.out.println("This item cannot be paid as it has not yet been approved");
		}
		else
		{
		this.paid = paid;
	    }
	}

	public int getId() {
		return id;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public String getDateOfClaim() {
		return dateOfClaim;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public boolean isApproved() {
		return approved;
	}

	public boolean isPaid() {
		return paid;
	}
	
	
	
	
	
}
