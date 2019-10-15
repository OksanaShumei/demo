package com.rest.repository;

import com.rest.model.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsRepository extends JpaRepository<Goods, Long> {

    @Query(value = "SELECT goods FROM test.store", nativeQuery = true)
    List<String> findAllGoods();

    Goods findAllById(Long id);

    Goods findByName(String searchName);

}
