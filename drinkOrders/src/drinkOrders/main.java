package drinkOrders;

public class main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		drinks a = new drinks();
		
		for(int i = 1; i < 26; i++) {
			a.addOrder("vodka tonic" + i);
		}
		
		for(int i = 0; i < 1; i++) {
			a.prepOrders();
		}
		
		
	}

}
