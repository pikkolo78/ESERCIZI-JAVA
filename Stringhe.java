public class Stringhe
{
	public static void main(String[] args)
	{
		String testo = "Oggi e' bella  | una bella sasd asdfagadg sadasd giornata | bella giornata";

		String parola = "una bella giornata";

		stampa(testo.indexOf("una"));
		stampa(testo.indexOf("bella giornata"));
		stampa(testo.indexOf("bella", 20));
		stampa(testo.indexOf(parola));

		stampa("asdasdasdas".isEmpty());

		stampa("Ciao".contains("iaos"));


		stampa("Ciao a tutti".substring(5, 9));

		int posizioneBarra1 = testo.indexOf("|");
		int posizioneBarra2 = testo.indexOf("|", posizioneBarra1 + 1);







		stampa(  testo.substring(posizioneBarra1 + 1, posizioneBarra2)                          );
		stampa(testo.substring(testo.indexOf("|") + 1,testo.indexOf("|",testo.indexOf("|")+1)));



	}

	static void stampa(String daStampare)
	{
		System.out.println(daStampare);
	}
	static void stampa(int daStampare)
	{
		System.out.println(daStampare);
	}
	static void stampa(boolean daStampare)
	{
		System.out.println(daStampare);
	}
}

/* 
int indexOf(String x) // restituisce posizione stringa x, se non presente restituisce -1
boolean isEmpty() // restituisce true se il vettore è vuoto
boolean contains(String x) // restituisce true se è contenuta la stringa x
boolean equals(String x) // restituisce true se la stringa x è uguale
int length() // restituisce la dimensione della stringa
String substring(int posIniziale) // restituisce una stringa uguale alla stringa di partenza, tagliata dalla pos iniziale
String substring(int posIniziale, int posFinale) // come sopra, impostando anche la pos finale


*/