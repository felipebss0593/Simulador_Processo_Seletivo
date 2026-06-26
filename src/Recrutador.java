public class Recrutador extends Pessoa implements Avaliavel{

    public void definirNota(Candidato candidato, double nota){
        candidato.setNotaTeste(nota);
    }


    @Override
    public void avaliarCandidato(Candidato candidato){
        if(candidato.getNotaTeste() >= 70){
            System.out.println("STATUS: APROVADO");
        }else {
            System.out.println("STATUS: REPROVADO");
        }
    }
}