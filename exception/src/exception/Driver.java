package exception;

public class Driver {

	public static void main(String[] args) {
		 
		int i = 0, d = 0;
		if (d != 0) {
			i = 10 / d;
		}

		try {// business logic
			
			
				// i = 10/0;
				// System.out.println("i="+i);
			int[] intArray = { 1, 2, 3 };
			// System.out.println(intArray[3]);

			try {

				String name = null;
				System.out.println(name.toUpperCase());
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}

		} catch (ArithmeticException e) {// exception logic
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {// exception logic
			System.out.println(e.getMessage());
		}
		 catch (NullPointerException e) {// exception logic
				System.out.println(e.getMessage());
			}
		finally { // used deallocate the resources
			System.out.println("Finally Am always there...");
		}
		// flow of exception object
		
		try {
			Exception exception = new Exception();
			exception.a();
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(i);
		System.out.println("Am at the end of application.");
	}



	}


