public class Funzioni
{
	public static void main(String[] args)
	{
		int a, b, c;
		a = 10;
		b = 2;
		c = 7;

		conta(a, b, 50);
		stampaCiao();

		c = somma(25, 10); // risultato

		somma(1 , 2);
		somma(3, 4, 5);

		System.out.println(c);
		System.out.println(somma(somma(5, 102) - 50, 30));

		System.out.println(concatena("ciao", "pippo"));
		

	}

	static int somma(int addendo1, int addendo2)
	{
		int risultato = addendo1 + addendo2;
		return risultato;
	}

	static String concatena(String a, String b)
	{
		String risultante = a + " " + b;
		System.out.println(risultante);
		return risultante;
	}

	/*static int somma(int a, int b, int c)
	{
		return a + b + c;
	}*/

	static int somma(int x, int y, int z)
	{
		System.out.println("ciao");
		return 0;
	}


	static void conta(int numeroPartenza, int numero2, int numero3)
	{
		numeroPartenza = 10;
		int a;
		int b;
		int c;
		for(int i = numeroPartenza; i < 5 + numeroPartenza; i++)
		{
			System.out.println(i);
		}
	} 

	static void stampaCiao()
	{
		System.out.println("Stampa ciao");
	}
}
/* stack

	conta
	{
		numeroPartenza = 10,
		numero2 =,
		numero 3 = 
		i = 2
	}
	main
	{
		int a = 10,
		int b = 2,
		int c = c,
	}




 */