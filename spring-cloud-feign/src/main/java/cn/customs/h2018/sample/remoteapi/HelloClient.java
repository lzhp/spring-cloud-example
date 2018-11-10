/**
 * Date: 2018-04-04 22:19:45.
 * 
 * @author: lizhipeng.
 */
package cn.customs.h2018.sample.remoteapi;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Date: 2018-04-04 22:19:45.
 * 
 * @author: lizhipeng.
 * @description:
 */
@FeignClient(name = "stores", url="http://127.0.0.1:8001")
public interface HelloClient {


      @GetMapping(value = "/hello")
      String getHello();
      
      @GetMapping(path = "/api/products/{id}")
      public String getProductFromRestAPI(@PathVariable(value = "id") String id);


  }

