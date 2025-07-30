package com.hanshan.hanaicodemother.common;

import lombok.Data;

/**
 * 分页请求封装类
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private int pageNum;

    /**
     * 页面大小
     */
    private int pageSize;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序方式（默认降序）
     */
    private String sortOrder = "descend";
}
