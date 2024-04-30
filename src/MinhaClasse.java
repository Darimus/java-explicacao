public class MinhaClasse {
  public static void main(String[] args) { 
    // Aqui podemos ver todos os tipos de variáveis

    // Para declarar uma variável precisamos dizer qual o tipo dela e o nome dela
    // Também precisa ser atribuida com aspas duplas
    String nome = "Luiz";

    // int e um tipo de variável que armazena um número inteiro
    int ano = 2021;

    // double e um tipo de variável que armazena um número decimal
    double salario = 1234.56;

    // char e um tipo de variável que armazena um caractere
    char genero = 'M';

    // boolean e um tipo de variável que armazena um valor booleano
    boolean programador = true;

    // Hello, World! igual o console.log do JS
    // Aqui basicamente estamos dizendo:
    // System me da uma saida de escrita no console
    System.out.println(nome + ", " + ano + ", " + salario + ", " + genero + ", " + programador);

    // Declarando metodos
    // TipoRetorno NomeObjetivoInfinitivo Parametro (s)
    // Ex:
    
    // int somar (int a, int b) {
    //   int a = 1;
    //   int b = 2;
    //   return a + b;
    // };

    String hello = "Hello";
    String world = "World";
    String helloWorld = helloWorld(hello, world);

    System.out.println(helloWorld);
  }

  public static String helloWorld(String hello, String world) {
    return "Resultado do método: " + hello.concat(" ").concat(world);
  }
}
