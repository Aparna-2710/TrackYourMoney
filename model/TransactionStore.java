package model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TransactionStore {
    private Map<Integer, Transaction> txnMap;

    public TransactionStore() {
        // TODO: initialize txnMap (e.g., new LinkedHashMap<>())
        txnMap = new LinkedHashMap<>();

    }

    public void addTxn(Transaction txn) {
        // TODO: implement
    }

    public void removeTxn(int txn_id){

    }
    public Transaction getTxn(int txn_id){
        return txnMap.get(txn_id);     
    }
    //public Transaction updateTxn(int txn_id){ IMPLEMENT }
    
    public Set<Integer> getTxn_id_array(){
        return txnMap.keySet();
    }
    public  Set<Map.Entry<Integer,Transaction>> get_txn_array(){
        return txnMap.entrySet();
    }
    public Boolean search_txn(int txn_id){
        return txnMap.containsKey(txn_id);
    }
    //traverse function needed? for Jtable?

   

    //Filter method
    List<Transaction> getTxnsByMonth(String month){
        List<Transaction> monthTxn = new ArrayList<>() ;
        //IMPLEMENT

        return monthTxn;   
    }
    List<Transaction> getTxnsByYear(int year){
        List<Transaction> filteredTxn = new ArrayList<>() ;
        //IMPLEMENT

        return filteredTxn;   
    }
    List<Transaction> getTxnsByMonthYear(String month){
        List<Transaction> filteredTxn = new ArrayList<>();
        //IMPLEMENT using filter by month anf year

        return filteredTxn ;   
    }






    


    
}
