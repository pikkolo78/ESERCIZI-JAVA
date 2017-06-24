public class Persona
{
  int anni;
  
  public Persona()
  {
  	anni=26;
  }

  public int calcoloGiorni()
  {
  	int giorni=anni * 365;
  	return giorni;
  }
  public int calcoloSecondi()
  {
  	int secondi= calcoloGiorni() * 24 * 60 * 60;
  	return secondi;
  }
  public void calculateAge()
  {
  	System.out.println("Eta':" + anni + ","+ " giorni:"+ calcoloGiorni()+ ","+" secondi:"+ calcoloSecondi());
  }

}