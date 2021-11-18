package com.atguigu.pojo;

import java.util.List;

public class Page<T> {
    public static final Integer PAGE_SIZE=4;
    private Integer pageSize =PAGE_SIZE;
    private Integer pageNo;
    private Integer pageTotalCount;
    private Integer pageTotal;
    private List<T> items;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageTotalCount() {
        return pageTotalCount;
    }

    public void setPageTotalCount(Integer pageTotalCount) {
        this.pageTotalCount = pageTotalCount;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageSize=" + pageSize +
                ", pageNo=" + pageNo +
                ", pageTotalCount=" + pageTotalCount +
                ", pageTotal=" + pageTotal +
                ", items=" + items +
                '}';
    }
}
