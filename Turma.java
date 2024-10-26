import java.util.ArrayList;

public class Turma {
  static ArrayList<Professor> funcionarios = new ArrayList<>();
  static ArrayList<Aluno> estudantes = new ArrayList<>();
  private String identificacao;
  private Curso curso;

  public Turma(String identificacao, Curso curso) {
    this.identificacao = identificacao; 
    this.curso = curso;
  }

  public Turma(String identificacao2, String string) {
    return;
  }

  public String getIdentificacao(){
    return identificacao;
  }

  public void setIdentificacao(String identificacao){
    this.identificacao = identificacao;
  }


  public Curso getCurso(){
    return curso;
  }

  public void setCurso(Curso curso){
    this.curso = curso;
  }

  public void adicionarProfessor(Professor professor){
    funcionarios.add(professor);
  }
  public void adicionarAluno(Aluno estudante){
    estudante.add(estudante);
  }

  public void adicionarCurso(Curso curso){
    this.curso = curso;
  }

  public static void setAluno(Aluno aluno) {
    estudantes.add(aluno);
  } 

  public static void setProfessor(Professor professor){
    funcionarios.add(professor);
  }

  public void exibirDados() {
    System.out.println("Turma: " + identificacao + " Curso: " + curso.getNomeCurso());
  }
}
