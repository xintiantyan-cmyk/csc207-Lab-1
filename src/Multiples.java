public class Multiples {
    static void main() {
        int total = 0; // the accumulator

        for (int i = 3; i <= 1000; i++) {
            boolean multipleOf3 = i % 3 == 0;
            boolean multipleOf5 = i % 5 == 0;

            if (multipleOf3 || multipleOf5) {
                total += 1;
            };
        }
        System.out.println(total);
    }
}
