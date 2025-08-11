import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // String name = "bro code";
        // int gta = 6;
        // double pi = 3.14159;
        // char gender = 'M';
        // boolean isAdmin = true;
        
        // System.out.println("hi " + name + " Your gender is " + gender + ", Current Gta version is " + gta + ", value of PI is " + pi + " Are you an Admin ? " + isAdmin);

        // Scanner userInput = new Scanner(System.in);
        
        // System.out.print("Enter your age : ");
        // int age = userInput.nextInt();
        // userInput.nextLine();
        
        // System.out.print("Enter your name : ");
        // String username = userInput.nextLine();
        
        // System.out.print("Enter your GPA : ");
        // double gpa = userInput.nextDouble();
        // userInput.nextLine();

        // System.out.print("Are you a student ? (true/false) : ");
        // boolean isStudent = userInput.nextBoolean();

        // System.out.println("Your name is " + username + ", you are " + age + " years old and your GPA is " + gpa + ".");
        // if (isStudent) {
        //     System.out.println("You are enrolled in as Student.");
        // } else {
        //     System.out.println("You are NOT enrolled.");
            
        // }
        //  userInput.close();

        Scanner userInput = new Scanner(System.in);

        // double width = 0 ;
        // double height = 0 ;
        // double area = 0;

        // System.out.print("Enter width: ");
        // width = userInput.nextDouble();
        // userInput.nextLine();

        // System.out.print("Enter height: ");
        // height = userInput.nextDouble();
        // userInput.nextLine();

        // if (width == 0 && height == 0) {
            
        //  System.out.println("Area of " + width + " & " + height +  " is" + area + ".");
        // } else {
        //     area = width * height;
        //     System.out.println("Area of width " + width + " & height " + height +  " is " + area + ".");
        // }


        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter adjective1 : ");
        adjective1 = userInput.nextLine();

        System.out.print("Enter noun1 : ");
        noun1 = userInput.nextLine();

        System.out.print("Enter adjective2 : ");
        adjective2 = userInput.nextLine();

        System.out.print("Enter verb1 : ");
        verb1 = userInput.nextLine();

        System.out.print("Enter adjective3 : ");
        adjective3 = userInput.nextLine();


        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println( noun1 + " was " + adjective2 + " and " + verb1 + " !");
        System.out.println( "I was " + adjective3 + "!");

        userInput.close();
    }
}