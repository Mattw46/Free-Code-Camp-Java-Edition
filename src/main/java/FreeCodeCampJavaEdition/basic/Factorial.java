package FreeCodeCampJavaEdition.basic;

public class Factorial {
    
    public long factorialize(long num) {
        long factorial = 1;
        long counter = 2;
        while (counter <= num) {
            factorial *= counter;
            counter++;
        }
        return factorial;
    }
    
    
}