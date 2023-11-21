public class FizzBuzz {
    public static void main(String[] args) {
        getFizzBuzzGame();

    }

    public static void getFizzBuzzGame() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i % 3 == 0) {
                System.out.println("Fizz" + i);
            }if (i % 5 == 0) {
                System.out.println("Buzz" + i);
            }if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz" + i);
            }
        }
    }
}
