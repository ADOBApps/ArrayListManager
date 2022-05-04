import java.util.Random;

public class Main {
    public static void main(String[] args) {
		int min = 1;
		int max = 10;

		Random random = new Random();

		int value = random.nextInt(max + min) + min;
		System.out.println(value);
    }
}