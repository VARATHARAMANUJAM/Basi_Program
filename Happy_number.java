package My_Basic_programs;

public class Happy_number {

	public static void main(String[] args) {
		Happy_number obj = new Happy_number();
		obj.happy_number();
	}

	private void happy_number() {
	int number =2;
	int sum=0;
	int b=0;
	
	while(number>0 || b>9 ) {
		if(number==0) {
			System.out.println(b);
			number=b;
			b=0;
			sum=0;
			
		}
		sum=number%10;
		
		number=number/10;		
		b=b+(sum*sum);	
		
	}
	
//	if(b>=10) {
//		number=b;
//	}else
//		break;
	
	
	if(b==1) {
		System.out.println("Happy Number ");
	}else
		System.out.println("Not happy number");
	
	
	}

}
