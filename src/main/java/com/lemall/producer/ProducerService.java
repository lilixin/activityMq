package com.lemall.producer;

import javax.jms.Destination;

/**
*@Author: lilixin
*@Date: 2016年10月14日
*/
public interface ProducerService {

	public void sendMessage(Destination destination, final String message) ;
}
