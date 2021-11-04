package Es1;

public class Prenotazione 
{
	private String nome; 
	protected Prenotazione(String nome, int orainizio, int orafine)
	{
		this.nome = nome;
	}
	public String getNome()
	{
		return nome;
	}
}
