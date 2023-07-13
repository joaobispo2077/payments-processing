# payments-processing-v1

## Objetivo

Projeto para a leitura de arquivo posicional e realizar validações.

## MVP - Tarefas

- [X] Criar um repositório no GitHub
- [X] Fundar o projeto do Quarkus
- [X] Criar endpoint de API REST GET para retornar fatia da string posicional
- [X] Criar endpoint de API REST para receber arquivo posicional
- [X] Ler arquivo posicional 
- [] Validar arquivo posicional 
- [X] Fazer um exemplo de publicar mensagem em fila MQ
- [X] Refator para Receber/Enviar mensagem para fila MQ

## Tecnologias e Metodologias

 - Java Quarkus
 - DDD
 - Fila MQ
 - Kubernetes e Docker

### Setup

Para realizar setup dessa aplicação, siga os passos nesse [link](setup.md).


#### RabbitMQ

Para subir um RabbitMQ com Docker run, use algo como o comando abaixo:

```bash
docker run -d --hostname localhost --name smallrye-rabbitmq -e RABBITMQ_DEFAULT_USER=user -e RABBITMQ_DEFAULT_PASS=password -p 5672:5672 rabbitmq:3
```

## Prioridade

1. Fazer funcionar
2. Testar a aplicação
3. Refatorar e eliminar code smell critical/major
4. Atingir selo requerido
5. Atingir pontuação requerida no motor de liberação