public class Esercizio1
{
   public static void main (String[] args)
 
     {  
       int [] vettore1= new int[Integer.parseInt (args[0])];
       int [] vettore2= new int[Integer.parseInt(args[1])];
       int [] vettore3= new int[Integer.parseInt(args[2])];
       int numero =riempiVettore(vettore1,0);
       numero=riempiVettore(vettore2,numero);
       stampaVettore(vettore1);
       stampaVettore(vettore2);
       sommaVettori(vettore1,vettore2,vettore3);
       stampaVettore(vettore3);
     }
 
     static int riempiVettore(int[] pippo,int paperino)
     {
       for (int i=0;i<pippo.length ;i++ )
       {
        pippo[i]=paperino;
        paperino++;
       }
        return paperino;
       
     }
 
     static void stampaVettore(int[] vettore)
     {
       for (int i=0;i<vettore.length ;i++ )
       {
        System.out.println( vettore[i]);
       }
     
 
     }
 
     static void sommaVettori(int[] pippo,int[] pluto,int[] topo)
     {
       for (int i=0;i<topo.length ;i++ )
       {
       
        if (pippo.length<=i && pluto.length<=i)
        {
            topo[i]=5+5;
            continue;
        }
        if (pippo.length<=i && pluto.length>i)
        {
 
            topo[i]=pluto[i]+5;
            continue;
        }
         if(pippo.length>i && pluto.length<=i)
           
 
         {
 
          topo[i]=pippo[i]+5;
          continue;
         }
         if (pippo.length>i && pluto.length>i)
         {
            topo[i]=pippo[i]+pluto[i];
         }
 
 
 
       }
 
       
 
 
 
     }
 
 
 
}
/* java Eserzio1 2 3 4
    1 vettore di 2 = 0 1
    1 vettore di 3 = 2 3 4
    1 vettore di 4 = 2 4 9 10
*/