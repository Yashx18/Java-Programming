
// import java.util.ArrayList;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;
// import java.util.Random;
import java.util.Scanner;


public class Main {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        // String name = "bro code";
        // int gta = 6;
        // double pi = 3.14159;
        // char gender = 'M';
        // boolean isAdmin = true;

        // System.out.println("hi " + name + " Your gender is " + gender + ", Current
        // Gta version is " + gta + ", value of PI is " + pi + " Are you an Admin ? " +
        // isAdmin);

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

        // System.out.println("Your name is " + username + ", you are " + age + " years
        // old and your GPA is " + gpa + ".");
        // if (isStudent) {
        // System.out.println("You are enrolled in as Student.");
        // } else {
        // System.out.println("You are NOT enrolled.");

        // }
        // userInput.close();

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

        // System.out.println("Area of " + width + " & " + height + " is" + area + ".");
        // } else {
        // area = width * height;
        // System.out.println("Area of width " + width + " & height " + height + " is "
        // + area + ".");
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

        // System.out.printf("Circumference of circle with %.1f is %.1f.\n", radius ,
        // circumference );
        // System.out.printf("Area of circle with %.1f is %.1f.\n", radius , area );
        // System.out.printf("Volume of Sphere with %.1f is %.1f.\n", radius , volume );

        // COMPOUND INTEREST CALCULATOR

        // double principal;
        // double rate;
        // int timesCompounded;
        // int years;
        // double amount;

        // System.out.print("Enter the Principal amount : ");
        // principal = userInput.nextDouble();
        // userInput.nextLine();

        // System.out.print("Enter the Rate of Interest(in %) : ");
        // rate = userInput.nextDouble() /100;
        // userInput.nextLine();

        // System.out.print("Enter the time of amount has to be compounded : ");
        // timesCompounded = userInput.nextInt();
        // userInput.nextLine();

        // System.out.print("Enter the years for amount is invested : ");
        // years = userInput.nextInt();
        // userInput.nextLine();

        // amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded *
        // years);

        // System.out.printf("The Amount after %d years is $%,.2f.\n",years, amount);

        // VALUES EXTRACTOR FROM EMAIL

        // String email;
        // System.out.print("Enter your Email : ");
        // email = userInput.nextLine();

        // if (email.contains("@")) {
        // int point = email.lastIndexOf("@");
        // String username = email.substring(0, point);
        // String domain = email.substring(point + 1);

        // System.out.printf("Your email is %s\n", email);
        // System.out.printf("Your username is %s\n", username);
        // System.out.printf("Your domain name is %s\n", domain);

        // } else {
        // System.out.println("Emails must contain '@'.");
        // }

        // WEIGHT CONVERSION PROGRAM

        // double weight;
        // double newWeight;
        // int choice;

        // System.out.println("Weight Conversion Program");
        // System.out.println("Opt 1. Convert Lbs to Kgs");
        // System.out.println("Opt 2. Convert Kgs to Lbs");

        // System.out.print("Enter your choice (1/2) : ");
        // choice = userInput.nextInt();

        // if (choice == 1 || choice == 2) {
        // System.out.print("Enter the Weight : ");
        // weight = userInput.nextDouble();
        // userInput.nextLine();

        // if (choice == 1) {
        // newWeight = weight * 0.45359237;
        // System.out.printf("%.2f lbs is equals to %.2f kgs.\n", weight, newWeight);
        // } else {
        // newWeight = weight * 2.20462;
        // System.out.printf("%.2f kgs is equals to %.2f lbs.\n", weight, newWeight);
        // }
        // } else {
        // System.out.println("Choose from the Options (1/2).");
        // System.out.println("Opt 1. Convert Lbs to Kgs");
        // System.out.println("Opt 2. Convert Kgs to Lbs");
        // }

        // TERNARY OPERATOR '? '

        // int num = 2;
        // String evenOrOdd = (num % 2 == 0) ? "EVEN" : "ODD";
        // System.out.println(evenOrOdd);

        // TEMPERATURE CONVERTER

        // double temperature;
        // double result;
        // String choice;

        // System.out.print("Enter the temperature : ");
        // temperature = userInput.nextDouble();
        // userInput.nextLine();

        // System.out.print("Convert to Celsius or Fahrenheit? (C or F) : ");
        // choice = userInput.next().toUpperCase();

        // result = (choice.equals("C")) ? (temperature - 32) * 5 / 9 : (temperature *
        // 9/5) +32;

        // System.out.printf("%.2f °%s\n", result, choice );

        // CALCULATOR PROGRAM

        // double num;
        // double secondNum;
        // char operation;
        // double result = 0;
        // boolean state = true;

        // System.out.print("Enter the first number : ");
        // num = userInput.nextDouble();

        // System.out.print("Enter the Operation you want to perform ( +, -, *, /, %, ^)
        // : ");
        // operation = userInput.next().charAt(0);

        // System.out.print("Enter the second number : ");
        // secondNum = userInput.nextDouble();

        // switch (operation) {
        // case '+' -> result = num + secondNum;
        // case '-' -> result = num - secondNum;
        // case '*' -> result = num * secondNum;
        // case '/' -> {
        // if (secondNum != 0) {
        // result = num / secondNum;
        // } else {
        // System.out.printf("%.2f can not be divided by %.2f\n", num, secondNum);
        // state = false;
        // }
        // }
        // case '%' -> result = num % secondNum;
        // case '^' -> result = Math.pow(num, secondNum);
        // default -> {
        // System.out.println("Enter a valid operation.");
        // state = false;
        // }
        // }

        // if (state) {
        // System.out.println(result);
        // }

        // WHILE LOOP for USER INPUT

        // String input = "";

        // while(!input.equals("I yield") ){
        // System.out.print("Enter the input : ");
        // input = userInput.nextLine();
        // }

        // NUMBER GUESSING GAME

        // Random random = new Random();

        // int guess;
        // int attempts = 9;
        // int randomNumber = random.nextInt(101) + 1;
        // boolean gameOver = false;
        // String replay = "";
        // ArrayList previousGuess = new ArrayList<>();
        // boolean start = true;

        // while (!gameOver) {

        // if (start == true ) {
        // System.out.println("RULES :\nYou have 10 attempts to guess the Right answer.
        // ");
        // start = false;
        // }

        // if (attempts == 0) {
        // System.out.println("Oops, No more attempts remaining. GAME OVER !!");
        // System.out.printf("Correct Answer was %d.\n", randomNumber);
        // } else {

        // System.out.print("Enter your guess between 1-100 : ");
        // guess = userInput.nextInt();
        // if (guess < 0 && guess > 100) {
        // continue;
        // } else {
        // previousGuess.add(guess);

        // }

        // if (guess == randomNumber) {
        // System.out.printf("You have Guessed the right number, The answer was %d.\n",
        // randomNumber);
        // System.out.println("Previous Guesses: " + previousGuess);
        // attempts = 9;
        // gameOver = true;
        // } else if (guess > randomNumber) {
        // System.out.printf("Attempts Remaining : %d\n", attempts);
        // System.out.printf("Your guess '%d' is greater than the Correct Answer\n",
        // guess);
        // System.out.println("Previous Guesses: " + previousGuess);
        // attempts--;
        // } else if (guess < randomNumber) {
        // System.out.printf("Attempts Remaining : %d\n", attempts);
        // System.out.printf("Your guess '%d' is smaller than the Correct Answer\n",
        // guess);
        // System.out.println("Previous Guesses: " + previousGuess);
        // attempts--;
        // } else if (guess < 0 && guess > 100) {
        // System.out.printf("Enter a number netween 1-100");
        // System.out.println("Previous Guesses: " + previousGuess);
        // }
        // }

        // }

        // System.out.print("Would you like to play again? (Yes / No) : ");
        // replay = userInput.nextLine().toUpperCase();

        // while (replay.equals("")) {

        // if (replay.equals("YES")) {
        // gameOver = true;
        // start = true;
        // }else if (replay.equals("NO")) {
        // System.out.println("Alright Bye !!");
        // }else{
        // System.out.println("Enter valid input.");
        // }
        // }

        // MATRIX PROGRAM

        // int row;
        // int columns;
        // char symbol;

        // System.out.print("Enter the number of rows : ");
        // row = userInput.nextInt();

        // System.out.print("Enter the number of columns : ");
        // columns = userInput.nextInt();

        // System.out.print("Enter the symbol to use : ");
        // symbol = userInput.next().charAt(0);

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < columns; j++) {
        // System.out.printf("%c ", symbol);
        // }
        // System.out.println();
        // }

        // JAVA BANKING PROGRAM

        // double balance;
        // int choice = 0;
        // boolean isRunning = true;

        // System.out.print("Enter the Funds you have ($) : ");
        // balance = userInput.nextDouble();

        // while (isRunning) {
        // System.out.println("********************");
        // System.out.println("BANKING PROGRAM");
        // System.out.println("********************");
        // System.out.println("1. Show balance");
        // System.out.println("2. Deposit");
        // System.out.println("3. Withdraw");
        // System.out.println("4. Exit");
        // System.out.println("********************");
        // System.out.print("Enter your Option (1-4) : ");
        // choice = userInput.nextInt();

        // switch (choice) {
        // case 1 -> showBalance(balance);
        // case 2 -> {
        // balance += deposit();
        // System.out.println("------------------------------");
        // System.out.printf("Updated Balance is $%,.2f\n", balance);
        // System.out.println("------------------------------");
        // }
        // case 3 -> {
        // double response = withDraw();
        // if(response > balance){
        // System.out.println("Insufficient Funds");
        // } else {
        // balance -= response;
        // System.out.println("------------------------------");
        // System.out.printf("Updated Balance is $%,.2f\n", balance);
        // System.out.println("------------------------------");
        // }
        // }
        // case 4 -> {
        // System.out.println("Alright, Bye !!");
        // isRunning = exit();
        // }
        // default -> {
        // System.out.println("Invalid Input ! Choose from the given options (1-4) !");
        // }
        // }
        // }

        // ADDING USERINPUT TO ARRAY

        // String[] arr;
        // int size;
        // System.out.print("How many items you want to enter? : ");
        // size = userInput.nextInt();
        // userInput.nextLine();
        // arr = new String[size];
        // String item = "";

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print("Enter the Input : ");
        // item = userInput.nextLine();
        // arr[i] = item;
        // }

        // // for (String input : arr) {
        // // System.out.println(input);
        // // }
        // System.out.println(Arrays.toString(arr));

        // ROLL THE DICE

        // Random random = new Random();
        // int numOfDice;
        // int roll = 0;
        // int total = 0;
        // System.out.print("Enter the number of Dice : ");
        // numOfDice = userInput.nextInt();

        // for (int i = 0; i < numOfDice; i++) {
        // roll = random.nextInt(1, 7);
        // total += roll;
        // System.out.printf("Rolled the dice and got %d.\n", roll);

        // switch (roll) {
        // case 1 -> System.out.println("""
        // ---------
        // | |
        // | ● |
        // | |
        // ---------
        // """);
        // case 2 -> System.out.println("""
        // ---------
        // | ● |
        // | |
        // | ● |
        // ---------
        // """);
        // case 3 -> System.out.println("""
        // ---------
        // | ● |
        // | ● |
        // | ● |
        // ---------
        // """);
        // case 4 -> System.out.println("""
        // ---------
        // | ● ● |
        // | |
        // | ● ● |
        // ---------
        // """);
        // case 5 -> System.out.println("""
        // ---------
        // | ● ● |
        // | ● |
        // | ● ● |
        // ---------
        // """);
        // case 6 -> System.out.println("""
        // ----------
        // | ● ● |
        // | ● ● |
        // | ● ● |
        // ----------
        // """);

        // }
        // }
        // System.out.printf("Your total is %d.\n",total);

        // VARARGS

        // System.out.println("Your Total is "+add(1, 2, 3, 4));
        // System.out.println("Your Avg. is " + avg(1,2,3,4));

        // 2D ARRAYS

        // char[][] telephone = {
        // {'1', '2', '3'},
        // {'4', '5', '6'},
        // {'7', '8', '9'},
        // {'*', '0', '#'},
        // };
        // for (char[] row : telephone) {
        // for (char element : row) {
        // System.out.printf("%c ", element);
        // }
        // System.out.println();
        // }

        // JAVA QUIZ GAME

        // int marks = 0;

        // String[] questions = {
        // "What is the main function of a router ?",
        // "Which part is considered the brain of a computer ?",
        // "What year was Facebook was launched ?",
        // "Who is knows as the father of Computer ?",
        // "What was the first programming language ?",
        // };

        // String[][] options = {
        // {
        // "1. Storing Files",
        // "2. Encrypting Data",
        // "3. Directing Internet Traffic",
        // "4. Managing Passwords",
        // },
        // {
        // "1. CPU",
        // "2. Hard Drive",
        // "3. RAM",
        // "4. GPU",
        // },
        // {
        // "1. 2000",
        // "2. 2004",
        // "3. 2006",
        // "4. 2008",
        // },
        // {
        // "1. Steve Jobs",
        // "2. Bill Gates",
        // "3. Alan Turing",
        // "4. Charles Babbage",
        // },
        // {
        // "1. COBOL",
        // "2. C",
        // "3. FORTRAN",
        // "4. Assembly",
        // },
        // };

        // int[] answers = {
        // 3,
        // 1,
        // 2,
        // 4,
        // 3,
        // };
        // System.out.println();
        // System.out.println("****************************");
        // System.out.println("WELCOME TO THE JAVA QUIZ GAME !!");
        // System.out.println("****************************");
        // System.out.println();

        // for (int i = 0; i < questions.length; i++) {
        // System.out.println(questions[i]);
        // for (String opt : options[i]) {
        // System.out.println(opt);
        // }
        // System.out.println();
        // System.out.print("Enter your choice (1-4) : ");
        // int choice = userInput.nextInt();
        // userInput.nextLine();

        // if (choice == answers[i]) {
        // System.out.println("-------------");
        // System.out.println("CORRECT !");
        // System.out.println("-------------");
        // marks++;
        // } else {
        // System.out.println("-------------");
        // System.out.println("WRONG !");
        // System.out.println("-------------");
        // }

        // }
        // System.out.printf("Your scored %d out of %d in this Quiz !\n", marks,
        // questions.length);

        // ROCK , PAPER , SCISSORS GAME

        // String[] choices = {
        // "rock",
        // "paper",
        // "scissors"
        // };
        // String keepPlaying = "yes";

        // String user;

        // while (!keepPlaying.equals("no")) {
        // System.out.print("Enter your choice (rock , paper , scissors) : ");
        // user = userInput.nextLine().toLowerCase();

        // Random random = new Random();

        // if (!user.equals("rock") && !user.equals("paper") &&
        // !user.equals("scissors")) {
        // System.out.println("Invalid Choice !!");
        // continue;
        // }

        // String computer = choices[random.nextInt(3)];
        // System.out.println("Computer chose "+ computer);

        // if (user.equals(computer)) {
        // System.out.println("Tie");
        // }else if((user.equals("rock") && computer.equals("scissors")) ||
        // (user.equals("paper") && computer.equals("rock")) || (user.equals("scissors")
        // && computer.equals("paper"))){
        // System.out.println("User Won !");
        // }else {
        // System.out.println("Computer Won !");
        // }
        // System.out.print("Want to keep playing ? (Yes/No) : ");
        // keepPlaying = userInput.nextLine().toLowerCase();

        // if (keepPlaying.equals("no")) {
        // System.out.println("Alright, Bye !!");
        // }

        // }

        // SLOT MACHINE PROJECT

        // int balance = 100;
        // int bet;
        // String choice;
        // boolean keepPlaying = true;
        // String[] slotOptions = { "🍉", "🍊", "🍇", "🥭", "🍎" };
        // Random random = new Random();
        // String[] res = new String[3];

        // System.out.println("***************************************");
        // System.out.println("WELCOME TO THE JAVA SLOT MACHINE !!");
        // System.out.println("***************************************");

        // while (keepPlaying) {

        //     System.out.print("Enter your bet : ");
        //     bet = userInput.nextInt();

        //     if (bet <= 0) {
        //         System.out.println("Bet can't be less than 0.");
        //     } else if (bet > balance) {
        //         System.out.println("Insufficient funds !!");
        //     } else {
        //         System.out.printf("Placed bet of $%d.\n", bet);
        //         balance -= bet;
        //         System.out.println("Your Current Balances is $ " + balance);

        //         System.out.println("Spinning...");
        //         for (int i = 0; i < 3; i++) {
        //             res[i] = slotOptions[random.nextInt(slotOptions.length)];
        //         }
        //         for (String item : res) {
        //             System.out.printf("%s ", item);
        //         }

        //         if (res[0].equals(res[1]) && res[1].equals(res[2]) ) {
        //             switch (res[0]) {
        //                 case "🍉" -> {
        //                     bet *= 3;
        //                     System.out.printf("You WON !! Your bet became", bet);
        //                     System.out.println("Your total Balance is now " + balance + bet);
        //                 }
        //                 case "🍊" -> {
        //                     bet *= 4;
        //                     System.out.printf("You WON !! Your bet became", bet);
        //                     System.out.println("Your total Balance is now " + balance + bet);
        //                 }
        //                 case "🍇" -> {
        //                     bet *= 5;
        //                     System.out.printf("You WON !! Your bet became", bet);
        //                     System.out.println("Your total Balance is now " + balance + bet);
        //                 }
        //                 case "🥭" -> {
        //                     bet *= 6;
        //                     System.out.printf("You WON !! Your bet became", bet);
        //                     System.out.println("Your total Balance is now " + balance + bet);
        //                 }
        //                 case "🍎" -> {
        //                     bet *= 8;
        //                     System.out.printf("You WON !! Your bet became", bet);
        //                     System.out.println("Your total Balance is now " + balance + bet);
        //                 }

        //                 default -> {
        //                     bet *= 0;
        //                     System.out.printf("You LOST !! ", bet);
        //                 }
        //             }
        //             System.out.println("Want to Keep playing (y/n) : ");
        //             choice = userInput.nextLine();
        //             if (choice.equals("n")) {
        //                 keepPlaying = false;
        //                 System.out.println("You cashed out, your total balance is $"+ balance);
        //             } else if (choice.equals("y")) {
        //                 keepPlaying = true;
        //             } else {
        //                 System.out.println("Enter a Valid Input");
        //             }
        //         }
        //         System.out.println();
        //     }
        // }

        // OBJECTS

        // Student student1 = new Student("Ken", 20 , 7.34);
        // Student student2 = new Student("Yash", 21 , 8.34);
        // Student student3 = new Student("Yash", 21 , 8.34);
        // Student student4 = new Student("Yash", 21 , 8.34);

        // student1.occupation();
        // student2.occupation();
        // student3.occupation();
        // student4.occupation();
        // System.out.println(Student.numOfStudents);
        // System.out.println(student1.schoolName);

      try(FileWriter file = new FileWriter("test.txt");) {
          file.write("IS THIS WORKING?");
          System.out.println("located");
      } catch (Exception e) {
        System.out.println(e);
        // TODO: handle exception
      }

    }
    // -----METHODS-----

    // this one here is a overloaded method that accepts no finited number of arguments.
    static double avg(double... numbers) {
        double res = 0;
        for (double d : numbers) {
            res += d;
        }
        return res / numbers.length;
    }

    static int add(int... number) {
        int sum = 0;
        for (int i : number) {
            sum += i;
        }
        return sum;

    }

    // Methods used in the BANKING PROGRAM.

    static void showBalance(double balance) {
        System.out.println("------------------------------");
        System.out.printf("Your Balance is $%,.2f\n", balance);
        System.out.println("------------------------------");
    }

    static double deposit() {
        System.out.print("Enter the amount to Deposit : ");
        double amount = userInput.nextDouble();
        if (amount < 0) {
            System.out.println("------------------------------");
            System.out.print("Amount can't be Negative.");
            System.out.println("------------------------------");

            return 0;
        } else {
            return amount;
        }
    }

    static double withDraw() {
        System.out.print("Enter the amount to withdraw : ");
        double amount = userInput.nextDouble();
        if (amount < 0) {
            System.out.println("------------------------------");
            System.out.print("Amount can't be Negative.");
            System.out.println("------------------------------");

            return 0;
        } else {
            return amount;
        }
    }

    static boolean exit() {
        return false;
    }
}