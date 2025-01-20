public class exer1 {
    public static int multiply(int a,int b) throws RangeOutOfException {
        if(a>1000||a<-1000||b>1000||b<-1000){
            throw new RangeOutOfException("Number is outside of the computation");
        }
        return a*b;
    }
    public static double divide(double a,double b){
        if(b==0){
            throw new ArithmeticException("divide by zero");
        }
        else
            return a/b;
    }
    public static void main(String[] args) throws RangeOutOfException {
        System.out.println(multiply(100001,5));
        System.out.println(divide(3.0,0));
    }
}
