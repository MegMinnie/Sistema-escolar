package classes;

public class Log {
  private double[] notaAnterior;
  private double[] notaAtual;
  private String nomeCoordenador;

  public Log(String nomeCoordenador, double[] notaAnterior, double[] notaAtual) {
      this.nomeCoordenador = nomeCoordenador;
      this.notaAnterior = notaAnterior;
      this.notaAtual = notaAtual;
  }

    public double[] getNotaAtual() {
        return notaAtual;
    }

    public void setNotaAtual(double[] notaAtual) {
        this.notaAtual = notaAtual;
    }

    public double[] getNotaAnterior() {
        return notaAnterior;
    }

    public void setNotaAnterior(double[] notaAnterior) {
        this.notaAnterior = notaAnterior;
    }

    public String getNomeCoordenador() {
        return nomeCoordenador;
    }

    public void setNomeCoordenador(String nomeCoordenador) {
        this.nomeCoordenador = nomeCoordenador;
    }

    public  void printLog(){
      System.out.println("Coordenador: " + nomeCoordenador);
      System.out.println("Nota anteriores: ");
      for(double nota : notaAnterior){
        System.out.printf("%.2f " , nota);
      }
      System.out.println("\nNotas atuais: ");
      for (double nota : notaAtual){
        System.out.printf("%.2f" , nota);
      }
      System.out.println();
    }
}