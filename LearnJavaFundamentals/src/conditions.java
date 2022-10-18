
public class conditions {
	public static void main(String[] args) {
		int testScore = 10;
		
		if(testScore >= 60)
		{
			System.out.println("Well Done You Passed");
		}
		else if(testScore == 0)
		{
			System.out.println("Go and study hard");
		}
		else
		{
			System.out.println(" You Failed");
		}
	
	
	switch (testScore) {
	case 0:{
		System.out.println("Did you even take the test");
		break;
	}
	case 100:{
		System.out.println("You got top marks");
		break;
	}
	default:{
		System.out.println("You did't do anything special");
		break;
	}
	}
	if(testScore>0 && testScore%10 ==0)
	{
System.out.println("Kiska hai ye Tumko intejarr mai ho na");		
	}
	}
	
}
