package Ph;


public class Star {
	private String[] menu = {"아아","레몬티","체리콕"};
	private int[] arPrice = {5000,8000,9000};
	private int income;

	String choice= "체리콕";


	public int[] getArPrice() {
		return arPrice;
	}

	public void setArPrice(int[] arPrice) {
		this.arPrice = arPrice;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}
	
	public String[] getMenu() {
		return menu;
	}

	public void setMenu(String[] menu) {
		this.menu = menu;
	}
	
	
	
	public void registCafe(Cafe c) {
		
	c.setMenu(menu);
	System.out.println("카페 등록 완료");
	System.out.println("--------menu-----------");
	
	for (int i = 0; i <c.getMenu().length; i++) {
		System.out.println(i+1+c.getMenu()[i]);
	}
	c.sell(choice);
		
	}
	public static void main(String[] args) {
		Star gan = new Star();
		gan.registCafe(new Cafe() {
			
			@Override
			public void setMenu(String[] menu) {
				gan.menu = menu;
			}
			
			@Override
			public void sell(String choice) {
				for (int i = 0; i < gan.getMenu().length; i++) {
						if(gan.getMenu()[i].equals(choice)) {
							gan.income += gan.arPrice[i];
						}					
				}
				
			}
			
			@Override
			public String[] getMenu() {

				return gan.menu;
			}
		});
		
		System.out.println("체리콕 주문 완료 ");
		System.out.println("현재수익" + gan.getIncome());
	}


	
}
