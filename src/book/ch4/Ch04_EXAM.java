package book.ch4;
class Print {
	private int numOfpapers;
	private boolean duplex;
	
	public Print(int x, boolean y) {
		numOfpapers=x;
		duplex = y;
	}
	
	void print(int amount) {
		
		String du="양면";
		if(duplex == true){
			du="양면으로 ";
			if(amount%2==0) {
				amount = amount / 2;
			}else {
				amount = amount / 2 + 1;
			}
		}else if(duplex == false) {
			du="단면으로 ";
		}
		
		if(numOfpapers==0) {
			System.out.println("용지가 없습니다.");			
		}else if(numOfpapers-amount>=0) {
			System.out.print(du + amount + "장 출력했습니다. ");
			numOfpapers-=amount;
			System.out.println("현재 " + numOfpapers + "장 남아 있습니다.");
		}else if(numOfpapers-amount<0) {
			System.out.println(du + "모두 출력하려면 용지가 " + (amount-numOfpapers) +"매 부족합니다. " + numOfpapers +"장만 출력합니다.");
			numOfpapers=0;
		}
		
	}
	
	public boolean getDuplex() {
		return duplex;
	}
	
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
}
public class Ch04_EXAM {

	public static void main(String[] args) {
		Print x = new Print(30, true);
		x.print(17);
		x.setDuplex(false);
		x.print(8);
		x.setDuplex(true);
		x.print(20);
		x.print(7);


	}

}
