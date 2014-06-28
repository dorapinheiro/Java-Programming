package excepcoes;

public class Main {

	public static void main(String[] args) {
		
		// para dar Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
		int[] arr = new int[8];
		//System.out.println(arr[8]);
		
		// Apanhar a excepção
		try{
		System.out.println(arr[8]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Apanho excepção");
		}

	}

}
