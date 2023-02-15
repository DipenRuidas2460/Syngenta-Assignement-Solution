package com.dipen.addressbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressbookApplication.class, args);
		System.out.println("started.....");
		csvFileReader fileReader = new csvFileReader();
		fileReader.readCSV();
	}

}




