package com.liuqi.dua.executor.bean;

import com.liuqi.common.base.bean.query.FilterOp;
import lombok.Data;

/**
 * 节点参数
 *
 * @author  LiuQi 2024/8/9-12:21
 * @version V1.0
 **/
@Data
public class NodeParam {
    private String key;

    // 比较操作符，只在表类型条件时有效
    private FilterOp op;

    // 参数类型，const/request/node/js/groovy
    private String type;

    // 引用参数的节点编码
    private String nodeCode;

    // 参数值
    private Object value;

    // 参数值1
    private Object value1;
}
