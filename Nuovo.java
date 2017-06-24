import java.util.ArrayList;
public class Nuovo
{
   public static void main(String[] args)
   {
     String testo= "abc-123-def-ciao-sole-def-def-ciao";
     testo=testo +"-";
     ArrayList<String> parole= new ArrayList<>();
     while (testo.indexOf("-") != -1)  
        {
          //System.out.println(testo.substring(0, testo.indexOf("-")));
     	   parole.add(testo.substring(0, testo.indexOf("-")));
           testo=testo.substring(testo.indexOf("-")+1);
        }
     //System.out.println(parole);
     //System.out.println(parole.size());
     int max=0;
     String parolaMax=" ";

     for (int i=0;i<parole.size() ;i++ )
     {
        String frase= parole.get(i);
        int conta=0;
        for (int y =0; y<parole.size();y++ ) 
        {   
        	if (frase.equals(parole.get(y))) 
        	{
        	 conta++;
        	}
        }
        if (conta>max) 
        {
        	max=conta;
        	parolaMax=frase;
        }
      }
      System.out.println(parolaMax);
   }
}