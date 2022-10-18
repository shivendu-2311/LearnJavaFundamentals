public class Variables {
public static void main(String args[]) {
	int  i = 1,j;
	j = 2;
	long a = 300000000000L;
	double anotherVariable = 17.5;
	float anotherVariableType = 17.3F;
	var notRecommended = 5;
	//notRecommended = 14.7;
	//var ___ can't assign value to of diffrent datatype 
	//if you have already assigned some other datatype value
System.out.println(a);

int first =100;
int second =50;
int third = first;
first = 65;

System.out.println("first " + first);
System.out.println("second " + second);
System.out.println("third " + third);

int weExpect1 = first/second;
System.out.println("First is divided by second and We expect  " + weExpect1);

double WeExpectOnePointThree = (double)first/second;
System.out.println("First is divided by second and We expect  "+ WeExpectOnePointThree);
int myAge= 22;
myAge++;
System.out.println(myAge);
System.out.println(myAge++);
System.out.println(--myAge);

boolean iAmYoungerThan20 = false;
System.out.println(iAmYoungerThan20);
char myFirstNameStartWith = 's';
System.out.println(myFirstNameStartWith);

int[] myArray = {1,2,3,4,5};
System.out.println(myArray[0]);
}
}
