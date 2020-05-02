
class mammals extends animals implements activities{
    int numberOfLimbs;

    public mammals(String n, String o, int m, int l){
        name = n;
        occurrence = o;
        maxLifeExpectancy = m;
        numberOfLimbs = l;
    }

    @Override
    public void sound(String soundExample) {

    }

    @Override
    public void breath() {

    }
}

