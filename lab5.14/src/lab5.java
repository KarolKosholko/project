import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть, будь ласка, перший рядок:");
            String firstSentence = scanner.nextLine();

            System.out.println("Введіть, будь ласка, другий рядок:");
            String secondSentence = scanner.nextLine();

            int a = firstSentence.length();
            int b = secondSentence.length();
            if (a>b){
                System.out.println("Перший рядок більший за другий");
            } else{
                System.out.println("Другий рядок більший за перший");
            }

        }
    }
    }

