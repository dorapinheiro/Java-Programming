package excepcoes;

public class Main {

	
	public static int m1() throws Exception{ 

		 throw new Exception("Some Exception"); 

		 }
	 public static void main(String[] args) throws Exception{
		
		// para dar Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
//		int[] arr = new int[8];
//		//System.out.println(arr[8]);
//		int String;
//		
//		// Apanhar a excepção
//		try{
//		System.out.println(arr[8]);
//		}catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("Apanho excepção");
//		}
//		
//		
//		ExceptionsTest eT = new ExceptionsTest();
//		System.out.println("Antes");
//		
//			
//			eT.atira();
//		
//		System.out.println("Depois");
		
		//byte b=320;
		
	
		boolean b1 = false; 

		boolean b2 = false; 

		if (b2 = b1 == false){ 

		} else{ 

		 System.out.println("false"); 

		}
		
		int[] a = null; 

		 int i = a [ m1() ];
		
	}

}
