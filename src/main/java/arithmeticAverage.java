public class arithmeticAverage {


    public arithmeticAverage() {
    }

    protected int sum(int arg0, int...args){
        int result = arg0;
        for (int a =0; a<args.length; a++){
            result += args[a];
        }
        return result;
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


