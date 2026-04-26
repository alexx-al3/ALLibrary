# ALLibrary
aula do curso de Java Programa Jovem Programador

🧠 1. Visão geral do sistema

Você vai ter 3 pilares:

📚 Livros
👤 Usuários
🔄 Empréstimos

👉 Regra central:

Um livro só pode estar em um empréstimo ativo por vez

📊 2. MER (Modelo Entidade-Relacionamento)

Visualiza assim:

USUARIO (1) -------- (N) EMPRESTIMO (N) -------- (1) LIVRO
📌 Tradução:
Um usuário pode ter vários empréstimos
Um livro pode aparecer em vários empréstimos (ao longo do tempo)
Mas só 1 empréstimo ativo por vez
🧱 3. Classes do sistema
📚 Classe: Livro

Responsável pelo item da biblioteca

Atributos:
titulo : String
autor : String
ano : int
codigo : String ou int
status : enum (DISPONIVEL, EMPRESTADO)
Métodos:
marcarComoEmprestado()
marcarComoDisponivel()
exibirInfo()
👤 Classe: Usuario (SUPERCLASSE)
Atributos:
nome : String
id (CPF ou código) : String
Métodos:
exibirInfo()
👨‍🎓 Classe: Aluno (HERDA de Usuario)
👨‍🏫 Classe: Professor (HERDA de Usuario)

👉 Aqui entra HERANÇA + POLIMORFISMO

💡 Ideia legal:

Professor pode ter mais livros emprestados que aluno
🔄 Classe: Emprestimo
Atributos:
livro : Livro
usuario : Usuario
dataEmprestimo : (String ou LocalDate futuramente)
dataDevolucao : (opcional)
Métodos:
registrarDevolucao()
🏢 Classe: Biblioteca (CORAÇÃO DO SISTEMA)

Essa é a mais importante.

Atributos:
listaLivros : ArrayList<Livro>
listaUsuarios : ArrayList<Usuario>
listaEmprestimos : ArrayList<Emprestimo>
Métodos:
cadastrarLivro()
cadastrarUsuario()
emprestarLivro()
devolverLivro()
listarLivros()
buscarLivroPorNome()
listarEmprestimosPorUsuario()
🔗 4. Relacionamentos (POO na prática)
Herança:
Usuario → Aluno / Professor
Associação:
Emprestimo tem Usuario e Livro
Encapsulamento:
Tudo privado + getters/setters
Regra de negócio dentro da Biblioteca
⚙️ 5. Regras de negócio (ESSENCIAL)

🔥 Aqui que você se destaca:

❌ Não permitir emprestar livro já emprestado
❌ Não permitir devolver livro que não está emprestado
✅ Atualizar status do livro automaticamente
✅ Validar se usuário existe
✅ Validar se livro existe
🧭 6. Fluxo do menu (switch + while)

Você vai ter tipo:

while (rodando) {
   mostrarMenu()

   switch(opcao) {
      1 -> cadastrar livro
      2 -> cadastrar usuário
      3 -> emprestar
      4 -> devolver
      5 -> listar
      6 -> sair
   }
}
💡 7. Melhorias (nível portfólio 🔥)
🔍 Busca inteligente
Buscar por parte do nome ("harry" acha Harry Potter)
📚 Histórico de empréstimos
Mostrar tudo que o usuário já pegou
🧠 Regra avançada
Limite de empréstimos:
Aluno: 3 livros
Professor: 5 livros
💾 Persistência (nível hard)
Salvar em arquivo .txt ou .csv
Ou futuramente banco de dados
🗂️ 8. Organização de pacotes (profissional)
biblioteca/
  model/
    Livro
    Usuario
    Aluno
    Professor
    Emprestimo

  service/
    Biblioteca

  main/
    Main
🚀 9. Visão de evolução (importante pra você)

Esse projeto pode crescer pra:

Interface gráfica (JavaFX)
API (Spring Boot 👀)
Banco de dados (MySQL)
