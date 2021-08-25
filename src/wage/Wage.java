package wage;

import java.util.Scanner;

public class Wage {
    public static int payforhour =20;
    public static void main(String[] args) {
       //Emppresentorabsent();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the type of employee details you need as mentioned number: " +
                "\n 1.FullTime employee " +
                "\n 2.PartTime employee");
        System.out.println("Enter the number: ");int emp = s.nextInt();

        switch (emp) {
            case 1:
                //FullTimeEmpsalary();
                fmonthlywage();
                break;
            case 2:
                //PartTimeEmployee();
                pmonthlywage();
                break;
            default:
                System.out.println("You searching wrong employee");

        }

    }



   /*public static void Emppresentorabsent(){
        int IsPresent = 1;
        int EmpCheck = (int) Math.floor(Math.random() * 10 % 2);
        System.out.println("The value of Attendance: " + EmpCheck);
        if (EmpCheck == IsPresent)
            System.out.println("So The Employee is Present Today");
        else
            System.out.println("So The Employee is Absent Today");
    }*/
  /*public static void FullTimeEmpsalary()
   {


       int FullEmployee = 8;
       int femployee = (int) (Math.floor(Math.random() * 10) % 2);


       int Fsalary = payforhour * FullEmployee;


       if (femployee == 1) {
           System.out.println("Employee's one day Salary is " + Fsalary);


       } else
           System.out.println("No salary if they Absent");


   }
   public static void PartTimeEmployee()
   {


       int PartEmployee = 4;
       int pemployee = (int) (Math.floor(Math.random() * 10) % 2);


       if (pemployee == 1) {
           System.out.println("Employee is Present");
       } else
           System.out.println("Employee is Absent");
       int Psalary = payforhour * PartEmployee;


       if (pemployee == 1) {
           System.out.println("Employee's one day Salary is " + Psalary);


       } else
           System.out.println("No salary due to Absent");*/

       public static void fmonthlywage()
       {
           int time= (int) (Math.floor(Math.random() * 100 ));
           int fsal= time*payforhour;
           System.out.println("Employee Worked Time for this month: " + time + " hours");
           System.out.println("Employee's this month salary is " + fsal );

       }

       public static void pmonthlywage()
       {
           int time= (int) (Math.floor(Math.random() * 50 ));
           int psal = time*payforhour;
           System.out.println("Employee Worked Time for this month: " + time + " hours");
           System.out.println("Employee's this month salary is " + psal );

       }


   }

}
