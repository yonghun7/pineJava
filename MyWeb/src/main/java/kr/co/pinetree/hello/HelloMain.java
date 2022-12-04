package kr.co.pinetree.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HelloDAO dao = new HelloDAO(); 
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
		HelloDAO dao = ctx.getBean("helloDAO", HelloDAO.class);		
		
		int result = dao.addTwoNumber(3, 5);		
		System.out.println("result dao = "+result);
		
		HelloService service = ctx.getBean("helloService", HelloService.class);
		result = service.calcTwoNumbers(3, 5);
		System.out.println("result service = "+result); 
		System.out.println("result service = "+result);   
	}
}
