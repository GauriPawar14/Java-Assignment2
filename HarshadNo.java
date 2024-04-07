package assignment;
import java.util.Scanner;
public class HarshadNo {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter the Number");
		
		Scanner sc =new Scanner(System.in);
		num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(temp>0)
		{
			sum=sum+temp%10;
			temp=temp/10;
			
			
		}
		if(num%sum==0)
			System.out.println("Harshad No");
		else
			System.out.println("not Harshad No");

		

			
					
			}

		}


	


