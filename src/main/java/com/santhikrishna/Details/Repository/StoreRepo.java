package com.santhikrishna.Details.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santhikrishna.Details.Entity.StoreEntity;

public interface StoreRepo extends JpaRepository<StoreEntity,Integer> {

}
