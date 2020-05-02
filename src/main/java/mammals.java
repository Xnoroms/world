
class mammals extends animals implements activities{
    private int numberOfLimbs;

    public int getNumberOfLimbs() {
        return numberOfLimbs;
    }

    public mammals(String n, String o, int m, int l){
        super(n, o, m);
        numberOfLimbs = l;
    }

    @Override
    public void sound(String soundExample) {

    }

    @Override
    public void breath() {

    }
}

