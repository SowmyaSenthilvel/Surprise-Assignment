import java.util.Scanner;

public class FibonnaciSeries {
	private static char[] result;

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Total Number ");
		int num=input.nextInt();
		int temp1=0,temp2=1,last,n=1,count=0;
		for(int i=2;i<num;i++) {
			last=temp1+temp2;
			temp1=temp2;
			temp2=last;
			System.out.println(last);
			if(last%n==0) {
				int result=last;
				count++;
			}
			
		}
		
		if(count==2) {
			System.out.println(result);
		}
	}

}
