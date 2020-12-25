public class test {
    public static void main(String[] args) {
        int arr1[] = new int[3];
        //createArray(arr1);
        int[] testArr = {-2, -3, -5};
        printArray(testArr);

        task(testArr);

    }

    public static void createArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int x = (int) (Math.random() * 201 - 100); // [-100; 100]
            arr[i] = x;
        }
    }

    public static void printArray(int[] arr) {
        boolean isPosivite = false;
        for ( int i = 0; i < arr.length; i++)
        {
            if( arr[i] > 0)
            {
                isPosivite = true;
            }
        }
        if (isPosivite = false)
        {
            throw new IllegalArgumentException("В массиве нет положительных элементов!!!");
        }

        if (arr.length == 0) {
            throw new IllegalArgumentException("Пустой массив");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println(" ");

    }

    public static void task(int[] arr) {
        int result;
        int WestSide = arr[0];;
        try {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0)
                {
                    if (arr[i] > WestSide)
                        WestSide = arr[i];
                }

            }

            result = WestSide + arr[1];
            System.out.println(result);


        }

        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }

    }

}