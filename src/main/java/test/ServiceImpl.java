package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceImpl implements IService{
	@Override  
    public String getString(String msg) {  
        return "hello : " + msg;  
    }  
  
    @Override  
    public Map<String, Object> getMap(String map) {  
        Map<String, Object> testMap = new HashMap<String, Object>();  
        testMap.put("m1", 1);  
        testMap.put("m2", "2");  
        List<String> list = new ArrayList<String>();  
        list.add("213");  
        list.add("456");  
        testMap.put("m3", list);  
        testMap.put(map, map);  
        System.out.println("Ô¶³Ìµ÷ÓÃ:" + map);  
        return testMap;  
    }  
  
    /* (non-Javadoc) 
     * @see test.IService#getCar() 
     */  
    @Override  
    public Car getCar() {  
        Car c = new Car();  
        c.setName("zhuc-httpinvoker-car");  
        c.setCapacity(100);  
        return c;  
    }  
}
