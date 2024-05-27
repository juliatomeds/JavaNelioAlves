# Estudos relacionados a Java!

# 👩‍💻Sobre o projeto
- Códigos relacionados as aulas da [Udemy com Nelio Alves](https://www.udemy.com/course/java-curso-completo/ "Link da Udemy").
- Anotações realizadas por [Júlia Tomé](https://github.com/juliatomeds)

## Principais Ferramentas e Frameworks
- JavaFX para interface gráfica
- Git / Github para versionamento
- Spring Boot - principal framework Java para desenvolvimento comercial em Java
- JPA / Hibernate para acesso a dados com mapeamento objeto-relacional (ORM)
- Maven para gerenciamento de dependências de projeto
- Spring Data JPA - framework para acesso a dados ORM
- Spring Data MongoDB - framework para acesso a dados NoSQL ao banco MongoDB

## Quais são os pré-requisitos
- Eclipse ou InteliJ baixado
- Java 11

## Como alterar as variáveis de ambiente
1. Entrar no site: https://www.azul.com/downloads/?version=java-17-lts&package=jdk
2. Baixar o arquivo zip - Java 17 (LTS)
3. Excluir versões anteriores da pasta " C:\Program Files\Java" -> Criar uma pasta Java se precisar 
4. Extrair o arquivo zip e colar nessa pasta acima 
5. Ir pra "Editar as Variáveis de Ambiente do Sistema" -> Avançado -> Variáveis de ambiente.. -> Variáveis do sistema ->
Novo... ->
6. Nome da variável: JAVA_HOME 
7. Valor da variável: C:\Program Files\Java\zulu17.38.21-ca-jdk17.0.5-win_x64 
8. Clicar em OK 
9. Ir pra "Editar as Variáveis de Ambiente do Sistema" -> Avançado -> Variáveis de ambiente.. -> Variáveis do sistema -> 
Path  -> Editar ... -> C:\Program Files\Java\zulu17.38.21-ca-jdk17.0.5-win_x64\bin (mover ao máximo pra cima)
10. Clicar em OK 
11. Ir no Prompt de controle e escrever: java --version e verificar os resultados

```bash
# clonar repositório
$ git clone https://github.com/....Resto do link....
```