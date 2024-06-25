package KafkaConfig;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig2 
{
	@Bean
public NewTopic topic()
{
	return TopicBuilder.name("user_data")
			.partitions(3).replicas(2)
			.build();
}
}
