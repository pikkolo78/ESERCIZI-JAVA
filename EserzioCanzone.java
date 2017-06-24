import java.util.ArrayList;


public class EserzioCanzone
{
	public static void main(String[] args)
	{
		String testo = "E questa sera vado fuori Sento troppa compressione Meglio uscire che scoppiare Io ed il mio amico Carnevale Capitiamo nel locale Dove abbiamo avuto il nostro bel daffare Da quanto non veniamo e non manchiamo Ci carburiamo con un aiutino Che è venerdì L'ingresso sembra un po' più stretto Forse han tolto degli specchi Io mi sento un po' impedito E lo sapevo, avrei scommesso Che la musica era un cesso Ma comunque noi avremmo resistito Che adesso c'ho bisogno di rumore E non pensare al freddo che c'è fuori Che è venerdì Non mi rompete i coglioni Mia bella sposa qualunque cosa Sarà il minore dei mali Arriva un tipo che mi offre Un po' di viagra e poi mi dice Che lo mette a molto poco E le ragazze son sudate Sono giovani e impegnate Che ballare adesso non è mica un gioco E un paio che ci lasciano provare E insomma non andiamo mica male Che è venerdì Si fanno vivi due fighetti A dirci quanto siamo vecchi E ad insultarci che c'eran prima loro Si passa presto agli spintoni Uno di loro ha la pistola Sento il freddo della canna sulla gola Mi dice vecchio hai già la vita corta Ma se ci tieni proprio te l'accorcio Ed è venerdì Non mi rompete i coglioni Mia bella sposa qualunque cosa Sarà il minore dei mali Che è venerdì Ed il respiro piano piano Ci ritorna e qui fuori Fa le nuvole di fumo Siamo sdraiati sul catrame Quelle stelle sono vere E almeno qui non ci sparerà nessuno E Carnevale si sta sbellicando E io che lo sfanculo e poi mi aggiungo Che è venerdì Non mi rompete i coglioni Mia bella sposa qualunque cosa Sarà il minore dei mali È venerdì Non ci rompete i coglioni Qualunque cosa mia bella sposa Il venerdì resta fuori Che è venerdì";

		stampaParole(testo);


	}

	static String trovaParolaUsataPiuSpesso(ArrayList<String> parole)
	{

		/* COMPLETARE QUI, FARE IN MODO CHE RESTITUISCA LA PAROLA USATA PIU' SPESSO NELLA CANZONE 
			consigli:
				equals,
				for,
				
		*/ 
		return null;
	}

	static void stampaParole(String testo)
	{
		testo = testo + " ";
		ArrayList<String> parole = new ArrayList<>();


		int numerospazi = contaParole(testo);

		for (int i = 0;i < numerospazi ;i++) 
		{
			parole.add(trovaPrimaParola(testo));
			testo = cancellaPrimaParola(testo);
		}

		System.out.println(parole);
	}

	static int contaParole(String testo)
	{
		int numeroDiSpazi = 0;

		while(testo.indexOf(" ") != -1)
		{
			numeroDiSpazi++;
			testo = testo.substring(testo.indexOf(" ") + 1);
		}

		return numeroDiSpazi;
	}

	static String cancellaPrimaParola(String testo)
	{
		testo = testo.substring(testo.indexOf(" ") + 1);
		return testo;
	}

	static String trovaPrimaParola(String testo)
	{
		testo = testo.substring(0, testo.indexOf(" "));
		return testo;
	}
}