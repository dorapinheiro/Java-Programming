
public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello World! V2");
		
		for(int i=0; i<args.length;i++)
		{
			if(i==args.length-1)
			{
				System.out.print( args[i]);
			}
			else
			{
				System.out.print(args[i] + " ");
			}
		}

	}

}
