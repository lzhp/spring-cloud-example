/**
 * Date: 2018-04-04 22:19:45.
 * 
 * @author: lizhipeng.
 */
package cn.customs.h2018.sample.remoteapi;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Date: 2018-04-04 22:19:45.
 * 
 * @author: lizhipeng.
 * @description:
 */
@FeignClient(name = "stores", url="http://127.0.0.1:8001")
public interface HelloClient {


      @RequestMapping(method = RequestMethod.GET, value = "/hello")
      String getHello();
      
      @RequestMapping(path = "/api/products/{id}", method = RequestMethod.GET)
      public String getProductFromRestAPI(@PathVariable(value = "id") String id);


  }

