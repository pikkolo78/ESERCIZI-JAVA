import java.util.ArrayList;


public class Canzone2
{
	public static void main(String[] args)
	{
		if("ciao" == "ciao")
		{
			System.out.println("Sono uguali");
		}

		String testo = "aa aa bb aa bb aa cc cc cc";
		ArrayList<String> paroleTesto = stampaParole(testo);
		System.out.println("Array parole: " + paroleTesto);
		System.out.println("Parola piu usata: " + trovaParolaUsataPiuSpesso(paroleTesto));
		

	}

	static String trovaParolaUsataPiuSpesso(ArrayList<String> parole)
	{

		ArrayList<String> paroleUniche = new ArrayList<>();
		int contatorecerca = 0;
		int contatoreparolapiuUsata = 0;
		String parolapiuUsata = "";
		String parolaCercata = "";
		String parola = ""; 
		for(int i = 0; i<parole.size();i++)
		{

				parola = parole.get(i);

				if(!paroleUniche.contains(parola))
				{
					paroleUniche.add(parola);

				}
		}
		
		for (int i = 0; i<paroleUniche.size(); i++)
		{
			parolaCercata = paroleUniche.get(i);

			for (int j = 0; j<parole.size(); j++)
			{

				parola = parole.get(j);
				if(parola == parolaCercata) 
				{
					contatorecerca++;
				}
			}

			if(contatorecerca > contatoreparolapiuUsata)
			{
				contatoreparolapiuUsata = contatorecerca;
				parolapiuUsata = parolaCercata;
				contatorecerca = 0;
			}
			if(contatorecerca < contatoreparolapiuUsata)
			{
				contatorecerca = 0;
			}
		}

		return parolapiuUsata;
	}

	static ArrayList<String> stampaParole(String testo)
	{
		testo = testo + " ";
		ArrayList<String> parole = new ArrayList<>();


		int numerospazi = contaParole(testo);

		for (int i = 0;i < numerospazi ;i++) 
		{
			parole.add(trovaPrimaParola(testo));
			testo = cancellaPrimaParola(testo);
		}

		return parole;
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