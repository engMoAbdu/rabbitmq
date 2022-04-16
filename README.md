**Rabbit MQ using Docker**

Docker is required to be installed on the machine.

**_Installation_**

Clone the Repo & run the following commands.

docker-compose up

GET a request using Postman on:-

http://localhost:2222/queue

or Swagger UI on:-

http://localhost:2222/swagger-ui/index.html#/rabbitmq-controller/send

**Output**
{
    "success": true,
    "message": "ok. done"
}