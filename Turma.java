import java.util.ArrayList;

public class Turma {
    private String identificacao;
    private ArrayList<Curso> cursos = new ArrayList<>();  
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Turma(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

  
    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibirDados() {
        System.out.println("Turma: " + identificacao);
        System.out.println("Cursos:");
        for (Curso curso : cursos) {
            System.out.println("- " + curso.getNomeCurso());
        }
        System.out.println("Professores:");
        for (Professor professor : professores) {
            professor.exibirDados();
        }
        System.out.println("Alunos:");
        for (Aluno aluno : alunos) {
            aluno.exibirDados();
        }
    }
}
