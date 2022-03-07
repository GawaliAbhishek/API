package com.Abhishek.DataJpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Abhishek.DataJpa.Model.data1;
import com.Abhishek.DataJpa.dao.DataRepo;

@Component
public class DataService {
	
	@Autowired
	private DataRepo repo;

	/*
	 * Service to collect all the data from Database table
	 */
   
	 List<data1> getallData(){
		return repo.findAll();
	}
	
	
	/*
	 * Service to all Data of perticular one primary ke
	 */
	 
	 
	 data1 getData(int id) {
		return repo.getById(id);
	}
	
	
	/*
	 * Service to add Data in record
	 */
	
	 data1 addData(data1 data) {
		return repo.save(data);
	}
	
	/*
	 * Service to Update existing data in Record
	 */
	 data1 updateData(data1 data) {
		return repo.save(data);
	}
	 
	 /*
	  * Service to Delete the Data from Database with given Id
	  */
	
	 data1 deleteData(int id) {
		 data1 data = getData(id);
		repo.deleteById(id);
		return data;
	 }
	 
	 /*
	  * Service to delete All the Data from Db
	  */
	 
	 String deleteallData() {
		 repo.deleteAll();
		 return "Data Deleted Successfully";
	 }
	
}
