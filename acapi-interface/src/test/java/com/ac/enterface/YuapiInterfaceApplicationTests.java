package com.ac.enterface;

import com.ac.clientsdk.client.AcApiClient;
import com.ac.clientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 测试类
 */
@SpringBootTest
class YuapiInterfaceApplicationTests {

    @Resource
    private AcApiClient acApiClient;

    @Test
    void contextLoads() {
        String result = acApiClient.getNameByGet("ac");
        User user = new User();
        user.setUsername("ac");
        String usernameByPost = acApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
