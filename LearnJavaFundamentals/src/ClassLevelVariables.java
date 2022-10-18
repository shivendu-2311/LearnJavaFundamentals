
public class ClassLevelVariables {
	
 String myName = "Shivendu Kumar";

public String firstN()
{
 int num = myName.indexOf(" ");
 return myName.substring(0,num);
}
public String secondN()
{
	 int num = myName.indexOf(" ");
	 return myName.substring(num+1);
}
public static void doSomething()
{
	System.out.println("I'm doing something");
}

}
