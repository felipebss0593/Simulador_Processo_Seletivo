public class Candidato extends Pessoa{
    private String curso;
    private int semestre;
    private double notaTeste;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setNotaTeste(double notaTeste) {
        this.notaTeste = notaTeste;
    }

    public double getNotaTeste() {
        return notaTeste;
    }

    public void exibirPerfil(){
        System.out.println("Nome do candidato(a): " + getNome());
        System.out.println("Idade do candidato(a): " + getIdade());
        System.out.println("Curso do candidato(a): " + getCurso());
        System.out.println("Semestre em qual o candidato está: " + getSemestre() + " Semestre");
        System.out.println("Nota do teste do candidato: " + getNotaTeste());
    }

}
