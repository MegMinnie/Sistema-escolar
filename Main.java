import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      
        ArrayList<Aluno> estudantes = new ArrayList<>();
        ArrayList<Professor> funcionarios = new ArrayList<>();
        ArrayList<Turma> classes = new ArrayList<>();
        ArrayList<Curso> disciplinas = new ArrayList<>();

     
        Curso curso1 = new Curso("Linguagem de Programação", "4");
        Curso curso2 = new Curso("Estrutura de Dados", "3");

        disciplinas.add(curso1);
        disciplinas.add(curso2);
    

    
        estudantes.add(new Aluno("Mirele Oliveira", "123.456.789.10", "Rua A, Bairro A, 123", "99912345", "202456"));
        estudantes.add(new Aluno("Gabriel Oliveira", "098.765.432.01", "Rua B, Bairro B, 345", "99123456", "202421"));
        estudantes.add(new Aluno("Carlos Eduardo", "190.451.709.20", "Rua C, Bairro C, 321", "99912345", "202456"));
        estudantes.add(new Aluno("Michael Jakson", "564.165.832.14", "Rua D, Bairro D, 543", "99123456", "202421"));
        estudantes.add(new Aluno("Jair Bolsonaro", "432.825.902.25", "Rua E, Bairro E, 453", "99123456", "202421"));

    
        funcionarios.add(new Professor("Luis Araújo", "010.090.687-01", "Rua F, Bairro F", "36216670", "67789"));
        funcionarios.add(new Professor("Beto Carneiro", "910.800.621-12", "AV. A, Bairro G", "981233489", "66881"));

        Turma turma1 = new Turma("turma1");
        Turma turma2 = new Turma("turma2");

        classes.add(turma1);
        classes.add(turma2);

        turma1.adicionarCurso(curso1);
        turma1.adicionarCurso(curso2);

      
        turma1.adicionarCurso(curso1);
        turma2.adicionarCurso(curso2);
       

        
        turma1.adicionarProfessor(funcionarios.get(0));
        for (Aluno aluno : estudantes) {
            turma1.adicionarAluno(aluno);
        }

        
        turma2.adicionarProfessor(funcionarios.get(1));
        for (Aluno aluno : estudantes) {
            turma2.adicionarAluno(aluno);
        }

      
        turma1.exibirDados();
        System.out.println();
        turma2.exibirDados();
    }
}
