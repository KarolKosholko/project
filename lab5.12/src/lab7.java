public class lab7 {
    public static void main(String[] args) {

        int array[][] = new int[7][7];

        for (int i=0; i< array.length; i++){
            for (int j=0; j< array[i].length; j++){
                array[i][j] = (int) (Math.random()*6);
                System.out.print(array[i][j] + " ");
            }
        }

        int sum = 0;
        int maxsum = 0;
        for (int i =0; i< array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum > maxsum) {
                maxsum = sum;
            }
        }

        System.out.println();
        System.out.println(maxsum);
    }

