# ev280422-svg-heranca-polimorfismo-java
etapa 1 - classes do pacote model
# Funcionários da Empresa – Herança e Polimorfismo
## Descrição
Programa que cadastra funcionários de diferentes cargos e calcula
a bonificação de fim de ano de cada um usando polimorfismo.
## Hierarquia de classes
Funcionario (abstract)
├── Programador
├── Estagiario
├── Gerente
└── Diretor
## Como executar
1. Compile o programa
2. Execute a classe ProgramaFuncionario
## Respostas
1. Significa que o Diretor herda de Gerente, e Gerente herda de Funcionario. Assim, o Diretor também é um Funcionario.
2. super(...)" chama o construtor da classe mãe. Já "super.getBonificacao()" chama o mé0todo de bonificação da classe mãe.
3. Ele utiliza o polimorfismo. O Java executa o método "getBonificacao()" correspondente ao objeto recebido. Isso é decidido durante a execução.
4. Não. Basta criar uma nova classe que herde de "Funcionario" e implemente "getBonificacao()". O método "registra()" continuará funcionando sem alterações.
5.Porque uma classe abstrata não pode criar objetos diretamente. Ela serve como modelo para outras classes, definindo atributos e métodos que as classes filhas utilizarão ou implementarão.
## Tecnologias
- Java
## Autor
Evellyn Victoria Batista dos Santos
