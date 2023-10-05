package com.ac.clientsdk;

import com.ac.clientsdk.client.AcApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author code2tan
 * 客户端配置
 */
@Configuration
@ConfigurationProperties("ac-api.client")
@Data
@ComponentScan
public class AcApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public AcApiClient acApiClient() {
        return new AcApiClient(accessKey, secretKey);
    }

}
