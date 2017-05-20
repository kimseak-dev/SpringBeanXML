package com.kimseak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	/**
	 * spring relies heavily on IoC inversion of control
	 * 	~the spring container helps to make this inversion of control
	 * 	create object + wire them together + manage their complete life cycle form creation to destruction 
	 *                + use DI to manage components --> these are the spring bean !!!
	 *  instruction + meta data (XML annotation)  ----> the container creates the full application!!!
	 *  	
	 *  
	 *  	Two containers:
	 *  		1.) Spring BeanFactory container
	 *  		2.) Spring ApplcationContext container INTERFACE ---> basically it include all the feature of BeanFactory so this is standard way
	 *  			For example: resolve textual information from  a property file + load bean + wire bean together
	 *  				org.springframeworkcontext.ApplicationContext
	 *  			
	 */
	
	/**
	 *  Beans --> we have define them in the XML file 
	 *  	we can specify the scope for the bean
	 *  
	 *  	For example:  we want to be unique then set the scope to singleton
	 *  		To force Spring spring to produce new bean instance each time one is needed, we should set beans's scope attribute
	 *  		to be prototype
	 *  		
	 *  		singleton: single instance of the bean per container
	 *  		prototype: there can be any number of instance in the container  
	 *  		
	 *  
	 */

	
	
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		/*
		 * 1
		Student student = (Student) aplicationContext.getBean("student_bean");
		
		student.sayHello();
		
		Student student1 = (Student) aplicationContext.getBean("student_bean");
		student1.setStudentName("name of student");
		System.out.println(student1.getStudentName());
		
		Student student2 = (Student) aplicationContext.getBean("student_bean");
		System.out.println(student2.getStudentName());
		*/
		
		
		/*
		 * 2	 
		Student student = (Student) applicationContext.getBean("student_bean");
		System.out.println(student.getStudentName());
		
		((ConfigurableApplicationContext) applicationContext).close();
		*/
		
		Student student = (Student) applicationContext.getBean("student_bean");
		student.showInfo();
		
		
		

	}
}
