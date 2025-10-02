import java.util.*;

public class strings {
    public static boolean CheckPalindrome(String str){
        for(int i=0;i<=str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;

    }


    // public static void printLetter( String str){
    //     for(int i=0;i<str.length();i++){
    //         System.out.print(str.charAt(i)+" ");
    //     }
    //     System.out.println();
    // }
    public static void main(String args[]){
    //     char arr []={'a' ,'b','c','d'};
    //     String str="abcd";
    //     String str1=new String ("xyz");

    // //STRINGS ARE IMMUTABLE
    // Scanner sc=new Scanner(System.in);
    // String name;
    // name=sc.nextLine();
    // System.out.println(name);
    // String fullName="tony stark";
    // System.out.println(fullName.length());

    // String firstName="affan";
    // String lastName="khan";
    // String fullName=firstName+" "+lastName;
    // System.out.println(fullName);
    // printLetter(fullName);

    String str="saippuakivikauppias";
    System.out.println(CheckPalindrome(str));

    }
    
}
