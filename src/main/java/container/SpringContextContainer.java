package container;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextContainer {
	
	private static ClassPathXmlApplicationContext context;
	
	private static void initContext() {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	public static Object getBean(String beanId) {
		if(context == null) {
			initContext();
		}
		
		return context.getBean(beanId);
	}
}
