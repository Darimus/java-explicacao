# Fundamentos em Java

Este repositório contém uma classe Java simples, `MinhaClasse`, que demonstra conceitos básicos em Java. O método `main` nesta classe imprime "Hello, World!" no console e também declara e inicializa variáveis de diferentes tipos.

## Pré-requisitos

Antes de executar este código, certifique-se de ter o Java Development Kit (JDK) instalado no seu computador. Você pode baixá-lo no [site da Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

## Executando o Código

Para executar este código, siga estes passos:

1. Clone este repositório.
2. Abra o projeto em sua IDE Java preferida (por exemplo, Eclipse, IntelliJ IDEA).
3. Construa e execute a classe `MinhaClasse`.

## Estrutura do Código

A classe `MinhaClasse` está localizada no diretório `src`. Ela contém um único método, `main`, que demonstra conceitos básicos em Java.

## Tipos de Variáveis em Java

Em Java, existem vários tipos de variáveis que podem ser declaradas, cada um com uma finalidade específica. Aqui estão alguns dos tipos mais comuns:

- `int`: Este tipo de variável é usado para armazenar números inteiros. Por exemplo, `int idade = 25;` declara uma variável chamada `idade` e atribui o valor 25 a ela.

- `double`: Este tipo de variável é usado para armazenar números decimais. Por exemplo, `double salario = 1234.56;` declara uma variável chamada `salario` e atribui o valor 1234.56 a ela.

- `String`: Este tipo de variável é usado para armazenar texto. Por exemplo, `String nome = "Luiz";` declara uma variável chamada `nome` e atribui o valor "Luiz" a ela.

## Declarando Variáveis em Java

Para declarar uma variável em Java, você precisa especificar o tipo da variável seguido pelo nome da variável e, opcionalmente, atribuir um valor a ela. Aqui está um exemplo de como declarar variáveis em Java:

```java
// Declarando uma variável do tipo int
int idade = 25;

// Declarando uma variável do tipo double
double salario = 1234.56;

// Declarando uma variável do tipo String
String nome = "Luiz";
```

## Criando e Chamando um Método em Java

Neste exemplo, temos dois métodos:

O método helloWorld recebe duas strings (hello e world), concatena-as e retorna a mensagem formatada.
O método main é o ponto de entrada do programa e chama o método helloWorld passando as strings "Hello" e "World". Em seguida, imprime o resultado retornado pelo método.
Ao executar o programa, a saída será "Resultado do método: Hello World".

```java
// Método que concatena duas strings e retorna o resultado
public static String helloWorld(String hello, String world) {
    return "Resultado do método: " + hello.concat(" ").concat(world);
}

// Método principal que chama o método helloWorld e imprime o resultado
public static void main(String[] args) {
    String hello = "Hello";
    String world = "World";
    String helloWorld = helloWorld(hello, world);

    System.out.println(helloWorld);
}
```

## Indentação em Java

A indentação é uma prática importante em Java e em muitas outras linguagens de programação. A indentação é usada para mostrar a estrutura e a hierarquia do código, facilitando a leitura e compreensão do programa.

Em Java, a indentação é feita usando espaços ou tabulações. A convenção comum é usar 4 espaços para cada nível de indentação. Aqui está um exemplo de como um código Java pode ser indentado corretamente:

```java
public class MinhaClasse {
    public static void main(String[] args) {
        // Código indentado corretamente
        String hello = "Hello";
        String world = "World";
        String helloWorld = helloWorld(hello, world);

        System.out.println(helloWorld);
    }

    public static String helloWorld(String hello, String world) {
        // Código indentado corretamente
        return "Resultado do método: " + hello.concat(" ").concat(world);
    }
}
```

# Tipos Primitivos e Variáveis em Java

Em Java, os tipos primitivos são os tipos de dados mais básicos e diretos fornecidos pela linguagem. Eles representam valores simples, como números inteiros, números decimais, caracteres, e valores verdadeiro/falso.

Aqui estão os principais tipos primitivos em Java:

- **int**: representa números inteiros.
- **double**: representa números decimais de ponto flutuante.
- **char**: representa um único caractere.
- **boolean**: representa um valor verdadeiro ou falso.

Além dos tipos primitivos, em Java também podemos declarar variáveis para armazenar valores. Uma variável é um espaço de armazenamento nomeado que pode conter um valor específico. Para declarar uma variável em Java, precisamos especificar o tipo da variável seguido pelo nome da variável.

Aqui está um exemplo de como declarar variáveis em Java:

```java
public class ExemploVariaveis {
    public static void main(String[] args) {
        int idade; // declarando uma variável do tipo int
        double precoProduto; // declarando uma variável do tipo double
        char letra; // declarando uma variável do tipo char
        boolean ehVerdadeiro; // declarando uma variável do tipo boolean

        idade = 25; // atribuindo um valor à variável idade
        precoProduto = 19.99; // atribuindo um valor à variável precoProduto
        letra = 'A'; // atribuindo um valor à variável letra
        ehVerdadeiro = true; // atribuindo um valor à variável ehVerdadeiro
    }
}
```

# Operadores em Java

Os operadores em Java são símbolos que são usados para realizar operações em variáveis, constantes e expressões. Os operadores em Java podem ser classificados em diferentes categorias, como operadores aritméticos, operadores de atribuição, operadores relacionais, operadores lógicos, operadores bitwise, operadores de incremento/decremento, entre outros.

Aqui estão alguns exemplos de operadores em Java:

## Operadores Aritméticos

- **Adição**: `+`
- **Subtração**: `-`
- **Multiplicação**: `*`
- **Divisão**: `/`
- **Módulo**: `%`

## Operadores de Atribuição

- **Atribuição**: `=`
- **Adição e atribuição**: `+=`
- **Subtração e atribuição**: `-=`
- **Multiplicação e atribuição**: `*=`
- **Divisão e atribuição**: `/=`
- **Módulo e atribuição**: `%=`

## Operadores Relacionais

- **Igualdade**: `==`
- **Desigualdade**: `!=`
- **Maior que**: `>`
- **Menor que**: `<`
- **Maior ou igual a**: `>=`
- **Menor ou igual a**: `<=`

## Operadores Lógicos

- **Conjunção**: `&&`
- **Disjunção**: `||`
- **Negação**: `!`

## Operadores Bitwise

- **AND bit a bit**: `&`
- **OR bit a bit**: `|`
- **XOR bit a bit**: `^`
- **Complemento bit a bit**: `~`
- **Deslocamento à esquerda**: `<<`
- **Deslocamento à direita**: `>>`

## Operadores de Incremento/Decremento

- **Incremento**: `++`
- **Decremento**: `--`

Esses são apenas alguns exemplos de operadores em Java. Existem outros operadores disponíveis, como o operador de negação unária `-`, o operador de comparação `==`, o operador de atribuição condicional `+=`, entre outros.

Para obter mais informações sobre os operadores em Java, consulte a documentação oficial da linguagem.

# Como tornar um número negativo positivo em Java

Se você deseja tornar um número negativo positivo em Java, você pode usar a operação de multiplicação por -1. Aqui está um exemplo de como fazer isso:

```java
public class ExemploNumerosNegativos {
    public static void main(String[] args) {
        int numero = -5; // número negativo

        // Tornar o número positivo
        numero = numero * -1;

        System.out.println("Número positivo: " + numero);
    }
}
```

Neste exemplo, o número inicial é -5. Para tornar o número positivo, multiplicamos-o por -1. O resultado é 5, que é um número positivo.

Lembre-se de que a operação de multiplicação por -1 apenas reverterá o sinal do número. Portanto, se o número já for positivo, a operação não terá efeito.

## Como tornar um número negativo positivo em Java

Se você deseja tornar um número negativo positivo em Java, você pode usar a operação de multiplicação por -1. Aqui está um exemplo de como fazer isso:

```java
public class ExemploNumerosNegativos {
    public static void main(String[] args) {
        int numero = -5; // número negativo

        // Tornar o número positivo
        numero = numero * -1;

        System.out.println("Número positivo: " + numero);
    }
}
```

# Operadores Ternários em Java

Os operadores ternários em Java são uma forma concisa de escrever condicionais simples. Eles permitem avaliar uma condição e retornar um valor com base no resultado dessa condição. O operador ternário tem a seguinte estrutura:

```java
condição ? valor_verdadeiro : valor_falso
```

Se a condição for verdadeira, o `valor_verdadeiro` será retornado. Caso contrário, o `valor_falso` será retornado.

Aqui está um exemplo de uso de operadores ternários em Java:

```java

public class ExemploOperadoresTernarios {
    public static void main(String[] args) {
        int idade = 18;
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println(resultado); // Saída: "Maior de idade"
    }
}
```

Neste exemplo, a variável `idade` é verificada em relação à condição `idade >= 18`. Se a condição for verdadeira, o valor `"Maior de idade"` será atribuído à variável resultado. Caso contrário, o valor `"Menor de idade"` será atribuído.

Os operadores ternários são úteis quando você precisa fazer uma decisão simples com base em uma condição. No entanto, é importante notar que o uso excessivo de operadores ternários pode tornar o código mais difícil de ler e entender. Portanto, é recomendado usar operadores ternários de forma modular e legível.

Essa é uma breve explicação sobre operadores ternários em Java. Para mais detalhes e informações, consulte a documentação oficial da linguagem Java.

# Métodos em Java

## Criação de Métodos

Em Java, um método é um bloco de código que executa uma tarefa específica. Você pode criar métodos para organizar e reutilizar código. A estrutura básica de um método em Java é a seguinte:

```java
modificador_de_acesso tipo_de_retorno nome_do_metodo(tipo1 parametro1, tipo2 parametro2, ...) {
    // Corpo do método
}
```

### Exemplo de Criação de um Método

Aqui está um exemplo de um método que soma dois números inteiros:

```java
public int somar(int a, int b) {
    return a + b;
}
```

Neste exemplo:

- **public**: é o modificador de acesso.
- **int**: é o tipo de retorno.
- **somar**: é o nome do método.
- **int**: a e int b são os parâmetros do método.

## Parâmetros de Métodos

Os parâmetros são usados para passar informações para os métodos. Você define os parâmetros dentro dos parênteses após o nome do método. Quando você chama o método, você deve fornecer valores correspondentes a esses parâmetros.

### Exemplo de Método com Parâmetros

```java
public void imprimirMensagem(String mensagem) {
    System.out.println(mensagem);
}
```

Neste exemplo:

- **String**: mensagem é o parâmetro do método `imprimirMensagem`.
  Para chamar este método, você faria algo assim:

```java
imprimirMensagem("Olá, mundo!");
```

## Visibilidade dos Métodos

A visibilidade (ou modificadores de acesso) controla onde os métodos podem ser acessados. Os principais modificadores de acesso em Java são:

- **public**: O método pode ser acessado de qualquer lugar.
- **protected**: O método pode ser acessado dentro do mesmo pacote e por subclasses.
- **default (sem modificador)**: O método pode ser acessado apenas dentro do mesmo pacote.
- **private**: O método pode ser acessado apenas dentro da própria classe.

### Exemplos de Métodos com Diferentes Níveis de Visibilidade

#### Método Público

#### Método Protegido

#### Método Default

#### Método Privado

```java
public class ExemploMetodos {

    // Método público
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    // Método protegido
    protected int somar(int a, int b) {
        return a + b;
    }

    // Método de pacote (default)
    void multiplicar(int a, int b) {
        System.out.println(a * b);
    }

    // Método privado
    private void metodoPrivado() {
        System.out.println("Este método é privado!");
    }

    public static void main(String[] args) {
        ExemploMetodos exemplo = new ExemploMetodos();

        // Chamando método público
        exemplo.exibirMensagem("Olá, mundo!");

        // Chamando método protegido
        int soma = exemplo.somar(3, 4);
        System.out.println("Soma: " + soma);

        // Chamando método de pacote
        exemplo.multiplicar(3, 4);

        // Chamando método privado dentro da própria classe
        exemplo.metodoPrivado();
    }
}



```
