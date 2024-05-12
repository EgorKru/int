import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class Producer {

    public static void main(String[] args) {

        // Настройка параметров продюсера
        Properties props = new Properties();

        // Адрес и порт брокера, к которому нужно подключиться
        props.put("bootstrap.servers", "localhost:9092");

        //Cериализаторы для ключей и значений(строковый сериализатор, преобразует ключи и значения в строки)
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        // Для отправки сообщ в тему
        KafkaProducer<String, String> producer = new KafkaProducer<>(props);

        //Создание новой записи, сообщение, которое будет в my_topic отправлено
        ProducerRecord<String, String> record = new ProducerRecord<>("my_topic", "Name", "Egor Krutakov ");

        //Отпарвка
        producer.send(record);

        // Закрытие продюсера
        producer.close();
    }
}


