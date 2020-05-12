import java.util.InputMismatchException;
import java.util.Scanner;

public class world {
    public static void main(String[] args) {

        animals snail = new animals("snail","Europe, Africa, Asia", 2);
        System.out.printf("I'm a %s. I live in %s. My maximum life expectancy is %s years\n",snail.getName(),snail.getOccurrence(),snail.getMaxLifeExpectancy());


        //extends
        mammals cow = new mammals("cow", "Europe, America, Asia", 20, 4);

        // Interface

        cow.sound("MUUUU!");
        cow.breath();

        animals duck = new animals("duck", "Europe, Asia", 13);
        System.out.printf("I'm a %s. I live in %s. My maximum life expectancy is %s years. I have %s limbs.\n",duck.getName(),duck.getOccurrence(),duck.getMaxLifeExpectancy(),cow.getNumberOfLimbs());
        duck.sound("kwa!");
        duck.breath();

        // abstract class

        human Grzegorz = new human("human", "all the continents",73,4) {
            @Override
            public void thinkAbstractly() {
                System.out.printf("\nI'm Grzegorz, and I'm abstract Genius!");
            }
        };
        Grzegorz.thinkAbstractly();

        // Exceptions

        System.out.printf("\n\narithmetic average- number of limbs\n");
        Scanner scanner = new Scanner(System.in);
        arithmeticAverage average = new arithmeticAverage();

        int n;
        int s;

        try {
            System.out.println("how many mammals?");
            n = scanner.nextInt();

            for (int a=0; a<n; a++ )

            System.out.println("gve me the sum of limbs");
            s = scanner.nextInt();


            System.out.printf("\nAverage: %s", average.average(s,n));


            System.out.println("\nbelow you can find sum of all fingers of genius Grzegorz");
            System.out.println(average.sum(5,4,5,5));
        }
      catch (InputMismatchException a) {
          System.out.println("I need a number!");
      }


      }

}

