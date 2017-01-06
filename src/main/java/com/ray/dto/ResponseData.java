package com.ray.dto;

import java.util.List;

/**
 * Created by liuneng on 2017/1/3.
 */
public class ResponseData<T>  {
    private int total;
    private List<T> rows;
    private int pageNow;
    
    public int getPageNow() {
        return pageNow;
    }

    public ResponseData<T> setPageNow(int pageNow) {
        this.pageNow = pageNow;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public ResponseData<T> setTotal(int total) {
        this.total = total;
        return this;
    }

    public List<T> getRows() {
        return rows;
    }

    public ResponseData<T> setRows(List<T> rows) {
        this.rows = rows;
        return this;
    }
}
