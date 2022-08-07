package tnsif.c2tc.framework;

public class SavingAcc extends BankAcc {
	public SavingAcc(int accNo, String accName, float accBal) {
		super(accNo, accName, accBal);
		// TODO Auto-generated constructor stub
	}

	private boolean isSalary=true;

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", getAccNo()=" + getAccNo() + ", getAccName()=" + getAccName()
				+ ", getAccBal()=" + getAccBal() + "]";
	}
	
}
