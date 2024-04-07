package assignment;

public class Q8 {
	
	private int rollNo,marks; 
	private String name,course,result;
	private char grade;
	
	public 
	void display(int rollNo,String name, String course,int marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
		this.marks=marks;
		
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name : "+name);
		System.out.println("Course : "+course);
		System.out.println("Marks : "+marks);
	}

	void calResult()
	{
		if(marks>90)
		{
			System.out.println(	"Grade :'A' " );
		}
		else if(marks<=80 || marks<=90)
		{
			System.out.println("Grade :'B' " );
		}
		else if(marks<=70 || marks<=80)
			System.out.println("Grade :'C' ");
		
		else if(marks<=60 || marks<=70)
			System.out.println("Grade :'D' ");
		
		else
			System.out.println("Grade :'F' ");
		
	}
	
	void findResult()
	{
		if(marks>60)
			System.out.println("Result  = PASS");
		else
			System.out.println("Result = Fail");
	}

	public static void main(String[] args) {
	Q8 student1 = new Q8();
		student1.display(11, "Sam","Science", 99);
		student1.calResult();
		student1.findResult();
		
		System.out.println("=============================");
		
	Q8 student2 = new Q8();
		student1.display(22, "Raj","Commerse", 40);
		student1.calResult();
		student1.findResult();
	}

}
