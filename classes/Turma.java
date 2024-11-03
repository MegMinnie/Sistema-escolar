package classes;

import java.util.ArrayList;

public class Turma {

  private String identificacao;
  private Curso curso;
  private String semestre;
  private ArrayList<Professor> professores = new ArrayList<>();
  private ArrayList<Aluno> alunos = new ArrayList<>();

  public Turma(){

  }

  public Turma( String indentificacao, Curso curso, String semestre){
    this.identificacao = indentificacao;
    this.curso = curso;
    this.semestre = semestre;
  }

  public String getIdentificacao(){
    return identificacao;
  }

  public void setIdentificacao( String identificacao){
    this.identificacao = identificacao;
  }

  public Curso getCurso(){
    return curso;
  }

  public void setCurso( Curso curso){
    this. curso = curso;
  }

public String getSemestre(){
  return semestre;
}

public void setSemestre( String semestre){
  this.semestre = semestre;
}

  public ArrayList<Professor> getProfessores() {
    return professores;
  }

  public void setProfessores(ArrayList<Professor> professores) {
    this.professores = professores;
  }

  public ArrayList<Aluno> getAlunos() {
    return alunos;
  }

  public void setAlunos(ArrayList<Aluno> alunos) {
    this.alunos = alunos;
  }

  public void adicionarProfessor(Professor professor){
    professores.add(professor);
  }

  public void adicionarAluno( Aluno aluno){
    alunos.add(aluno);
  }

  public void exibirDados(){
    System.out.println("Turma: " + identificacao);
    System.out.println("Professores:");
    for (Professor professor : professores){
      professor.exibirDados();
    }
    System.out.println("Alunos");
    for (Aluno aluno : alunos){
      aluno.exibirDados();
    }
  }
}