package com.mslc;

public class HelloWorld {
	 private String name = "";

	   public String getName() 
	   {
	      return name;
	   }

	   public String getMessage() 
	   {
	      if (name == "") 
	      {
	         return "Helloo!";
	      }
	      else 
	      {
	         return "Hello " + name + "!";
	      }
	   }

	   public void setName(String name) 
	   {
	      this.name = name;
	   }

}
