package Es1;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		int input;
		Campo c = null;
		boolean controllo = true;
		Scanner in = new Scanner (System.in);
		String nome;
		int orainizio,orafine;
		
		do 
		{
			do
			{
		     System.out.println('\n'+"Benvenuto premere:");
		     System.out.println("1) Aggiungi prenotazione");
		     System.out.println("2) Cancella prenotazione");
		     System.out.println("3) Lista prenotazioni");
		     System.out.println("0) Esci" +'\n');
		     input = in.nextInt();
		     if (input != 1 && input != 2 && input != 3 && input != 0) 
		    	 System.out.println("Premere [0/1/2/3]");
			}while (input != 1 && input != 2 && input != 3 && input != 0);
			
			switch(input)
			{
			case 1:
			{
				
				System.out.println("Inserire nome:");
				nome = in.next();
				do
				{
				System.out.println("Inserire ora di inizio:");
				orainizio = in.nextInt();
				System.out.println("Inserire ora di fine:");
				orafine = in.nextInt();
				if ((orainizio>24 || orainizio<0) || (orafine>24 || orafine<0) || orainizio == orafine) 
					System.out.println("...Orario errato..." +'\n');
				}while ((orainizio>24 || orainizio<0) || (orafine>24 || orafine<0) || orainizio == orafine);
				c = new Campo(nome,  orainizio, orafine);
				if (c.addPrenotazione(c)) System.out.println("Utente inserito correttamente"+ '\n');
				else System.out.println("Utente gia presente"+ '\n');
				
			}break;
			case 2:
			{
				System.out.println("Inserire nome:");
				if(c.removePrenotazione(in.next())) System.out.println("Utente rimosso correttamente"+ '\n');
				else System.out.println("Utente non presente"+ '\n');
				
			}break;
			case 3:
			{
				System.out.println('\n' +"LISTA:");
				c.stampaLista();
			}break;
			case 0: 
			{
					System.out.println('\n' +"Arrivederci");
					controllo = false;
			}break;
			}
		} while(controllo);
		in.close();
	}

}
