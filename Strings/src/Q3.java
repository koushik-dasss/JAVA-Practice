import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        String reverse = "";
        for(int i = str.length()-1 ; i>=0;i--){
            reverse+=str.charAt(i);
        }
        if(reverse.equals(str)){
            System.out.println(str +" is a palindrome.");
        }else{
            System.out.println(str +" is not a palindrome ");
        }
        sc.close();
    }
}
