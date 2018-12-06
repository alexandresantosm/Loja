# Loja
Aula prática 4
ETAPA 1
1. Crie um projeto chamado Loja. Crie um pacote chamado recursoshumanos.
ETAPA 2
1. Dentro do pacote recursos humanos você irá criar uma classe chamada Funcionario com os
seguintes atributos:
a. public long cpf;
b. public double salario;
c. public double desconto;
2. Crie nesta classe os métodos get e set para cada atributo.
3. Crie um método construtor com parâmetros e outro sem parâmetros.
ETAPA 3
1. Você irá criar na classe Funcionario um método calcularSalario(). Este método deve atender
os seguintes requisitos:
a. Deverá retornar um double
b. O salário retornado deve ser o valor líquido do salário, ou seja, deverá calcular o valor
do salário menos os descontos.

ETAPA 4
1. Dentro do pacote recursos humanos você irá criar uma classe chamada Vendedor que
estende a classe funcionario. Esta classe deve atender aos seguintes requisitos:
a. Adição de um campo chamado comissão: double (Crie um get e set para este campo)
b. Método construtor com parâmetros
i. Este método deve utilizar o comando super();
1. Este comando é usado para referenciar a classe pai, que neste caso é
Funcionario
2. O construtor de Vendedor de receber os mesmo parâmetro que o
construtor de Funcionario recebe mais o parâmetro referente a
comissão.
3. Os parâmetros em comum com a classe Funcionários devem ser
passados ao comando super na mesma ordem que são passados ao
construtor de Funcionparios.
4. Exemplo: super(parametro 1, parametro 2); ← isso dentro do construtor
de Funcionário. Este comando super evita que você tenha de reescrever
as atribuições dos parâmetros aos campos herdados pela classe
Vendedor.

c. Você deve sobrescrever o método calcularSalario(), adicionando ao cálculo as
comissões ganhas pelo vendedor.
i. Lembre-se:
1. utilize o marcador @Override antes de sobrescrever o método.
2. O método sobrescrito deve conter exatamente a mesma assinatura e lista
de parâmetros que o método herdado.

ETAPA 5
1. Crie uma classe principal com um método main;
2. Crie um objeto do tipo Funcionário passando os valores dos atributos por meio do método set.
3. Chame o método calcularSalario e mostre o resultado utilizando um System.out.println();

4. Crie um objeto do tipo vendedor e passe os valores como parâmetros por meio do próprio objeto.
5. 4. Chame o método calcularSalario e mostre o resultado utilizando um System.out.println();

Polimorfismo

ETAPA 1
Nesta etapa, você deverá abrir seu projeto da aula anterior (prática 4 Herança). Após abrir o projeto,
você deverá seguir os seguintes passos:
1. Cria uma classe chamada Diarista. A classe Diarista deve ser uma extensão da classe
funcionário
2. Incluir os atributos: double, valorHora e qtdHora.
3. Criar o método construtor com parâmetros e sem parâmetros.
4. Criar os métodos get e set.
ETAPA 2
1. Agora vamos utilizar o conceito de polimorfismo criando na classe Diarista e um método
calcularSalario(). O cálculo do salário deverá ser: valorHora x qtdHoras

2. Exemplo:
3.
ETAPA 3
Iremos trabalhar agora com variáveis polimórficas. Crie um método main, você irá criar uma
referência da classe funcionário e, a partir dela, criar objetos do tipo Vendedor e Diarista, chamamos
isso de variável polimórfica ou upcasting. Siga os seguintes passos:
1. Dentro do main, crie uma referência da classe Funcionário.
2. Utilize a referência para criar um objeto Vendedor e outro Diarista.
3. Passe os valores para os objetos e chame o método calcularSalario para cada um deles.
4. Não esqueça de utilizar um System.out.println() para visualizar os resultados.

ETAPA 1
Nesta etapa você deverá abrir seu projeto da aula anterior (prática 5 herança). Após abrir o projeto você deve
seguir os seguintes passos:
1. Cria um pacote chamado produtos.
2. Criar uma classe abstrata chamada Produto com os seguintes atributos: double preço, int quantidade e
long cod_barra.
3. Incluir um método abstrato para calcular o preço de venda do produto com seguintes parâmetros: preço e
lucro.
ETAPA 2
Agora vamos utilizar o conceito de interfaces para criar uma regra de autenticação.
1. Crie no pacote produtos uma interface chamada Autenticação.
2. Inclua um método para autenticação de código de barras.

ETAPA 3
Nesta etapa você irá criar uma classe que será subclasse de Produto e implementará a interface
Autenticação.
4. Crie uma classe chamada computador. Esta classe deve ser uma subclasse de Produto.
5. A classe computador deve implementar a interface Autenticação.
6. Implemente os métodos de autenticação (método da interface) e CalcularPreço (Método da classe
abstrata).

ETAPA 4
Agora que você criou toda estrutura, é necessário executar e visualizar o resultado.
1. Crie um método main dentro da classe Computador
2. Crie um objeto do tipo Computador
3. Chame o método de autenticação e passe os valores necessários
4. Chame o método para calcular preço e passe os valores necessários.
5. Incluir um System.out.println() para mostrar os resultados.
