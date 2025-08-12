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


        // String adjective1;
        // String noun1;
        // String adjective2;
        // String verb1;
        // String adjective3;

        // System.out.print("Enter adjective1 : ");
        // adjective1 = userInput.nextLine();

        // System.out.print("Enter noun1 : ");
        // noun1 = userInput.nextLine();

        // System.out.print("Enter adjective2 : ");
        // adjective2 = userInput.nextLine();

        // System.out.print("Enter verb1 : ");
        // verb1 = userInput.nextLine();

        // System.out.print("Enter adjective3 : ");
        // adjective3 = userInput.nextLine();


        // System.out.println("Today I went to a " + adjective1 + " zoo.");
        // System.out.println("In an exhibit, I saw a " + noun1 + ".");
        // System.out.println( noun1 + " was " + adjective2 + " and " + verb1 + " !");
        // System.out.println( "I was " + adjective3 + "!");

        // String item ;
        // double price ;
        // int quantity ;
        // double total ;


        // System.out.print("What item would you like to buy? : ");
        // item = userInput.nextLine();

        // System.out.print("What is the price for each? : ");
        // price = userInput.nextDouble();
        // userInput.nextLine();
        
        // System.out.print("How many would you like? : ");
        // quantity = userInput.nextInt();
        // userInput.nextLine();

        // total = price * quantity;

        // System.out.println("\nYou have bought "+ quantity + " " + item+ "/s.");
        // System.out.println("You total is $"+ total + ".");

        // double a;
        // double b;
        // double c;

        // System.out.print("Enter length of Side A : ");
        // a = userInput.nextDouble();

        // System.out.print("Enter length of Side B : ");
        // b = userInput.nextDouble();
        
        // c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        // System.out.println("Hypotenuse of Side C is " + c);

        // CODE TO FIND OUT AREA & CIRCUMFERENCE OF A CIRCLE & VOLUME OF SPHERE.

        // double radius;
        // double circumference;
        // double area;
        // double volume;

        // System.out.print("Enter the Radius : ");
        // radius = userInput.nextDouble();

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        
        // System.out.printf("Circumference of circle with %.1f is %.1f.\n", radius , circumference );
        // System.out.printf("Area of circle with %.1f is %.1f.\n", radius , area );
        // System.out.printf("Volume of Sphere with %.1f is %.1f.\n", radius , volume );


        // COMPOUND INTEREST CALCULATOR 

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the Principal amount : ");
        principal = userInput.nextDouble();
        userInput.nextLine();

        System.out.print("Enter the Rate of Interest(in %) : ");
        rate = userInput.nextDouble() /100;
        userInput.nextLine();

        System.out.print("Enter the time of amount has to be compounded : ");
        timesCompounded = userInput.nextInt();
        userInput.nextLine();

        System.out.print("Enter the years for amount is invested : ");
        years = userInput.nextInt();
        userInput.nextLine();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The Amount after %d years is $%,.2f.\n",years, amount);

        userInput.close();
    }
}