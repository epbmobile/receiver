package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

	private final Log log = LogFactory.getLog(MyBean.class);

	@RabbitListener(queues = "queue1")
	public void processQueue1(String msg) {
		this.log.info(msg);
	}

	@RabbitListener(queues = "queue2")
	public void processQueue2(String msg) {
		this.log.info(msg);
	}
}
