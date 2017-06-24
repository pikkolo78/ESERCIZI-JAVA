public class Temperatura
{
  double celsius;
  double farheneit;
  public Temperatura(double farheneit)
  {
      this.farheneit=farheneit;
      celsius=(farheneit -32) *5/9;
  }

  public void stampaTemperatura()
  {
  	System.out.println("farheneit= "+farheneit+","+"celsius= "+celsius);
  }


}