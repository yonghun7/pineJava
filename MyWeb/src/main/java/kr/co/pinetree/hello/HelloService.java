package kr.co.pinetree.hello;

import kr.co.pinetree.hello.HelloDAO;

public class HelloService {
	
	private HelloDAO helloDAO;
	
	public void setHelloDAO(HelloDAO helloDAO) {
		this.helloDAO = helloDAO;
	}
	
	public int calcTwoNumbers(int a, int b) {
		
		//dao = new HelloDAO();
		return helloDAO.addTwoNumber(a, b);
	}

}
