
public class Demo {

	public static void main(String[] args) {
		int amount=1234567;
		if (amount<=10000) {
			System.out.println("Interest rate is 4%");
		}
		else if (amount<=20000 && amount>10001) {
			System.out.println("Interest is 5%");
		}
			else if (amount<=50000 && amount>20001) {
				System.out.println("Interest is 6%");
			}
			else {
				System.out.println("no interest");
				
			}
			
		}
	}
	
	