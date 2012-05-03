package oppgave2;

// by the coding heads of Trond Larsen && Mikael Bendiksen

import java.util.Scanner;


public class indexof 
{


	public static void main(String[] args) 
	{
		
		Scanner tekstinn = new Scanner(System.in);
		Scanner s¿kinn = new Scanner(System.in);
		System.out.println("Skriv inn tekst:");
		String tekst = tekstinn.nextLine();
		System.out.println("Skriv inn ord du vil s¿ke etter:");
		String s¿k = s¿kinn.nextLine();
		
		
		System.out.println("Du skrev: " + tekst);
		
		int funn = 0;
		int teller = 0;

		for (int antall = 1;(funn = (tekst.indexOf (s¿k,funn) +1 )) > 0; antall++)
		{
			teller++;
		}

		while ((funn = (tekst.indexOf (s¿k,funn) +1 )) > 0)

		System.out.println (funn);

		System.out.println("Ordet forekommer: " + teller + " gang i teksen");
		
	}
	
}


