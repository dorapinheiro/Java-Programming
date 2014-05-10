
public class Main {

	public static void main(String[] args) {

		for(int i=0; i<args.length;i++)
		{
			// utilização de operador ternario
			System.out.println(args[i] + (( i== args.length-1)? "\n": " "));
		}

	}
}


// 


