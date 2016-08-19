package test;

import java.io.Serializable;

public class Car implements Serializable{
	 private static final long serialVersionUID = -1115598660168001267L;  
	  
	    private String name;  
	  
	    private transient Integer capacity;  
	  
	    /** 
	     * @return the name 
	     */  
	    public String getName() {  
	        return name;  
	    }  
	  
	    /** 
	     * @param name the name to set 
	     */  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	  
	    /** 
	     * @return the capacity 
	     */  
	    public Integer getCapacity() {  
	        return capacity;  
	    }  
	  
	    /** 
	     * @param capacity the capacity to set 
	     */  
	    public void setCapacity(Integer capacity) {  
	        this.capacity = capacity;  
	    }  
}
