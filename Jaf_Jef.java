package logical_sat;
import java.util.Scanner;
public class Jaf_Jef
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first alphabet");
        char first = scan.next().charAt(0);
        System.out.println("enter last alphabet");
        char last = scan.next().charAt(0);
        char[] ch = {'A', 'E', 'I', 'O', 'U'};
        char lastLetter = 'F';

        for (int i = first; i <= last; i++)
        {
            String convertedLetter = String.valueOf((lastLetter));
            for (int j = 0; j < ch.length; j++)
            {
                System.out.print(first + "" + ch[j] + convertedLetter + " ,");
            }
            first++;
            lastLetter++;
            System.out.println();
        }

       // int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        char[] alphabets={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    }
}
