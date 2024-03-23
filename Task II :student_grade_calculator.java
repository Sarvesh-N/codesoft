
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
