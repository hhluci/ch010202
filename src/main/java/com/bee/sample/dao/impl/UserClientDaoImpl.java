package com.bee.sample.dao.impl;

import com.bee.sample.dao.UserClientDao;

public class UserClientDaoImpl implements UserClientDao {

	@Override
	public void saveCustom() {
		System.out.println("���ڵ���:"+this.getClass().getName());
		
	}

}
