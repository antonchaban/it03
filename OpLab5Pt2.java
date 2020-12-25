public class OpLab5Pt2 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {0, 2, 2},
                {1, 0, 0},
                {2, 1, 0}
        };
        int[][] matrix2 = {
                {1,1,1},
                {1,1,1},
                {1,1,1}};

        int[][] matrix3 = {
                {0,1,1},
                {1,0,1},
                {1,1,0}};
        PrintRes(getFlawless(matrix1));
        System.out.println("///////////");
        PrintRes(getFlawless(matrix2));
        System.out.println("///////////");
        PrintRes(getFlawless(matrix3));

    }

    private static void PrintRes(int[] resultArr)
    {
        for (int i = 0; i < resultArr.length; i++)
    {
        if (resultArr[i] != -1)
            System.out.println("Winner team:" + resultArr[i]);
    }
    }


    private static int[] getFlawless(int[][] matrix) {
        int[] teams = new int[matrix.length];
        try
        {
            for (int i = 0; i < teams.length; i++)
            {
                teams[i] = -1;
            }
            int teamsCounter = 0;
            {
                if (matrix.length != matrix[0].length) {
                    throw new IllegalArgumentException("Matrix is not square");
                }
                for (int i = 0; i < matrix.length; i++) {

                    boolean isWinner = true;
                    for (int j = 0; j < matrix[0].length; j++) {
                        int num = matrix[i][j];
                        if ((i == j && num != 0)) {
                            throw new IllegalArgumentException("Wrong value of diagonal");
                        }
                        if (i != j && num == 0)
                        {
                            isWinner = false;
                            break;
                        }
                    }
                    if (isWinner)
                    {
                        teams[teamsCounter] = i;
                        teamsCounter++;
                    }
                }
            }

        }
        catch (IllegalArgumentException err)
        {
            System.out.println("EXCEPTION: " + err.getMessage());
        }
        return teams;
    }
}




