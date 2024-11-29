package classes;

public class Professor extends Pessoa {

  private String siape;
 private boolean coordenador = false;

 public Professor(){
 super();
  }
  
  public Professor( String nome, String cpf, String telefone, String endereco, String siape){
  super(nome, cpf, telefone, endereco);
  this.siape = siape;
  }
 
 

  public String getSiape(){
    return siape;
  }

  public void setSiape( String siape){
    this.siape = siape;
  }


  public boolean getCoordenador(){
    return coordenador;
  }

  public void setCoodernador( boolean coordenador){
    this.coordenador = coordenador;
  }

  public void exibirDados(){
    super.imprimirDados();
    System.out.println("SIAPE: " + siape);
  }

}