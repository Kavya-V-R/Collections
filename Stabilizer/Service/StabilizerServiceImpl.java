package com.xworkz.collection.Stabilizer.Service;

import com.xworkz.Exception.Helmet.Exception.InvalidBrand;
import com.xworkz.Exception.Helmet.Exception.InvalidPrice;
import com.xworkz.collection.Stabilizer.DAO.StabilizerDaoImpl;
import com.xworkz.collection.Stabilizer.DTO.Stabilizer;
import com.xworkz.collection.Stabilizer.Exception.InvalidSerialNumber;
import com.xworkz.collection.Stabilizer.Exception.InvalidVolt;

public class StabilizerServiceImpl implements StabilizerService {
	StabilizerDaoImpl dao=new StabilizerDaoImpl();
	boolean status=true;
	public void validateSave(Stabilizer dto) {
		try {
			if (dto.getBrand().length() < 2 && dto.getBrand() == null) {
				throw new InvalidBrand("Invalid Brand");
			}
			if (dto.getPrice() < 500) {
				throw new InvalidPrice("Invalid Price");
			}
			if (dto.getSerialNumber() == 0) {
				throw new InvalidSerialNumber("invalid serial number");
			}
			if (dto.getVolt() > 200) {
				throw new InvalidVolt("invalid volt");
			}
		} catch (InvalidBrand e) {
			e.printStackTrace();
		} catch (InvalidPrice e) {
			e.printStackTrace();
		} catch (InvalidSerialNumber e) {
			e.printStackTrace();
		} catch (InvalidVolt e) {
			e.printStackTrace();
		}
		if(status) {
			dao.saveStabilizer(dto);
		}
	}
	public void display() {
		dao.display();
	}
	public void remove(Stabilizer dto) {
		dao.remove(dto);
	}
	public void updatePriceBySerialNumber(int newprice,int serialNumber) {
		dao.updatePriceBySerialNumber(newprice,serialNumber);
	}

}