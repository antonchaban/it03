import java.util.Scanner;

public class AsdLab {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        System.out.print("X: ");
        String x = line.next();
        System.out.print("Y: ");
        String y = line.next();
        char[] arrayX = x.toCharArray();
        char[] arrayY = y.toCharArray();
        int z = 0;
        long ResultX = 0;
        long ResultY = 0;

        System.out.println(x);


        for (int i = arrayX.length-1;i >= 0; i--)
        {
            ResultX = ResultX + Character.getNumericValue(arrayX[i]) * Power(2, z);
            z++;
        }
        z = 0;
        for (int i = arrayY.length-1;i >= 0; i--)
        {
            ResultY = ResultY + Character.getNumericValue(arrayY[i]) * Power(2, z);
            z++;
        }

        System.out.println("X: " + ResultX);
        System.out.println("Y: " + ResultY);



        if (ResultX % ResultY == 0)
        {
            System.out.print("Ділиться БЕЗ остачі");
        }
        else
            {
                System.out.print("Ділиться З остачею");
        }




    }
    public static int Power(int x, int n)
    {
        if (n == 0) return 1;

        return x*Power(x, n-1);
    }


}

