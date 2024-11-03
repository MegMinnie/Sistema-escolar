package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<Turma> turmas = new ArrayList<>();
        Coordenador coordenador = new Coordenador();
      
        alunos.add(new Aluno("Mirele Oliveira", "111.111.111-11", "111111111", "Rua A, Bairro A", "123456"));
        alunos.add(new Aluno("Gabriel Oliveira", "222.222.222-22", "2222222222", "Rua B, Bairro B", "09876"));
        alunos.add(new Aluno("Carlos Eduardo", "333.333.333-33", "333333333", "Rua C, Bairro C", "13579"));
        alunos.add(new Aluno("Michael Jakson", "444.444.444-44", "444444444", "Rua D, Bairro D", "086429"));
        alunos.add(new Aluno("Jair Bolsonaro", "555.555.555-55", "555555555", "Rua E, Bairro E", "102938"));

       
        professores.add(new Professor("Luís Araújo", "666.666.666-66", "6666666666", "Rua F, Bairro F", "244576"));
        professores.add(new Professor("Beto Carneiro", "777.777.777-77", "777777777", "Rua G, Bairro G", "325078"));

       
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
                    System.out.println("Informe o professor que deseja vincular a função de coodernador:");
                    System.out.println();
                    System.out.println("Digite 1 para o professor: " + professores.get(0).getNome());
                    System.out.println("Digite 2 para o professor: " + professores.get(1).getNome());
                    
                   int escolha = scanner.nextInt();

                    
                    if (escolha == 1) {
                        cursos.get(0).vincularCoordenador(professores.get(0));
                    } else if (escolha == 2) {
                        cursos.get(0).vincularCoordenador(professores.get(1));
                    } else {
                        System.out.println("Escolha inválida.");
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
                    System.out.println("Estáticas das notas dos alunos:");
                    int totalAprovados = 0;
                    int totalReprovados = 0;
                    int totalRecuperação = 0;

                    for (Aluno aluno : alunos) {
                      System.out.printf("Nome: %s, Média: %.2f\n", aluno.getNome(), aluno.calcularMedia());
                    }
                   
                    for( Aluno a : alunos){
                      if(a.calcularMedia() >= 7){
                        totalAprovados++;
                      } else if(a.calcularMedia() >= 2.5){
                        totalRecuperação++;
                      } else{
                        totalReprovados++;
                      }
                    }

                    System.out.println("Total de aprovados: " + totalAprovados );
                    System.out.println("Total de aprovados: " + totalReprovados );
                    System.out.println("Total de aprovados: " + totalRecuperação );
                   
                 
                    break;

                case 4:
                    System.out.println("Lista de recuperação");
                    for(Aluno a : alunos){
                    Double notaRecuperacao = 0.0;
                    if(a.calcularMedia() >= 2.5 && a.calcularMedia() < 7){
                    System.out.println("Insira uma nota de recuperação:"  + a.getNome() + ":");
                    notaRecuperacao = entrada.nextDouble();
                    System.out.println("Nota de recuperação:" + notaRecuperacao);
               }  
               }

              Double notaRecuperacao;
               for(Aluno a : alunos){
              if(notaRecuperacao >= 5){
              System.out.println("Aprovado");
              } else if(notaRecuperacao = null){
                System.out.println("Sem nota");
              }else{
                System.out.println("Reprovado");
              }
              
               }
               
               


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
