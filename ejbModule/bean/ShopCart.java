package bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

@Stateful
public class ShopCart implements ShopCartLocal {
	
	public ShopCart() {
		// TODO Auto-generated constructor stub
		System.out.println("创建了1个新的ShopCart实例");
	}
	
	private List<String> shopList = new ArrayList<String>();
	
	@Override
	public void add(String shopName) {
		// TODO Auto-generated method stub
		shopList.add(shopName);
		
	}
	
	@Override
	public void delete(int shopIndex) {
		// TODO Auto-generated method stub
		shopList.remove(shopIndex);
	}
	
	@Override
	public int getCartSize() {
		// TODO Auto-generated method stub
		return shopList.size();
	}
	
}
