import java.util.Arrays;

public class OpLab4 {


    public static void main(String[] args) {
        // Вариант 25: №25, 55, 64
        int[] testArray1 = {1, 8, 200, 377, -115, 228, 0, 222, 999, 300};
        int[] testArray2 = CreateArray();
        int[] testArray3 = CreateArray();
        System.out.println("////////////////////////////////////////////////////////");
        PartOne(testArray2);
        PartOne(testArray1);
        PartOne(testArray3);

        System.out.println("////////////////////////////////////////////////////////");

        PrintArr(testArray1);
        System.out.println(PartTwo(testArray1));
        PrintArr(testArray2);
        System.out.println(PartTwo(testArray2));

        System.out.println("////////////////////////////////////////////////////////");

        testArray1 = PartThree(testArray1);
        PrintArr(testArray1);
        testArray2 = PartThree(testArray2);
        PrintArr(testArray2);
        testArray3 = PartThree(testArray3);
        PrintArr(testArray3);
        System.out.println("////////////////////////////////////////////////////////");

    }
    private static int RandomNum()
    {
        return (int) (Math.random() * (100 - (-100) + 1) + (-100));
    }

    private static int[] CreateArray()
    {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
        {
            array[i] = RandomNum();
        }
        return array;
    }
    private static int PartOne(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            int x = Math.abs(array[i]);
            System.out.print(" " + x);
            array[i] = x;
        }
        Arrays.sort(array);
        System.out.println("");
        System.out.println("Second min abs:"+array[1]);
        return array[1];
    }

    private static int[] PartThree(int[] array)
    {
        int[] arrayX = new int[10];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < 0)
                arrayX[i] = array[i] * (-1);
            else if (array[i] > 0)
                arrayX[i] = array[i] - 3;
            else if (array[i] == 0)
                arrayX[i] = -2;
        }
        return arrayX;
    }

    private static int PartTwo(int[] array) //Знайти кількість додатних елементів масиву, індекс яких кратний 4
    {
        int res = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (i%4 == 0 && array[i] > 0)
                res++;
        }
        return res;
    }

    private static int[] PrintArr(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            int x = array[i];
            System.out.print(" " + x);
        }
        System.out.println(" ");
        return array;
    }
}