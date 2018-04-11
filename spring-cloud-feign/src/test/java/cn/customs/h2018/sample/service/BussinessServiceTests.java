/**  
 * Date: 2018-03-23 15:32:29. 
 * @author: lizhipeng.
 */  
package cn.customs.h2018.sample.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import cn.customs.h2018.sample.remoteapi.HelloClient;
import lombok.extern.slf4j.Slf4j;

/**  
 * Date: 2018-03-23 15:32:29. 
 * @author: lizhipeng.
 * @description: 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BussinessServiceTests {

  @Autowired
  HelloClient t;
  
  @Test
  public void sayHello() {
    log.info(t.getHello());
  }
}
  
