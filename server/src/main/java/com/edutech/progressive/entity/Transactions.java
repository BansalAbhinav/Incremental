package com.edutech.progressive.entity;
import java.util.Date;

public class Transactions {
private int transctionId;
private int accountId;
private double amount;
private String transactionType;
private Date transactionDate;
public int getTransctionId() {
    return transctionId;
}
public void setTransctionId(int transctionId) {
    this.transctionId = transctionId;
}
public int getAccountId() {
    return accountId;
}
public void setAccountId(int accountId) {
    this.accountId = accountId;
}
public double getAmount() {
    return amount;
}
public void setAmount(double amount) {
    this.amount = amount;
}
public String getTransactionType() {
    return transactionType;
}
public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
}
public Date getTransactionDate() {
    return transactionDate;
}
public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
}
public Transactions(int transctionId, int accountId, double amount, String transactionType, Date transactionDate) {
    this.transctionId = transctionId;
    this.accountId = accountId;
    this.amount = amount;
    this.transactionType = transactionType;
    this.transactionDate = transactionDate;
}
public Transactions() {
} 

}