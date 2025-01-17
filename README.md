# Desafio Técnico - Testes Automatizados 

Este repositório contém o código de testes automatizados para validar diferentes fluxos de busca na loja virtual do Magazine Luiza. O objetivo principal é garantir que os fluxos de busca de produtos estejam funcionando corretamente, considerando tanto os cenários de sucesso quanto alguns fluxos alternativos.

## Vídeo Demonstrativo
- https://youtu.be/65vv1GWkfZ4


## Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **JUnit**: Framework de testes.
- **Selenium**: Biblioteca para automação de navegação no navegador.
- **Chrome Driver**: Para realização dos testes no site da Magazine Luiza.
- **Maven**: Gerenciamento de dependências.

## Como Executar os Testes

### Pré-requisitos

1. Ter o [Java JDK 11 ou superior](https://adoptopenjdk.net/) instalado.
2. Instalar o [Maven](https://maven.apache.org/install.html).
3. Ter o [WebDriver](https://www.selenium.dev/documentation/webdriver/) adequado para o seu navegador (Chrome, Firefox, etc.). Neste projeto foi usado o Chrome.

### Passos

1. Clone o repositório para a sua máquina local:

   ```bash
   git clone https://github.com/estertrvs/desafio-klok-automacao-web.git
   cd desafio-klok-automacao-web
   ```
2. Instale as dependências do Maven:
   ```bash
   mvn install
   ```
3. Execute os testes com o seguinte comando:
   ```bash
   mvn test
   ```

Autora: Ester Trevisan
