public class FibonacciIterative {
    public static void main (String[] args){
        int maxNumber = 10;
        int prevoiusNumber = 0;
        int nextNumber = 1;

        System.out.println("Fibonacci Series of " + maxNumber+ " numbers");

        for (int i = 1; i <=maxNumber; i++){
            System.out.println(prevoiusNumber + "");

            int sum = prevoiusNumber + nextNumber;
            prevoiusNumber = nextNumber;
            nextNumber = sum;
        }

    }
}
