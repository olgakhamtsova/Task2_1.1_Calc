public class Main {
    public static void main(String[] args) {

        Calculator<Integer> calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        // При помощи блока try..catch отслеживаем ошибку и выводим на экран сообщение
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
            //println(System.out::println, c);

        } catch (ArithmeticException e) {
            System.out.println("Cannot devide by zero");
        }

    }
}