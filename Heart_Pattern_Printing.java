package My_Basic_programs;

public class Heart_Pattern_Printing {

	public static void main(String[] args) {
		Heart_Pattern_Printing obj = new Heart_Pattern_Printing();
		obj.Heart_Pattern_Printing();
	}

	private void Heart_Pattern_Printing() {
		for (int i=1;i<=5;i++ ) {
			for (int j=1;j<=7;j++) {
if((i==1 && (j==2 || j==3 || j==5 || j==6)) || (i ==2 && (j==1 ||j==4 || j==7) )  || (i ==3 && (j==1  || j==7) ) || (i ==4 && (j==6 ||j==2 ) ) ||(i ==5 && (j==3 ||j==5 ) )) {
					System.out.print("* ");
				}else
					System.out.print("  ");
				
				
			}System.out.println();
		}System.out.println("      *");
	}

}
