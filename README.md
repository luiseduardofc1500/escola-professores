# escola-professores
Apredizagem de classe abstrata

Uma escola possui dois tipos de professores: os professores de regime integral e os professores horistas. Os professores horistas são contratados apenas em casos especiais, e o salário deles é estipulado por hora trabalhada. Já os professores integrais possuem um salário fixo para 40 horas de atividades semanais.

A escola possui as seguintes informações sobre os professores:

Classe ProfessorIntegral:\
Atributos: String nome, String matricula, Date dataNascimento, double salario, String nivelEscolaridade1, String disciplina, Date dataInicio.\
Métodos: sets() e gets() de cada atributo.

Classe ProfessorHorista:\
Atributos: String nome, String matricula, Date dataNascimento, int horasTrabalhadas, double salario, String nivelEscolaridade, String disciplina.\
Métodos: sets() e gets() de cada atributo.

O cálculo do salário dos professores horistas dependerá da quantidade de horas trabalhadas. Observe que o valor da hora é fixo (R$ 25,00), e para tal você deverá utilizar uma constante.

Observe que os professores possuem informações em comum. Crie as classes Professor, ProfessorIntegral e ProfessorHorista, aplicando na sequência os conceitos de Herança. Além disso, como parte da função dos professores, todos lecionam. Dessa forma, usando o conceito de polimorfismo, crie um método lecionar() que possa aplicar tal conceito visto na disciplina (aplicar polimorfismo).

Crie uma classe para armazenar (ProfessorDAO) todos os professores e que também contém os relatórios necessários, e que possua os seguintes métodos:

1.  a)  Adicionar professor;

2.  b)  Remover professor;

3.  c)  Informar a quantidade de professores na escola;

4.  d)  Informar o professor com o maior salário;

5.  e)  Informar qual o professor mais jovem da escola;

6.  f)  Informar o professor mais antigo na escola;

7.  g)  Listar o total de salários a ser pago pela escola (professores Integrais e Horistas);

8.  h)  Listar a quantidade média de HorasTrabalhadas pelos Professores Horistas;

9.  i)  Listar os professores que lecionam as disciplinas de português e matemática;

10. j)  Listar os professores com mestrado e doutorado.
