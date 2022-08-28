package My_Basic_programs;

public class Finaci_Prb_without_3rd_variable {

	public static void main(String[] args) {
		Finaci_Prb_without_3rd_variable obj = new Finaci_Prb_without_3rd_variable();
		obj.Solution_without_variable();
		obj.Solution_with_variable();
		
	}

	private void Solution_with_variable() {
		int first =0;
		int second=1;
		int i=0,sum=0;
		while(i<10) {
			System.out.print(first+" ");
			sum = first+second;
			first = second;
			second=sum;
			i++;
		}
		System.out.println();
	}

	private void Solution_without_variable() {
		int first =0;
		int second=1;
		int i=0;
		while(i<10) {
			System.out.print(first+" ");
			second = first+second;
			first = second-first;
			i++;
		}
	
	System.out.println();
	}

}
