public class Vettori
{
	public static void main(String[] args)
	{
		String[] posti;

		posti = new String[10];

		int i = 0;
		// Caricamento Vettore
		while(i < 10)
		{
			System.out.println("Stiamo entrando nell'elemento numero: " + (i+1) + " del vettore");
			posti[i + 1] = "Persona " + (i + 1);
			System.out.println("Stiamo entrando nell'elemento numero: " + (i+1) + " del vettore");
			i = i + 1;
		}
		// Stampa vettore

		i = 0;

		while(i < 10)
		{
			System.out.println(posti[i]);
			i = i + 1;
		}



	}


	/*
	|stack|
		$String[]  posti = 124
		$String[]  persone = 124
	
	|heap|
	
		123 = |$String = "Mario" |$String = "Giuseppe"|$String | | | | | | | | 
		124 = | | | | | ||| || |||||


	*/
}