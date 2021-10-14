public class Factorial {
    int FactorialOfNumber(int n){
        if (n == 1){
            return n;
        }
        return n * FactorialOfNumber(n-1);
    }
}
