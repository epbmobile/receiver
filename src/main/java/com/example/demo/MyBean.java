package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

	private final Log log = LogFactory.getLog(MyBean.class);

	@RabbitListener(queues = "dev")
	public void process(String msg) {
		this.log.info(msg);
	}

}
