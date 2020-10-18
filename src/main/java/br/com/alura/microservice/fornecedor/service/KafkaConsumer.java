package br.com.alura.microservice.fornecedor.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaConsumer {

	@KafkaListener(topics = "${order.topic}", groupId = "${spring.kafka.consumer.group-id}")
	public void consumer(ConsumerRecord consumerRecord) {
		log.info("key: " + consumerRecord.key());
		log.info("Headers: " + consumerRecord.headers());
		log.info("Partion: " + consumerRecord.partition());
		log.info("Order: " + consumerRecord.value());
	}
}
