package demo;

public class ExceptionHandeling {

	public static void main(String[] args) {
		demo();
		
	}	
		
		public static void demo () {
			
			try {
				
				System.out.println("-----helloooo---");
				
				int i =1/0;
				
				System.out.println("----completed----");
			}
			catch (Exception e) {
				System.out.println("inside catch block");
				System.out.println("message is: "+e.getMessage());
				System.out.println("cause is: "+e.getCause());
				e.printStackTrace();
			}
			
			finally {
				System.out.println("finally block");
			}
			
			
		}
		
		
		
		
		

	}


