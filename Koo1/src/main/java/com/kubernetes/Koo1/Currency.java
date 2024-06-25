package com.kubernetes.Koo1;

import org.springframework.stereotype.Component;

@Component
public class Currency 
{
private String from;
private String to;
private int amount;

// Adding override
@Override
public String toString() {
	return "Currency [from=" + from + ", to=" + to + ", amount=" + amount + "]";
}
public Currency()
{
	
}
public Currency(String from, String to, int amount) {
	super();
	this.from = from;
	this.to = to;
	this.amount = amount;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}


}
