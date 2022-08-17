package com.sample.s1springdi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/sample/s1springdi/SpringConfig.xml");
        
    	/*Hospital hospital=(Hospital)springContainer.getBean("hospital");
    	System.out.println(hospital);
        */
    	/*Employee emp = (Employee) springContainer.getBean("emp"); 
        System.out.println(emp);*/
    
    		/*CarDealer cardealer=(CarDealer)springContainer.getBean("cardealer");
    		System.out.println(cardealer);
    */
    	ShoppingCart itemsc=(ShoppingCart) springContainer.getBean("shoppingcart");
    	System.out.println(itemsc);
    	
    	
    }
}
