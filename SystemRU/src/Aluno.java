
public class Aluno {

	private String nome;
	private String cpf;
	private String periodo;
	private String anoDeEntrada;
	private int codigo;

	public Aluno(String nome, String cpf, String periodo, String anoDeEntrada, int codigo) {
		this.nome = nome;
		this.cpf = cpf;
		this.periodo = periodo;
		this.anoDeEntrada = anoDeEntrada;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getAnoDeEntrada() {
		return anoDeEntrada;
	}

	public void setAnoDeEntrada(String anoDeEntrada) {
		this.anoDeEntrada = anoDeEntrada;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
