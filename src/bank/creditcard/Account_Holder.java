package bank.creditcard;

import bank.chennai.SBI;

public class Account_Holder {
    public static void main(String[] args) {
        SBI account_holder = new SBI();
        // compiler error 'create_account()',empId,empName,branch_name,'get_loan' is not public in 'bank.chennai.SBI'. Cannot be accessed from outside package
/*        account_holder.empId = "1324";
        account_holder.empName = "Smith";

        System.out.println(account_holder.empId);
        System.out.println(account_holder.empName);
        //account_holder.create_account();
        //account_holder.get_loan(200);

        System.out.println(account_holder.branch_name);*/
    }
}
