package com.javappa.postmemberof.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.javappa.postmemberof.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query("SELECT i FROM Item i WHERE NOT EXISTS (SELECT 1 FROM User u WHERE i MEMBER OF u.items)")
    List<Item> findAllNotAssignedToUser();
}
