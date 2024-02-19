package Calculator;

public class calcultorService implements calcultor {

    @Override
    public int add(int a, int b) {
        return a+b ;
    }

    @Override
    public int minus(int a, int b) {
        return a-b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }
}
