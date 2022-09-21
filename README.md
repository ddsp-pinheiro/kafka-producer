# kafka-producer
[POC] Send messages to a kafka topic
## Get started

We are using Java 11 and Docker, so for run this application use the command 
```bash
  docker-compose up -d
```

## API Documentation.
![image](https://user-images.githubusercontent.com/77706397/191391325-8c04b214-1ad3-47c4-bfcc-54c6edff5155.png)

#### Post a message.

```http
  POST /message
```

| Parameter   | Type       | Description                        |
| :---------- | :--------- | :---------------------------------- |
| `message` | `String` | **Required**. message. |
                                                                                                                                                           
#### For more documentation

See the [consumer](https://github.com/ddsp-pinheiro/kafka-consumer) too.

## Created by

- [Dan Pinheiro](https://github.com/ddsp-pinheiro)      


