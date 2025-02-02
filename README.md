# kafka-errorhandlingdeserializer-demo
This sample project depicts how to use ErrorHandlingDeserializer for spring kafka consumers

Make sure Docker service is up and running. On Linux this can be done as follows:
`sudo service docker start`

Run kafka and kafka-ui with docker-compose
```shell
docker-compose up -d .
```

Install kcat tool (check out the repo for more detailed instructions for different OS):
```shell
sudo dnf install kafkacat
```

Kcat commands:
```shell
kcat -b 127.0.0.1:9092 -G randomgroup topic1

kcat -P -b 127.0.0.1 -t sms-topic

kcat -P -b 127.0.0.1 -t sms-topic -H "__TypeId=Sms"
```

Sample events:
```json lines
{"from": "+00000000", "to": "+00000001", "text": "Hello!"}
{"from": "user1@example.com", "to": "user2@example.com", "subject":  "Hello", "body":  "How have you been?"}
```
