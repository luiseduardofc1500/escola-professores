package pratica_aula15.modelo;
import java.util.Date;

public class EscolaView {

	public static void main(String[] args) {
		ProfessorDAO dao = new ProfessorDAO();

		// Criando quatro professores integrais
		ProfessorIntegral p1 = new ProfessorIntegral();
		p1.setNome("João");
		p1.setMatricula("001");
		p1.setDataNascimento(new Date());
		p1.setSalario(4000.00);
		p1.setNivelEscolaridade("Mestrado");
		p1.setDisciplina("Matemática");
		p1.setDataInicio(new Date());

		ProfessorIntegral p2 = new ProfessorIntegral();
		p2.setNome("Maria");
		p2.setMatricula("002");
		p2.setDataNascimento(new Date());
		p2.setSalario(5000.00);
		p2.setNivelEscolaridade("Doutorado");
		p2.setDisciplina("Português");
		p2.setDataInicio(new Date());

		ProfessorIntegral p3 = new ProfessorIntegral();
		p3.setNome("José");
		p3.setMatricula("003");
		p3.setDataNascimento(new Date());
		p3.setSalario(3500.00);
		p3.setNivelEscolaridade("Graduação");
		p3.setDisciplina("Geografia");
		p3.setDataInicio(new Date());

		ProfessorIntegral p4 = new ProfessorIntegral();
		p4.setNome("Ana");
		p4.setMatricula("004");
		p4.setDataNascimento(new Date());
		p4.setSalario(4500.00);
		p4.setNivelEscolaridade("Especialização");
		p4.setDisciplina("História");
		p4.setDataInicio(new Date());

		// Criando quatro professores horistas
		ProfessorHorista p5 = new ProfessorHorista();
		p5.setNome("Pedro");
		p5.setMatricula("005");
		p5.setDataNascimento(new Date());
		p5.setHorasTrabalhadas(20);
		p5.setSalario(0.0);
		p5.setNivelEscolaridade("Graduação");
		p5.setDisciplina("Educação Física");

		ProfessorHorista p6 = new ProfessorHorista();
		p6.setNome("Julia");
		p6.setMatricula("006");
		p6.setDataNascimento(new Date());
		p6.setHorasTrabalhadas(15);
		p6.setSalario(0.0);
		p6.setNivelEscolaridade("Mestrado");
		p6.setDisciplina("Física");

		ProfessorHorista p7 = new ProfessorHorista();
		p7.setNome("Lucas");
		p7.setMatricula("007");
		p7.setDataNascimento(new Date());
		p7.setHorasTrabalhadas(30);
		p7.setSalario(0.0);
		p7.setNivelEscolaridade("Especialização");
		p7.setDisciplina("Química");

		ProfessorHorista p8 = new ProfessorHorista();
		p8.setNome("Carla");
		p8.setMatricula("008");
		p8.setDataNascimento(new Date());
		p8.setHorasTrabalhadas(25);
		p8.setSalario(0.0);
		p8.setNivelEscolaridade("Doutorado");
		p8.setDisciplina("Biologia");
		
		

		// Adicionando professores na lista
		
		dao.adicionarProfessor(p1);
		dao.adicionarProfessor(p2);
		dao.adicionarProfessor(p3);
		dao.adicionarProfessor(p4);
		dao.adicionarProfessor(p5);
		dao.adicionarProfessor(p6);
		dao.adicionarProfessor(p7);
		dao.adicionarProfessor(p8);

		
		

		// Informa a quantidade de professores na escola
		dao.quantidadeProfessores();

		// Informa o professor com o maior salário
		dao.professorMaiorSalario();

		// Informa qual o professor mais jovem da escola
		dao.professorMaisJovem();

		// Informa o professor mais velho
		dao.professorMaisVelho();

		// total de salários a ser pago pela escola (professores Integrais e Horistas)
		dao.totalSalarios();

		// Listar a quantidade média de HorasTrabalhadas pelos Professores Horistas
		dao.mediaHorasTrabalhadasHoristas();

		
		/**
		 * // Listar os professores que lecionam as disciplinas de português e matemática
		List<Professor> professoresPortuguesMatematica = dao.professores("Português", "Matemática");
		for (Professor professor : professoresPortuguesMatematica) {
		    System.out.println("Professor que leciona " + "Português e Matemática: " + professor.getNome());
		}

		// Listar os professores com mestrado e doutorado
		List<Professor> professoresMestradoDoutorado = dao.obterProfessoresPorNivelEscolaridade("Mestrado", "Doutorado");
		for (Professor professor : professoresMestradoDoutorado) {
		    System.out.println("Professor com mestrado ou doutorado: " + professor.getNome());
		}
		 */
		


	}

}
