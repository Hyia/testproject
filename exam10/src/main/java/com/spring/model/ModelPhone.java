package com.spring.model;

public class ModelPhone {
    
    private String phname;
    private String phfactory;
    private Integer phprice;
    
    // getter & setter
    public String getPhname() {
        return phname;
    }
    public void setPhname(String phname) {
        this.phname = phname;
    }
    public String getPhfactory() {
        return phfactory;
    }
    public void setPhfactory(String phfactory) {
        this.phfactory = phfactory;
    }
    public Integer getPhprice() {
        return phprice;
    }
    public void setPhprice(Integer phprice) {
        this.phprice = phprice;
    }
    
    // toString
    @Override
    public String toString() {
        return "ModelPhone [phname=" + phname + ", phfactory=" + phfactory
                + ", phprice=" + phprice + "]";
    }
    
    
    // constructor
    public ModelPhone() {
        super();
    }
    public ModelPhone(String phname, String phfactory, Integer phprice) {
        super();
        this.phname = phname;
        this.phfactory = phfactory;
        this.phprice = phprice;
    }
    
    

}
