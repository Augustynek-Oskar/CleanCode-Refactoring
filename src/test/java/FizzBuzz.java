public class FizzBuzz {
    public static void main(String[] args) {

        getFizzBuzzIfNumberIsDivisibleByThreeAndFive();

    }

    public static void getFizzIfNumberIsDivisibleByThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else System.out.println(i);
        }
    }

    public static void getBuzzIfNumberIsDivisibleByFive() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else System.out.println(i);
        }
    }

    public static void getFizzBuzzIfNumberIsDivisibleByThreeAndFive() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
            else System.out.println(i);
        }
    }

    public static void getFizzBuzzGame(){
        for (int i = 1; i <= 100; i++){
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else System.out.println(i);
        }
    }
}
