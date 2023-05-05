package pratica_aula15.modelo;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {
    private List<Professor> professores = new ArrayList<>();

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void removerProfessor(Professor professor) {
        professores.remove(professor);
    }

    public int quantidadeProfessores() {
        return professores.size();
    }

    public void professorMaiorSalario() {
    	double maiorSalario = 0;
        int index = 0;
        
        for (int i=0; i < professores.size(); i++) {
        	double valorAtual = professores.get(i).getSalario();
        	maiorSalario = valorAtual;
        	index = i;
        }
        System.out.println("Professor com maior Salario: " + professores.get(index).getSalario());
        
    }
    
    

    public void professorMaisJovem() {
    	Professor novinho = professores.get(0);
    	for (int i = 1; i < professores.size(); i++) {
            if (professores.get(i).getDataNascimento().after(novinho.getDataNascimento())) {
                novinho = professores.get(i);
            }
        }
        System.out.println("Professor mais jovem: " + novinho.getNome());
        
    }
    
    
    

    public void professorMaisVelho() {
    	Professor velhote = professores.get(0);
    	for (int i = 1; i < professores.size(); i++) {
            if (professores.get(i).getDataNascimento().before(velhote.getDataNascimento())) {
                velhote = professores.get(i);
            }
        }
        System.out.println("Professor mais antigo: " + velhote.getNome());
    }
    
    

    public void totalSalarios() {
        double total = 0;

        for (Professor professor : professores) {
            total += professor.getSalario();
        }

        System.out.println("Salario total da escola: " + total);
    }

    
    
    public void mediaHorasTrabalhadasHoristas() {
        int totalHorasTrabalhadas = 0;
        int quantidadeHoristas = 0;

        for (Professor professor : professores) {
            if (professor instanceof ProfessorHorista) {
                ProfessorHorista horista = (ProfessorHorista) professor;
                totalHorasTrabalhadas += horista.getHorasTrabalhadas();
                quantidadeHoristas++;
            }
        }

        if (quantidadeHoristas == 0) {
        	System.out.println("Não ha nenhuma hora de professores horistas. ");
        }
        
        double media = totalHorasTrabalhadas / quantidadeHoristas; 
        System.out.println("Media de Horas trabalhadas por horistas " + media);
        
    }
    
    

    public List<Professor> professoresDePortuguesEMatematica() {
        List<Professor> portuguesMatematica = new ArrayList<>();

        for (Professor professor : professores) {
            if (professor.getDisciplina().equals("Português") ||
                    professor.getDisciplina().equals("Matemática")) {
            			portuguesMatematica.add(professor);
            }
        }

        return portuguesMatematica;
    }
    
    

    public List<Professor> professoresComMestradoDoutorado() {
    	List<Professor> mestradoDoutorado = new ArrayList<>();

        for (Professor professor : professores) {
            if (professor.getNivelEscolaridade().equals("Mestrado") ||
                    professor.getNivelEscolaridade().equals("Doutorado")) {
            			mestradoDoutorado.add(professor);
            	}
        }
        return mestradoDoutorado;
    }
}
