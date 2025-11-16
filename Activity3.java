import java.util.Scanner;
 public class Activity3 {
   public static void main(String[] args) {
   Scanner console = new Scanner(System.in);
   
   int SECRET;
   double RATE;

   SECRET = 11;
   RATE = 12.50;

   int num1, num2, newNum;
   String name;
   double hoursWorked, wages;

   System.out.print("Enter two integers: ");
   num1 = console.nextInt();
   num2 = console.nextInt();
   System.out.println("The value of num1 = " + num1 + " & The value of num2 = " +num2);

   newNum = num1*2 + num2;
   System.out.println("The value of newNum = " +newNum);

   newNum = newNum + SECRET;
   System.out.println("The value of newNum =" +newNum);

   System.out.print("Enter your last name : ");
   name = console.next();

   System.out.print("Enter hoursWorked (0-70): ");
   hoursWorked = console.nextDouble();

   wages = RATE*hoursWorked;

   System.out.println("Name : " +name);
   System.out.println("Pay Rate: $" +RATE);
   System.out.println("Hours Worked : " + hoursWorked);
   System.out.println("salary : " +wages);
  }
}
   

 