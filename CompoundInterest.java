
public class CompoundInterest {

	public static void main(String[] args) {
		double amount=0, p=2000,r=10,t=2,ci;
		System.out.println("principle="+p);
		System.out.println("rate="+r);
		System.out.println("time="+t);
amount=p*((1+r/100)*(1+r/100));
System.out.println("amount="+amount);
ci=amount-p;
System.out.println("compound interest="+ci);


	}

}
