import java.util.ArrayList;


public class Arrays {

	public static void main(String args[])
	{
		
		// ArrayList

//		ArrayList myList;
//		myList = new ArrayList();
//		
//		myList.add("John");
//		myList.add("Mary");
//		myList.add("Lidia");
//		myList.add("Mary");
//		
//	 myList.remove(20);
//		
//		System.out.println(myList);
		
		
		// arrays
		
//		int[][] matrix;
//		matrix = new int[4][];
//		matrix[0] = new int[1];
//		matrix[1] = new int[2];
//		matrix[2] = new int[3];
//		matrix[3] = new int[4];
//		
//		
//		for(int i=0; i<matrix.length;i++)
//		{
//			int lengthI = matrix[i].length;
//			
//			for (int j = 0; j < lengthI; j++) {
//				System.out.println(matrix[i][j]);
//			}
//		}

		
		
		int[][] a ={{1}, {2,3}, {4,5,6}, {7,8}};
		
		
		// Implementação com for	
		System.out.println("-- Implementação com for --");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j] + " " );
			}
			System.out.println();
		}
		
		
		// Implementação com foreach		
		System.out.println("-- Implementação com foreach --");
		for (int[] is : a) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		
		// Implementação com while
		System.out.println("-- Implementação com while --");
		
		int i=0;
		int j;
		while(i<a.length)
		{
			j=0;
			while(j<a[i].length)
			{
				System.out.print(a[i][j] + " ");
				j++;
			}
			i++;
			System.out.println();
		}
		

		// Implementação com do while
		System.out.println("-- Implementação com do while --");
		int var=0;
		int var2=0;
		
		do {
			
			while(var2<a[var].length)
			{
				System.out.println(a[var][var2] + " ");
				var2++;
			}
			var++;
			System.out.println();
		} while (var<a.length);
		
		// Exemplo de duas declarações num for
		int ia;
		double at;
		for(ia =0, at =0.0;i<10;i++)
		{
			
		}
	}
}
