package com.bee.sample.util;

import com.bee.sample.dao.UserClientDao;
import com.bee.sample.dao.impl.UserClientDaoImpl;
import com.bee.sample.service.UserClientService;

public class BeanFactory {

	public static UserClientService getUserClientService() {
		UserClientService userClientService = null;
		try {
			Object object = Class.forName("com.bee.sample.service.impl."
					+ "UserClientServiceImpl").newInstance();
			if(object instanceof UserClientService) {
				userClientService = (UserClientService) object;
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			
			e.printStackTrace();
		}
		return userClientService;
		
	}
	public static UserClientDao getUserClientDao() {
		UserClientDao userClientDao = null;
		try {
			Object object = Class.forName("com.bee.sample.dao.impl."
					+ "UserClientDaoImpl").newInstance();
			if(object instanceof UserClientDao) {
				userClientDao = (UserClientDao) object;
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			
			e.printStackTrace();
		}
		return userClientDao;
		
	}
	
}
