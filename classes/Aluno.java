package classes;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa implements Printable {
  private String matricula;
  private ArrayList<Double> notas = new ArrayList<>();
  private Double NotaRecuperacao;
 private List<String> logHistorico = new ArrayList<>(); 
  public Aluno() {}

  public Aluno(String nome, String cpf, String telefone, String endereco, String matricula, Double notaRecuperacao) {
    super(nome, cpf, telefone, endereco);
    this.matricula = matricula;
    this.NotaRecuperacao = notaRecuperacao;
    registrarLog("Aluno criado com a matrícula " + matricula);
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

  public void setNotas(double nota) {
    if (!this.notas.isEmpty() && this.notas.size() <= 3) {
      registrarLog("Nota alterada: " + nota + ". Histórico anterior: " + this.notas);
    }
    this.notas.add(nota);
  }

  public Double getNotaRecuperacao() {
    return this.NotaRecuperacao;
  }

  public void NotaRecuperacao(Double notaRecuperacao) {
    registrarLog("Nota de recuperação alterada para " + notaRecuperacao);
    this.NotaRecuperacao = notaRecuperacao;
  }

  public double calcularMedia() {
    if (this.notas.isEmpty()) return 0;
    double soma = 0;
    for (double nota : this.notas) {
      soma += nota;
    }
    return soma / this.notas.size();
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

  private void registrarLog(String mensagem) {
    String registro = LocalDateTime.now() + " - " + mensagem;
    logHistorico.add(registro);
  }

  public void exibirHistorico() {
    System.out.println("Histórico do aluno " + this.getNome() + ":");
    for (String log : logHistorico) {
      System.out.println(log);
    }
  }
}
