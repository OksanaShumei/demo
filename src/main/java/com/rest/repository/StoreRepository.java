package com.rest.repository;

import com.rest.model.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

    Page<Store> findAll(Pageable pageable);

    Store findAllById(Long id);

    Store findByName(String searchName);
}
