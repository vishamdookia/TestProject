package classesandobjects;

public class AccountHolder {

		String firstname;
		String lastname;
		int age;
		float accountBalance;
		boolean eligibleForCreditCard;

		public void testEligibilityForCreditCard() {
			if(age>25 && accountBalance>=20000) {
				eligibleForCreditCard = true;
			}
		}
}
