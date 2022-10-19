
public class Employee {
	
	private int id;
	private String title;
	private String firstName;
	private String surname;
	private String jobTitle;
	private String department;
	
	
	//constructors start
	public Employee()
	{
		
	}
	public Employee(int id, String jobTitle)
	{
		this.id = id;
		this.jobTitle = jobTitle;
	}
	
	
	
	
	public Employee(int id, String title, String firstName, String surname, String jobTitle, String department) {
		super();
		this.id = id;
		this.title = title;
		this.firstName = firstName;
		this.surname = surname;
		this.jobTitle = jobTitle;
		this.department = department;
	} //constructor end
	
	//Method Overloading 
	
	public String getMailingName()
	{
		return title + " " + firstName + " " + surname;
	}
	public String getMailingName(boolean firstIntialOnly)
	{
		if(firstIntialOnly)
		{
		return title + " " + firstName.substring(0,1) + " " + surname;
		}
		else
		{
			return title + " " + surname;
		}
	}
	
	public void setId(int id)
	{
		//id = value;
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	public void setTitle(String title)
	{

		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setFirstName(String firstName)
	{
		if(firstName.length()<2)
		{
		System.out.println("Error - firstName must be greater than Two charecter");
		}
		else {
		this.firstName = firstName;
		}
	}
	
	public String getFirstName()
	{
		
		return firstName;
	}
	
	public void setSurname(String surname)
	{
  
		if(surname.length()<2)
		{
		System.out.println("Error - surname must be greater than Two charecter");
		}
		else {
		this.surname = surname;
		}
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public void setJobTitle(String jobTitle)
	{

		this.jobTitle = jobTitle;
	}
	
	public String getJobTitle()
	{
		return jobTitle;
	}
	
	public void setDepartment(String department)
	{

		this.department = department;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
}
