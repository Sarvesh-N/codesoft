
/*  1.data types
primitive and  non primitive
primitive = int , double , char , flaot...
non primitive = user defined data types
Stirng : unlike the other primitive data type its name start with capital
		 its an class : we can give data to string by creating an class eg : String name = new String("sarvesh"); (or)
		 String name = "sarvesh";
		 eg:
	there are two types they are :
		*mutable strings = change the value of string
		eg : mutable strings
		class Java // class name
  {
	public static void main(String[]args) // main mathod
	{
		String name = "sarevsh";
		name = name + " CSE";

		String s1 = "Sarvesh";
		String s2 = "Sarvesh";

		System.out.println(name);
		System.out.println(s1 +"\n"+ s2);
	}
  }

   STRINGS Functions:

  class Main{
	public static void main(Stirng[]args){}
		String txt1 = "hello";
		String txt2 = "world";
		System.out.println(txt1.toUppercase);
		System.out.println(txt1.toLowercase);
		System.out.println(txt1.length());
		System.out.println(txt1.indexOf());
		System.out.println(txt1+" "+txt2);
		System.out.println(txt1.concat(txt2));

  }
  }



if we want to manipulate strings in java we can use the string buffer or string builder both are similar but have a slight differents
*immutable strings = cannot change the value of the string by default the strings are immutable
once we create an object it cannot be changed
	eg : stringbuffer
class Java
{
	public static void main(String[]args)
	{
		StringBuffer s = new StringBuffer("sarvesh");

		s.append(" helloo");

		System.out.println(s);


	}
}



*/
/*  2.variables
 it is used to store the different types of values
*/

/*
 *  3.LITERALS
 * literals are the value stored in the variables
 * eg:number,charcters,decimal values,names or alphabets
 */

 /*class Java
 {
	public static void main(String[]args)
	{
		int num = 0b10;
		char x = 'a';
		boolean a = true;
		System.out.println(a);
	}
 }*/

 /*
  * 4. TYPE CONVERSION , CASTING AND PROMOTIONS
  		it is used to convert one datatype to other datatype
 		syntax :
 				var1 =(datatype)var2
				eg:
 					byte a = 126;
					int b = 12;
					a = (byte)b;
  */
// eg program
/*class java
{
	public static void main(String[]args)
	{
		int a = 300;
		byte b = 29;
		b =(byte)a;
		float f = 10.9f;
		int t = (int)f;
		System.out.println(b);
	}

	type promotions
	if we use two byte value in the result the byte value is converted into int,float or double according to the output by mentioning the datatype for the result variable
	eg : byte a = 10;
		 byte b = 30;
		 int result = a*b;
		 System.out.println(result);
}*/

/* OPERATORS
	ARITHMETIC, LOGICAL , RELATIONAL , CONDITIONAL , SHIFT...

	ARITHMETIC
			Add,Subtraction,Multiplication,Division,Modulus..

	RELATONAL
			comaparing 2 values (>,>,==,!=,>=,<=)

	LOGICAL
			used to compare the three values(that is using the relational operator for 3 values in a single line
			)AND(&&),OR(||,NOT(!))  are the two logical operator


 */
/*CONDITIONAL STATEMENTS
	if , else & elif is known as some of the conditional statement in java
	in this the condition is 1st checked in the "if" block if the condition given is satisfied
	then the "if" block is executed else the "else" block will be executed.
	else if is also an another conditional statement in java it is used to give more conditions ..*/

/* TERNARY OPERATOR
 * 	it's also known as a conditional operator it works based on the condition given. It is basically a if else statment
 * it consist of question mark(?) and a colon(:)
 * Syntax = condition ? print statment : print statement(else parts)
 */

/*SWITCH STATEMENT
 *  Instead of writing many if..else statements, you can use the switch statement.
	The switch statement selects one of many code blocks to be executed

	working : instead of checking the given condition and it will compare the given input with the values assigned to the cases
	=> the "case" keyword is used to define any type of condition
	=> "break" keyword is an jumping statement it is used between the "cases" so the use of breaek is only print what is required and
		avoid all other stuffs.
	default : this is a keyword used to print a default output if the input is not matched for any cases then the default statement is
			  printed in the output the default statement is ooptional
 */
/*import java.util.Scanner;

class Java
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("enter a number:");
		int n = s.nextInt();

		if(n>10){
			System.out.println("its greater than 10");
		}
		else if(n==10){
			System.out.println("its  equal to 10");
		}
		else{
			System.out.println("its  less than 10");
		}

		String message = n>10 ? "its greater than 10": n == 10 ? "its equal to 10" : "its less than 10";
		System.out.println(message);

		switch(n < 10 ? 0 : n == 10 ? 1 : 2){

			case 0:
				System.out.println("its less than 10");
				break;
			case 1:
				System.out.println("its equal to 10");
				break;
			case 2:
				System.out.println("its greater than 10");

		}
	}
}*/
/*
 * LOOPS - it is used to do a task multiple times untill the condition is satisfied
 * there are different types loops they are : while, do-while, for.
 * WHILE LOOP -  it is one of the looping statement it executes something untill the condition in the while loop becomes false
example for while loop:
 class Java
 {
	public static void main(String[]args)
	{
		int i = 1;
		while(i<5)
		{
			System.out.println("heiii "+i);
			for(int j = 1 ; j<3;j++)
			{
				System.out.println("hello "+j);
				j++;
			}

			i++;
		}
	}
 }*/
/*
 * DO WHILE : without checking the condition the statement is printed and after printing the condition is checked if is is satisfied and it will be iterated
 * and the print statement is printed untill the condition becomes false if . The do whilr loop prints the print statement atleast once even the the 1st iteration itself failed.
 * Syntax : do
 * {
 * System.out.println("hello");
 * }while(var>5);
 *
 * For loop: the for loop is very convinient loop in this loop the initialaization ,contidion,&increment or decrement statements all the three are given in the same line
 * syntax: for(int i = 1;i<5;i++)
 * {
 * System.out.println("haiii");
 * }
 *
 * FOR EACH LOOP :
 * 			it is an optimised version of an for loop ,it works only in array and array type data
 * 			syntax : for(int n : datatype to iterate){
 * }
 * eg:
 * 		class Java
{
	public static void main(String[]args)
	{
		int num[] = new int[3];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		for(int n: num) // enhanced for loop
		{
			System.out.println(n);
		}
	}
}
 eg 2:
	class Java
	{
	public static void main(String[]args)
	{
		Students s1 = new Students();

		s1.name = "SARVESH";
		s1.rollno = 12;

		Students s2 = new Students();
		s2.name = "HARSHINI";
		s2.rollno = 26;

		Students students[] = new Students[2];
		students[0] = s1;
		students[1] = s2;

		for (Students n : students)
		{
			System.out.println(n.name +" "+n.rollno);
		}
	}
}
class Students // here this clas is decalres due to run time error(main String[] not found)
{
	String name;
	int rollno;
}

 *
 * OBJECT -  it is an real world entity it has property and behavior
 * CLASS - it is an blueprint for an object the give data is converted into an byte code using "JVM" and the byte code is responsible for creating the object
 */
//hackerrank solution
/*class Solution
{

    public static void main(String[] args)
	{
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
			{
				System.out.println("enter a string");
                String s1=sc.next();
				System.out.println("enter a number:");
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x);

            }
            System.out.println("================================");

    }
}*/

/* METHODS
 * A method is a block of code which only runs when it is called.

You can pass data, known as parameters, into a method.

Methods are used to perform certain actions, and they are also known as functions.

Why use methods? To reuse code: define the code once, and use it many times.

METHOD OVERLOADING :
Method overloading in Java is a concept that allows defining multiple methods with the same name but different parameters in the same class.
123 It is one of the ways through which Java supports polymorphism, a concept of object-oriented programming that deals with multiple forms. Method overloading can be done by changing the number of arguments or by changing the data type of arguments.
1 To avoid ambiguity, Java demands that such methods have different signatures in order to be able to tell them apart.4 Every time an object calls a method, Java matches up to the method name first and then the number and type of parameters to decide what definitions to execute.
5 This feature is mainly used to increase the readability of the program and make it look better.
method overloading example
class Java
{
	public static void main(String[]args)
	{
		Demo  d = new Demo();
		System.out.println(d.add(1.1,4.10));
	}
}
class Demo
{
	public int add(int n1,int n2)
	{
		int result = n1+n2;
		return result;
	}
	public int add(int n1, int n2,int n3)
	{
		int result = n1+n2+n3;
		return result;
	}
	public double add(double n1,double n2)
	{
		double result = n1+n2;
		return result;
	}

}*/

/*
 * ARRAYS
 * 		arrays is an collection of a similar datatype and store in a memory
 * TYPES
 * 		single dimension array & multi dimensional array
 * SINGLE DIMENSIONAL ARRAY:
 * 				its an array of an elements, it  contains an  elements in an array
 * SYNTAX:
 * 		datatype var_name = {values separated by commas}; or datatye var_name = new dataype[];
 * MULTI DIMENSIONAL ARRAY:
 * 				its an array of array, it contains an arrays in a array
 * SYNTAX:
 * 		datatype var_name[][] = new int[][]
 *
 * MATH RANDOM FUNTION ITS IS USED TO PRINT ANY RANODM VALUES IT WILL PRINT THE VALUES IN THE FORM OF DOUBLE WE HAVE TO TYPE CASTE IT
 * LIKE WE WANT AND THE ENHANCED FOR LOOP IS ALSO USED IN THE BELOW EXAMPLE:
 * EXAMPLE :
 * 			class Java{
	public static void main(String[]args)
	{
		int num[][] = new int[3][3];
		for (int i = 0;i<3;i++)
		{
			for (int j = 0;j<3;j++)
			{
				num[i][j] = (int)(Math.random()*10);
			}
		}

		for (int i = 0;i<3;i++)
		{
			for (int j = 0;j<3;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println();

		for(int n[]: num)
		{
			for(int m : n )
			{
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}
}
*JAGGED ARRAY = in the jagged array we won't specify the size of the array , we have to manually specify the separate array
size in this method..!
eg:	int n[][] = new int[3][];
n[0] = new int[3];
n[1] = new int[2];
n[2] = new int[4];

class Java{
	public static void main(String[]args)
	{
		int num[][] = new int[3][];
		num[0] = new int[3];
		num[1] = new int[2];
		num[2] = new int[4];

		for (int i = 0;i<num.length;i++)
		{
			for (int j = 0;j<num[i].length;j++)
			{
				num[i][j] = (int)(Math.random()*10);
			}
		}

		for (int i = 0;i<num.length;i++)
		{
			for (int j = 0;j<num[i].length;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println();
	}
}
3-DIMENSINAL ARRAY : int num[][][] = new int [3][3][3];
class Java{
	public static void main(String[]args){
		int num[][][] = new int[3][3][3];

		for (int i = 0;i<num.length;i++)
		{
			for(int j = 0;j<num[i].length;j++)
			{
				for (int k = 0;k<num[j].length;k++)
				{
					num [i][j][k] = (int)(Math.random()*10);
				}
			}
		}
		for (int i = 0;i<num.length;i++)
		{
			for(int j = 0;j<num[i].length;j++)
			{
				for (int k = 0;k<num[j].length;k++)
				{
					System.out.print(num[i][j][k]+" ");

				}
				System.out.println("");
			}
			System.out.println();
		}
	}
}
ARRAY OF OBJECTS:
	in this we create an object and then set it to the array
	we use the same obeject  name to create an array of obj
	eg :
		regular array creation = int num[] = new int[3];
		array of object = Student student[] = new Student[3];
		here the Student is the class name ,the new keyword is used to create an array of obj (Students[3] represets the size,stdudent[] is the name of the array)
	eg:
	class Java
	{
	public static void main(String[]args)
	{
		Students s1 = new Students();

		s1.name = "SARVESH";
		s1.rollno = 12;

		Students s2 = new Students();
		s2.name = "HARSHINI";
		s2.rollno = 26;

		Students students[] = new Students[2];
		students[0] = s1;
		students[1] = s2;

		for(int i = 0;i<students.length;i++)
		{
			System.out.println(students[i].name + " : " + students[i].rollno);
		}
	}
}
class Students // here this class is decalres due to run time error(main String[] not found)
{
	String name;
	int rollno;
}
 STATIC VARIABLE :
		unlike the other variable it gives the same value for all the objects that called with that particular class that the varibale is defined
		and the varibale that decalred inside the class is called instance class .

		Eg:
class Java
{
	public static void main(String[]args)
	{
		Detail obj1 = new Detail();
		obj1.name = "sarvesh";
		obj1.age = 19;
		obj1.place = "cooimbatore";

		Detail obj2 = new Detail();
		obj2.name = "saravana";
		obj2.age = 22;
		obj2.place = "annur";

		Detail.place = "USA";
		obj1.display();
		obj2.display();

	}
}

class Detail
{
	String name ;
	int age ;
	static String place ;

	public void display()
	{
		System.out.println(name +" : "+age+" : "+place);
	}
}
 ***In this example the place variable is declared as a static variable and also it is known as instance variable
	when the value of the static vaiable is changed for  one object then all the objects which refers that variable changes the value
	=>it gives common value for all the objects which refers that varible.
	=>We can call the Static varible by the class name itself ,its does mean for any separate variable oject common for all object.
	=>in non static methods also we use the static variable.

Static method :
	=>A non static method cannot be called by the class name ,but the static method can be called by the class name
	=> If the method does not have the static key word then it is called as instance method
	=> We can use the static variable inside the static method ,but we can't use the non static variable inside the static variable
	=>when we have to call the main class we have to create an object but when the mathod is declared as a static then it does not need a object so that only we are using static in main mathod
	=> But we can use the non static variable indirectly by calling the oject name in the parenthesis eg:
*/

/*
public class Java {
    public static void main(String[] args) {
        Detail obj1 = new Detail();
        obj1.name = "sarvesh";
        obj1.age = 19;
        obj1.place = "coimbatore";

        Detail obj2 = new Detail();
        obj2.name = "saravana";
        obj2.age = 22;
        obj2.place = "annur";

        Detail.place = "USA";
        obj1.display();
        obj2.display();
        Detail.display1();
    }
}

class Detail {
    String name;
    int age;
    static String place;

    public void display() {
        System.out.println(name + " : " + age + " : " + place);
    }

    public static void display1() {
        System.out.println(Detail.place);
    }

STATIC MEMBERS:

}*/
/*import java.util.Scanner;
class Java
{
  public static void main(String[]args)
  {
     int n1,n2;
     int no;

     Scanner s = new Scanner(System.in);
     System.out.println("enetr how many numbers:");
     no = s.nextInt();
     for(int i = 0;i<no;i++)
     System.out.println("enter a number 1:");
     n1 = s.nextInt();
     System.out.println("enter a number 2:");
     n2 = s.nextInt();
     System.out.println("choose operator");
     System.out.println("+,-,*,/,%");
     char operator;
     int result = 0;
     operator = s.next().charAt(0);

     switch (operator)
     {
       case '+':
       result = n1+n2;
         break;

       case '-':
         result = n1-n2;
         break;

       case '*':
         result = n1*n2;
         break;

       case '/':
        result =  n1/n2;
         break;

       case'%':
         result = n1%n2;
         break;
     }
    System.out.println("the value of %d and %d is %d".formatted(n1, n2, result));
  }
}*/

/*class Java {
	public static void main(String[]args){

		int arr[][] = {
			{1,2,3},
			{4,5,6},
			{7,8,9},
		};

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(i+j == 3-1){
					System.out.print(arr[i][j]+" ");

				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}*/


//java Math
/*class Java {
	public static void main(String[]args){
	System.out.println(Math.abs(-200));// prints the absolute value of the give negative number
	System.out.println(Math.max(10,4));//find max
	System.out.println(Math.min(10,4)); // find min

	int maxnum = (int)(Math.random()*10); // prints the random number
	System.out.println("random "+maxnum);
	System.out.println(Math.sqrt(81)); // prints the square root of the given number
	}
}*/

/*import java.util.Random;
import java.util.Scanner;

class Main{
    public static void main(String[]args){

        Scanner s = new Scanner(System.in); // creating an object for scanner to get input
        Random r = new Random(); // creating an object to print a random number

        int minrange = 0;
        int maxrange = 100;
        int score = 0;
        int attemptlimit = 3;
        boolean playagain = true;

        while(playagain){
            int numbergenerator = r.nextInt(maxrange - minrange+2);

            System.out.println("NUMBER GUESSSING GAME");
            System.out.println("Choose the number between range of "+minrange+" and "+maxrange);

            int attempts = 0;
            boolean gussedcorrectly = true;

            while(attempts<attemptlimit && gussedcorrectly){

                System.out.println("ATTEMPTS LEFT :"+(attemptlimit-attempts));
                System.out.println("Enter your guess:");
                int usergussednumber = s.nextInt();

                if(usergussednumber == numbergenerator){
                    System.out.println("Congrats you gussed correctly ");
                    score = score+(attemptlimit-attempts);
                } else if (usergussednumber < numbergenerator) {
                    System.out.println("Entered number is smaller, Try again");
                }
                else{
                    System.out.println("Entered number is larger, Try again");
                }
                attempts++;
            }
            if(!gussedcorrectly){
                System.out.println("You ran out of the chances, Try again");
            }
            System.out.println("your score is :"+score);
            System.out.println("The correct answer is :"+numbergenerator);
            System.out.println("Do you want to play again ?(yes/no)");
            String restart = s.next();
            playagain = restart.equalsIgnoreCase("yes");
        }
        System.out.println("Your final score is :"+score);
        s.close();
    }
}*/

import java.util.Scanner;

class Main { // main class


    public static void main(String[] args) { // main method
        Scanner s = new Scanner(System.in); // creating an object "s" for getting an input

        System.out.println("enter how many subjects:");
        int no_of_subject = s.nextInt();  // getting an input value for number of subject

        int totalmark = 0;
        for (int i = 0; i < no_of_subject; i++) {
            System.out.println("Subject" + (i + 1) + ":");  // it prints the no of subjects that you want to enter
            int mark = s.nextInt();
            totalmark += mark; // add and store the value in totalmark variable
        }

        int average = totalmark / no_of_subject;
        System.out.println(average);

        System.out.println("Total marks : " + totalmark);
        System.out.println("Average : " + average);
        printresult(average); // calling the printresult() function
    }

    static void printresult(int average) {

        if (average >= 90 && average <= 100) {
            System.out.println("You got A grade");
        }
        else if (average >= 80){
            System.out.println("You got B grade");
        }
        else if (average >= 70) {
            System.out.println("You got C grade");
        }
        else if(average >= 60){
            System.out.println("You got D grade");
        }
        else if(average >= 50){
            System.out.println("You got E grade");
        }
        else{
            System.out.println("You are fail!!!");
        }

    }
}
