package com.bee.sample.service.impl;

import com.bee.sample.dao.UserClientDao;
import com.bee.sample.dao.impl.UserClientDaoImpl;
import com.bee.sample.service.UserClientService;
import com.bee.sample.util.BeanFactory;

public class UserClientServiceImpl implements UserClientService {

	@Override
	public void saveCustom() {
		

		System.out.println("正在调用:"+this.getClass().getName());
		//UserClientDao userClientDao = new UserClientDaoImpl();
		UserClientDao userClientDao = BeanFactory.getUserClientDao();
		userClientDao.saveCustom();
	}

}
