package com.dipen.addressbook;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class csvFileReader {
    ArrayList<Address> addList = new ArrayList<Address>();
    public Address readCSV;
    public Collection<? extends Address> readCSV(){
    
        String csvFile = "/home/dipen/PenDrive/Syngenta-Assignement/addressbook/src/main/resources/file.csv";
        CSVReader reader = null;
        try{
            reader = new CSVReader(new FileReader(csvFile));
            String[] line;
            while((line = reader.readNext()) != null){
                // Address addr = new Address(csvFile, csvFile, csvFile, csvFile, csvFile, csvFile);
                Address addr = new Address();
                addr.setFirstName(line[0]);
                addr.setLastName(line[1]);
                addr.setAddress(line[2]);
                addr.setCity(line[3]);
                addr.setState(line[4]);
                addr.setPincode(line[5]);
                addList.add(addr);
            }
        } catch(IOException e){
            e.printStackTrace();
        } catch(CsvValidationException e){
            e.printStackTrace();
        }
        // for (Address addr : addList) {
        //     System.out.print(addr.getFirstName());
        //     System.out.print(addr.getFirstName());
        //     System.out.print(addr.getAddress());
        //     System.out.print(addr.getCity());
        //     System.out.print(addr.getState());
        //     System.out.print(addr.getPincode());
        //     System.out.println();
        // }
        return addList;

    }
}
