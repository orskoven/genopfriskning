import java.util.Scanner;

public class Græs {

    public static double getHowManyDaysToCut(double howLongAtTheMoment, double heightToBeCut){
        double daysToCut = 0;
        for (double i = howLongAtTheMoment; i < heightToBeCut; i+= 0.8) {
            daysToCut++;
        }
        return daysToCut;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hvor højt er din græs?");
        double howLongIsTheGrass = scanner.nextDouble();
        System.out.println("hvor højt skal græsset være, før du vil slå det?");
        double heightToBeCut = scanner.nextDouble();
        System.out.println("Du skal slå græsset om ");
        System.out.print(Græs.getHowManyDaysToCut(howLongIsTheGrass, heightToBeCut));
        System.out.print(" dage");
    }

}
