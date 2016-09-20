public class Trio{
	interface MenuItem{
		String getName();
		double getPrice();
	}
	static class Sandwich implements MenuItem {
		private String Name;
		private double Price;
		public Sandwich (String SandName, double SandPrice){
			Name = SandName;
			Price = SandPrice;
		}
		public String getName(){
			return this.Name;
		}
		public double getPrice(){
			return this.Price;
		}
	}
	static class Salad implements MenuItem {
		private String Name;
		private double Price;
		public Salad (String SalName, double SalPrice){
			Name = SalName;
			Price = SalPrice;
		}
		public String getName(){
			return this.Name;
		}
		public double getPrice(){
			return this.Price;
		}
	}
	static class Drink implements MenuItem {
		private String Name;
		private double Price;
		public Drink (String DrinkName, double DrinkPrice){
			Name = DrinkName;
			Price = DrinkPrice;
		}
		public String getName(){
			return this.Name;
		}
		public double getPrice(){
			return this.Price;
		}
	}
	private Sandwich sand;
	private Salad sal;
	private Drink dri;
	private double one;
	private double two;
	public Trio (Sandwich a, Salad b, Drink c){
		sand = a;
		sal= b; 
		dri = c;
	}
	public static void main (String [] args){
		System.out.printf("\nHere is today's trio menu: \n \n");
		Trio trio = new Trio (new Sandwich("Cheeseburger",2.75),new Salad("Spinach Salad",1.25), new Drink("Orange Soda",1.25));
		System.out.printf("%s %.2f\n",trio.getName(),trio.getPrice());
		Trio trio1 = new Trio (new Sandwich("Club Sandwich",2.75),new  Salad("Spinach Salad",1.25), new Drink("Orange Soda", 1.25));
		System.out.printf("%s %.2f\n",trio1.getName(),trio1.getPrice());
		Trio trio2 = new Trio (new Sandwich("Cheeseburger",2.75),new Salad("Coleslaw",1.25), new Drink("Orange Soda",1.25));
		System.out.printf("%s %.2f\n",trio2.getName(),trio2.getPrice());
		Trio trio3 = new Trio (new Sandwich("Cheeseburger",2.75),new  Salad("Coleslaw",1.25),new Drink("Cappuccino",3.50));
		System.out.printf("%s %.2f\n",trio3.getName(),trio3.getPrice());
		Trio trio4 = new Trio (new Sandwich("Club Sandwich",2.75),new Salad("Spinach Salad",1.25),new Drink("Cappuccino",3.50));
		System.out.printf("%s %.2f\n",trio4.getName(),trio4.getPrice());
		Trio trio5 = new Trio (new Sandwich("Club Sandwich",2.75),new Salad("Coleslaw",1.25),new Drink("Cappuccino",3.50));
		System.out.printf("%s %.2f\n\n",trio5.getName(),trio5.getPrice());
	}
	public String getName(){
		return sand.getName()+"/"+sal.getName()+"/"+dri.getName()+" Trio";
	}
	public double getPrice(){
		if(sand.getPrice()>=sal.getPrice()){
			one = sand.getPrice();
		}else{
			one = sal.getPrice();
		}
		if( one >= dri.getPrice()){
			two = dri.getPrice();
		}else{
			two=one;
		}
		two = sand.getPrice()+sal.getPrice()+dri.getPrice()-two;
		return this.two;
	}
}
