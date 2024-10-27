public class Professor extends Pessoa {
  private String siape;

  public Professor(String nome, String cpf, String endereco, String telefone, String siape) {
      super(nome, cpf, endereco, telefone);
      this.siape = siape;
  }

  public String getSiape() {
      return siape;
  }

  public void setSiape(String siape) {
      this.siape = siape;
  }

  @Override
  public void exibirDados() {
      super.imprimirDados();
      System.out.println("SIAPE: " + siape);
  }
}
