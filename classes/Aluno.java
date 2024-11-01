package classes;

import java.util.ArrayList;

public class Aluno extends Pessoa {
   private String matricula;
   private ArrayList<Double> notas = new ArrayList();

   public Aluno() {
   }

   Aluno(String var1, String var2, String var3, String var4, String var5) {
      super(var1, var2, var3, var4);
      this.matricula = var5;
   }

   public String getMatricula() {
      return this.matricula;
   }

   public void setMatricula(String var1) {
      this.matricula = var1;
   }

   public ArrayList<Double> getNotas() {
      return this.notas;
   }

   public void setNotas(double var1) {
      this.notas.add(var1);
   }

   public double calcularMedia() {
      return ((Double)this.notas.get(0) + (Double)this.notas.get(1) + (Double)this.notas.get(2)) / 3.0;
   }

   public boolean verificarAprovado() {
      return this.calcularMedia() >= 7.0;
   }

   public void exibirDados(){
    super.imprimirDados();
    System.out.println("Matrícula: " + matricula);
  }
}
