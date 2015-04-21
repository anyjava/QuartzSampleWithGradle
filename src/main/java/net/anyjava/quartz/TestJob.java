package net.anyjava.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class TestJob extends QuartzJobBean {

	private TestService svc;
	
	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		// TODO Auto-generated method stub

		svc.printHello();
		
	}
	
	public void setSvc( TestService t ) {
		this.svc = t;
	}

}
