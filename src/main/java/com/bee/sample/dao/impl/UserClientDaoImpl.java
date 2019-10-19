package com.bee.sample.dao.impl;

import com.bee.sample.dao.UserClientDao;

public class UserClientDaoImpl implements UserClientDao {

	@Override
	public void saveCustom() {
		System.out.println("正在调用:"+this.getClass().getName());
		
	}

}
