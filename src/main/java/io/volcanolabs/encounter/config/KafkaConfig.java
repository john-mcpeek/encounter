package io.volcanolabs.encounter.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

	public static final String ENCOUNTER_CREATED_0 = "encounter.created.0";

	@Value( "${encounter.topic.replicas:1}" )
	int replicas;

	@Bean
	public NewTopic topic() {
		return TopicBuilder.name( ENCOUNTER_CREATED_0 )
				.partitions( 10 )
				.replicas( replicas )
				.build();
	}
}
