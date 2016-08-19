package test;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
	public static void main(String[] args) {  
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"classpath:remote-client.xml"});  
        IService service = (IService) applicationContext  
                .getBean("remoteService");  
        String msg = service.getString("zhuc-httpinvoker");  
        System.out.println(msg);  
  
        Car c = service.getCar();  
        System.out.println(c.getName());  
        System.out.println(c.getCapacity());  
          
        Map<String, Object> map = service.getMap("test");  
        for (Map.Entry<String, Object> entry : map.entrySet()) {  
            System.out.println(entry.getKey() + "," + entry.getValue());  
        }  
    }  
}
