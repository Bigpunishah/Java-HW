import java.text.DecimalFormat;
import java.util.Scanner;
public class TriangleYN {
    public static void main(String[] args){
        System.out.print("Enter three sizes, separated by spaces(decimals values are acceptable):");
            Scanner user = new Scanner(System.in);

            DecimalFormat df = new DecimalFormat(".00");
            

            double fNum, sNum, tNum;

                fNum = user.nextDouble();
                sNum = user.nextDouble();
                tNum = user.nextDouble();

                if((fNum + sNum > tNum) && (tNum + sNum > fNum) && (fNum + tNum > sNum)){
            System.out.println("A triangle could measure " + df.format(fNum) + ", " + df.format(sNum) + ", by " + df.format(tNum) + ".");
                }
            else{
                System.out.println("A triangle could not measure " + df.format(fNum) + ", " + df.format(sNum) + ", by " + df.format(tNum) + ".");
            }


    }
}


