package com.example.asynchronous.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.asynchronous.model.SalesLine;
import com.example.asynchronous.repository.ProductsRepository;
import com.example.asynchronous.repository.SalesLineRepository;
import com.example.asynchronous.repository.SalesPersonRepository;

@Service
public class SalesLineService {

	@Autowired
	SalesLineRepository salesLineRepository;
	String line = "";
	
	@Autowired
	SalesPersonRepository salesPersonRepository;
	
	@Autowired
	ProductsRepository productsRepository;
	
	
	
	public void saveSalesLineData(MultipartFile file) throws IOException, ParseException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream(), "UTF-8"));
		while((line = br.readLine()) != null) {
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
			String[] data = line.split(",");
			SalesLine salesLine = new SalesLine();
			salesLine.setSalesLineId(data[0]);
			

			salesLine.setSalesPersonId(data[1]);
			salesLine.setProductId(data[2]);
			salesLine.setReportingId(data[3]); 	
			salesLine.setSalesDate(formatter.parse(data[4]));
			salesLine.setSalesPrice(Float.parseFloat(data[5]));
			salesLine.setCommision(0);
			salesLineRepository.save(salesLine);
			
			int commissionPer =  salesLineRepository.findCommission(data[0]);
//			System.out.println("Commission Per"+commissionPer);
			float commissionPrice = (float) (Float.parseFloat(data[5]) * (commissionPer/100.0));
//			System.out.println("Commission Price "+commissionPrice);
			salesLine.setCommision(commissionPrice);
			salesLineRepository.save(salesLine);
			
			int twoWheelerSold = salesPersonRepository.getTwoWheelerSold(data[1]);
			int threeWheelerSold = salesPersonRepository.getThreeWheelerSold(data[1]);
			int fourWheelerSold = salesPersonRepository.getFourWheelerSold(data[1]);
			int commercialSold = salesPersonRepository.getCommercialSold(data[1]);
			String productType = productsRepository.getProductType(data[2]);
			System.out.println(productType);
			if(productType.equalsIgnoreCase("two wheeler")) {
				salesPersonRepository.updateVehicleDetails(twoWheelerSold+1,threeWheelerSold, fourWheelerSold, commercialSold, data[1]);
				
			} else if (productType.equalsIgnoreCase("three wheeler")) {
				salesPersonRepository.updateVehicleDetails(twoWheelerSold,threeWheelerSold+1, fourWheelerSold, commercialSold, data[1]);
			
			} else if (productType.equalsIgnoreCase("four wheeler")) {
				salesPersonRepository.updateVehicleDetails(twoWheelerSold,threeWheelerSold, fourWheelerSold+1, commercialSold, data[1]);
			
			} else{
				salesPersonRepository.updateVehicleDetails(twoWheelerSold,threeWheelerSold, fourWheelerSold, commercialSold+1, data[1]);
			
			}
			
			float existing_uptodateCommission = salesPersonRepository.getUptodateCommission(data[1]);
			float updatedCommission = existing_uptodateCommission + commissionPrice;
			salesPersonRepository.updateCommission(updatedCommission, data[1]);
			
		
		
		}
	}
}