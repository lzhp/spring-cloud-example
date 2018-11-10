package cn.customs.h2018.sample;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.codec.ErrorDecoder;

@Configuration
public class Config {
  
  @Bean
  @ConditionalOnClass(EnableFeignClients.class)
  public ErrorDecoder myErrorDecoder() {
    return new FeignErrorDecoder();
  }

}
