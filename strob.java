import java.util.Scanner;
public class strob {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        int n=sc.nextInt();
        String s=String.valueOf(n);
        int l=0,r=s.length()-1;
        int x=0;
        while(l<r){
            char ch1=s.charAt(l);
            char ch2=s.charAt(r);
            if(ch1==ch2 || (ch1=='0' && ch2=='0') || (ch1=='1' && ch2=='1') || (ch1=='8' && ch2=='8'))
                x=x;
        else {
                x++;
                break;
            }
            l++;
            r--;
        }
        int le=s.length()/2;

        if(s.length()%2!=0){
            char ch=s.charAt(le);
            if(ch=='1' || ch=='0' || ch=='8')
                x=x;
            else
                x++;
        }
        if(x!=0)
            System.out.println("not");
        else
            System.out.println("yes");
    }
}
