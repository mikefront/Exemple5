public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задание1
        int[] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println();

        double[] someNumbers = {1.57, 7.654, 9.986};
        System.out.println();

        int[] fruitBox = new int[15];
        fruitBox[0] = 4;
        fruitBox[1] = 9;
        fruitBox[2] = 15;
        System.out.println();

        //Задание2
        int[] diffNum = new int [3];
        diffNum[0] = 1;
        diffNum[1] = 2;
        diffNum[2] = 3;
        for (int j = 0; j < diffNum.length; j++) {
            System.out.print(diffNum[j]);
            if (j != diffNum.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] commNum = {1.57, 7.654, 9.986};
        for (int j = 0; j < commNum.length; j++) {
            System.out.print(commNum[j]);
            if (j != commNum.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] anyBox = new int[3];
        anyBox[0] = 4;
        anyBox[1] = 9;
        anyBox[2] = 15;
        for (int k = 0; k < anyBox.length; k++) {
            System.out.print(anyBox[k]);
            if (k != anyBox.length - 1) {
                System.out.print(", ");
            }
        }
    }
}