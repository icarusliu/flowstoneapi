package com.liuqi.dua.bean.query;

import com.liuqi.common.base.bean.query.BaseQuery;
import lombok.Data;

import java.util.List;

/**
 * 接口查询对象
 *
 * @author Coder Generator 2024-07-08 22:32:36
 **/
@Data
public class ApiQuery extends BaseQuery {
    private Boolean guestMode;
    private String key;
    private List<String> idsNot;
}