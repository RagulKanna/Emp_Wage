package wage;

public class Wage {
    public static void main(String[] args) {
        Emppresentorabsent();
    }
    public static void Emppresentorabsent(){
        int IsPresent = 1;
        int EmpCheck = (int) Math.floor(Math.random() * 10 % 2);
        System.out.println("The value of Attendance: " + EmpCheck);
        if (EmpCheck == IsPresent)
            System.out.println("So The Employee is Present Today");
        else
            System.out.println("So The Employee is Absent Today");
    }

}
