package wage;

public class Wage {
    public static void main(String[] args) {
      //  Emppresentorabsent();
        FullTimeEmpsalary();
    }



   /* public static void Emppresentorabsent(){
        int IsPresent = 1;
        int EmpCheck = (int) Math.floor(Math.random() * 10 % 2);
        System.out.println("The value of Attendance: " + EmpCheck);
        if (EmpCheck == IsPresent)
            System.out.println("So The Employee is Present Today");
        else
            System.out.println("So The Employee is Absent Today");
    }*/
   public static void FullTimeEmpsalary()
   {


       int FullEmployee = 8;
       int femployee = (int) (Math.floor(Math.random() * 10) % 2);


       int Fsalary = payforhour * FullEmployee;


       if (femployee == 1) {
           System.out.println("Employee's one day Salary is " + Fsalary);


       } else
           System.out.println("No salary if they Absent");


   }

}
