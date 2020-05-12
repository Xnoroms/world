public class arithmeticAverage {


    public arithmeticAverage() {
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


