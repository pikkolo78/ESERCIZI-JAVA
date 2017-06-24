public class EsercizioFunzioni
{
	public static void main(String[] args)
	{
		if(valutaArgs(args.length))
		{
			valutaSegno( args[1], Integer.parseInt(args[0]) , Integer.parseInt(args[2]));
		}
		else
		{
			System.out.println("Lunghezza di args errata");
		}
	}

	static boolean valutaArgs(int lunghezza)
	{
		if(lunghezza != 3)
			return false;
		else
			return true;
	}


	static void valutaSegno(String segno, int a, int b)
	{
		int risultato = 0;

		if(segno.equals("+"))
		{
			risultato = addizione(a,b);
		}
		else if (segno.equals("-"))
		{
			risultato = sottrazione(a,b);
		}
		else if(segno.equals("x"))
		{
			risultato = moltiplicazione(a,b);
		}
		else if(segno.equals("/"))
		{
			risultato = divisione(a,b);
		}
		else
		{
			System.out.println("Segno non riconosciuto");
			return;
		}


		System.out.println("Risultato = " + risultato);

	}

	static int addizione(int a, int b)
	{
		return a + b;
	}

	static int sottrazione(int a, int b)
	{
		if (a < b)
		{
			System.out.println("ATTENZIONE, NUMERO NEGATIVO");
		}

		return a - b;
	}

	static int moltiplicazione(int a, int b)
	{
		return a * b;
	}

	static int divisione(int a, int b)
	{
		if (b == 0)
		{
			System.out.println("Non si puo' dividere per 0");
			return 0;
		}
		else
		{
			return a / b;
		}
	}


}