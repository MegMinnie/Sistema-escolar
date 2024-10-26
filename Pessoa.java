abstract class Pessoa implements Printable {

  
  private String nome;
  private String cpf;
  private String endereco;
  private String telefone;
  public Object print;
  public Object exibirDados;

public Pessoa(String nome, String cpf, String endereco, String telefone){
  this.nome = nome;
  this. cpf = cpf;
  this.endereco = endereco;
  this.telefone = telefone;
}
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

 
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  
  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
  public abstract void exibirDados();

  
  public void imprimirDados() {
  System.out.println("Nome: " + getNome() + ", CPF: " + getCpf() + ", Endereço: " + getEndereco() + ", Telefone: " + getTelefone());
  }
}


