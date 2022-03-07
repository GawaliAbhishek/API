package com.Abhishek.DataJpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Abhishek.DataJpa.Model.data1;

@RestController
public class DataController {
	
@Autowired
private DataService service;
	
	@GetMapping("AbhiApi/Oracle/getalldata")
	public List<data1> getallData(){
		return service.getallData();
	}
	
    
	
	@GetMapping("AbhiApi/Oracle/getdata/{id}")
	public data1 getData(@PathVariable int id) {
		return service.getData(id);
	}
	
	@PostMapping("AbhiApi/Oracle/adddata")
	public data1 putData(@RequestBody  data1 data) {
		return service.addData(data);
	}
	
	@PutMapping("AbhiApi/Oracle/updatedata")
	public data1 updateData(@RequestBody data1 data) {
		return service.updateData(data);
	}
	
	@DeleteMapping("AbhiApi/Oracle/deletedata/{id}")
	public data1 deleteData(@PathVariable int id) {
		return service.deleteData(id);
	}
    
	@DeleteMapping(path ="AbhiApi/Oracle/DELETEALLDATA",produces="application/text")
	public String deletealldata() {
		return "jamla";
	}
	
	

}
