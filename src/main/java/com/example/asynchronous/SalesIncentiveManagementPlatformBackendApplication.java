package com.example.asynchronous;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.asynchronous.model.Admin;
import com.example.asynchronous.model.CommissionModel;
import com.example.asynchronous.model.CommissionRules;
import com.example.asynchronous.model.Products;
import com.example.asynchronous.model.SalesLine;
import com.example.asynchronous.model.SalesPerson;
import com.example.asynchronous.repository.AdminRepository;
import com.example.asynchronous.repository.CommissionModelRepository;
import com.example.asynchronous.repository.CommissionRulesRepository;
import com.example.asynchronous.repository.ProductsRepository;
import com.example.asynchronous.repository.SalesLineRepository;
import com.example.asynchronous.repository.SalesPersonRepository;

@SpringBootApplication
public class SalesIncentiveManagementPlatformBackendApplication  implements CommandLineRunner{
	
	@Autowired
	SalesPersonRepository salesPersonRepository;
	@Autowired
	SalesLineRepository salesLineRepository;
	@Autowired
	ProductsRepository productsRepository;
	@Autowired
	CommissionRulesRepository commissionRuleRepository;
	@Autowired
	AdminRepository adminRepository;
	@Autowired
	CommissionModelRepository commissionModelRepository;
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SalesIncentiveManagementPlatformBackendApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception
    {

//        SalesPerson first = new SalesPerson("SP1", "password", "kalyani", "hyderabad", 10, 0, "SP2", 2,3,4,5,14,100000.0f);
//        salesPersonRepository.save(first);
//        SalesPerson second = new SalesPerson("SP2", "password2", "christina", "banglore", 12, 1, "SP4", 2,3,4,6,15,120000.0f);
//        salesPersonRepository.save(second);
//        SalesPerson third = new SalesPerson("SP3", "password3", "mythli", "mumbai", 14, 1, "SP4", 2,3,4,6,15,130000.0f);
//        salesPersonRepository.save(third);
//        SalesPerson four = new SalesPerson("SP4", "password4", "sanju", "chennai", 15, 2, "SP5", 2,3,4,6,15,130000.0f);
//        salesPersonRepository.save(four);
//        Date d1 = new Date(2022, 04, 13);
//        SalesLine sl1 =new SalesLine("SL1","P1", first, d1 ,10000.0f, "SP2", 3000.0f );
//        salesLineRepository.save(sl1);
//        Date d2 = new Date(2022, 04, 11);
//        SalesLine sl2 =new SalesLine("SL2","P2", second, d1 ,20000.0f, "SP4", 6000.0f );
//        salesLineRepository.save(sl2);
//        Date d3 = new Date(2022, 04, 10);
//        SalesLine sl3 =new SalesLine("SL3","P3", first, d1 ,25000.0f, "SP2", 8000.0f );
//        salesLineRepository.save(sl3);
//        productsRepository.saveAll(List.of(
//				new Products("P1", "Honda Activa", "two wheeler", "Honda", 52000.0f, "2WR3"),
//				new Products("P2", "Hero HF Deluxe", "two wheeler", "Hero", 39000.0f, "2WR2"),
//				new Products("P3", "Bajaj Pulsar", "two wheeler", "Bajaj", 28000.0f, "2WR1"),
//				new Products("P4", "Bajaj Compact RE", "three wheeler", "Bajaj", 275000.0f, "3WR1"),
//				new Products("P5", "Kia Carens", "four wheeler", "Kia", 975000.0f, "4WR1"),
//				new Products("P5", "MahindraXUV700", "four wheeler", "Mahindra", 1275000.0f, "4WR2"),
//				new Products("P6", "Tata Signa", "commercial vehicle", "Tata", 5675000.0f, "CVR2"),
//				new Products("P7", "Tata Ultra", "commercial vehicle", "Tata", 1046000.0f, "CVR1")
//				)
//				);
//		 CommissionRules rule1 = new CommissionRules(0.1f, 0.2f, 0.5f);
//		 commissionRuleRepository.save(rule1);
//		 Admin firstA = new Admin("A1","Admin1","Admin@1");
//         adminRepository.save(firstA);
//         Admin secondA = new Admin("A2","Admin2","Admin@2");
//         adminRepository.save(secondA);
//		commissionModelRepository.saveAll(List.of(
//				new CommissionModel("2WR1", 3),
//				new CommissionModel("2WR2", 5),
//				new CommissionModel("2WR3", 8),
//				new CommissionModel("3WR1", 3),
//				new CommissionModel("3WR2", 5),
//				new CommissionModel("4WR1", 4),
//				new CommissionModel("4WR2", 6),
//				new CommissionModel("4WR3", 10),
//				new CommissionModel("CVR1", 6),
//				new CommissionModel("CVR2", 11)
//				)
//				);
    }
}
