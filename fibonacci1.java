package assignment;
import java.util.Scanner;
public class fibonacci1 {
//1st method Using Iteration (Using Three variables)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int first = 0, second = 1, third = 1;

		int n;

		System.out.println("Enter nth term: ");

		n = sc.nextInt();

		System.out.print(first + " " + second);

		for (int i = 2; i < n; i++) {

			third = first + second;

			System.out.print(" " + third);

			first = second;

			second = third;
	}

}
}
