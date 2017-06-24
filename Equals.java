public class Equals
{
	public static void main(String[] args)
	{
		String a = new String("ciao");
		String b = new String("ciao");

		String c = "ciao";
		int x = 10;
		boolean y = true;
		char carattere = 'a';

		char[] caratter = new char[10];

		/*a = "ciao";
		b = "ciao";
*/

		System.out.println(a+b);
		if(b == c)
		{
			System.out.println("Sono uguali");
		}
	}
}


/* 
stack
{
	main
	{
		a= 123
		b = 124
		c = 125
		x = 10
		y = true
	}
}
heap
{
	123 = "ciao"
	124 = "ciao"
	125 = "ciao"



}





*/