import java.util.Scanner;
public class DuplicateElimination{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

            int[] numbers = new int[6];
                int i = 1;

                 for(i = 1; i < numbers.length; i++){
                    System.out.print("Enter an integer between 10 and 100:");
                    numbers[i] = input.nextInt();   
                        if(numbers[i] > 100 || numbers[i] < 10){
                            break;
                     }     
                        if(numbers[i] != numbers[i - 1]){
                            System.out.println("This is the first time " + numbers[i] + " has been entered");
                  }      
                 }


                    int a = 0;
                 System.out.println("The complete set of unique values entered is:");
                    for(int j = 1; j < numbers.length; j++){
                        if(numbers[j] != numbers[j - 1]){
                            a++;
                            System.out.println("Unique Value " + (a) + ": is " + numbers[j]);
             }
         }
    }
}