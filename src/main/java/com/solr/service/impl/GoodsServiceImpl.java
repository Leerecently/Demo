package com.solr.service.impl;

import com.solr.dao.GoodsMapper;
import com.solr.pojo.Goods;
import com.solr.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/18
 * Time: 9:02
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> getAllGoodsList() {




        return null;
    }
}
