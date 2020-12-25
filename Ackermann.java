import java.util.Scanner;

public class Ackermann {
    public static void main(String[] args) {
        int m = GetNaturalInt("M: ");
        int n = GetNaturalInt("N: ");
        System.out.println("Func:"+AckermannFunc(m,n));
    }

    private static int AckermannFunc(int m, int n)
    {
        int temp = 0;
        System.out.println("Step: Ackerman("+m+ "," +n+");");
        if (m == 0) temp =  n+1;

        if (m > 0 && n == 0) temp = AckermannFunc(m-1,1);

        if (m > 0 && n > 0) temp = AckermannFunc(m-1,AckermannFunc(m,n-1));
        return temp;
    }


    private static int GetNaturalInt(String variableName)
    {
        int s;
        do {
            Scanner natural = new Scanner(System.in);
            System.out.print("Number " + variableName);
            s = natural.nextInt();
        } while (s < 0);
        return s;
    }


}
