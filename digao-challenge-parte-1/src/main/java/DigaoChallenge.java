import exception.DigaoException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class DigaoChallenge {

    public static void main(String[] args) throws InterruptedException {
        Scanner numericScanner = new Scanner(System.in);
        int option;
        boolean isOnMainMenu = true;
        System.out.println("Bem vindo ao DigaoChallenge!");

        while (isOnMainMenu) {
            System.out.println("Selecione uma opção para me desafiar: " +
                    "\n\t1: Calcular 1+1" +
                    "\n\t2: Soma básica entre 2 números" +
                    "\n\t3: Array de múltiplos" +
                    "\n\t4: Calculadora de operações básicas" +
                    "\n\t5: Pedra papel ou tesoura" +
                    "\n\t6: Digitos em comum" +
                    "\n\t7: SeteBoom" +
                    "\n\t8: Agradecimentos" +
                    "\n\t0: Sair");
            option = numericScanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("1+1 = " + calcularUmMaisUm());
                    break;
                case 2:
                    subMenuDaSomaBasica();
                    break;
                case 3:
                    subMenuDoArrayDeMultiplos();
                    break;
                case 4:
                    subMenuDaCalculadoraDeSomaBasica();
                    break;
                case 5:
                    subMenuDePedraPapelOuTesoura();
                    break;
                case 6:
                    subMenuDeDigitosEmComum();
                    break;
                case 7:
                    subMenuDoSeteBoom();
                    break;
                case 8:
                    agradecimentosEspeciais();
                    break;
                case 0:
                    isOnMainMenu = false;
                    System.out.println("\n\n\nThanks for challenge me!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente");
                    break;
            }
        }
    }

    private static void agradecimentosEspeciais() {
        System.out.println(" Meus agradecimentos especiais a Deus quem me permitiu adquirir sabedoria necessária" +
                            "\n para conseguir completar a Challenge, e ao meu mestre, irmão e melhor amigo, Felipe Klahn Muniz Hedlund Martins quem me ajudou e incentivou durante toda a jornada!");
    }

    static int calcularUmMaisUm() {
        return 2;
    }


    /* Esse método é básico só para você se acostumar com a forma que o projeto funciona
     * Toda a lógica de cada desafio deve ser feita em seu método específico,
     * Você pode criar métodos para fazer submenus e pegar os valores necessários com o usuário para cada método
     * */
    private static void subMenuDaSomaBasica() {
        Integer valor1;
        Integer valor2;

        Scanner scannerSoma = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        valor1 = scannerSoma.nextInt();

        System.out.println("Digite o segundo valor: ");
        valor2 = scannerSoma.nextInt();

        System.out.println("O resultado da soma é: " + somaBasica(valor1, valor2));

    }

    static Integer somaBasica(Integer valor1, Integer valor2) {

        if (valor1 == null || valor2 == null) {
            throw new DigaoException();
        }

        return valor1 + valor2;
    }
    /*Array de Múltiplos
     * Esta função recebe 2 parametros: numero e tamanho e deve retornar um array dos multiplos da variavel 'número'
     * até que o array chegue no tamanho da variavel 'tamanho'
     *
     * Exemplo:
     * arrayDeMultiplos(7, 5) ➞ [7, 14, 21, 28, 35]
     * arrayDeMultiplos(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
     *
     * Notas:
     * Note que o 'numero' também é retornado
     * Testes em: ArrayDeMultiplosTest*/

    public static int[] arrayDeMultiplos(int numero, int tamanho) {

        int[] array = new int[tamanho];

        for (int i=0;i<tamanho;i++){
            array[i] = numero * (i+1);
        }
        return array;
    }
    public static void subMenuDoArrayDeMultiplos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo à opção 3. Digite um número: ");
        int number = sc.nextInt();
        System.out.println("Número " + number + " escolhido. Digite a quantia de vezes que deseja ver os múltiplos dele:");
        int size = sc.nextInt();

        System.out.println("O array de multiplos é: " + Arrays.toString(arrayDeMultiplos(number, size)));
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
        /*para capturar a Exception vai precisar aprender try catch*/
        BigDecimal bdNumero1 = new BigDecimal(numero1);
        BigDecimal bdNumero2 = new BigDecimal(numero2);
        switch (operacao){
            case "somar":
                return soma(bdNumero1, bdNumero2);
            case "subtrair":
                return subtrair(bdNumero1, bdNumero2);
            case "multiplicar":
                return multiplicar(bdNumero1, bdNumero2);
            case "dividir":
                return dividir(bdNumero1, bdNumero2);
        }
        throw new DigaoException();

    }

    private static void subMenuDaCalculadoraDeSomaBasica() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo à opção 4! Calculadora de operações básicas, digite dois números");
        String numero1 = sc.nextLine();
        String numero2 = sc.nextLine();
        System.out.println("Qual operação você deseja realizar?" +
                "\n\t somar" +
                "\n\t subtrair" +
                "\n\t multiplicar" +
                "\n\t dividir");
        String operacao = "";
        boolean valida = true;
        while (valida){
            operacao = sc.nextLine();
            if (operacao.equalsIgnoreCase("somar")
                    || operacao.equalsIgnoreCase("subtrair")
                    || operacao.equalsIgnoreCase("multiplicar")
                    || operacao.equalsIgnoreCase("dividir")){
                valida = false;
            }else {
                System.out.println("Operação inválida, tente novamente");
            }
        }
        System.out.println("O resultado da sua operação é: " + calculadoraDeOperacoesBasicas(numero1, numero2, operacao.toLowerCase()));
    }

    //Creating subMethods to realize the operations
    private static int soma(BigDecimal numero1, BigDecimal numero2){
        return numero1.add(numero2).intValue();
    }

    private static int subtrair(BigDecimal numero1, BigDecimal numero2){
        return numero1.subtract(numero2).intValue();
    }

    private static int multiplicar(BigDecimal numero1, BigDecimal numero2){
        return numero1.multiply(numero2).intValue();
    }

    private static int dividir(BigDecimal numero1, BigDecimal numero2){
        try {
            return numero1.divide(numero2, RoundingMode.DOWN).intValue();
        } catch (ArithmeticException e){
            return Integer.MIN_VALUE;
        }
    }

    /*Pedra Papel Tesoura
     * Essa função recebe 2 parametros que são as opções dos dois jogadores
     * a função terá os seguintes retornos baseado no resultado da partida:
     *           Jogador 1 Venceu! - Jogador 2 Venceu! - Empate!
     *
     * as opções dos jogadores podem ser pedra, papel, ou tesoura, porém o jogo deve entender independente se tem caps lock ou não
     * Se a opçao for inválida devera jogar uma DigãoException dizendo quais opções foram inválidas
     *
     * Exemplos:
     * pedraPapelTesoura("pedra", "papel") ➞ "Jogador 2 Venceu!"
     * pedraPapelTesoura("PaPeL", "PEDRA") ➞ "Jogador 1 Venceu!"
     * pedraPapelTesoura("pApEl", "Tesoura") ➞ "Jogador 2 Venceu!"
     * pedraPapelTesoura("teSoura", "tesourA") ➞ "Empate!"
     * pedraPapelTesoura("tesourinha", "tesourA") ➞ DigaoException("Opção: tesourinha do Jogador 1 é inválida!")
     * pedraPapelTesoura("PAPEL", "robson") ➞ DigaoException("Opção: robson do Jogador 2 é inválida!")
     * pedraPapelTesoura("josnel", "aaaa") ➞ DigaoException("Ambas opções são inválidas, melhorem!")
     *
     * Notas:
     * Pedra ganha de tesoura, papel ganha de pedra, tesoura ganha de papel
     * DigaoException não tem um construtor que recebe uma mensagem de erro, crie um construtor
     * alternativo para poder enviar as mensagens de erro customizadas
     * na exception
     * */
    public static String pedraPapelTesoura(String opcaoJogador1, String opcaoJogador2) {

        validaOpcoes(opcaoJogador1, opcaoJogador2);

        if (opcaoJogador1.equalsIgnoreCase(opcaoJogador2)){
            return new String("Empate!");
        }else if (opcaoJogador1.equalsIgnoreCase("papel") && opcaoJogador2.equalsIgnoreCase("tesoura")){
            return new String("Jogador 2 Venceu!");
        } else if (opcaoJogador1.equalsIgnoreCase("pedra") && opcaoJogador2.equalsIgnoreCase("papel")) {
            return new String("Jogador 2 Venceu!");
        } else if (opcaoJogador1.equalsIgnoreCase("tesoura") && opcaoJogador2.equalsIgnoreCase("pedra")) {
            return new String("Jogador 2 Venceu!");
        } else {
            return new String("Jogador 1 Venceu!");
        }

    }

    private static void validaOpcoes(String opcaoJogador1, String opcaoJogador2) {

        boolean opcaoJogador1Invalida = false;
        boolean opcaoJogador2Invalida = false;

        if (!opcaoJogador1.equalsIgnoreCase("pedra")
            && !opcaoJogador1.equalsIgnoreCase("papel")
            && !opcaoJogador1.equalsIgnoreCase("tesoura")){
            opcaoJogador1Invalida = true;
        }

        if(!opcaoJogador2.equalsIgnoreCase("pedra")
            && !opcaoJogador2.equalsIgnoreCase("papel")
            && !opcaoJogador2.equalsIgnoreCase("tesoura")){
            opcaoJogador2Invalida = true;
        }

        if (opcaoJogador1Invalida && opcaoJogador2Invalida){
            throw new DigaoException("Ambas opções são inválidas, melhorem!");
        }

        if (opcaoJogador1Invalida){
            throw new DigaoException(String.format("Opção: %s do Jogador 1 é inválida!", opcaoJogador1));
        }

        if (opcaoJogador2Invalida){
            throw new DigaoException(String.format("Opção: %s do Jogador 2 é inválida!", opcaoJogador2));
        }

    }

    private static void subMenuDePedraPapelOuTesoura(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Bem-vindo à opção 5. Pedra papel ou tesoura. Regras: " +
                            "\n Jogador 1 começa e praticamente é só digitar se você quer pedra papel ou tesoura" +
                            "\n Depois disso é a vez do Jogador 2 e se aplicam as mesmas validações. Boa sorte!");
        String opcaoJogador1 = sc.nextLine();
        String opcaoJogador2 = sc.nextLine();

        System.out.println("Resultado: " + pedraPapelTesoura(opcaoJogador1, opcaoJogador2));
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

        for(int i=0;i<numeros.length-1;i++){
            int valorAtual = numeros[i];
            int valorSeguinte = numeros[i+1];
            String valorAtualStr = String.valueOf(valorAtual);
            String valorSeguinteStr = String.valueOf(valorSeguinte);
            char[] valorseguinteCharArr = valorSeguinteStr.toCharArray();
            boolean thereAreAnCharacterEqual = false;
            for (char digito : valorseguinteCharArr) {
                if (valorAtualStr.contains(String.valueOf(digito))){
                    thereAreAnCharacterEqual = true;
                    break;
                }
            }
            if (!thereAreAnCharacterEqual){
                return false;
            }
        }
        return true;
    }

    public static void subMenuDeDigitosEmComum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo à opção 6! Digitos em comum");
        System.out.println("Como funciona? Digite uma sequência de números e os mesmos serão comparados" +
                            "\nSe todos eles tiverem ao menos um digito em comum, isso retornará true, caso não hajam retornará false.");
        int sequencia = sc.nextInt();
        while (sequencia > 15){
            System.out.println("Objeto muito grande, favor diminuir o valor");
            sequencia = sc.nextInt();
        }
        int[] arrayInt = new int[sequencia];

        for (int i=0;i<arrayInt.length;i++) {
            System.out.println("Digite o número da posição: " + (i+1));
            arrayInt[i] = sc.nextInt();
        }
        System.out.println("resultado: " + digitosEmComum(arrayInt));
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
                : "Bomba não acionada!";
    }

    public static void subMenuDoSeteBoom() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo à opção 7, SETE OU BOOM!");
        System.out.println("Digite o tamanho do seu obejeto: ");
        int tamanho = sc.nextInt();
        int[] array = new int[tamanho];
        System.out.println("Se a sequência tiver um 7, BOOM" +
                            "\nSe não tiver, a bomba não é acionada!" +
                            "\nDigite a sequência: ");

        for (int i=0;i<tamanho;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("3...");
        Thread.sleep(2000);
        System.out.println("2...");
        Thread.sleep(2000);
        System.out.println("1...");
        Thread.sleep(2000);
        System.out.println(seteBoom(array));
    }
}
