import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE PROCESSO SELETIVO ===");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Antes de iniciar o Sistema preciso saber suas informações");
        System.out.println("Digite seu Nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do seu Curso: ");
        String curso = scanner.nextLine();

        System.out.println("Digite em qual semestre você está: ");
        int semestre = scanner.nextInt();
        scanner.nextLine();

        int opcao = -1;
        Recrutador recrutador = new Recrutador();
        recrutador.setNome("Rony");

        Candidato candidato = new Candidato();

        candidato.setNome(nome);
        candidato.setIdade(idade);
        candidato.setCurso(curso);
        candidato.setSemestre(semestre);

        String menu ="""
                1- Ver perfil do candidato
                2- definir nota
                3- Avaliar candidato
                0- Sair
                """;

        while(opcao != 0) {
            System.out.println();
            System.out.println(menu);
            opcao = scanner.nextInt();

            if(opcao == 1){
                candidato.exibirPerfil();
            }else if(opcao == 2){
                System.out.println("Digite uma nota: ");
               double nota = scanner.nextDouble();
               recrutador.definirNota(candidato,nota);
            }else if(opcao == 3){
                System.out.println("=== RESULTADO ===");
                recrutador.avaliarCandidato(candidato);
            }else if(opcao == 0 ){
                System.out.println("Sistema encerrado.");
            }else {
                System.out.println("Número digitado inválido.Tente novamente");
            }
        }
    }
}
