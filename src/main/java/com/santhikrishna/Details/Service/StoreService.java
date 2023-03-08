package com.santhikrishna.Details.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santhikrishna.Details.Entity.StoreEntity;
import com.santhikrishna.Details.Repository.StoreRepo;

@Service
public class StoreService {
	
	@Autowired
	private StoreRepo repo;
	
	public StoreEntity saveDetails(StoreEntity s)
	{
		return repo.save(s);
	}
	
	public ArrayList<StoreEntity> getAllDetails()
	{
		List<StoreEntity> arr = new ArrayList<>();
		arr=repo.findAll();
		return (ArrayList<StoreEntity>) arr;
	}
	
	public void deleteById(int cust_id)
	{
		repo.deleteById(cust_id);
	}
	
	public StoreEntity update(int cust_id,StoreEntity s)
	{
		return repo.saveAndFlush(s);
	}

}
