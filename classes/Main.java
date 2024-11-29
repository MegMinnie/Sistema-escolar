package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayList<Aluno> alunos = new ArrayList<>();
    ArrayList<Professor> professores = new ArrayList<>();
    ArrayList<Curso> cursos = new ArrayList<>();
    ArrayList<Turma> turmas = new ArrayList<>();
    
    

    alunos.add(new Aluno("Mirele Oliveira", "111.111.111-11", "(11) 91111-1111", "Rua A, Bairro A", "1111111", 7.0));
    alunos.add(new Aluno("Gabriel Cavalcante", "222.222.222-22", "(22) 92222-2222", "Rua B, Bairro B", "2222222", 7.0));
    alunos.add(new Aluno("Carlos Eduardo", "333.333.333-33", "(33) 93333-33333", "Rua C, Bairro C", "3333333", 7.0));
    alunos.add(new Aluno("Michael Jackson", "444.444.444-44", "(44) 94444-4444", "Rua D, Bairro D", "4444444", 7.0));
    alunos.add(new Aluno("Jair Bolsonaro", "555.555.555-55", "(55) 95555-5555", "Rua E, Bairro E", "5555555", 7.0));
    

    professores.add(new Professor("Luís Araújo", "666.666.666-66", "(66) 96666-6666", "Rua F, Bairro F", "244576"));
    professores.add(new Professor("Beto Carneiro", "777.777.777-77", "(77) 97777-7777", "Rua G, Bairro G", "325078"));

    cursos.add(new Curso("Linguagem de programação", "3"));
    cursos.add(new Curso("Estrutura de dados", "5"));

    turmas.add(new Turma("20243", cursos.get(0), "5"));
    turmas.add(new Turma("20247", cursos.get(1), "6"));

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
      System.out.println("║                MENU                ║");
      System.out.println("╠════════════════════════════════════╣");
      System.out.println("║     1 - Cadastrar um coordenador   ║");
      System.out.println("║  2 - Atribuir notas aos estudantes ║");
      System.out.println("║     3 - Mostrar a estatística      ║");
      System.out.println("║      4 - Lista de recuperação      ║");
      System.out.println("║          5 - Lista geral           ║");
      System.out.println("║           6 - Histórico            ║");
      System.out.println("║             0 - Sair               ║");
      System.out.println("╚════════════════════════════════════╝");
      System.out.print("Opção: ");
      opcao = entrada.nextInt(); 

      switch (opcao) {
        case 1:
         
        System.out.println("Deseja cadastrar coordenador de curso?:");
          for (Professor professor : professores) {
            String nome = professor.getNome();
            System.out.printf("Nome: %s" , nome );
            System.out.println();
          
          }

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
              System.out.printf("Situação do aluno:" , aluno.getNome(), aluno.verificarSituacao());
              System.out.println();
            }
            
            break;
          case 3:

          turmas.get(0).setEstatica(); 
          System.out.println();
          turmas.get(1).setEstatica(); 
            
            break;
          case 4:
            System.out.println("Lista de recuperação");
            
            for (Aluno aluno : alunos) {
              if (aluno.calcularMedia() >= 2.5 && aluno.calcularMedia() < 7) {
                System.out.print("Insira uma nota de recuperação para " + aluno.getNome() + ": ");
                Double notaRecuperacao = entrada.nextDouble();
                aluno.NotaRecuperacao(notaRecuperacao);  
                System.out.println("Nota de recuperação registrada: " + notaRecuperacao);
              }
            }
    
            System.out.println("\nResultado da situação dos alunos após recuperação:");
        
            for (Aluno aluno : alunos) {
              Double notaRecuperacao = aluno.getNotaRecuperacao();

              if (notaRecuperacao == null) {
                System.out.println(aluno.getNome() + ": Sem nota de recuperação");
            } else if (notaRecuperacao <= 5) {
                System.out.println(aluno.getNome() + ": Reprovado");
            } else {
                System.out.println(aluno.getNome() + ": Aprovado");
            }}
            break;
          case 5:
            turmas.get(0).exibirDados();
            System.out.println();
        
            System.out.println("Cursos:");
            for (Curso curso : cursos) {
              System.out.println("Nome do curso: " + curso.getNomeCurso() + ", Semestres: " + curso.getQtdSemestre());
            }
        
            turmas.get(1).exibirDados();
            System.out.println("Cursos:");
            for (Curso curso : cursos) {
              System.out.println("Nome do curso: " + curso.getNomeCurso() + ", Semestres: " + curso.getQtdSemestre());
            }
            break;
            case 6:
           System.out.println("Histórico de alterações dos alunos:");
           for (Aluno aluno : alunos) {
           aluno.exibirHistorico();
           System.out.println();
           }
           break;

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