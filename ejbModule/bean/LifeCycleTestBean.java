package bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

@Stateless
public class LifeCycleTestBean implements LifeCycleTestBeanLocal {

	public LifeCycleTestBean() {
		// TODO Auto-generated constructor stub
		System.out.println("创建LifeCycleTestBeanLocal类的实例");
	}
	
	@Override
	public void sayHello() {
		System.out.println("sayHello()");

	}
	
	@PostConstruct
	public void postConstruct(){
		System.out.println("postConstruct");
	}

	@PreDestroy
	public void preDestroy(){
		System.out.println("preDestroy");
	}
	
}
