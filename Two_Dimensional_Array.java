package logical_sat;

public class Two_Dimensional_Array
{
    public static void main(String[] args)
    {
        int x=2;
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=6;j++)
            {
                int table=x*j;
                System.out.print(" "+table +"  ");
            }
            x++;
            System.out.println();
        }
    }
}
