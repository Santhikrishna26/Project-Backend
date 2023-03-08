package com.santhikrishna.Details.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.santhikrishna.Details.Entity.StoreEntity;
import com.santhikrishna.Details.Service.StoreService;
@CrossOrigin

@RestController

public class StoreController {
	
	@Autowired
	private StoreService st;
	
	@GetMapping("/getDetails")
	public List<StoreEntity> getDetails()
	{
		return st.getAllDetails();
	}
	
	@PostMapping("/addDetails")
	public StoreEntity postDetails(@RequestBody StoreEntity s)
	{
		return st.saveDetails(s);
	}
	
	@DeleteMapping("/delete/{cust_id}")
	public void delete(@PathVariable("cust_id") int cust_id)
	{
		st.deleteById(cust_id);
	}
	
	@PutMapping("/update/{cust_id}")
	public StoreEntity update(@PathVariable int cust_id,@RequestBody StoreEntity s)
	{
		return st.update(cust_id, s);
	}

}
