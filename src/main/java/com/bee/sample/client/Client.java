package com.bee.sample.client;

import com.bee.sample.service.UserClientService;
import com.bee.sample.service.impl.UserClientServiceImpl;
import com.bee.sample.util.BeanFactory;
/**
 * 
 * 解耦策略2：使用类动态装载方法解耦工厂类和其他类
 * 下一个问题：有没有更好的解耦策略
 * @author hhluci
 *
 */
public class Client {

	public static void main(String[] args) {
		//UserClientService userClientService = new UserClientServiceImpl();

		UserClientService userClientService = BeanFactory.getUserClientService();
		userClientService.saveCustom();
	}

}
