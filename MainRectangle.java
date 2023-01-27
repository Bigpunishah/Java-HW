import java.util.Scanner;
import java.text.DecimalFormat;


class rectangle{

    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat(".##");
    private double width = 1;
    private double length = 1;
    private double area = 1;
    private double perimeter = 1;

    public void inputLength(){
        double inputLength;
        System.out.print("Enter length of rectangle:");   
            inputLength = input.nextDouble();
                if(inputLength <  20 && inputLength > 0)
                    length = inputLength; 

    }
    
    public void inputWidth(){
        System.out.print("Enter width of rectangle:");  
        double inputWidth;
            inputWidth = input.nextDouble();
                if(inputWidth < 20 && inputWidth > 0)
                    width = inputWidth;

    }

    public void getPerimeter() {
        System.out.print(", Perimeter: " + df.format(perimeter));
    }
    
    public void getArea(){
        System.out.print("Area: " + df.format(area));
    }

    public void calculateArea(){
         area = (length * width);
    }

    public void calculatePerimeter(){
        perimeter = (length * 2) + (width * 2);
    }
    

}

public class MainRectangle{
    public static void main(String[]args){
       
        rectangle  rec1 = new rectangle();

        rec1.inputLength();
        rec1.inputWidth();
        rec1.calculateArea();
        rec1.calculatePerimeter();
        rec1.getArea();
        rec1.getPerimeter();
    }
}

 

