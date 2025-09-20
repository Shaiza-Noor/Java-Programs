import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Birth Year:");
        int birthyear = input.nextInt();
        int currentyear = 2025;
        int age = currentyear - birthyear;
        System.out.print("You are approximately " + age + "years old.");
    }
}
