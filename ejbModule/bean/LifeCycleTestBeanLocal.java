package bean;

import javax.ejb.Local;

@Local
public interface LifeCycleTestBeanLocal {
	public void sayHello();
}
