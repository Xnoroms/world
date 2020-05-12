
class mammals extends animals implements activities{
    private int numberOfLimbs;

    public mammals() {

    }

    public int getNumberOfLimbs() {
        return numberOfLimbs;
    }

    public mammals(String n, String o, int m, int l){
        super(n, o, m);
        numberOfLimbs = l;
    }

    @Override
    public String sound(String soundExample) {
       System.out.println(soundExample);
    return soundExample;
    }

    @Override
    public void breath() {

    }
}

