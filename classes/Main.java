package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<Turma> turmas = new ArrayList<>();

        // Adicionando alunos
        alunos.add(new Aluno("Mirele Oliveira", "111.111.111-11", "111111111", "Rua A, Bairro A", "123456"));
        alunos.add(new Aluno("Gabriel Oliveira", "222.222.222-22", "2222222222", "Rua B, Bairro B", "09876"));
        alunos.add(new Aluno("Carlos Eduardo", "333.333.333-33", "333333333", "Rua C, Bairro C", "13579"));
        alunos.add(new Aluno("Michael Jakson", "444.444.444-44", "444444444", "Rua D, Bairro D", "086429"));
        alunos.add(new Aluno("Jair Bolsonaro", "555.555.555-55", "555555555", "Rua E, Bairro E", "102938"));

        // Adicionando professores
        professores.add(new Professor("Luís Araújo", "666.666.666-66", "6666666666", "Rua F, Bairro F", "244576"));
        professores.add(new Professor("Beto Carneiro", "777.777.777-77", "777777777", "Rua G, Bairro G", "325078"));

        // Adicionando cursos
        cursos.add(new Curso("Linguagem de programação", "3"));
        cursos.add(new Curso("Estrutura de dados", "5"));

        // Adicionando turmas
        turmas.add(new Turma("20243", cursos.get(0), "5"));
        turmas.add(new Turma("20247", cursos.get(1), "6"));

        // Atribuindo professores e alunos às turmas
        turmas.get(0).adicionarProfessor(professores.get(0));
        for (Aluno aluno : alunos) {
            turmas.get(0).adicionarAluno(aluno);
        }

        turmas.get(1).adicionarProfessor(professores.get(1));
        for (Aluno aluno : alunos) {
            turmas.get(1).adicionarAluno(aluno);
        }

        int opcao;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("╔════════════════════════════════════╗");
            System.out.println("║     1 - Cadastrar um coordenador   ║");
            System.out.println("║  2 - Atribuir notas aos estudantes ║");
            System.out.println("║     3 - Mostrar a estatística      ║");
            System.out.println("║      4 - Lista de recuperação      ║");
            System.out.println("║          5 - Lista geral           ║");
            System.out.println("║             0 - Sair               ║");
            System.out.println("╚════════════════════════════════════╝");
            System.out.print("Opção: ");
            opcao = entrada.nextInt(); 

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar coordenador...");
                    break;

                case 2:
                  System.out.println("Cadastrar notas");

                  for (int i = 0, totalAlunos = alunos.size(); i < totalAlunos; i++) {
                    Aluno aluno = alunos.get(i);

                    System.out.printf("Aluno(a): %s\n", aluno.getNome());

                    for (int j = 0; j < 3; j++ ) {
                      System.out.printf("Informe a nota %d: ", j + 1);
                      aluno.setNotas(entrada.nextDouble());
                    }

                    System.out.printf("Média do(a) %s: %.2f\n", aluno.getNome(), aluno.calcularMedia());
                  }

                  break;
                case 3:
                    // Implementar lógica para mostrar estatísticas
                    System.out.println("Mostrar estatísticas...");
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;


                case 5:
                    turmas.get(0).exibirDados();
                    System.out.println();
                    turmas.get(1).exibirDados();

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        entrada.close();
    }
}
