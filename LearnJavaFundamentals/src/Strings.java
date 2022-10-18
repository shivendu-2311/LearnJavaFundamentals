
public class Strings {

	public static void main(String args[])	{
		String str = "Shivendu";
		
		// Various string methods
		int len = str.length();
		System.out.println("my name is " + str);
		System.out.println("This has" + len + "charecters");
		System.out.println(str.contains("Shiv"));
		System.out.println(str.toUpperCase());
		System.out.println(str.startsWith("Sh"));
		System.out.println(str.indexOf("h"));
		System.out.println(str.indexOf("ay"));
		
		
		String pharse = "Festive Seasons Are Coming";
		System.out.println(pharse.substring(0,7));
		System.out.println(pharse.replace("Are","is"));
		System.out.println(pharse);
		
		String name = "shiv";
		String name1 = "shiv";
		//== operator doesn't work to compare string java
		System.out.println(name.equals(name1));
		
		String today = "sunday";
		String nextDay = "";
		
		nextDay = today.equals("sunday")?"monday":"tuesday";
		
		System.out.println(nextDay);
		
	//activity
		
		String word = "Sandra Burnside";
	   
		System.out.println(word.indexOf(" "));
		System.out.println(word.substring(7));
		
		boolean evenLength;
		
		evenLength = word.length()%2 == 0? true:false;
		System.out.println(evenLength);
		
		
		//concatenation of string
		
		System.out.println(str +" " + word);
		System.out.println(str +" " + word +" " + evenLength);
		
		//About String Literals in Java or its alternatives
		
		String greeting = "Good Morning "+ word  + " Today is "+nextDay;
		String greeting2 = String.format("Good Morning %s Today is %s", word, nextDay);
		System.out.println(greeting);
		System.out.println(greeting2);
		
		// split method to change string to string of array 
		String colors = "red, green, blue, pink";
		
		String[] colorsArray=  colors.split(", ");
		
		
		for(String it : colorsArray)
		{
			System.out.println(it);
		}
		
	}
}
