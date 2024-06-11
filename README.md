# Email Microservice System

# Visão Geral

Este projeto demonstra uma arquitetura baseada em microserviços onde os usuários podem se registrar via uma API REST, e uma notificação automática é enviada para o endereço de email informado como uma mensagem de boas-vindas. O fluxo envolve o registro do usuário, a enfileiramento de mensagens, e o envio de emails através de um microserviço dedicado.

# Resumo do Fluxo

Cadastro do Usuário: O usuário se cadastra fornecendo seu nome e email via uma chamada de API REST.
Notificação: O sistema envia uma notificação para o microserviço responsável pelo envio de emails.
Envio de Email: O microserviço de email processa a notificação e envia um email de boas-vindas para o endereço de email fornecido pelo usuário.

# Fluxo Detalhado

1. Cadastro do Usuário
Endpoint: http://localhost:8081/users

Método: POST

Payload: O usuário fornece seu nome e email.

Exemplo:

json
{
    "name": "Karoline",
    "email": "karolined.profissional@gmail.com"
}

Você pode usar o Postman para enviar esta solicitação.

Passos no Postman:

Abra o Postman e crie uma nova requisição.
Defina o método da requisição para POST.
Insira a URL (ex.: http://localhost:8081/users).
Selecione a aba Body, escolha raw e o formato JSON.
Insira o payload JSON semelhante ao exemplo fornecido acima.
Clique em Send.

2. Notificação do Sistema
Após o cadastro bem-sucedido, o sistema envia uma mensagem para uma fila de mensagens que é monitorada pelo microserviço de email. Esta mensagem contém os detalhes necessários para enviar o email de boas-vindas.

Message Broker: RabbitMQ

Nome da Fila: default.email

3. Envio de Email
O microserviço de email (ms-email) escuta mensagens na fila. Ao receber uma mensagem, ele envia um email de boas-vindas para o usuário.

Serviço de Email: O microserviço de email processa as mensagens recebidas e envia emails via um servidor SMTP.
Conteúdo do Email: Uma mensagem de boas-vindas personalizada é enviada para o endereço de email do usuário.


![image](https://github.com/KarolDiniz/email-microservice-system/assets/90431161/13c3ff3b-584b-4f39-b70d-6f193d32ace6)

# Pré-requisitos

Java (versão 17 ou superior)
Spring Boot (versão 3.3.0 ou superior)
RabbitMQ (para enfileiramento de mensagens)
PostgreSQL (para banco de dados)
Postman (para testes de API)


