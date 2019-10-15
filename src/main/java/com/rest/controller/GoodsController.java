package com.rest.controller;

import com.rest.model.Goods;
import com.rest.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class GoodsController {

    @Autowired
    GoodsRepository goodsRepository;

    @GetMapping(value = "/goods")
    public List<String> getAllGoods(){
        return goodsRepository.findAllGoods();
    }

    @GetMapping(value = "/search/goods/{name}")
    public ResponseEntity<Goods> searchGoodsName(@PathVariable(value = "name") String searchName) {
        Goods goods = goodsRepository.findByName(searchName);
        return ResponseEntity.ok().body(goods);
    }

    @GetMapping("/store/{id}/goods")
    public List<Goods> getGoods(){
        return goodsRepository.findAll();
    }


    @GetMapping("/store/{id}/goods/{id}")
    public ResponseEntity<Goods> getGoogsById(@PathVariable(value = "id") Long id){
        Goods goods = goodsRepository.findAllById(id);
        return ResponseEntity.ok().body(goods);
    }

    @PutMapping("/store/{id}/goods/{id}")
    public ResponseEntity<Goods> updateGoogs(@PathVariable(value = "id") Long id,
                                             @RequestBody Goods goodsDetails){
        Goods goods = goodsRepository.findAllById(id);
        goods.setName(goodsDetails.getName());
        goods.setDate(goodsDetails.getDate());
        Goods updatedGoods = goodsRepository.save(goods);

        return ResponseEntity.ok(updatedGoods);
    }

    @DeleteMapping("/store/{id}/goods/{id}")
    public ResponseEntity<Goods> deleteGoods(@PathVariable(value = "id") Long id){
        Goods goods = goodsRepository.findAllById(id);

        goodsRepository.delete(goods);

        return ResponseEntity.ok().build();
    }
}
