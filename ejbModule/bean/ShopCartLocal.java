package bean;

import javax.ejb.Local;

@Local
public interface ShopCartLocal {
	public void add(String shopName);
	
	public void delete(int shopIndex);
	
	public int getCartSize();
}
