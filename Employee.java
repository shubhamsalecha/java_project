package shubham;

import java.util.*;
import java.io.*;

public class Employee extends Thread implements Runnable
{
   int id;
   String name;
   double salary;

   Scanner sc;
   Thread th;

   EmployeeDetails details;
   BufferedReader br;

   public Employee()throws Exception
   {
     super("My Thread");
     sc = new Scanner(System.in);
     th = new Thread(this);

     br = new BufferedReader(new InputStreamReader(System.in));
     
     System.out.println("Enter your name:");
     String name = sc.next();
     System.out.println("Enter your Department:");
     String dept = sc.next();
     System.out.println("enter your age:");
     int age = sc.nextInt();

     if(age > 25)
     {
     
     System.out.println("Please wait until we are storing your information, You're patience is appreciated");
     Thread.sleep(2000);

     details = new EmployeeDetails(name,age,dept);
     Thread.sleep(1000);

     System.out.println("Information Succesfully stored");

     System.out.println("Please answer the following questions....");

     th.start();
     th.join();
     
     System.out.println(" ............");
     System.out.println("Thanks for answering, Have a good Day "+details.getName());

     }

     else 
       new InternException();
     
   }

   public void run()
   {
    try 
    {
       Thread.sleep(2000);
       questions();
       Thread.sleep(2000);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
   }

   public Employee(int id,String name,double salary)
   {
      this.id = id;
      this.name = name;
      this.salary = salary;
   }

   public static void main(String args[])
   {
      try 
      {
            System.out.println("Welcome to Shubham IT Solutions!!");
            System.out.println("This is a Yearly Survey being conducted");
            System.out.println("Please fill in the details for future reference");
            new Employee();
            
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
   }
 
   public void questions()throws Exception
   {
     System.out.println("1) How was your past experience at the company?");
     String response1 = br.readLine();

     System.out.println("2) When was the last time you travelled on company expense?");
     String response2 = br.readLine();

     System.out.println("3) When was the last time you had an audit in the company?If any changes, please suggest");
     String response3 = br.readLine();

     
      Thread.sleep(2000);

      System.out.println("Want to make any Changes ??,then type yes "+details.getName());
      String response = sc.next();

      if(response.equals("yes"))
        questions();
       
         System.out.println("Before You Leave Please review your response");

         Thread.sleep(3000);

      System.out.println("--------------------");
      details.store(response1,response2,response3);
      System.out.println("--------------------");
   }
};