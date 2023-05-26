public class lab6 {
    public static void main(String[] args) {

        int array[][] = new int[15][];

        for (int i = 0; array.length; i++){
            if(i < 4){
                array[i] = new int[5];
            }else if(i < 8){
                array[i] = new int[8];
            }else if(i < 12){
                array[i] = new int[3];
            }else{
                array[i] = new int[9];
            }
        }


        for (int i=0; i< array.length; i++){
            for (int j=0; j<array[i].length; j++){
                array[i][j] = (int) (Math.random()*15);
                System.out.print(array[i][j] + " ");
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }

