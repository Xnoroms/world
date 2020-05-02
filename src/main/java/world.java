public class world {
    public static void main(String[] args) {

        animals snail = new animals("snail","Europe, Africa, Asia", 2);
        System.out.printf("I'm a %s. I live in %s. My maximum life expectancy is %s years\n",snail.name,snail.occurrence,snail.maxLifeExpectancy);


        //extends
        mammals cow = new mammals("cow", "Europe, America, Asia", 20, 4);
        System.out.printf("I'm a %s. I live in %s. My maximum life expectancy is %s years. I have %s limbs.\n",cow.name,cow.occurrence,cow.maxLifeExpectancy,cow.numberOfLimbs);

        // Interface

        cow.sound("MUUUU!");
        cow.breath();

        activities duck = new animals();
        duck.sound("kwa!");
        duck.breath();
    }
}
