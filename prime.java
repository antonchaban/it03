public class prime {

    public static void main(String[] args) {
        for (int a = 2; a <= 30; a++) {
            if (a != 2  &&a % 2 == 0 ||a != 3 &&a % 3 == 0 ||a != 5 &&a % 5 == 0){
                System.out.println(a + " = Not Prime");
            }
        else
            {
                System.out.println(a + " = Prime");
            }
        }
    }
}