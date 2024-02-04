package test.firstTest;

public class thirdLecture extends  AssignmentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Q1: Create a variable of any 3 datatypes and print their values.
//				String firstVar = "String Variable";
//				int secondVar = 50;
//				Boolean thirdVar = true; 
//				System.out.println(firstVar);
//				System.out.println(secondVar);
//				System.out.println(thirdVar);
		
		// Q2: Create an array of 10 and print the items without for loop.
//				int[] arr = new int[10];
//				arr[0]=1;
//				arr[1]=2;
//				arr[2]=3;
//				arr[3]=4;
//				arr[4]=5;
//				arr[5]=6;
//				arr[6]=7;
//				arr[7]=8;
//				arr[8]=9;
//				arr[9]=10;
//				System.out.println(arr[0]);
//				System.out.println(arr[1]);
//				System.out.println(arr[2]);
//				System.out.println(arr[3]);
//				System.out.println(arr[4]);
//				System.out.println(arr[5]);
//				System.out.println(arr[6]);
//				System.out.println(arr[7]);
//				System.out.println(arr[8]);
//				System.out.println(arr[9]);
		
		
		// Q5: Write a program which Print table of 9 upto 10 using for loop.
		//        int table = 9;
		//        int result = 0;
		//        for(int x=1; x<=10; x++)
		//        {
		//        	System.out.println(table+" "+"x"+" "+x+" "+"="+" "+table*x);
		//        }
		
		// Q6: Write a program that print any string in reverse order.
		//		String reverseprint = "QA Jobs in Lahore";
		//		StringBuffer sb = new StringBuffer(reverseprint);
		//		System.out.println(sb.reverse());
		
		// Q7: Write a program if user gives even number it print “qa jobs in lahore” and if user give odd number it prints “automation testing course”.
//        int input = 4;
//		if(input%2==0)
//		{
//			System.out.println("qa jobs in lahore");
//		}
//		else {
//			System.out.println("automation testing course");
//		}      
		

		//Q8: Create a class and its object and create a method which displays “welcome to automation testing
		//course” using class and object.
		
//		thirdLecture obj = new thirdLecture();
//		obj.AssignmentClassFun();
		
		
		// Q10: Write a program that applies polymorphism concept and also add the comments that its
		// “polymorphism program”
		
		// Method overloading
//		thirdLecture obj1 = new thirdLecture();
//		obj1.sum(1, 2);
//		obj1.sum(1, 2, 3);
//	}
		//	void sum(int a, int b)
		//	{
		//		System.out.println(a+b);
		//	}
		//	void sum(int a, int b, int c)
		//	{
		//		System.out.println(a+b+c);
//	}
		
		// Method overriding
		thirdLecture obj2 = new thirdLecture();
		obj2.run();
	}
		public void run()
		{
			System.out.println("Vehicle is runing smoothly");
		}
		
	

}
