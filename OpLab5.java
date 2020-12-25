

public class OpLab5 {
    public static void main(String[] args) {
        int[][] testMatrix3 = SquareMatrix(3, 4);
        PrintMatrix(testMatrix3);
        System.out.println("/////////////////");
        System.out.println(minElementInLargestColumn(testMatrix3));
    }

    // Знайти найменше зі значень елементів стовпця, який має найбільшу суму модулів
//елементів. Якщо таких стовпців декілька, то знайти найменше значення серед них.
    private static int[][] SquareMatrix(int size, int size2) {
        int[][] values = new int[size][size2]; // створення масиву заданого розміру
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = ((int) (Math.random() * (10 - (-10) + 1) + (-10)));
            } // генерація рандомних чисел від [-10;10]
        }
        return values;
    }


    private static void PrintMatrix(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j] + " "); // друк рядків матриці через цикл foreach
            }
            System.out.println();
        }
    }



    public static int minElementInLargestColumn(int[][] matrix){
        int[] columns = new int[matrix[0].length]; // ініціалізуємо масив модулів колонок
        for (int j = 0; j < matrix[0].length; j++) // цикл foreach для зовнішнього масиву
        {
            columns[j] = 0;
            for (int i = 0; i < matrix.length; i++) // цикл foreach для внутрішнього масиву
            {
                columns[j] += Math.abs(matrix[i][j]); // кожен елемент записуємо до масиву стовпця
            }
        }
        int maxCol = 0;
        for (int j = 0; j < columns.length; j++)
        {
            if (columns[j] > maxCol) // знаходимо найбільше значення серед колонок
                maxCol = columns[j];
        }
        int res = 2147483647; // задамо найбільше ціле значення для порівняння
        for (int j = 0; j < columns.length; j++) 
        {
            if (columns[j] == maxCol) // якщо колонка = Максимальному числу
            {
                for (int i = 0; i < matrix.length; i++) // шукаємо найменше значення серед її елементів
                {
                    if (matrix[i][j] < res)
                        res = matrix[i][j];
                }
            }
        }
        return res;
    }
}