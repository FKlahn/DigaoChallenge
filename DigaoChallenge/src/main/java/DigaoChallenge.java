import exception.DigaoException;

import java.util.Arrays;
import java.util.Scanner;

public class DigaoChallenge {

    public static void main(String[] args) {
        Scanner numericScanner = new Scanner(System.in);
        int option;
        boolean isOnMainMenu = true;
        System.out.println("Bem vindo ao DigaoChallenge!");

        while (isOnMainMenu) {
            System.out.println("Selecione uma opção para me desafiar: " +
                    "\n\t1: Calcular 1+1" +
                    "\n\t2: Soma básica entre 2 números" +
                    "\n\t3: Array de múltiplos" +
                    "\n\t0: Sair");
            option = numericScanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("1+1 = " + calcularUmMaisUm());
                    break;
                case 2:
                    break;
                case 0:
                    isOnMainMenu = false;
                    System.out.println("Obrigado por me desafiar!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente");
                    break;
            }
        }
    }

    static int calcularUmMaisUm() {
        return 2;
    }

    /* Esse método é básico só para você se acostumar com a forma que o projeto funciona
     * Toda a lógica de cada desafio deve ser feita em seu método específico,
     * Você pode criar métodos para fazer submenus e pegar os valores necessários com o usuário para cada método
     * */
    static Integer somaBasica(Integer valor1, Integer valor2) {

        if (valor1 == null || valor2 == null) {
            throw new DigaoException();
        }

        return null;
    }

    /*Array de Múltiplos
     * Esta função recebe 2 parametros: numero e tamanho e deve retornar um array dos multiplos da variavel 'número'
     * até que o array chegue no tamanho da variavel 'tamanho'
     * Exemplo:
     *
     * arrayDeMultiplos(7, 5) ➞ [7, 14, 21, 28, 35]
     * arrayDeMultiplos(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
     *
     * Notas:
     * Note que o 'numero' também é retornado
     * Testes em: ArrayDeMultiplosTest*/
    public static int[] arrayDeMultiplos(int numero, int tamanho) {

        return new int[0];
    }

    /*Calculadora de Operações Básicas
     * Esta função recebe 3 parametros: 'numero1', 'numero2' e 'operacao'
     * 'operacao' pode receber os valores: somar - subtrair - multiplicar - dividir
     * 'numero1' e 'numero2' podem receber valores positivos e negativos inteiros ou com casas decimais
     * O retorno da função deve ser o resultado da operação solicitada entre 'numero1' e 'numero2'
     *
     * Exemplos:
     *
     * calculadoraDeOperacoesBasicas("1",  "2",  "somar" ) ➞ 3
     * calculadoraDeOperacoesBasicas("4",  "5",  "subtrair") ➞ -1
     * calculadoraDeOperacoesBasicas("6",  "3",  "dividir") ➞ 2
     *
     * Notas:
     * Os parametros que recebem os números são recebidos como String e devem resultar em um valor int, eles podem
     * ser valores negativos ex:"-10". Procure por conversão de String para tipos numéricos
     *
     * Certas operações matemáticas podem lançar uma ArithmeticException, ex:"Divisão por zero", em casos que isso
     * possa ocorrer, retorne Integer.MIN_VALUE
     * Os resultados da divisão serão arredondados para um valor inteiro sempre pra baixo ex:
     *  8,99 se tornaria 8*/
    public static int calculadoraDeOperacoesBasicas(String numero1, String numero2, String operacao) {

        return 0;
    }

    /*Pedra Papel Tesoura
     * Essa função recebe 2 parametros que são as opções dos dois jogadores
     * a função terá os seguintes retornos baseado no resultado da partida:
     *           Jogador 1 Venceu! - Jogador 2 Venceu! - Empate!
     *
     * as opções do jogadores podem ser pedra - papel - tesoura porém o jogo deve entender independente se tem caps lock ou não
     * Se a opçao for inválida devera jogar uma DigãoException dizendo quais opções foram inválidas
     *
     * Exemplos:
     * pedraPapelTesoura("pedra", "papel") ➞ "Jogador 2 Venceu!"
     * pedraPapelTesoura("PaPeL", "PEDRA") ➞ "Jogador 1 Venceu!"
     * pedraPapelTesoura("pApEl", "Tesoura") ➞ "Jogador 2 Venceu!"
     * pedraPapelTesoura("teSoura", "tesourA") ➞ "Empate!"
     * pedraPapelTesoura("tesourinha", "tesourA") ➞ DigaoException("Opção: tesourinha do Jogador 1 é inválida!")
     * pedraPapelTesoura("PAPEL", "robson") ➞ DigaoException("Opção: robson do Jogador 2 é inválida!")
     * pedraPapelTesoura("teste", "aaaa") ➞ DigaoException("Ambas opções são inválidas, melhorem!")
     *
     * Notas:
     * Pedra ganha de tesoura, papel ganha de pedra, tesoura ganha de papel
     * DigaoException não tem um construtor que recebe uma mensagem de erro, crie um construtor
     * alternativo para poder enviar as mensagens de erro customizadas
     * na exception
     * */
    public static String pedraPapelTesoura(String opcaoJogador1, String opcaoJogador2) {

        return null;
    }

    /*Digitos em comum
     * Essa função recebe um array de numeros inteiros válidos
     * Ela deve comparar por pares sempre o valor anterior em relação ao seguinte
     * Ao comparar deve retornar verdadeiro se cada par contém ao menos um digito em comum
     *
     * Exemplos:
     *  digitosEmComum([12, 13, 17, 19, 79]) ➞ true
     * 12 e 13 tem o digito 1 em comum
     * 13 e 17 tem o digito 1 em comum
     * 17 e 19 tem o digito 1 em comum
     * 19 e 79 tem o digito 9 em comum
     *
     * digitosEmComum([33, 53, 6351, 12, 2242, 44]) ➞ true
     * 33 e 53 tem o digito 3 em comum
     * 53 e 6351 tem o digito 3 em comum
     * 6351 e 12 tem o digito 1 em comum
     * 12 e 2242 tem o digito 2 em comum
     * 2242 e 44 tem o digito 4 em comum
     *
     * digitosEmComum([33, 44, 55, 66, 77]) ➞ false
     *
     * digitosEmComum([1, 11, 12, 13, 14, 15, 16]) ➞ true
     *
     * digitosEmComum([1, 12, 123, 1234, 1235, 6789]) ➞ false
     * 1 e 12 tem o digito 1 em comum
     * 12 e 123 tem digitos em comum
     * 123 e 1234 tem digitos em comum
     * 1234 e 12345 tem digitos em comum
     * 12345 e 6789 não tem digitos em comum*/
    public static boolean digitosEmComum(int[] numeros) {

        return false;
    }

    /*
    Sete Boom
    Esse método já está feito! Mas não tem nenhum teste e não tem integração com o menu principal para o usuário o chamar,
    você poderia criar?

    Descrição do método:
        Esse método recebe um array de numeros e retorna "Boom!" se qualquer valor do array contém o dígito 7, e se caso
        não contém retorna a mensagem: "Não tem nenhum número 7 no array"

     */
    public static String seteBoom(int[] arr) {
        /*Para você entender como esse método está funcionando em código, você pode pesquisar
        o que o método Arrays.toString faz, o que o método String.contains() faz e como funciona operador ternário
        Esse método tinha como ser feito de maneira mais "manual" mas achei interessante mostrar alguns métodos
        que o java contém dentro de frameworks e pacotes que facilitam muitas coisas, sempre que puder é interessante
        pesquisar o que você está tentando fazer para ver se já não existe algo do próprio Java que te facilitaria
        de alguma forma

        para conhecer mais:
            https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html
            https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
            https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
            Depois quero te mostrar algo sobre como o java consegue se manter funcional retroativamente com suas
            atualizações
         */
        return Arrays.toString(arr).contains("7") ? "Boom!"
                : "Não tem nenhum número 7 no array";
    }
}
