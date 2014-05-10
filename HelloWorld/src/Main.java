
public class Main {

	public static void main(String[] args) {

	//solucao com foreach	
	
		for (String batata : args) {
			if(batata.equals(args[args.length-1]))
			{
				System.out.println(batata);
			}
			else{
			System.out.print(batata + " ");
			}
		}
	}

}


// usar o for e ter tratamento do último espaço 

//for(int i=0; i<args.length;i++)
//{
//	if(i==args.length-1)
//	{
//		System.out.print( args[i]);
//	}
//	else
//	{
//		System.out.print(args[i] + " ");
//	}
//}
