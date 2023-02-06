import java.util.Scanner;
import java.text.DecimalFormat;

 class Employee{
        Scanner input = new Scanner(System.in);
        String Fname;
        String Lname;
        String SSN;
        double wage;
        double HoursWorked;

    Employee(){
        setFname();
        setLname();
        setSSN();
    }

    public void setFname(){
        System.out.print("Enter first name:");
        String Fname = input.nextLine();
        this.Fname = Fname;
    }

    public void setLname(){
        System.out.print("Enter last name:");
        String Lname = input.nextLine();
        this.Lname = Lname;
    }

    public void setSSN(){
        System.out.print("Enter social security number:");
        String SSN = input.nextLine();
        this.SSN = SSN;
    }

}
class HourlyEmployee extends Employee{
        double hours;
        double wage;
        double earnings;

    DecimalFormat df1 = new DecimalFormat(".00");
    DecimalFormat df2 = new DecimalFormat(".0");

    HourlyEmployee(){
        setHoursWorked();
        setHourlyWage();
        earnings();
        toString();
        
    }
    public void setHoursWorked(){
        System.out.print("Enter hours worked:");
        double hours = input.nextDouble();
        if(hours < 168 && hours > 0){
           this.hours = hours;  
        }
    }

    public void setHourlyWage(){
        System.out.print("Enter wage:");
        double wage = input.nextDouble();
        if(wage > 0){
           this.wage = wage; 
        }
    }

    public void earnings(){
        earnings = wage * hours;
    }

    public String toString(){
        String employeeData = "hourly employee: " + Fname + " " + Lname + "\n" + "social security number: " + SSN + "\n" +
        "hours: " + df2.format(hours) + " \n" + "wage: " + df1.format(wage) + " \n" + "earnings: " + df1.format(earnings);
        return employeeData;
    }

}

public class EmployeeOOP {
    public static void main(String[] args){
        HourlyEmployee employee = new HourlyEmployee();
        System.out.println(employee.toString());
    }
}
