package shubham;

public class  EmployeeDetails 
{
    String name,dept,response1,response2,response3;
    int age;

   public EmployeeDetails()
   {

   }
   public EmployeeDetails(String name,int age,String dept)
   {
    this.name = name;
    this.age = age;
    this.dept = dept;
   }

   public void setName(String name)
   {
    this.name = name;
   }
   public String getName()
   {
    return name;
   }

   public void setDept(String dept)
   {
    this.dept = dept;
   }
   public String getDept()
   {
    return dept;
   }

   public void setAge(int age)
   {
    this.age = age;
   }
   public int getAge()
   {
    return age;
   }

   public String toString()
   {
    return "Employee Storage Object";
   }


   public void store(String response1,String response2,String response3)
   {
      System.out.println(response1);
      System.out.println(response2);
      System.out.println(response3);
   }
};