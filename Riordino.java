/* Scrivere un programma che, per tutti i numeri passati in args, li riordini e li ristampi ordinati */


public class Riordino
{
	public static void main(String[] args)
	{
		/*int[] numeri = {1 , 2 , 3 , 4 , 5};

		for(int numero : numeri)
		{
			System.out.println(numero);
		}*/

		int[] numeri = new int[args.length];
		int posizionePiccolo;
		int numeroPiccolo;
		int j;
		int valoreAttuale;
		/* i++ == i = i + 1 */

		for(int i = 0; i < args.length ; i++)
		{
			numeri[i] = Integer.parseInt(args[i]);
		}

		for(int i=0;i<args.length;i++)
		{
			numeroPiccolo = numeri[i]; // 5
			posizionePiccolo = i; // 1
			// Cerco numero più piccolo nel vettore
			for (j = i;j<args.length;j++) // j = 4
			{
				if(numeri[j] < numeroPiccolo)
				{
					numeroPiccolo = numeri[j];//0
					posizionePiccolo = j;//6
				}
			}

			/*Scambiamo i due valori */
			valoreAttuale = numeri[i];
			numeri[i] = numeroPiccolo;
			numeri[posizionePiccolo] = valoreAttuale;
			/* */
			System.out.println("Vettore temporaneo: ");
			for(int numero : numeri)
			{
				System.out.print(numero + " ");
			}
			System.out.println();


		}

		System.out.println("Vettore Ordinato:");
		for(int numero : numeri)
		{
			System.out.print(numero + " ");
		}


	}
}
/*

1 5 2 7 12 7 2 1

1 1 2 2 5 7 7 12  */