package com.dubbo.test.service.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import com.dubbo.test.bean.UserAddress;
import com.dubbo.test.service.UserService;

@Service
@Component
public class UserServiceImpl implements UserService {

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		UserAddress address1 = new UserAddress(1,"汕头市","1","郑书记","15715165465","1");
		UserAddress address2 = new UserAddress(1,"娄底市","1","龚董事长","15749866592","0");
		return Arrays.asList(address1,address2);
	}
	
}