# ExContaBancaria
Exercício aplicado sobre herança


Contas Bancárias

 Considere um banco em que é preciso registrar numa mesma lista todas as 

contas bancárias para efetuar o cálculo dos juros no fim do mês. 

· As contas bancárias podem ser à Ordem ou a Prazo;  

· Para calcular os juros de cada conta seguem-se as seguintes regras:

o As contas à ordem rendem 1%

o As contas a prazo rendem 2% se o saldo for menor que 2000 e 

Pretende-se que crie uma hierarquia de classes e um programa de teste que 

permita percorrer a lista de contas e gerar uma listagem dos juros de todas as 

contas do banco. Não deve ter variáveis duplicadas nas várias classes (por 

exemplo, cada conta só pode ter um saldo).

O resultado esperado da execução do programa é uma listagem semelhante a:

Conta à Ordem 123,      saldo: 100        , juros: 1

Conta à Ordem 124,      saldo: 1000      , juros: 10

Conta a Prazo 125,        saldo: 1000      , juros: 20

Conta à Ordem 126,      saldo: 5000      , juros: 50

Conta a Prazo 127,        saldo: 5000      , juros: 150

a) O departamento de Marketing do banco propôs criar uma nova conta, 

chamada Conta Poupança, que é uma conta a Prazo, mas quando o saldo é 

superior a 1000 e inferior a 2000 tem um juro de 2,5%. Implemente no seu 

sistema de gestão de contas esta nova possibilidade sem alterar as classes 

existentes na hierarquia de contas e teste juntando às contas existentes duas 

novas contas de Poupança.

b) Crie e teste um mecanismo que permita fazer depósitos e levantamentos 

(i.e. alterar o saldo das contas) com as seguintes regras:

- Nas contas à ordem pode ser depositado e levantado qualquer valor, 

desde que o saldo o permita. As contas à ordem, podem ter um limite de 

levantamento deixando a conta com saldo negativo, por exemplo uma conta 

que tenha um Limite Descoberto Negociável de 500 com um saldo de 250, 

pode ser feito um levantamento até 750. Implemente a capacidade de ter um 

LDN como um interface, em que o método que é obrigatório implementar será 

o valor do LDN para essa classe em particular;

- Nas contas a prazo só podem ser depositados valores superiores a 

1000 e pode ser levantado qualquer valor, desde que o saldo o permita (i.e. 

mantendo o saldo maior ou igual a zero).

- Nas contas poupança só podem ser depositados valores múltiplos de 

1000 e pode ser levantado qualquer valor, desde que o saldo o permita (i.e. 

mantendo o saldo maior ou igual a zero).

O código que implementa cada uma das regras acima deve estar dentro da 

classe da conta a que a regra diz respeito.

Caso falhe um depósito ou levantamento as contas devem manter-se no estado 

anterior à tentativa de depósito ou levantamento. Devem ser feitas todas as 

verificações necessárias primeiro e só depois deve ser feita a alteração. Deve 

considerar-se que o método de depósito ou levantamento não é interrompido a 

meio.

·         Não deve ser possível fazer depósitos ou levantamentos de valores 

negativos.·
