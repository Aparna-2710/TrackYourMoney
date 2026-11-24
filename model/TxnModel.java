package model;


public class TxnModel{
    //For HELPER FUNCTIONS

    public boolean isValidAmount(double amount){
        return amount>=0.0;
    }

    public double totalAmountByTxnType(TransactionStore txnMap, String txnType){
        double total = 0.0;
        for(int txn_id : txnMap.getTxn_id_array()){
            Transaction txn = txnMap.getTxn(txn_id);
            if(txn.getCat().equals(txnType)){
                total += txn.getAmount();
            }
        }
        return total;    
    }

    double getBalance(TransactionStore txnMap){
        double totalIncome = this.totalAmountByTxnType(txnMap, "INCOME");
        double totalExpense = this.totalAmountByTxnType(txnMap, "EXPENSE");

        return (totalIncome-totalExpense);
    }

    public double totalAmountByTxnCat(TransactionStore txnMap, String txnCat){
        double total = 0.0;
        for(int txn_id : txnMap.getTxn_id_array()){
            Transaction txn = txnMap.getTxn(txn_id);
            if(txn.getCat().equals(txnCat)){
                total += txn.getAmount();
            }
        }
        return total;
    }



    
   
}