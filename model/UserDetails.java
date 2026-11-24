package model;

public class UserDetails {
    private String userName;
    private String dob;
    private long phone;
    private String password;

    public UserDetails(String userName,String dob,long phone,String password){
        this.userName = userName;
        this.dob = dob;
        this.phone = phone;
        this.password = password;
    }

    public String getName() { return userName;}
    public String getDob() {return dob;}
    public long getPhone() {return phone;}
    public String getPassword() {return password;}

    public void setName(String name) {
        while(true){
            if (name==null || name.isBlank()){
                System.out.println("No name typed");
            }
            else{
                userName=name;
                System.out.println("User Name : "+userName);
                break;
            }
        }   
    }

    public void setDob(String dob) {
        while(true){
            if (dob==null || dob.isBlank()){
                System.out.println("No DOB entered");
            }
            else{
                this.dob=dob;
                System.out.println("DOB : "+ this.dob);
                break;
            }
        }     
    }

    public void setPhone(long phone) { this.phone = phone;}
    public void setPassword(String password) {
        while(true){
            if(password.length()<=7 || password.length()>=15){
                System.out.println("password too short or too long");
            }else{
                this.password = password;
                break;
            }
        }       
    }
    
}
