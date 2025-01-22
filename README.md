# Screen Match -
Bem-vindo ao **Screen Match**, um sistema simples desenvolvido em **Java** com **Spring Boot** que consome a API OMDb para buscar e processar informações sobre séries. Este projeto foi criado durante o curso da Alura para explorar conceitos de integração com APIs e manipulação de dados JSON.

---

## 🎯 Objetivo

Criar uma aplicação que:

- Consuma dados da API OMDb.
- Faça a conversão dos dados JSON retornados em objetos Java.
- Exiba informações básicas sobre séries no console.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**: Linguagem principal.
- **Spring Boot**: Framework para simplificar o desenvolvimento de aplicações.
- **Jackson**: Biblioteca para serialização e desserialização de JSON.
- **HTTPClient**: Para realizar requisições HTTP.

---

## 🚀 Funcionalidades

1. **Consumo de API**: Faz requisições à API pública OMDb para buscar informações sobre séries.
2. **Conversão de Dados**: Converte o JSON retornado em objetos Java utilizando a biblioteca Jackson.
3. **Exibição de Dados**: Exibe os dados processados no console, incluindo título, número total de temporadas e avaliação no IMDb.

---

## 🔧 Como Executar o Projeto

### Pré-requisitos

- **Java 17** ou superior instalado.
- **Maven** instalado.
- Um editor de código como o **IntelliJ IDEA** ou **VS Code** (com extensão para Java).

### Passos para execução

1. Clone o repositório:

   ```bash
   git clone https://github.com/MarafigoLucas/screenmachtcomSpringBoot-semweb-curso-Alura.git
   cd screenmachtcomSpringBoot-semweb-curso-Alura
   ```

2. Execute o comando Maven para baixar as dependências:

   ```bash
   mvn clean install
   ```

3. Inicie a aplicação:

   ```bash
   mvn spring-boot:run
   ```

4. O sistema executará e exibirá os dados processados no console.

---

## 📁 Estrutura do Projeto

```
📂 src
 ┣ 📂 main
 ┃ ┣ 📂 java/br/com/alura/screenmacht
 ┃ ┃ ┣ 📂 model
 ┃ ┃ ┃ ┗ 📜 DadosSerie.java
 ┃ ┃ ┣ 📂 service
 ┃ ┃ ┃ ┣ 📜 ConsumoApi.java
 ┃ ┃ ┃ ┣ 📜 ConverteDados.java
 ┃ ┃ ┃ ┗ 📜 IConverteDados.java
 ┃ ┃ ┗ 📜 ScreenmachtApplication.java
 ┃ ┗ 📂 resources
 ┃ ┃ ┗ 📜 application.properties
 ┣ 📂 test
 ┃ ┗ 📂 java/br/com/alura/screenmacht
 ┃ ┃ ┗ 📜 ScreenmachtApplicationTests.java
```

- **model**: Define os objetos de domínio, como `DadosSerie`.
- **service**: Contém a lógica de negócio para consumo e processamento de dados da API.
- **resources**: Configurações da aplicação.

---

## 📌 Pontos de Aprendizado

- Consumo de APIs externas com `HttpClient`.
- Conversão de JSON em objetos Java com Jackson.
- Organização e estruturação de projetos Spring Boot.
- Implementação de interfaces para desacoplamento e flexibilidade do código.

---

## 📝 Melhorias Futuras

- Implementar uma interface gráfica para exibir os dados processados.
- Permitir que o usuário escolha diferentes séries para consulta.
- Adicionar tratamento de erros mais robusto para requisições HTTP.
- Expandir o suporte para filmes e outras categorias da API OMDb.

---

## 🤝 Contribuindo

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do projeto.
2. Crie uma branch para sua feature: `git checkout -b minha-feature`.
3. Commit suas mudanças: `git commit -m 'Adicionei minha feature'`.
4. Faça um push para a branch: `git push origin minha-feature`.
5. Abra um Pull Request.

---

## 📜 Licença

Este projeto é licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## ✉️ Contato

Criado por **Lucas Marafigo** - [LinkedIn](https://www.linkedin.com/in/marafigo/) | [GitHub](https://github.com/MarafigoLucas)

