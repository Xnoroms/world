public class world {
    public static void main(String[] args) {

        animals snail = new animals("snail","Europe, Africa, Asia", 2);
        System.out.printf("I'm a %s. I live in %s. My maximum life expectancy is %s years\n",snail.getName(),snail.getName(),snail.getName());


        //extends
        mammals cow = new mammals("cow", "Europe, America, Asia", 20, 4);
        System.out.printf("I'm a %s. I live in %s. My maximum life expectancy is %s years. I have %s limbs.\n",cow.getName(),cow.getOccurrence(),cow.getOccurrence(),cow.getNumberOfLimbs());

        // Interface

        cow.sound("MUUUU!");
        cow.breath();

        animals duck = new animals("duck", "Europe, Asia", 13);
        duck.sound("kwa!");
        duck.breath();
        System.out.printf("I'm a %s. I live in %s. My maximum life expectancy is %s years. I have %s limbs.\n",cow.getName(),cow.getOccurrence(),cow.getOccurrence(),cow.getNumberOfLimbs());

    }
}
