package pratica_aula15.modelo;

public class ProfessorHorista extends Professor {
	
	private int horasTrabalhadas;
	
	public ProfessorHorista() {
		 
	 }

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double getSalario() {
		final double valorHora = 25.0;
        return valorHora * getHorasTrabalhadas();
	}
	
	
	public void lecionar() {
        System.out.println("Estou lecionando na turma horista.");
    }
	
}
