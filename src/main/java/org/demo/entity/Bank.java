package org.demo.entity;

public class Bank {
    private int id;
    private String actholdername;
    private double bank_balance;
    private double deposit_amt;
    private int deposit_id;
    private int trans_id;
    private String branch;
    private String account_type;
	public int getId() {
		return id;
	}
	public String getActholdername() {
		return actholdername;
	}
	public double getBank_balance() {
		return bank_balance;
	}
	public double getDeposit_amt() {
		return deposit_amt;
	}
	public int getDeposit_id() {
		return deposit_id;
	}
	public int getTrans_id() {
		return trans_id;
	}
	public String getBranch() {
		return branch;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setActholdername(String actholdername) {
		this.actholdername = actholdername;
	}
	public void setBank_balance(double bank_balance) {
		this.bank_balance = bank_balance;
	}
	public void setDeposit_amt(double deposit_amt) {
		this.deposit_amt = deposit_amt;
	}
	public void setDeposit_id(int deposit_id) {
		this.deposit_id = deposit_id;
	}
	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
    
    
}
