import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {

	public static void main(String[] args) throws Negative_number {
		Exception_Handling obj = new Exception_Handling();
		obj.Exception_Handling_Arithmetric();
	}
	Scanner sc = new Scanner(System.in);
	private void Exception_Handling_Arithmetric() throws Negative_number {
		System.out.print("Enter a number : ");
		String  a =sc.next();
		int ar[] = {6,7,4,89,9};
		int b=10;
		try {
			System.out.println(ar[0]);
			System.out.println("Number : "+b+a.charAt(6));
		}
		catch (InputMismatchException e) {
			System.out.println("You enter a wrong information");
			Exception_Handling_Arithmetric();
		}
		catch (ArithmeticException e) {
			System.out.println("You enter a wrong Data");
			Exception_Handling_Arithmetric();
		}
//		catch (Negative_number w) {
//			
//		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("you enter a wrong index");
			Exception_Handling_Arithmetric();

		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("you enter a wrong index");
			Exception_Handling_Arithmetric();

		}
catch (Exception e) {
			System.out.println("wrong");
		}
		
		
	}

}
