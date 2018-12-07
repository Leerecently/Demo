package com.solr.dao;

import com.solr.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/18
 * Time: 9:01
 */
@Mapper
public interface GoodsMapper {
    List<Goods> getAllGoodsList();

}
