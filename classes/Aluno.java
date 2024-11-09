package classes;

import java.util.ArrayList;

public class Aluno extends Pessoa implements Printable {
  private String matricula;
  private ArrayList<Double> notas = new ArrayList<>();
  private Double NotaRecuperacao;

  public Aluno() {}

  public Aluno(String nome, String cpf, String telefone, String endereco, String matricula, Double notaRecuperacao) {
    super(nome, cpf, telefone, endereco);
    this.matricula = matricula;
    this.NotaRecuperacao = notaRecuperacao;
  }

  public String getMatricula() {
    return this.matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public ArrayList<Double> getNotas() {
    return this.notas;
  }

  public void setNotas(double notas) {
    this.notas.add(notas);
  }

  public Double getNotaRecuperacao() {
    return this.NotaRecuperacao;
  }

  public void NotaRecuperacao(Double notaRecuperacao) {
    this.NotaRecuperacao = notaRecuperacao;
  }

  public double calcularMedia() {
    double media = (this.notas.get(0) + this.notas.get(1) + this.notas.get(2)) / 3.0;

    return media;
  }

  public boolean verificarSituacao() {
    boolean aprovado = false;
    double media = this.calcularMedia();

    if (media < 2.5) {
      System.out.println("Reprovado");
    } else if (media < 7) {
      System.out.println("Em recuperação");
    } else {
      System.out.println("Aprovado");
      aprovado = true;
    }

    return aprovado;
  }

  public void exibirDados() {
    System.out.println("Nome: " + this.getNome());
    System.out.println("CPF: " + this.getCpf());
    System.out.println("Endereço: " + this.getEndereco());
    System.out.println("Telefone: " + this.getTelefone());
    System.out.println("Matrícula: " + this.matricula);
  }
}
