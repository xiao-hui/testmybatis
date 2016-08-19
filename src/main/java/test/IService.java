package test;

import java.util.Map;

public interface IService {
	public String getString(String msg);  
	  
    /** 
     * @param map 
     * @return 
     */  
    public Map<String, Object> getMap(String map);  
      
    /** 
     * @return 
     */  
    public Car getCar();  
}
