# Padrão Observer (Java)

*Projeto desenvolvido para o estudo e aplicação do padrão de projeto Observer*

O padrão observer serve para notificar diversas dependências sobre atualizações em determinado objeto, serviço etc.

É muito utilizado em aplicações API's e facilita a manutenção do código, já que não gera dependências fortes entre as entidades.

## Como o padrão funciona?

O padrão observer é análogo a uma assinatura de revista. Os assinantes recebem a cada publicação uma revista em suas casas. Caso queiram cancelar a assinatura eles deixaram de receber as novas edições. Caso uma pessoa realiza a assinatura o novo assinante passará a receber as edições da revista.

Nessa análogia a publicadora da revista é a classe Subject, os assinates as classes Observer (Observadores) e a revista que os assinantes recebem seria a classe que estão observando.

A Classe Subject é responsável por cadastrar e remover os observadores, além de notifica-los sobre as atualizações na classe que estão inscritos.


## Sobre o projeto

Nesse projeto estamos gerenciando um sistema de vendas que, assim que uma venda é realizada, precisa executar as seguints funções:

- Notificar o cliente via WhatsApp que o pedido foi realizado
- Notificar o cliente via Email que o pedido foi realizado
- Atualizar o estoque do(s) produtos vendidos


### Clases observadoras
Nesse projeto temos como classes observadoras as classes:
- Enviar WhatsApp
- Enviar Email
- Atualizar Estoque

As classes observadoras estão observando as vendas realizadas e suas mudanças de estado, sendo informadas pela classe Subject.

### Classe Subject
Nesse projeto temos uma classe Subject que gerencia quais classes estão inscritas na lista para o envio das atualizações do pedido.

Toda vez que uma venda é realizada, a classe Subject irá notificar as classes observadoras que irão executar as suas funções após receberem a informação da venda.