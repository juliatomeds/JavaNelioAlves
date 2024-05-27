# Seção 2: Conceitos de Programação

## Algoritmo, automação e programa de computador
- Algoritmo: 
    🔸Sequência finita de instruções para se resolver um problema.
    🔸Aplica-se a diversas áreas de conhecimento
    🔸Exemplo: Problema: lavar roupa suja
        Algoritmo:
        1) Colocar a roupa em um recipiente
        2) Colocar um pouco de sabão e amaciante
        3) Encher de água
        4) Mexer tudo até dissolver todo o sabão
        5) Deixar de molho por vinte minutos
        6) Esfregar a roupa
        7) Enxaguar
        8) Torcer
- Automação
    🔸Consiste em utilizar máquina(s) para executar o procedimento desejado de forma automática ou semiautomática.
- Computador
  🔸Hardware - parte física (a máquina em si)
  🔸Software - parte lógica (programas)
    🔸Sistema operacional (Windows, Linux, iOS)
    🔸Aplicativos (apps de escritório, app de câmera, navegador web)
    🔸Jogos 
    🔸Utilitários (Antivírus, compactador de arquivos)
    🔸Outros
- Programa ~ Algoritmo
  🔸Programas de computador são algoritmos executados pelo computador (em linhas gerais).
  🔸Conclusão: o computador é uma máquina que automatiza a execução de algoritmos.
  🔸Qualquer algoritmo? Não. Apenas algoritmos computacionais:
    🔸Processamento de dados
    🔸Cálculos
- Resumo da aula
  • Algoritmo: sequência finita de instruções para se resolver um problema
  • Automação: quando uma máquina realiza o algoritmo
  • Computador:
  • hardware / software
  • máquina que automatiza algoritmos (de cálculo)
  • Programa de computador: algoritmo executado pelo computador

## O que é preciso para se fazer um programa de computador?
Vamos precisar de:
1. Linguagem de programação: regras léxicas e sintáticas para se escrever o programa
2. IDE: software para editar e testar o programa
3. Compilador: software para transformar o código fonte em código objeto
4. Gerador de código ou máquina virtual: software que permite que o programa seja executado

## Linguagem de programação, léxica, sintática
Linguagem de programação: É um conjunto de regras léxicas (ortografia) e sintáticas (gramática) para se escrever 
programas.

- Resumo da aula
  1. Linguagem: conjunto de regras léxicas e sintáticas para se escrever
  um programa
    🔸Léxica = ortografia. Palavras isoladas.
    🔸Sintática = gramática. Sentença como um todo.
    🔸Exemplos de linguagens: C, Pascal, C++, Java, C#, Python, Ruby, PHP, JavaScript, etc.
  2. Exemplo de códigos feitos em linguagem C, C++, C# e Java

- Léxica: Diz respeito à correção das palavras "isoladas" (ortografia).
  🔸Exemplo (Português): cachorro ✅ caxorro ❌
  🔸Linguagem de programação:main ✅ maim ❌
- Sintática: Diz respeito à correção das sentenças (gramática).
  🔸Exemplo (Português): O cachorro está com fome ✅ A cachorro está com fome ❌
  🔸Linguagem de programação: x = 2 + y ✅ x = + 2 y ❌
- Linguagem de programação
  🔸 Exemplos de linguagens de programação: C, Pascal, C++, Java, C#, Python, Ruby, PHP, JavaScript, etc.
- Exemplo de um programa:
  Suponha um programa que solicita do usuário dois números e depois mostra a média aritmética deles:
```c
#include <stdio.h>
int main() {
float num1, num2, media;
    printf("Digite o primeiro numero: ");
    scanf("%f", &num1);
    printf("Digite o segundo numero: ");
    scanf("%f", &num2);
    media = (num1 + num2) / 2;
    printf("Media = %.2f\n", media);
    return 0;
}
```

```pascal
program MediaNumeros;
var
num1, num2, media: real;
begin
writeln('Digite o primeiro numero: ');
readln(num1);
writeln('Digite o segundo numero: ');
readln(num2);
media := (num1 + num2) / 2;
writeln('Media = ', media:0:2);
end.
```

```cpp
#include <iostream>
int main() {
    float num1, num2, media;
    std::cout << "Digite o primeiro numero: ";
    std::cin >> num1;
    std::cout << "Digite o segundo numero: ";
    std::cin >> num2;
    media = (num1 + num2) / 2;
    std::cout << "Media = " << media << std::endl;
    return 0;
}
```

```java
import java.util.Scanner;
public class MediaNumeros {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        float num1 = scanner.nextFloat();
        System.out.print("Digite o segundo numero: ");
        float num2 = scanner.nextFloat();
        float media = (num1 + num2) / 2;
        System.out.println("Media = " + media);
        scanner.close();
    }
}
```

```scharp
using System;
class Program {
static void Main() {
Console.Write("Digite o primeiro numero: ");
float num1 = float.Parse(Console.ReadLine());
        Console.Write("Digite o segundo numero: ");
        float num2 = float.Parse(Console.ReadLine());
        float media = (num1 + num2) / 2;
        Console.WriteLine("Media = " + media);
    }
}
```

```python
num1 = float(input("Digite o primeiro numero: "))
num2 = float(input("Digite o segundo numero: "))
media = (num1 + num2) / 2
print(f"Media = {media:.2f}")
```

```ruby
print "Digite o primeiro numero: "
num1 = gets.chomp.to_f
print "Digite o segundo numero: "
num2 = gets.chomp.to_f
media = (num1 + num2) / 2
puts "Media = #{media}"
```

```php
print "Digite o primeiro numero: "
num1 = gets.chomp.to_f
print "Digite o segundo numero: "
num2 = gets.chomp.to_f
media = (num1 + num2) / 2
puts "Media = #{media}"
```

```javascript
const readline = require('readline').createInterface({
input: process.stdin,
output: process.stdout
});
readline.question('Digite o primeiro numero: ', (num1) => {
readline.question('Digite o segundo numero: ', (num2) => {
const media = (parseFloat(num1) + parseFloat(num2)) / 2;
console.log(`Media = ${media}`);
readline.close();
});
});
```
## IDE: Ambiente de Desenvolvimento Integrado
- IDE – Ambiente Integrado de Desenvolvimento
- É um conjunto de softwares utilizado para a construção de programas.
- Exemplos:
  🔸C/C++ : Code Blocks
  🔸Java : Eclipse, NetBeans
  🔸C# : Microsoft Visual Studio
- Funcionalidades de uma IDE
  🔸Edição de código fonte (endentação, autocompletar, destaque de palavras, etc.)
  🔸Depuração e testes
  🔸Construção do produto final (build)
  🔸Sugestão de modelos (templates)
  🔸Auxiliar em várias tarefas do seu projeto
  🔸Etc.
- Resumo da aula
  🔸IDE: é um conjunto de softwares utilizado para a construção de programas
    🔸C/C++ : Code Blocks
    🔸Java : Eclipse, NetBeans
    🔸C# : Microsoft Visual Studio
  🔸Uma IDE oferece várias funcionalidades para facilitar a construção dos programas

## Compilação e interpretação, Código fonte e objeto, Máquina virtual
- Código fonte: é aquele escrito pelo programador em linguagem de programação
- Compilação:
  🔸 Processo de transformar o código fonte em código objeto ou código executável.
  🔸 Etapas da Compilação:
    1. Análise Léxica: O compilador divide o código fonte em tokens, que são as menores unidades significativas.
    2. Análise Sintática: Verifica a estrutura gramatical dos tokens de acordo com a sintaxe da linguagem de programação.
    3. Código Objeto: Após a análise, o código é convertido em um formato intermediário, específico da máquina, mas ainda 
    não executável.
    4. Gerador de Código: Construção (build) do código objeto em código executável otimizado para o sistema operacional 
    específico.
    5. Execução: O código executável é finalmente executado pelo hardware do sistema.
  🔸 Exemplos: C, C++
- Interpretação:
  -  Processo de executar o código fonte diretamente, instrução por instrução, por meio de um interpretador.
    🔸 Etapas da Interpretação:
        1. Análise Léxica e Sintática: Realizadas durante a execução, não gerando um código intermediário.
        2. Execução Direta: O interpretador lê, analisa e executa o código fonte em tempo real.
    🔸 Flexibilidade e interatividade são vantagens, mas pode ser mais lento comparado ao código compilado.
    🔸 Exemplos: PHP, Python, JavaScript
- Abordagem híbrida:
  - Combina elementos de compilação e interpretação.
  - Etapas da Abordagem Híbrida:
      1. Compilação para Bytecode: O código fonte é compilado em um código intermediário (bytecode) que não é específico para nenhuma máquina.
      2. Execução por Máquina Virtual: O bytecode é interpretado ou compilado em tempo de execução por uma máquina virtual (VM), que é específica para o sistema operacional.
  - Oferece um bom equilíbrio entre desempenho e portabilidade.
  - Exemplos: Java (usando Java Virtual Machine - JVM), C# (usando Common Language Runtime - CLR)
  - A abordagem híbrida possui as seguintes vantagens:
    - Compilação:
      🔸 velocidade do programa
      🔸 auxílio do compilador antes da execução
    - Interpretação:
      🔸 flexibilidade de manutenção do aplicativo em produção
      🔸 expressividade da linguagem
      🔸 código fonte não precisa ser recompilado para rodar em plataformas diferentes

- C / C++ PHP: Código fonte, Código executável (específico para o sistema operacional), Sistema Operacional, Hardware
- Python, JavaScript: Código fonte, Interpretador (específico para o sistema operacional), Sistema Operacional, Hardware
- Java, C#: Código fonte, Bytecode (código precompilado), Máquina virtual (específica para o sistema operacional), 
Sistema Operacional, Hardware

- Resumo da aula
  🔸 Tipos de código
    🔸Código fonte
    🔸Código objeto / bytecode
  🔸Modelos de execução:
    🔸Compilação
      🔸Gerador de código
    🔸Interpretação
    🔸Abordagem híbrida
      🔸Máquina virtual