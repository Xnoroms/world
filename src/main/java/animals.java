import java.util.ArrayList;
import java.util.Objects;

class animals implements activities {

    private String name;
    private String occurrence;
    private int maxLifeExpectancy;


    public String getOccurrence() {
        return occurrence;
    }

    public int getMaxLifeExpectancy() {
        return maxLifeExpectancy;
    }

    public String getName(){
        return name;
    }

    public animals(){

    }

    public animals(String n, String o, int m){
        name = n;
        occurrence = o;
        maxLifeExpectancy = m;
    }


    @Override
    public String sound(String soundExample){
        System.out.println(soundExample);
        return soundExample;
    }

    @Override
    public void breath(){

    }

}

