public class lab3 {
    public static void main(String[] args) {
        public static void main(String[] args) {
            int p = 563;
            int a = p / 100;
            int b = (p / 10) % 10;
            int c = p % 10;
            int maximum = a;
            if (b > maximum)
                maximum = b;
            if (c > maximum)
                maximum = c;
            System.out.println("Максимальне: " + maximum);
            int MAXabc = Math.max(Math.max(a, b), c);
            System.out.println(MAXabc);
        }
