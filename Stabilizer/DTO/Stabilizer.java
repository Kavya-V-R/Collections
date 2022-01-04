package com.xworkz.collection.Stabilizer.DTO;

import java.util.Iterator;

public class Stabilizer{
private String brand;
private int price;
private int serialNumber;
private int volt;
public Stabilizer(String brand, int price, int serialNumber, int volt) {
	this.brand = brand;
	this.price = price;
	this.serialNumber = serialNumber;
	this.volt = volt;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getSerialNumber() {
	return serialNumber;
}
public void setSerialNumber(int serialNumber) {
	this.serialNumber = serialNumber;
}
public int getVolt() {
	return volt;
}
public void setVolt(int volt) {
	this.volt = volt;
}
@Override
public String toString() {
	return super.toString();
}
public static Iterator iterator() {
	return null;
}
public static boolean remmove(Stabilizer dto) {
	return false;
}
public int hashcode() {
	return this.getSerialNumber();
}
public boolean equals(Object obj) {
	if(obj==null) {
		return false;
	}
	Stabilizer s=(Stabilizer) obj;
	if(this.getSerialNumber()==s.getSerialNumber()) {
		return true;
	}
	return false;
}
}
