package classes;

import java.util.ArrayList;
import java.util.List;

public class Turma {

  private String identificacao;
  private Curso curso;
  private String semestre;
  private ArrayList<Professor> professores = new ArrayList<>();
  private ArrayList<Aluno> alunos = new ArrayList<>();
  private List<Log> logs = new ArrayList<>();

  public Turma(){

  }

  public Turma( String indentificacao, Curso curso, String semestre){
    this.identificacao = indentificacao;
    this.curso = curso;
    this.semestre = semestre;
    this.logs = new ArrayList<>();
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

  
  public void adicionarProfessor(Professor professor) {
    professor.setCoodernador(false); 
    professores.add(professor);
}

  public void adicionarAluno( Aluno aluno){
    alunos.add(aluno);
  }

  
  public void setEstatica(){
    System.out.println("Estáticas das notas dos alunos:");
    int totalAprovados = 0;
    int totalReprovados = 0;
    int totalRecuperação = 0;
    for (Aluno aluno : alunos) {
      String nome = aluno.getNome();
      double media = aluno.calcularMedia();

      System.out.printf("Nome: %s, Média: %.2f\n", nome, media);
    }
    
    for (Aluno aluno : alunos) {
      double media = aluno.calcularMedia();

      if (media < 2.5) {
        totalReprovados++;
      } else if (media < 7) {
        totalRecuperação++;
      } else {
        totalAprovados++;
      }
    }
    System.out.println("Total de aprovados: " + totalAprovados);
    System.out.println("Total de reprovados: " + totalReprovados);
    System.out.println("Total de recuperação: " + totalRecuperação);
    }


   
    public void alterarNotaEstudante(Professor coordenador, Aluno aluno, double novaNota) {
      if (coordenador.getCoordenador()) {
        ArrayList<Double>  notaAnterior = aluno.getNotas();
          aluno.setNotas(novaNota);
          Log log = new Log(coordenador.getNome(), notaAnterior, novaNota);
          logs.add(log);
      } else {
          System.out.println("Somente coordenadores podem alterar notas.");
      }
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