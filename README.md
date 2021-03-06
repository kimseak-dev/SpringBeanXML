# SpringBeanXML
spring bean xml

# Spring framework
- [ ] Spring framework was created in 2003
- [ ] Enforce programers to use the known coding practices
- [ ] Key feature -> inversion of control principle and dependency injection
- [ ] This is the core module in the framework “inversion of control container”
- [ ] We do not instantiate classes: the framework manages this problem

Example

- [x] Public class Address { .. }
- [x] Public class Student {  private Address address ; …}
- [ ] We want to have as few dependencies as possible -> if classes and modules are independent, we can reuse them without any problem!!!
- [ ] DI: glue classes together but keep them as independent as possible


# SOLID principles
- [ ] The las solid principle is the dependency inversion principle 
- [ ] High-level modules should not depend on low-level modules, both should depend on abstraction
- [ ] Abstraction should not depend on detail, detail should depend on abstraction
- [ ] We can make it happen with inversion of control such as dependency injection
- [x] This why spring framework come toe
- [ ] We can handle these problems with various design patterns: template pattern, service locator pattern … 
- [ ] Using spring framework is more convenient!!!
- [ ] 

# Benefits

- [ ] We can develop enterprise applications using  POJOs (instead of enterprise beans) -> so we do not need EJB container such as an application server .. we can use server container as well
- [ ] Spring framework make use of the existing technolgy(ORM …)
- [ ] It has lightweight loC container compared  to EJB container -> it can be helpful when we to deploy out application on the computer with limited memory /CPU resource
- [ ] 
- [ ] Data access : jdbc, transactions, jus
- [ ] Web : servlet, web, web socket
- [ ] Core container: bean, core, context.
- [ ] 



# 1

	  <bean id="student_bean" class="com.kimseak.Student" scope="singleton" init-method="studentInit" destroy-method="studentDestory">
			<property name="studentName" value="Joe Smith"></property>
		</bean>
	  <bean id="student_bean" class="com.kimseak.Student" scope="prototype"></bean>  



# 2
	<bean id="student_bean" class="com.kimseak.Student" scope="prototype">
		<constructor-arg ref="address_bean"></constructor-arg>
	</bean>
	<bean id="address_bean" class="com.kimseak.Address" scope="prototype">
		<property name="address" value="Wall Street 12"></property>
	</bean>
# Explaination

	
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
	 *  		2.) Spring ApplcationContext container INTERFACE ---> basically it include all the feature of BeanFactory so this 				is standard way
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
