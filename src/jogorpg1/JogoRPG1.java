package jogorpg1;
import java.util.Scanner;
/**
 *
 * @author Sara
 */
public class JogoRPG1 {
    static Scanner entrada = new Scanner(System.in);

    static boolean confirmador(String simNao) {
        boolean confirmador = false;
        if (simNao.equalsIgnoreCase("sim")) {
            confirmador = true;
        }

        return confirmador;
    }    
    public static void main(String[] args) {
       String n1, nome ="", sexo = "", simNao;
        boolean teste = false;

        do {
            System.out.println("");
            System.out.println("**DISTOPIA MATEMÁTICA**");
            System.out.println("A - INSTRUÇÕES");
            System.out.println("B - JOGAR");
            System.out.println("C - CRÉDITOS");
            System.out.println("D - SAIR");

            System.out.println("Entre com uma opção:");
            n1 = entrada.next();

            switch (n1) {

                case "A":
                case "a":
                    System.out.println("***INSTRUÇÕES***");
                    System.out.println("Distopia matemática busca dentro do seu contexto ajudar os jogadores a entender melhor a matéria de matemática para TI");
                    System.out.println("Durante o jogo você tera que tomar algumas decisões que podem modificar o mundo a sua volta e a maneira como ele vai reagir a você");
                    System.out.println("");

                    break;
                case "B":
                case "b":
                    System.out.println("Dentro dos próximos momentos você vai moldar a história do seu personagem dentro "
                            + "da nossa aventura.");
                    System.out.println("");
                    System.out.println("Para começar vamos criar seu personagem.");
                    while (teste != true) {
                        System.out.println("Digite o nome do seu personagem:");
                        nome = entrada.nextLine();
                        System.out.println("Seu nome agora é " + nome + " tem certeza disso? Responda SIM ou NÃO");
                        simNao = entrada.nextLine();
                     teste = confirmador(simNao);
                    }
                    teste = false;
                    while (teste != true){
                    System.out.println("Seu personagem é Homem ou Mulher?");
                    sexo = entrada.nextLine();
                    System.out.println("Você escolheu ser " + sexo + " esta certo disso? Digite SIM ou NÃO");
                    simNao = entrada.nextLine();
                    teste = confirmador(simNao);
                    }
                    if(sexo.equalsIgnoreCase("homem")){
                        System.out.println("");
                        System.out.println("Muito bem: " + nome + " seja muito bem vindo a Distopia Matemática.");
                        System.out.println(".");
                        System.out.println(".");
                        System.out.println(".");
                        System.out.println(nome + " nós estamos em um ambiente diferente de tudo que você conhece; estamos"
                                + "na galáxia 87cp22j, também conhecida como ");
                    }
                    break;
                case "C":
                case "c":
                    System.out.println("Este jogo foi produzido por quatro aluno do primeiro semestre de TADS da "
                            + "faculdade Senac Santo Amaro.");
                    System.out.println("História:");
                    System.out.println("Alexandre Marcopoulos Henrique");
                    System.out.println("Denys Roger A. B. dos Santos");
                    System.out.println("Sara Caroline do Nascimento");
                    System.out.println("");
                    System.out.println("Produção:");
                    System.out.println("Alexandre Marcopoulos Henrique");
                    System.out.println("Denys Roger A. B. dos Santos");
                    System.out.println("Sara Caroline do Nascimento");
                    System.out.println("");
                    System.out.println("Referências:");
                    System.out.println("CyberChase");
                    System.out.println("The Forest");
                    System.out.println("Capitão América, risos");

                    System.out.println("");
                    break;
                case "D":
                case "d":
                    System.out.println("Obrigado por jogar");
                    break;
                default:
                    System.out.println("Código inválido!");
            }
        } while (!(n1.equalsIgnoreCase("D")));
    }
}
    

