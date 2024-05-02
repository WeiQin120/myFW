package com.example.myFramework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.myFramework.entity.Item;

@Repository
public interface itemRepository extends JpaRepository<Item, Integer> {
    @Query(value="SELECT * from item WHERE itemID = ?1", nativeQuery=true)
    public Item getItemByID(String id);
}
