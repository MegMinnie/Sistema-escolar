public class Curso {
  private String nomeCurso;
  private String qtdSemestre;

public Curso(String nomeCurso, String qtdSemestre){
  this. nomeCurso = nomeCurso;
  this. qtdSemestre  = qtdSemestre;
}


public String getNomeCurso(){
  return nomeCurso;
    }
  
public void setNomeCurso(String nomeCurso){
      this.nomeCurso = nomeCurso;
    }


public String getQtdSemestre(){
  return qtdSemestre;
    }
  
    public void setQtdSemestre(String qtdSemestre){
      this.qtdSemestre = qtdSemestre;
    }
}
