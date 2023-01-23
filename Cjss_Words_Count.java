package logical_sat;
import java.util.*;
public class Cjss_Words_Count
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the String :");
        String string= scan.nextLine();
        char[] ch=string.toCharArray();
        int countC=0;
        int countJ=0;
        int countS=0;
        char c='c';
        String convertedC=String.valueOf(c);
        for (int i=0;i<ch.length;i++)
        {
                if (ch[i]=='c') {
                    countC++;
                } else if (ch[i]=='j') {
                    countJ++;
                } else if (ch[i]=='s') {
                    countS++;
                }
            }
//            System.out.println("number of c :"+ countC);
//           System.out.println("number of j :"+countJ);
//        System.out.println("number of s :"+countS);
        int countSDevide=countS/2;
           if (countC<countJ && countC<countSDevide) {
               System.out.println("The number of cjss words are :"+countC);
           } else if (countJ<countSDevide && countJ<countC) {
               System.out.println("The number of cjss words are :"+countJ);
           } else{
               System.out.println("The number of cjss words are :"+countSDevide);
           }
        }
    }

