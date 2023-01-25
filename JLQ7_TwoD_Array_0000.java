package logical_sat;

public class JLQ7_TwoD_Array_0000 {
    public static void main(String[] args) {
        char x[][] = {
                {'a', 'b', 'c', 'd', 'e', 'f'},
                {'3', 't', '1', 'k', 'r', 's'},
                {'a', 'd', 'i', 'l', 'q', 't'},
                {'b', 'e', 'h', 'm', 'p', 'a'},
                {'c', 'f', 'g', 'n', 'r', 'b'},
        };
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                if (x[i][j] == '1')
                {
                    for (int m = 0, n = j; m <= 4; m++)
                    {
                        if (m != 1)
                        {
                            x[m][n] = '0';
                        }

                        for (int l = 0; l <= 5; l++)
                        {
                            if (l != 2)
                            {
                                x[i][l] = '0';
                            }

                        }
                    }
                }
            }//inner for loop close
        }
            System.out.println("---------------");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(x[i][j] + "  ");
                }
                System.out.println();
            }

    }
}
