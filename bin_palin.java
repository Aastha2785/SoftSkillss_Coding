import java.util.*;
public class bin_palin {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String b=Integer.toBinaryString(n);
        String x=b;
        String rev="";
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            rev=ch+rev;
        }
        System.out.println(b+" "+rev);
        if(rev.equalsIgnoreCase(b))
            System.out.println("Palindrome");
        else
            System.out.println("Not");
    }
}
