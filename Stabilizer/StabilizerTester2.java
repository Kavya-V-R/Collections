package com.xworkz.collection.Stabilizer;

import java.util.List;
import com.xworkz.collection.Stabilizer.Service.StabilizerServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import com.xworkz.collection.Stabilizer.DTO.Stabilizer;

public class StabilizerTester2 {

		public static void main(String[] args) {
			
			Stabilizer S1 = new Stabilizer("Vguard", 123, 1200, 224);
			Stabilizer S2 = new Stabilizer("sony", 123, 1200, 224);
			Stabilizer S3 = new Stabilizer("bpl", 123, 1200, 224);
			Stabilizer S4 = new Stabilizer("mi", 123, 1200, 224);
			
			StabilizerServiceImpl stabilizerServiceImpl = new StabilizerServiceImpl();
			stabilizerServiceImpl.validateSave(S1);
			stabilizerServiceImpl.validateSave(S2);
			stabilizerServiceImpl.validateSave(S3);
			stabilizerServiceImpl.validateSave(S4);

			
			stabilizerServiceImpl.remove(S1);
			stabilizerServiceImpl.updatePriceBySerialNumber(1250,123 );
			stabilizerServiceImpl.display();

		}
	}


