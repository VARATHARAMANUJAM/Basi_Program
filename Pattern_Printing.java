package My_Basic_programs;

public class Pattern_Printing {

	public static void main(String[] args) {
		Pattern_Printing obj = new Pattern_Printing();
		//obj.pattern_prb();
		obj.Crish_Reverse_Star_Pattern_Printing();
        obj.Crish_Star_Pattern_Printing();
	}
	
	private void Crish_Reverse_Star_Pattern_Printing() {
		for (int i=1;i<=7;i++) {
			for(int j=8;j>=1;j--) {
				if(i<j  ) {
				System.out.print(" ");
				}else
					System.out.print(" *");			
			}			
			System.out.println();
		}
		for(int i=4;i>0;i--) {
			for(int j=1;j<=9;j++) {
				if(i>=j  ) {
				System.out.print(" ");
				}else
					System.out.print("* ");
				
			}System.out.println();
		}
		for(int i=5;i>0;i--) {
			for(int j=1;j<=9;j++) {
				if(i>=j  ) {
				System.out.print(" ");
				}else
					System.out.print("* ");
				
			}System.out.println();
		}
		System.out.println();
		System.out.println();
		
			}

	private void Crish_Star_Pattern_Printing() {
		for(int i=0;i<4;i++) {
			for(int j=1;j<=7;j++) {
				if(i>=j  ) {
				System.out.print(" ");
				}else
					System.out.print(" *");
				
			}System.out.println();
		}

	

		for(int i=0;i<4;i++) {
			for(int j=1;j<=7;j++) {
				if(i>=j  ) { 
				System.out.print(" ");
				}else
					System.out.print(" *");
				
			}System.out.println();
		}
		for (int i=1;i<=7;i++) {
			for(int j=1;j<=8;j++) {
				if(i>=j  || j==1) {
				System.out.print(" ");
				}else
					System.out.print("* ");			
			}			
			System.out.println();
		}
	}
	
	

	private void Triangle_Pattern_Printing() {
		for (int i=0;i<6;i++) {
			for(int j=6;j>0;j--) {
				if(j>i) {
					System.out.print("      ");	
				}else
				System.out.print("*   ");
			}System.out.println();
		}
		
	}

	// to be discuss 0001 0001 0001 0001, 1001 1001 1001 1001, 

	private void pattern_prb() {
		for (int i=4;i>0;i--) {
			
			int col1=1;
			while (col1 <=i) {
				 if (col1==i) {
					System.out.print(1+"   ");
				}else
					System.out.print("  ");
				col1++;
			}System.out.println();
		}
		
	}

}
