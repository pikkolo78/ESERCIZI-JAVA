import java.util.ArrayList;


public class Liste
{
	public static void main(String[] args)
	{
		/*ArrayList<String> parole;

		parole = new ArrayList<>();

		parole.add("Parola1");
		parole.add("Parola2");
		parole.add("Parola3");

		parole.remove(1);

		parole.add(1,"Parola4");

		//parole.clear();

		System.out.println(parole.get(1));*/


		ArrayList<Integer> numeri = new ArrayList<>();
		ArrayList<Integer> altriNumeri;

		altriNumeri = numeri;

		for (String numero : args) 
		{
			if (Integer.parseInt(numero) < 5) 
			{
				numeri.add(Integer.parseInt(numero));	
			}

		}

		//System.out.println(altriNumeri);

		for (Integer intero : numeri ) 
		{	
			System.out.println(intero);
		}

	}
}

/* 
stack:
	numeri: 123

heap:

	123 = | | | | 
*/