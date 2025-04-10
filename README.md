# 📌 API REST com Spring Boot 3 - Gerenciador de Tarefas

Projeto desenvolvido como prática de estudos em Java utilizando Spring Boot 3. O objetivo é construir uma API REST simples para gerenciamento de tarefas (to-do list), com funcionalidades básicas de CRUD.

## ✅ Funcionalidades

- [x] Criar uma nova tarefa
- [x] Listar todas as tarefas
- [x] Buscar uma tarefa por ID
- [x] Atualizar uma tarefa existente
- [x] Deletar uma tarefa

## 🛠️ Tecnologias e Ferramentas Utilizadas

- **Java 17**
- **Spring Boot 3.4.4**
- **Spring Web**
- **Spring Data JPA**
- **Banco de Dados H2 (em memória)**
- **Postman** para testes dos endpoints
- **Maven** para gerenciamento de dependências
- **IDE IntelliJ / VS Code**
- **Diagramas UML** e documentação em PDF

## 🚀 Como Executar o Projeto

### Pré-requisitos

- Java 17 instalado
- Maven instalado
- IDE como IntelliJ IDEA ou VS Code

### Passo a passo

Clone o projeto e execute com Maven:

```bash
# Clone o repositório
git clone https://github.com/WellFl/api-rest-spring-boot-3.git
cd api-rest-spring-boot-3

# Execute o projeto com o Maven
./mvnw spring-boot:run
```

## 📫 Endpoints da API

| Método | Endpoint            | Descrição                            |
|--------|---------------------|----------------------------------------|
| GET    | `/tasks`            | Retorna todas as tarefas               |
| GET    | `/tasks/{id}`       | Retorna uma tarefa pelo ID             |
| POST   | `/tasks`            | Cria uma nova tarefa                   |
| PUT    | `/tasks/{id}`       | Atualiza uma tarefa existente pelo ID  |
| DELETE | `/tasks/{id}`       | Deleta uma tarefa pelo ID              |

## 🧪 Testando a API com Postman

Você pode testar todos os endpoints da API utilizando o Postman.

### Sugestão:

1. Abra o Postman
2. Faça requisições para `http://localhost:8080/tasks` utilizando os métodos `GET`, `POST`, `PUT`, `DELETE`
3. Envie um JSON no corpo da requisição ao usar `POST` ou `PUT`. Exemplo:

```json
{
  "title": "Estudar Spring Boot",
  "description": "Assistir aulas e praticar código",
  "completed": false
}
```
## 📄 Documentação e Diagramas

Na pasta `/documentacao` você encontrará:

- ✅ **PDF** com a explicação completa do projeto e sua estrutura
- ✅ **Diagrama de Classe (UML)** da entidade `Task`
- ✅ **Diagrama dos Endpoints REST** da API

### 📷 Prévia dos Diagramas

#### 🧩 Diagrama de Classe

<img src="documentacao/diagrama-classe.png" alt="Diagrama de Classe" width="600"/>

#### 🌐 Diagrama de Endpoints

<img src="documentacao/diagrama-endpoints.png" alt="Diagrama de Endpoints" width="600"/>


