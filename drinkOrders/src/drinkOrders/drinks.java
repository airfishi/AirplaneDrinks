package drinkOrders;

import java.util.List;
import java.util.Stack;

public class drinks {
	public List<String> orders = new Stack<>();
	//make the first stack here a list, but causes problem using push/pop later
	
	
	public void addOrder(String order) {
		orders.push(order);
	}
	
	public void prepOrders() {
		for(int i = 0; i < 10; i++) {
			if(orders.isEmpty()) {
				break;
			}
			System.out.println(orders.pop());
		}
		
		
	}
	
	
}
