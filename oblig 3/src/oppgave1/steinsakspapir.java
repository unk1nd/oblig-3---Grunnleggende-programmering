package oppgave1;

// by the coding heads of Trond Larsen && Mikael Bendiksen

import java.util.Random;
import java.util.Scanner;

public class steinsakspapir {
	

	public static void main(String[] args) {

			
		int Datamaskin=0, Spiller=0, Uavgjort=0, DatamaskinTall;
		String DatamaskinPlay="",PersonPlay;
		String valg="y";
		Random generate = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		while(valg.equals("y")) {
			DatamaskinTall = generate.nextInt(3)+1;
			DatamaskinPlay = "";
			switch (DatamaskinTall)
			{
				case 1:
					{
						DatamaskinPlay = "R";
						break;
					}
				case 2:
					{
						DatamaskinPlay = "S";
						break;
					}
				case 3:
					{
						DatamaskinPlay = "P";
						break;
					}
				
			}
			System.out.println("Ta ditt valg: Stein (R), Saks (S) eller Papir (P)");
			PersonPlay = scan.nextLine();
			PersonPlay = PersonPlay.toUpperCase();
			if (PersonPlay.equals("Q"))
				{
					System.out.println("Avslutter.");
					System.exit(0);
				}
			
			if (DatamaskinPlay.equals(PersonPlay)) 
				{
					System.out.println("Datamaskin valgte " + DatamaskinPlay +  " og du valgte " + PersonPlay);
					System.out.println("Uavgjort");
					Uavgjort++;
				}
			else
				{

				if(PersonPlay.equals("R"))
						{
							if (DatamaskinPlay=="S")
							{
								System.out.println("Datamaskin valgte " + DatamaskinPlay +  " og du valgte " + PersonPlay);
								System.out.println("Stein knuser Saks");
								System.out.println("Spiller vant.");
								Spiller++;
							}
							else
							{
								System.out.println("Datamaskin valgte " + DatamaskinPlay +  " og du valgte " + PersonPlay);
								System.out.println("Papir dekker Stein");
								System.out.println("Datamaskinen vant.");
								Datamaskin++;
							}
							
						}
				else if(PersonPlay.equals("P"))
						{
							if (DatamaskinPlay=="R")
								{
								System.out.println("Datamaskin valgte " + DatamaskinPlay +  " og du valgte " + PersonPlay);
								System.out.println("Papir dekker Stein");							
								System.out.println("Spiller vant.");
								Spiller++;
								}
							else
								{
								System.out.println("Datamaskin valgte " + DatamaskinPlay +  " og du valgte " + PersonPlay);
								System.out.println("Saks klipper Papir");
								System.out.println("Datamaskinen vant.");
								Datamaskin++;
								}
						}
				else if (PersonPlay.equals("S"))
						{
							if (DatamaskinPlay=="P")
								{
								System.out.println("Datamaskin valgte " + DatamaskinPlay +  " og du valgte " + PersonPlay);
								System.out.println("Saks klipper Papir");							
								System.out.println("Spiller vant.");
								Spiller++;
								}
							else
								{
								System.out.println("Datamaskin valgte " + DatamaskinPlay +  " og du valgte " + PersonPlay);
								System.out.println("Stein knuser Saks");
								System.out.println("Datamaskinen vant.");
								Datamaskin++;
								}
						}
				else 
						{
							System.out.println("Ugyldig valg.. Pr¿v igjen..");
						}
					}
				System.out.println("\nStilling:");
				System.out.println("---------------");
				System.out.println("Datamaskin \t" + Datamaskin);
				System.out.println("Uavgjort \t" + Uavgjort);
				System.out.println("Spiller \t" + Spiller + "\n");
				System.out.println("Avslutte med Œ velge: Q");
				}
		
		}
	}


