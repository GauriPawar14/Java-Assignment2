package assignment;
import java.util.Scanner;
public class fibonacci3 {
//3 rd method Using Formula a[i]=a[i-1]+a[i-2] (Using Array)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("Enter nth term: ");

		n = sc.nextInt();

		int arr[]=new int[n];

		arr[0]=0;

		arr[1]=1;

		

		System.out.print(arr[0]+" "+arr[1]);

		for(int i=2;i<n;i++)

		{

			arr[i]=arr[i-1]+arr[i-2];

			System.out.print(" "+arr[i]);

		}
		
	}

}
