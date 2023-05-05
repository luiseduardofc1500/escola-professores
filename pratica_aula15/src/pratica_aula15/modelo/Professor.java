package pratica_aula15.modelo;
import java.util.Date;

abstract class Professor {
	
	
	
	
	protected String nome;
	protected String matricula;
	protected Date dataNascimento;
	protected double salario;
	protected String nivelEscolaridade;
	protected String disciplina;
	
	
	public Professor() {
		
	}


	public String getNome() {
		return nome;
	}
	


	public String getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public abstract double getSalario();

	public void setSalario(double salario) {
		this.salario = salario;
	}
	


	public String getNivelEscolaridade() {
		return nivelEscolaridade;
	}


	public void setNivelEscolaridade(String nivelEscolaridade) {
		this.nivelEscolaridade = nivelEscolaridade;
	}
	
	public abstract void lecionar();
	
	
	
	
	
}
