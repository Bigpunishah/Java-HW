import java.util.Scanner;

    class Square{
        private int length;
        Scanner input = new Scanner(System.in);

        public void getLength(){
            System.out.print("Enter side length of square:");
                length = input.nextInt();
                    if(length <= 0){
                        System.out.print("Side length must be greater than 0.");
                    }
                    else{
                        System.out.println(length * length);
                    }
        }
    }

public class invalidSide {
    public static void main(String[]args){
        Square square1 = new Square();
            square1.getLength();      
    }
    
}
