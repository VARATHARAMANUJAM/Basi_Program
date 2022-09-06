package My_Basic_programs;

public class Diff_Of_Digit_ODD_EVEN {

	public static void main(String[] args) {
		Diff_Of_Digit_ODD_EVEN obj = new Diff_Of_Digit_ODD_EVEN();
		obj.Diff_Of_Digit_ODD_EVEN();
	}

	private void Diff_Of_Digit_ODD_EVEN() {
		int a=121;
		int count=1;
		int sum_even=0;
		int sum_odd=0;
		while(a>0) {
			if (count%2==0) {
			sum_even=sum_even +(a%10);
			a=a/10;
			count++;
			}else
			{sum_odd=sum_odd + (a%10);
			a=a/10;
			count++;}
		} 
		int diff =0;
		
		if(sum_even > sum_odd) {
		 diff = sum_even - sum_odd;
		System.out.println(" Difference is : " +diff);
		}else {
			diff = sum_odd-sum_even;
			System.out.println(" Difference is : " +diff);
		}
	}

}
