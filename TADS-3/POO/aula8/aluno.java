import java.util.Scanner;

public class Aluno{
	String nome;
	int matricula;
	String curso;

	String disciplina1;
	String disciplina2;
	String disciplina3;

	double notaDisciplina1;
	double notaDisciplina2;
	double notaDisciplina3;

	public Aluno(String nome, int matricula, String curso, String disciplina1, String disciplina2, String disciplina3, double notaDisciplina1, double notaDisciplina2, double notaDisciplina3){
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;

		this.disciplina1 = disciplina1;
		this.disciplina2 = disciplina2;
		this.disciplina3 = disciplina3;

		this.notaDisciplina1 = notaDisciplina1;
		this.notaDisciplina2 = notaDisciplina2;
		this.notaDisciplina3 = notaDisciplina3;
	}

	public String aprovReprov(double nota){
		if(nota >= 7){
			return "Aprovado";
		}
		return "Reprovado";
	}

		public static void main(String[] args){
			Scanner in = new Scanner(System.in);

			System.out.print("Digite o nome do aluno: ");
			String nome = in.next();

			System.out.print("Digite a matricula: ");
			int matricula = in.nextInt();

			System.out.print("Digite o Curso: ");
			String curso = in.next();


			System.out.print("Digite a 1 materia: ");
			String materia1 = in.next();

			System.out.print("Digite a 2 materia: ");
			String materia2 = in.next();

			System.out.print("Digite a 3 materia: ");
			String materia3 = in.next();


			System.out.print("Digite a 1 nota: ");
			int nota1 = in.nextInt();

			System.out.print("Digite a 2 nota: ");
			int nota2 = in.nextInt();

			System.out.print("Digite a 3 nota: ");
			int nota3 = in.nextInt();

			Aluno aluno = new Aluno(nome, matricula, curso, materia1, materia2, materia3, nota1, nota2, nota3);

			System.out.println(""); 

			System.out.println(aluno.disciplina1);
			System.out.println(aluno.notaDisciplina1);
			System.out.println(aluno.aprovReprov(aluno.notaDisciplina1));

			System.out.println(""); 

			System.out.println(aluno.disciplina2);
			System.out.println(aluno.notaDisciplina2);
			System.out.println(aluno.aprovReprov(aluno.notaDisciplina2));

			System.out.println(""); 

			System.out.println(aluno.disciplina3);
			System.out.println(aluno.notaDisciplina3);
			System.out.println(aluno.aprovReprov(aluno.notaDisciplina3));



	}
}