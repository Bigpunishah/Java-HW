import java.util.Scanner;

class StringInfo{
    Scanner sc = new Scanner(System.in);
    private String str1, str2;
    StringInfo(){
        System.out.print("Enter first string:");
        str1 = sc.nextLine();
        str1 = str1.toLowerCase();
        System.out.print("Enter second string:");
        str2 = sc.nextLine();
        str2 = str2.toLowerCase();
    }

    public void compareString(){

        System.out.print("Enter starting index for first string:");
        int index1 = sc.nextInt();

        System.out.print("Enter starting index for second string:");
        int index2 = sc.nextInt();

        System.out.print("Enter number of characters to be compared:");
        int num = sc.nextInt();
        
        String str1_subString = str1.substring(index1);
        String str2_subString = str2.substring(index2);

        char str1_ch[] = str1_subString.toCharArray();
        char str2_ch[] = str2_subString.toCharArray();
        for(int i = 0; i < num; i++){
            if(str1_ch[i] != str2_ch[i]){
                System.out.print("false");
                return;
            }
            else
                continue;
        }
        System.out.println("true");
        
    }
}

public class StringCompare{
    public static void main(String[] args){
        StringInfo strComp = new StringInfo();
        strComp.compareString();
    }
}