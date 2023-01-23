import java.util.Scanner;
public class Date{

    public static void main(String[] args){
      int day, month, year;
      String slash = "/";


        Scanner user = new Scanner(System.in);
              System.out.print("Enter the month, day and year in the form XX XX XXXX and hit enter:");
            month = user.nextInt();
            day = user.nextInt();
            year = user.nextInt();
              if( day < 32 && month < 13 && year < 2024){
                System.out.println("The Date object's state is: " + month + slash + day + slash + year);}
                else{
                  System.out.println("No");
              }
              System.out.print("Enter a new year:");
                year = user.nextInt();
                if(year < 2024){
                  System.out.println("The Date object's state is: " + month + slash + day + slash + year);}
                  else{
                    System.out.println("No");}

                    System.out.print("Enter a new day:");
                day = user.nextInt();
                if(day < 32){
                  System.out.println("The Date object's state is: " + month + slash + day + slash + year);}
                  else{
                    System.out.println("No");}

                    System.out.print("Enter a new month:");
                month = user.nextInt();
                if(month < 13){
                  System.out.println("The Date object's state is: " + month + slash + day + slash + year);}
                  else{
                    System.out.println("No");}

    }   
  }