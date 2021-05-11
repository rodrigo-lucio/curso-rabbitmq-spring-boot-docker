## 💻 Curso: RabbitMQ com SpringBoot e Docker
- Código desenvolvido durante o curso "RabbitMQ com SpringBoot e Docker" da Udemy	
## :books: Conteúdos
- RabbitMQ com Docker
- Projeto producer e consumer
- Mensagens de erro para DeadLetter

## :whale: Utilização com Docker
- Para iniciar o contêiner do RabbitMQ, execute o comando: 
```
docker run -d -p 15672:15672 -p 5672:5672 --name rabbitmq rabbitmq:3-management
```

## ▶️ Endpoints para teste:
- Com os projetos consumer e producer iniciados, envie um post para http://localhost:8081/send, com uma estrutura JSON seguindo este padrão:
```
{
   "text" : "Mensagem de teste"
}
```
- As filas com os nomes definidos no projeto serão criadas automaticamente.
- Quando a mensagem chegar ao RabbitMQ, caso o projeto consumer estiver iniciado, a mensagem será consumida automaticamente, caso contrário, o consumo será feito após a inicialização.
- Caso ocorra alguma exception, a mensagem será enviada para a dead letter.