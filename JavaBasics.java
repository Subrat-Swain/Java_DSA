import java.util.*;
// import java.net.SocketTimeoutException;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthStyleFactory;

public class JavaBasics 
{
    public static void main(String args[])
    {

        // System.out.println("Hello World!\n");//ln use for another line
        // System.out.println("Hello World!\n");
        // System.out.println("Hello World!\n");//\n is also use for next line

        // System.out.println("Hello World\n Hello\n World!");


        // System.out.println("****");//print pattern
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // int a = 10;
        // int b = 5;
        // System.out.println(a);
        // System.out.println(b);
        // String name= "Tony Stark";
        // System.out.println(name);

        // a = b;
        // System.out.println(a);

        // byte b = 8;
        // System.out.println(b);
        // char ch = 'a';
        // System.out.println(ch);
        // boolean var = true;
        // float price = 10.5f;
        // int number = 25;
        // //long
        // //double 

        // int a = 10;
        // int b = 5;
        // int sum = a + b ;
        // System.out.println(sum);

        //Input In Java:-
        // Scanner sc = new Scanner(System.in);

        // // String input = sc.next();
        // // System.out.println(input); 

        // // String name = sc.nextLine();
        // // System.out.println(name);

        // // int number = sc.nextInt();
        // // System.out.println(number);

        // float price = sc.nextFloat();
        // System.out.println(price);

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = a * b;
        // System.out.println(product);

        // Scanner sc = new Scanner(System.in);
        // float rad = sc.nextFloat();
        // float area = 3.14f * rad * rad;
        // System.out.println(area);

        // int a = 25;
        // long b = a;

        // long a = 25;
        // int b = a;
        // System.out.println(b);

        // Scanner sc = new Scanner(System.in);
        // float number = sc.nextInt();
        // System.out.println(number);


        /**
         * Sum of two numbers with inputs:-
        */
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum); 

        /**
         * Product Of Two Number with user input:-
         */

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = a * b;
        // System.out.println(product);

        /**
         * Area Of A Circle:-
         */

        // Scanner sc = new Scanner(System.in);
        // Float radius = sc.nextFloat();
        // float area = 3.14f * radius * radius;
        // System.out.println(area);

        /**
         * Type Conversion:-Widening Conversion(Implicit Coversion)
         * byte->short->int->float->long->double
         */

        // int a = 25;
        // long b = a;

        // long a = 25;
        // int b =a;
        // System.out.println(b);

        // Scanner sc = new Scanner(System.in);
        // // int num = sc.nextFloat();
        // float number = sc.nextInt();
        // System.out.println(number);

        /**
         * Type Casting:-Narrowing conversion/Explicit Conversion
         */
        // Scanner sc = new Scanner(System.in);
        // float a = 25.12f;
        // int b = (int)a;
        // System.out.println(b);

        // char ch = 'a';
        // char ch2 = 'b';
        // int number = ch;
        // int number2 = ch2;
        // System.out.println(number);
        // System.out.println(number2);

        /**
         * Type Promotion:-
         */
        // char a = 'a';
        // char b = 'b';
        // // char c = 'a-b';
        // System.out.println((int)(b));
        // System.out.println((int)a);
        // System.out.println(a);
        // System.out.println(b-a);

        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = (byte)(a + b + c);
        // System.out.println(bt);

        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // double ans = a + b + c + d;
        // System.out.println(ans);

        // byte b = 5;
        // byte a = (byte)(b * 2);
        // System.out.println(a);

        /**
         * Arithmatic Operator:-
         */

        // int A = 10;
        // int B = 5;
        // System.out.println("modulo(remainder) = " +(A%B));
        // System.out.println(A-B);

        /**
         * Pre&Post Increment & Decrement:-
         */

        // int a = 10;
        // int b = a--;
        // System.out.println(a);
        // System.out.println(b);

        /**
         * Relational Operator:-
         */

        // // Equal to "=="
        // int A = 10;
        // int B = 10;
        // System.out.println(A == B);

        // // Not Equal To "!="
        // int A = 10;
        // int B = 10;
        // System.out.println(A!=B);

        // // Greater Than & Greater than equal to ">" & ">="
        // int A = 10;
        // int B = 5;
        // System.out.println(A>B);

        // // Less Than & Less Than Equal to "<" & "<="
        // int A = 10;
        // int B = 5;
        // System.out.println(A<B);

        /**
         * Conditional Statement:-
         */
        // int age = 17;
        // if(age >= 18){
        //     System.out.println("adult: drive, vote");
        // }
        // if(age > 13 && age< 18){
        //     System.out.println("teenager");
        // }
        // else{
        //     System.out.println("not adult");
        // }

        /**
         * Print the largest of 2 numbers with else if:-
         */
        // int A = 1, B = 5;
        // if(A >= B){
        //     System.out.println("A is largest of 2");
        //     System.out.println("A >= B");
        // }else{
        //     System.out.println("B is largest of 2");
        // }

        /**
         * Print if a number is Odd or Even:-
         */
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();

        // if(number % 2 == 0){
        //     System.out.println("EVEN");
        // }else{
        //     System.out.println("ODD");
        // }

        /**
         * else if Condition:-
         */
        // int age = 13;

        // if (age >= 18){
        //     System.out.println("Adult");
        // }
        // else if(age >= 13 && age < 18){
        //     System.out.println("Teenager");
        // }
        // else {
        //     System.out.println("Child");
        // }

        /**
         * Income Tax Calculator:-
         */
        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax;

        // if(income < 500000){
        //     tax = 0;
        // }
        // else if(income >= 500000 && income < 1000000){
        //     tax = (int) (income * 0.2);
        // }
        // else{
        //     tax = (int)(income * 0.3);
        // }
        // System.out.println("Your tax is : "+ tax);

        /**
         * Print the Largest of 3:-
         */
        // int A = 1, B = 3, C = 6;

        // if (A >= B && A >= C){
        //     System.out.println("Largest is A");
        // }else if(B >= C){
        //     System.out.println("Largest is B");
        // }
        // else{
        //     System.out.println("Largest is C");
        // }

        /**
         * Ternary Operator:-
         */
        // int number = 4;

        // String type = ((number % 2) == 0)? "even" : "odd";
        // System.out.println(type);

        /**
         * Check if a Student will Pass or Fail:-
         */

        // int marks = 67;

        // String reportCard = marks >= 33 ? "Pass" : "Fail";
        // System.out.println(reportCard);

        /**
         * Switch Case:- Integer/Character
         */
        
        // int number = 2;
        // switch(number){
        //     case 1 : System.out.println("Samosa");
        //         break;
        //     case 2: System.out.println("Burger");
        //         break;
        //     case 3 : System.out.println("Mango Shake");
        //         break;
        //     default: System.out.println("We Wake Up"); 
        // }

        // char ch = 'a';
        // switch(ch){
        //     case 'd' : System.out.println("Samosa");
        //         break;
        //     case 'a' : System.out.println("Burger");
        //         break;
        //     case 'c' : System.out.println("Mango Shake");
        //         break;
        //     default : System.out.println("We Wake Up");
        // }

        /**
         * Calculator:- Using Switch 
         */
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a : ");
        // int a = sc.nextInt();
        // System.out.println("Enter b : ");
        // int b = sc.nextInt();
        // System.out.println("Enter Operator : ");
        // char operator = sc.next().charAt(0);

        // switch(operator){
        //     case '+' : System.out.println(a+b);
        //         break;
        //     case '-' : System.out.println(a-b);
        //         break;
        //     case '*' : System.out.println(a*b);
        //         break;
        //     case '/' : System.out.println(a/b);
        //         break;
        //     case '%' : System.out.println(a%b);
        //         break;
        //     default: System.out.println("Wrong Operator");
        // }


        /**
         * Loops/Flow Control:-
         */
        // System.out.println("Hello World!");
        // System.out.println("Hello World!");
        // System.out.println("Hello World!");

        // int counter = 0;
        // while(counter < 100){
        //     System.out.println("Hello World!");
        //     counter++;
        // }
        // System.out.println("Printer HW 100x");

        /**
         * Print Number From 1 to 10:-
         */
        // int counter = 1;
        // while (counter <= 10){
        //     System.out.println(counter);
        //     counter++;
        // }

        /**
         * Print Number from 1 to n:-
         */
        // Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();
        // int counter = 1;
        // while(counter <= range){
        //     System.out.println(counter + "");
        //     counter++;
        // }

        /**
         * Print sum of first n natural numbers:-
         */

        // Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();
        // int i = 1;
        // int sum = 0;
        // while(i <= range){
        //     sum = sum + i;
        //     i++;
        // }
        // System.out.println("Sum of first n natural number is : "+sum);


        /**
         * For Loop:-
         */
        // for(int i=1; i<= 10; i++){
        //     System.out.println("Hello World!");
        // }

        /**
         * Print Square Pattern:-
         */
        // for(int line=1;line<=4;line++){
        //     System.out.println("****");
        // }

        // int line= 1;
        // while(line <= 4){
        //     System.out.println("****");
        //     line++;
        // }


        /**
         * Print Reverse of a number:-
         */

        // int n =25890;
        // while(n > 0){
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit);
        //     n = n / 10;
        // }


        /**
         * Reverse The given Number:-
         */
        // int n = 10899;
        // int rev = 0;
        // while(n > 0)
        // {
        //     int lastDigit = n % 10;
        //     rev = (rev * 10)+lastDigit;
        //     n = n/10;
        // }
        // System.out.println("Reverse Of Given Number is:"+rev);


        /**
         *  do-while Loop:-
         */
        // int counter = 1;
        // do{
        //     System.out.println("Hello World");
        //     counter++;
        // }while(counter <= 10);


        /**
         *  break statement:-
         */
        // for(int i = 1; i <= 5; i++){
        //     if(i == 3){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("I am out of the loop");

        /**
         * Keep entering numbers till user enters a multiple of 10
         */
        // Scanner sc = new Scanner(System.in);

        // do{
        //     System.out.println("Enter Your Number:-");
        //     int n = sc.nextInt();
        //     if(n % 10 == 0){
        //         break;
        //     }
        //     System.out.println("Your Number is:"+n);
        // }while(true);


        /**
         *  Continue Statement:-
         */
        // for(int i = 1; i<=5; i++){
        //     if(i == 3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        /**
         *  Display all number entered by user except multiple of 10
         */
        // Scanner sc = new Scanner(System.in);
        // do{
        //     System.out.println("Entere Your Number");
        //     int n = sc.nextInt();
        //     if(n % 10 == 0){
        //         continue;
        //     }
        //     System.out.println("Your Number Is :"+n);
        // }while(true);

        /**
         * Check if a number is prime or not 
         */
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your Number:-");
        // int n = sc.nextInt();
        
        // if(n == 2){
        //     System.out.println( n+" is Prime");
        // }else{
        //     boolean isPrime = true;
        //     for(int i = 2; i <= Math.sqrt(n); i++){
        //         if(n % i == 0){
        //             isPrime = false;
        //         }
        //     }
    
        //     if(isPrime == true){
        //         System.out.println(n+" is Prime");
        //     }else{
        //         System.out.println(n+" is not Prime");
        //     }
        // }


        /**
         * Print Star Pattern:- 
         */
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your Number:-");
        // int n = sc.nextInt();
        // for(int row = 1; row <= n; row++)
        // {
        //     for(int col = 1; col <= row; col++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /**
         * Inverted-Star Pattern:-
         */

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your Number:-");
        // int n = sc.nextInt();
        // for( int row = 1; row <= n; row++){
        //     for(int col=1; col<=(n-row)+1; col++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /**
         * Print Half-PYRAMID Pattern:-
         */

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your Numbeer:-");
        // int n = sc.nextInt();
        // for(int row = 1; row <= n; row ++){
        //     for (int col = 1; col<=row; col++){
        //         System.out.print(col);
        //     }
        //     System.out.println();
        // }

        /**
         * Print character Pattern:-
         * 
         * A
         * BC
         * DEF
         * GHIJ
         */

        // System.out.println("Enter Your Number:-");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // char ch = 'A';
        // for(int row = 1; row <=n; row++){
        //     for(int col = 1; col<=row; col++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }


        
        /**
         * Functions & Methods:-
         */
    }
} 