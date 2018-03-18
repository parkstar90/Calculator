public class Main {
    public static void main(String[] args) {

        final Calculator calculator = new Calculator();

        int result = calculator.sum(3, 5);
        System.out.println(result);

        int subResult = calculator.sub(5, 2);
        System.out.println(subResult);

        int mulResult = calculator.mul(6, 3);
        System.out.println(mulResult);
    }
}
