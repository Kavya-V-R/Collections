package com.xworkz.collection.Stabilizer.Service;

import com.xworkz.collection.Stabilizer.DTO.Stabilizer;

public interface StabilizerService {
public void validateSave(Stabilizer dto);
public void display();
public void remove(Stabilizer dto);
public void updatePriceBySerialNumber(int newprice,int serialNumber);
}
