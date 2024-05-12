
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;

import java.util.Collections;
import java.util.Properties;

public class KafkaTopicCreator {

    public static void main(String[] args) throws Exception {
        Properties props = new Properties();

        //Адрес и порт брокера, к которому нужно подключиться, чтоб создать тему
        props.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");

        //Для взаимодействия с Kafka Admin API
        try (AdminClient adminClient = AdminClient.create(props)) {

            //Сам топик
            NewTopic newTopic = new NewTopic("my_topic", 1, (short) 1);

            //Для передачи списка тем
            adminClient.createTopics(Collections.singleton(newTopic));
        }
    }

}
