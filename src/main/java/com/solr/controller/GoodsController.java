package com.solr.controller;

import com.solr.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/18
 * Time: 9:01
 */
@RestController
public class GoodsController {

    private GoodsService goodsService;

    @Autowired
    public GoodsController(GoodsService goodsService){
        this.goodsService=goodsService;
    }


}
