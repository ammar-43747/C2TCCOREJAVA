package tnsif.c2tc;

import tnsif.c2tc.application.MMBankFactory;
import tnsif.c2tc.application.MMSavingAcc;
import tnsif.c2tc.framework.BankFactory;
import tnsif.c2tc.framework.CurrentAcc;
import tnsif.c2tc.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankFactory bf=new MMBankFactory();
SavingAcc ms=new SavingAcc(1234,"Ammar",15000);
ms.withdraw(12000);
CurrentAcc ca=new CurrentAcc(1234,"idris" , 1300);
ca.withdraw(12000);
	}

}
