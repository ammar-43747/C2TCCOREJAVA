package tnsif.c2tc.application;

import tnsif.c2tc.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	public MMSavingAcc(int accNo, String accName, float accBal) {
		super(accNo, accName, accBal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float accBal) {
		System.out.println("the balance amount is"+ accBal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccName()="
				+ getAccName() + ", getAccBal()=" + getAccBal() +  "]";
	}

}
