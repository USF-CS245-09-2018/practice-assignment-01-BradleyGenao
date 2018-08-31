public class FactorialIterative implements Factorial {
    @Override
    public int factorial(int n) {

            int product = 1;
            for ( int j=1; j<=n; j++ )
                product *= j;
            return product;
        }


}
