public class OpLab6 {
    public static void main(String[] args) {
        double[] testArr = CreateArray();
        PrintArr(testArr);
        System.out.println("//");
        BubbleSort(testArr);
        System.out.println("//");
        SelectionSort(testArr);
        System.out.println("//");
        PrintArr(testArr);

    }
    private static void PrintArr(double[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            double x = array[i];
            System.out.printf("%.2f  ", x);
        }
        System.out.println(" ");
    }

    private static double[] CreateArray()
    {
        double[] array = new double[10];
        for (int i = 0; i < 10; i++)
        {
            array[i] = Math.random() * (100 - (-100) + 1) + (-100);
        }
        return array;
    }


    private static double[] BubbleSort(double[] array)
    {
        long m = System.nanoTime();
        for (int j = 0; j < array.length-1; j++)
        {
            for (int i = 0; i < array.length-j-1; i++)
            {
                if (array[i] > array[i+1])
                {
                    double swap = array[i];
                    array[i] = array[i+1];
                    array[i+1] = swap;
                }
            }
        }
        System.out.println("Time:"+ (double) (System.nanoTime() - m));
        return array;
    }

    private static double[] SelectionSort(double[] array)
    {
        long m = System.nanoTime();
        for (int i = 0; i < array.length-1; i++) {
            int minIdx = i;
            for (int j = i; j < array.length - 1; j++) {
                if (array[minIdx] > array[j + 1]) {
                    minIdx = j + 1;
                }
            }
            double swap = array[minIdx];
            array[minIdx] = array[i];
            array[i] = swap;
        }
        System.out.println("Time:"+ (double) (System.nanoTime() - m));
        return array;
    }

    private static double[] InsertionSort(double[] array)
    {

        return array;
    }

}
