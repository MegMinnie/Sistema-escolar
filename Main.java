import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Aluno> estudantes = new ArrayList<>();
    ArrayList<Professor> funcionarios = new ArrayList<>();
    ArrayList<Turma> classes = new ArrayList<>();
    ArrayList<Curso> disciplinas = new ArrayList<>();


    estudantes.add(new Aluno("Mirele Oliveira","123.456.789.10","Rua A, Bairro A, 123","99912345","202456"));
    estudantes.add(new Aluno("Gabriel Oliveira","098.765.432.01","Rua B, Bairro B, 345","99123456","202421"));
    estudantes.add(new Aluno("Carlos Eduardo","190.451.709.20","Rua C, Bairro C, 321","99912345","202456"));
    estudantes.add(new Aluno("Michael Jakson","564.165.832.14","Rua D, Bairro D, 543","99123456","202421"));
    estudantes.add(new Aluno("Gabriel Oliveira","432.825.902.25","Rua E, Bairro E, 453",
    "99123456","202421"));

  
    funcionarios.add(new Professor("Luis Araújo" , "010.090.687-01" ,"Rua F, Bairro F", "36216670", "67789"));
    funcionarios.add(new Professor("Beto Carneiro" , "910.800.621-12" ,"AV. A, Bairro G", "981233489", "66881"));
    
    classes.add(new Turma("turma1" , "curso1"));
    classes.add(new Turma("turma2" , "curso2"));

    disciplinas.add(new Curso("Linguagem de programação" , "4" ));
    disciplinas.add(new Curso("Estrutura de dados" , "3" ));

    //Adicionando  professor, curso e  alunos na turma 1
    classes.get(0).adicionarProfessor(funcionarios.get(0));
    classes.get(0).adicionarCurso(disciplinas.get(0));
    classes.get(0).adicionarAluno(estudantes.get(0));
    classes.get(0).adicionarAluno(estudantes.get(1));
    classes.get(0).adicionarAluno(estudantes.get(2));
    classes.get(0).adicionarAluno(estudantes.get(3));
    classes.get(0).adicionarAluno(estudantes.get(4));

    classes.get(1).adicionarProfessor(funcionarios.get(1));
    classes.get(1).adicionarCurso(disciplinas.get(1));
    classes.get(1).adicionarAluno(estudantes.get(0));
    classes.get(1).adicionarAluno(estudantes.get(1));
    classes.get(1).adicionarAluno(estudantes.get(2));
    classes.get(1).adicionarAluno(estudantes.get(3));
    classes.get(1).adicionarAluno(estudantes.get(4));
   
    classes.get(0).exibirDados();
    System.out.println();
    classes.get(1).exibirDados();

  }
}