public class Oop
{
	public static void main(String[] args)
	{
		Persona p1 = new Persona();

		//mario.nome = "Mario";

		//mario.assegnaMeStesso();

		//p1.cambiaNome("Francesco");

		//p1.creaPadre();
		//p1.stampaNomePadre();
          p1.creaFiglio();


		 System.out.println(p1.figlio.nome);
	}
}

/*
	public = campo è accessibile da qualunque punto
	private = campo è accessibile soltanto dalla classe stessa(metodi della classe)
*/

/*
stack
{
	stampanomeECognome
	{
		this = 125(padre)
	}
	stampanomePadre
	{
		this = 123
	}
	main{
			mario = 124
	antonio = 124
	}

}
heap
{
	123 = {nome = "Mario", cognome = "Pirris", eta = 28, padre = 125, mestesso= 123...}
	124 = {nome = "Francesco", cognome = "D'accampo", eta = 28...}
	125 = {nome giacomo, cognome boh}
}



*/