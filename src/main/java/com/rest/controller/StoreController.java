package com.rest.controller;

import com.rest.model.Store;
import com.rest.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class StoreController {

    @Autowired
    StoreRepository storeRepository;

    @GetMapping("/")
    Page<Store> storePage(@PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC) Pageable pageable){
        return storeRepository.findAll(pageable);
    }

    @GetMapping(value = "/search/{name}")
    public ResponseEntity<Store> searchStoreName(@PathVariable(value = "name") String searchName) {
        Store store = storeRepository.findByName(searchName);
        return ResponseEntity.ok().body(store);
    }

    @GetMapping("/store")
    public List<Store> getAllStores(){
        return storeRepository.findAll();
    }

    @GetMapping("/store/{id}")
    public ResponseEntity<Store> getStoreById(@PathVariable(value = "id") Long id){
        Store store = storeRepository.findAllById(id);
        return ResponseEntity.ok().body(store);
    }

    @PutMapping("/store/{id}")
    public ResponseEntity<Store> updateStore(@PathVariable(value = "id") Long id,
                                             @RequestBody Store storeDetails){
        Store store = storeRepository.findAllById(id);
        store.setName(storeDetails.getName());
        store.setDescription(storeDetails.getDescription());
        store.setAddress(storeDetails.getAddress());
        store.setGoods(storeDetails.getGoods());
        Store updatedStore = storeRepository.save(store);

        return ResponseEntity.ok(updatedStore);
    }

    @DeleteMapping("/store/{id}")
    public ResponseEntity<Store> deleteStore(@PathVariable(value = "id") Long id){
        Store store = storeRepository.findAllById(id);

        storeRepository.delete(store);

        return ResponseEntity.ok().build();
    }
}
