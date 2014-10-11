package sessao.um;

import java.util.ArrayList;

public class Teste {



	public static void main(String args[])
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		ArrayList<String> arrayListAux = new ArrayList<String>();
		
		
		arrayList.add("lara");
		arrayList.add(null);
		arrayList.add("li");
		arrayList.add(null);
		arrayList.add("lara");
		
		
		arrayListAux.addAll(arrayList);
		
		System.out.println("Quantos elementos " + arrayList.size());
		
		
		// Remover laras do ArrayList
		if(arrayListAux.contains("lara"))
		{
			System.out.println("\nContenho");
			 
			ArrayList<String> ls = new ArrayList<String>();
			ls.add("lara");
			
			arrayListAux.removeAll(ls);

		}
		
		// Imprimir arraylist
		System.out.println("\nUsando um ciclo foreach");
		for (String string : arrayList) {
			System.out.println("Imprimo: " + string);
		}
		
		System.out.println("\nUsando um ciclo for");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Ciclo for i: " + arrayList.get(i)); 
		
		}
		
		// Imprimir laras sem if != null
		System.out.println("\nImprimo as laras");
		
		String s = "lara";
		
		for (String string : arrayList) {
			if (s.equals(string)) {
				System.out.println( string);
			}
		}
		
	}
	
}
