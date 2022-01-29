public class Kvadrat {

    static void printSquare(int inputSize, char characterToPrint){

        for (int i = 0; i < inputSize; i++) {
            for (int j = 0; j < inputSize-1; j++) {
                System.out.print(characterToPrint + " ");
            }
            System.out.println(characterToPrint);
        }




    }

    public static void main(String[] args) {
        printSquare(6,'*');
    }
}
