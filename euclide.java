public class euclide {
    public static void main(String[] args) {
        System.out.println(gcd(9765, 6944));
    }

    public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
}