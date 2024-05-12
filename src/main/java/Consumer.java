import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class Consumer {
    public static void main(String[] args) {
        Properties props = new Properties();

        //Адрес и порт
        props.put("bootstrap.servers", "localhost:9092");

        //Для связи потребителей в группы
        props.put("group.id", "test-group");

        //Десериализаторы для ключей и значений в стрингу
        props.put("key.deserializer", StringDeserializer.class.getName());
        props.put("value.deserializer", StringDeserializer.class.getName());

        // Для инициализации,  сообщают потребителю, как подключиться к кластеру Kafka
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);

        //Подписк ана топик
        consumer.subscribe(Collections.singletonList("my_topic"));

        //бесконечный цикл, консюмер вызывает poll, чтоб записи получить и вывод через forEach
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
            records.forEach(record -> {
                System.out.printf("Received message: key = %s, value = %s%n", record.key(), record.value());
            });
        }
    }
}
