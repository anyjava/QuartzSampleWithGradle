package net.anyjava.quartz;

public class TestServiceImpl implements TestService {

	@Override
	public void printHello() {
		// TODO Auto-generated method stub
		System.out.println(" log--" + System.currentTimeMillis() );
	}

}
