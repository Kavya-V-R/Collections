package com.xworkz.collection.Stabilizer.DAO;

import java.util.List;

import com.xworkz.collection.Stabilizer.DTO.Stabilizer;

import java.util.ArrayList;
import java.util.Iterator;

public class StabilizerDaoImpl {
	List stabilizer = new ArrayList();
	private int newprice;
	private int serialNumber;

	public void saveStabilizer(Stabilizer dto) {
		stabilizer.add(dto);
		System.out.println("object added successfully");
	}

	public void display() {
		Iterator iterator = stabilizer.iterator();
		while (iterator.hasNext()) {
			Stabilizer s = (Stabilizer) iterator.next();
			System.out.println(s.getBrand());
			System.out.println(s.getPrice());
			System.out.println(s.getSerialNumber());
			System.out.println(s.getVolt());
		}
	}

	public void remove(Stabilizer dto) {
		boolean remove = stabilizer.remove(dto);
		if (remove) {
			System.out.println("remove successfully");
		}
	}

	public void updatePriceBySerialNumber(Stabilizer dto) {
		boolean contains = stabilizer.contains(dto);
		if (contains) {
			for (Object object : stabilizer) {
				Stabilizer s = (Stabilizer) object;
				if (s.getSerialNumber() == serialNumber) {
					s.setPrice(newprice);
				}
			}
		}
	}

	public void updatePriceBySerialNumber(int newprice, int serialNumber) {
StabilizerDaoImpl dao;
dao.updatePriceBySerialNumber(newprice,serialNumber);		
	}
}
