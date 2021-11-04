package Es1;
import java.util.*;

public class Campo extends Prenotazione
{
	static ArrayList <Campo> preList = new ArrayList<>();
	private String ora; 
	protected Campo(String nome, int orainizio, int orafine) 
	{
		super(nome, orainizio, orafine);
		this.ora = orainizio + "-" + orafine;
		
	}

	public boolean addPrenotazione(Campo prenota) // OK
	{
		for (int i = 0;i<preList.size();i++) 
		{
			if (preList.get(i).getNome().equals(prenota.getNome()))
	  		return false;
		}
        preList.add(prenota);
		return true;
		
	}
	public boolean removePrenotazione(String utente) 
	{
		for(int i = 0; i <= preList.size(); i++)
		{
			if (preList.get(i).getNome().equals(utente)) 
				{
				preList.remove(i);
				return true;
				}
		}
		return false;
	}

	public String getOra() // OK
	{
		return ora;
	}
	public void stampaLista() 
	{
		for (Campo c: preList)
		{
			System.out.println(toString(c));
		}
		System.out.println(preList.size());
		
	}
	
	public String toString(Campo p)
	{
		
		return p.getNome()+" "+p.getOra();
	
		
		
		/*Campo [] listaOra = new Campo[preList.size()];
		for (int i = 0; i <listaOra.length;i++)
		{
			listaOra[i]= preList.get(i);
		}
		Bubblesort(listaOra,listaOra.length);
		for(int i = 0; i <listaOra.length;i++) 
		{
			System.out.println(listaOra[i].getNome()+" "+listaOra[i].getOra());
		}*/
	
	}
	/*private static void Bubblesort(Campo[] a, int n)
	{
		boolean controllo = true;
		while (controllo)
		{
			controllo = false;
			for (int i = 0; i<n-1;i++)
			{
				if(a[i].getOra().compareTo(a[i+1].getOra()) > 0) 
				{
					Campo app = a[i];
					a[i] = a[i+1];
					a[i+1] = app;
					controllo = true;
				}
			}
		}	
	}*/


}
