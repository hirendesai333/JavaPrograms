package JavaFoundation;

public class BankingSystem {
	public static void main(String[] args){
        //create an object of account through reference
        Account a1 = new Account();

        a1.insertData(101, "hiren desai", 10000);//insert data
        a1.displayData();//display data

        a1.deposit(15000);//deposit amount
        a1.displayData();//display updated data

        a1.withdraw(5000);//withdraw amount
        a1.displayData();//display updated data

    }
}
