package com.edutech.progressive.entity;
import java.util.Date;

public class Transactions {
private int transactionId;
private int accountId;
private double amount;
private String transactionType;
private Date transactionDate;
public int getTransctionId() {
    return transactionId;
}
public void setTransctionId(int transctionId) {
    this.transactionId = transctionId;
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
    this.transactionId = transctionId;
    this.accountId = accountId;
    this.amount = amount;
    this.transactionType = transactionType;
    this.transactionDate = transactionDate;
}
public Transactions() {
} 

}