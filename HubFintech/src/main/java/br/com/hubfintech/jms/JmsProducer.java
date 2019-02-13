package br.com.hubfintech.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import br.com.hubfintech.domain.Conta;

@Component
public class JmsProducer {

	@Autowired
	private JmsTemplate jmsTemplate;
	@Autowired
	private JmsTemplate jmsTemplateTopic;

	public void sendToQueue(Conta conta) {
		jmsTemplate.convertAndSend("queue.conta", conta);
	}

	public void sendToTopic(Conta str) {
		jmsTemplateTopic.convertAndSend("topic.conta	", str);
	}

}
