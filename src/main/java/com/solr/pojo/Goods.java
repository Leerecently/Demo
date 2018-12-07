package com.solr.pojo;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/18
 * Time: 9:00
 */
@Data
@SolrDocument(solrCoreName = "goods")
public class Goods {
    @Id
    private Integer id;
    @Field
    private String name;
    @Field
    private Float price;
    @Field
    private String address;
}
