package JavaFoundation;

public class Account {
	//declare variables 
    int acc_No,amount;
    String name;

    //insert data into account
    void insertData(int aNum, String aName, int aAmount){
        acc_No = aNum;
        name = aName;
        amount = aAmount;
    }

    //dispaly account data
    void displayData(){
        System.out.println(acc_No + " "+name+" "+amount);
    }

    //deposit money into account 
    void deposit(int amt){
        amount += amt;
        System.out.println(amt + " is deposited into the account");
    }

    //void withdraw money from account
    void withdraw(int withdraw){
        amount -= withdraw;
        System.out.println(withdraw + " is withdrawn from the account");
    }
}
