import java.util.Scanner;
public class lexo_{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int fr[]=new int[26];
        for(int i=0;i<str.length();i++){
            fr[str.charAt(i)-'a']++;
        }
        int odd=0;
        char mdl=0;
        for(int i=0;i<fr.length;i++){
            if(fr[i]%2!=0)
            {
                odd++;
                mdl=(char)(i + 'a');
            }
        }
        String lf="";
        if(odd<=1){
            for(int i=0;i<fr.length;i++){
                for(int j=0;j<fr[i]/2;j++){
                    char x=(char)(i+'a');
                    lf=lf+x;
                }
            }
            String ri="";
            for(int i=lf.length()-1;i>=0;i--){
                ri=ri+lf.charAt(i);
            }
                    System.out.println(lf+mdl+ri);

        }


    }
}