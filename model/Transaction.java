package model;

public class Transaction {
    private int txn_id;
    private String txn_type; // Expected values: INCOME / EXPENSE
    private String category;
    private double amount;
    private int month; // Expected range: [1, 12]
    private int year;  // Expected values: {2026, 2027}
    public String details;

    public Transaction(int id, String type, double amt, int month, int year, String details, String cat) {
        this(id, type, amt, month, year);  
        this.details = details;
        category = cat;     
    }

    public Transaction(int id, String type, double amt, int month, int year) {
        txn_id=id;
        txn_type=type;
        amount = amt;
        this.month = month;
        this.year = year;
        details="NA";
        if(type.equals("EXPENSE")){
            category="OTHER EXPENSES";
        }else{ category="OTHER INCOMES";}
        
    }

    public int getId() {return txn_id;}
    public String getType() {return txn_type;}
    public String getCat() {return category;}
    public double getAmount() {return amount;}
    public int getMonth() {return month;}
    public int getYear() {return year;}
    public String getDetails() {return details;}


    public void setId(int id) {
        // TODO: implement
    }

    public void setType(String type) {
        // TODO: implement
    }

    public void setCat(String cat) {
        // TODO: implement
    }

    public void setAmount(double amount) {
        // TODO: implement
    }

    public void setMonth(int month) {
        // TODO: implement
    }

    public void setYear(int year) {
        // TODO: implement
    }

    public void setDetails(String details) {
        // TODO: implement
    }

    @Override
    public boolean equals(Object obj) {
        // TODO: implement
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO: implement
        return super.hashCode();
    }
    
}
