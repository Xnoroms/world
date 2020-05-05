public class arithmeticAverage {
    int sumOfElements;
    int numberOfElements;

    public arithmeticAverage() {
    }

    public arithmeticAverage(int sumOfElements, int numberOfElements) {
        this.sumOfElements = sumOfElements;
        this.numberOfElements = numberOfElements;
    }

    protected int average(int sumOfElements, int numberOfElements){
        if (numberOfElements ==0){
        throw new ArithmeticException("Cannot divide by 0!");}
        else{
        int result = sumOfElements/numberOfElements;
                return result;
        }
    }


}


