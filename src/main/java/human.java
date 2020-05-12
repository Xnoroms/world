public abstract class human extends mammals{
    public human(String n, String o, int m, int l) {
        super(n, o, m, l);
    }

    @Override
    public int getNumberOfLimbs() {
        return super.getNumberOfLimbs();
    }

    @Override
    public String sound(String soundExample) {
        return super.sound(soundExample);
    }

    @Override
    public void breath() {
        super.breath();
    }

    @Override
    public String getOccurrence() {
        return super.getOccurrence();
    }

    @Override
    public int getMaxLifeExpectancy() {
        return super.getMaxLifeExpectancy();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public human() {

    }

    public abstract void thinkAbstractly();

}
