package com.qishuiqing.gmall.usermanage;

import com.qishuiqing.gmall.usermanage.bean.UserAddress;
import com.qishuiqing.gmall.usermanage.service.UserManageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsermanagerApplicationTests {

	@Autowired
	UserManageService userManageService;

	@Test
	public void contextLoads() {
		List<UserAddress> userAddressList = userManageService.getUserAddressList("1000");
		for (UserAddress userAddress : userAddressList) {
			System.err.println("userAddress = " + userAddress);
		}
	}

}
