public class Aluno extends Pessoa {
  private String matricula;
  private String cursoVinculado;

  public Aluno(String nome, String cpf, String endereco, String telefone, String matricula) {
      super(nome, cpf, endereco, telefone);
      this.matricula = matricula;
  }

  public String getMatricula() {
      return matricula;
  }

  public void setMatricula(String matricula) {
      this.matricula = matricula;
  }

  public String getCursoVinculado() {
      return cursoVinculado;
  }

  public void setCursoVinculado(String cursoVinculado) {
      this.cursoVinculado = cursoVinculado;
  }

  @Override
  public void exibirDados() {
      super.imprimirDados();
      System.out.println("Matrícula: " + matricula + ", Curso Vinculado: " + cursoVinculado);
  }
}
