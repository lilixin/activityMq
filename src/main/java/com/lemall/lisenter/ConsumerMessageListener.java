package com.lemall.lisenter;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
*@Author: lilixin
*@Date: 2016年10月14日
*/
public class ConsumerMessageListener implements MessageListener{

	@Override
	public void onMessage(Message message) {
		TextMessage msg = (TextMessage)message;
		System.out.println("接收到一个纯文本消息。");  
		try {
			System.out.println("接收到的消息为="+msg.getText());
			message.acknowledge();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
