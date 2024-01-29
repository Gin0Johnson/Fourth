package Helloo;

public class A {
	  
	
	 public static void main(String[] args) {
	     
		
		 Class guru99ClassObj = Guru99Base.class; 
		 
		 System.out.println("Name of the class is : " +guru99ClassObj.getName()); 
		
	System.out.println("Name of the super class is : " +guru99ClassObj.getSuperclass().getName()); 
		
		 class[] guru99InterfaceList = guru99classObj.getInterfaces(); 
		
		 System.out.print("Implemented interfaces are : "); 
		 for (Class guru99class1 : quru99 InterfaceList) { 
		 system.out.print guru99class1.getName() + " "); 
		 } 
		 system.out.println(); 
		 //Get access modifiers using get Modifiers() method and toString() method of 
		 java.lang.reflect.Modifier class 
		 int guru99AccessModifier= guru99classObj.getModifiers();  
		 // Print the access modifiers 
		 System.Out.println("Access modifiers of the class are : " 
		 +Modifier.tostring(guru99AccessModifier));
	 }
}