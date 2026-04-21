public class StaticNested {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.fun();
    }
}

class Outer{
    static class Inner{
        void fun(){
            System.out.println("Hello from Inner class");
        }
    }
}

//  This is the example where we can see the actual need for nested classes:

class BankAccount {
    private static class InterestCalculator{  // This class will  now act as a helper class for the BankAccount class
        static double calculateYearly(double principal, double rate){
            return principal * rate;
        }
    }

    public double computeInterest(double principal) {
        return InterestCalculator.calculateYearly(principal, 0.09);
    }
}
