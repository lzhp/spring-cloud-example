/**
 * Date: 2018-03-23 14:58:42.
 * 
 * @author: lizhipeng.
 */
package cn.customs.h2018.sample.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * Date: 2018-03-23 14:58:42.
 * 
 * @author: lizhipeng.
 * @description:
 */
@CrossOrigin(origins = "*", allowCredentials = "true", maxAge = 4800)
@RestController
public class BussinessController {

  @GetMapping("/hello")
  public String sayHello() {
    throw new RuntimeException("tt");
    // return "hello !";
  }

  @GetMapping(path = "/api/products/{id}")
  public String getProductFromRestAPI(@PathVariable(value = "id") String id) {
    return "products:" + id;
  }

}

