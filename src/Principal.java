import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE PROCESSO SELETIVO ===");

        int opcao = 0;
        Recrutador recrutador = new Recrutador();
        recrutador.setNome("Rony");

        Candidato candidato = new Candidato();

        candidato.setNome("Felipe");
        candidato.setIdade(20);
        candidato.setCurso("Análise e desenvolvimento de sistemas");
        candidato.setSemestre(2);

        String menu ="""
                1- Ver perfil do candidato
                2- definir nota
                3- Avaliar candidato
                0- Sair
                """;

        Scanner scanner = new Scanner(System.in);

        while(opcao != 0) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if(opcao == 1){
                candidato.exibirPerfil();
            }else if(opcao == 2){
               double nota = scanner.nextDouble();
               recrutador.definirNota(candidato,10);
            }
        }
    }
}
