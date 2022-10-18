
public class Methods {

	public static void main(String[] args)
	{
		for(String arg : args)
		{
			System.out.println(arg);
		}
		printMyName();
int num =addTwoNumbers(1,2);
System.out.println(num);
System.out.println(whoIsOlder(5, 6));
System.out.println(longerThan5("shivendu"));

ClassLevelVariables obj = new ClassLevelVariables();
String myName = obj.firstN()+ " " + obj.secondN();
System.out.println(myName);


//static member are used to call function of another class without creating instance of that class
ClassLevelVariables.doSomething();

	}
	public static int  addTwoNumbers(int n1, int n2)
	{
		System.out.println(n1 + n2);
		printMyName();
		return n1+n2;
	}
	
	public static void printMyName()
	{
		System.out.println("My name is Shivendu");
	}
	//Activity
	
	public static int whoIsOlder(int a1, int a2)
	{
		int num = 0;
		return num = a1 > a2?a1:a2;
	}
	public static boolean longerThan5(String str)
	{
		//return   str.length() > 5?true:false;
		return   str.length() > 6;
	}
}


