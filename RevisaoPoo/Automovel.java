package RevisaoPoo;

public class Automovel 
{
 //declaração dos atributos da classe
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	
	//criação do método especial construtor (inicializa atributos) ---parametros abaixo
	public Automovel(String nomeProprietario, String modelo, String placa, int ano)
	{
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		//O método construtor serve para inicializar
		// O this é necessário quando o nome do atributo é o mesmo do parâmetro
	}
	
	//declaração dos demais métodos da classe Automovel
	//get = pegar alguma informação
	//SET = dar alguma informação
	public void imprimirInfo()
	{
		System.out.println("\nNome do proprietário: "+nomeProprietario+" possui um "+
		modelo+" com placa "+placa+ " e ano: "+ano);
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
