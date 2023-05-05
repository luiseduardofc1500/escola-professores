package pratica_aula15.modelo;
import java.util.Date;

public class ProfessorIntegral extends Professor {
	
	
	 private Date dataInicio;
	 
	 public ProfessorIntegral() {
		 
	 }
	 
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	 
	public double getSalario() {
		return salario;
	}
	
	public void lecionar() {
        System.out.println("Estou lecionando na turma integral.");
    }
	 
	 

}
