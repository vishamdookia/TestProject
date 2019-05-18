package classesandobjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
		
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();

		tom.firstname="Tom";
		tom.lastname="Smith";
		tom.age=21;
		tom.accountBalance=10000;
		tom.testEligibilityForCreditCard();
		System.out.println("Is Tom eligible for Credit card: "+tom.eligibleForCreditCard);
		
		henry.firstname="Henry";
		henry.lastname="Hill";
		henry.age=31;
		henry.accountBalance=20000;
		henry.testEligibilityForCreditCard();
		System.out.println("Is Henry eligible for Credit card: "+henry.eligibleForCreditCard);
		
		sarah.firstname="Sarah";
		sarah.lastname="Miller";
		sarah.age=41;
		sarah.accountBalance=30000;
		sarah.testEligibilityForCreditCard();
		System.out.println("Is Sarah eligible for Credit card: "+sarah.eligibleForCreditCard);
		
	}

}
