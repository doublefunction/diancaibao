package com.tjufe.manage.utils;

import java.util.List;

public class Page {
    /**
     * 每页显示
     */
    private int pageSize = 8;
    /**
     * 页码
     */
    private int pageNo = 1;
    /**
     * 开始数
     */
    private int start = 0;
    /**
     * 调整URL
     */
    private String toUrl = "";

    private List<?> result;
    /**
     * 总条数
     */
    private int totalRows = 0;

    /**
     * 是否需要查询总条数，如果只需要查询固定几条，不需要再查询总条数，提升性能
     */
    private boolean selectTotalRows = true;

    /**
     * 排序方式 0 desc,1 asc
     */
    private int orderBy = 0;
    private int orderBy2 = 0;
    //排序
    private String comment_num;
    private String point_num;
    private String views_num;
    private String share_num;


    private Object condition;

    public Page() {

    }

    public Page(int pageSize, int pageNo) {
        this.pageSize = pageSize;
        this.pageNo = pageNo;
    }

    /**
     * @param pageSize  每页条数
     * @param pageNo    页码（单前页码）
     * @param totalRows 总条数
     * @param start     开始条数
     * @param toUrl     跳转的URL
     * @param result    返回数据list
     */
    public Page(int pageSize, int pageNo, int totalRows, int start, String toUrl, List<?> result) {

        this.pageSize = pageSize;
        this.pageNo = pageNo;
        this.totalRows = totalRows;
        this.start = start;
        this.toUrl = toUrl;
        this.result = result;
    }

    /**
     * <p>
     * 每一页的条数，默认20条
     * <p/>
     *
     * @author LH
     */
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getStart() {
        this.start = (pageNo - 1) * pageSize;
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public String getToUrl() {
        return toUrl;
    }

    public void setToUrl(String toUrl) {
        this.toUrl = toUrl;
    }

    public List<?> getResult() {
        return result;
    }

    public void setResult(List<?> result) {
        this.result = result;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public Object getCondition() {
        return condition;
    }

    public void setCondition(Object condition) {
        this.condition = condition;
    }

    public int getPageCount() {
        return getTotalRows() % getPageSize() == 0 ? getTotalRows() / getPageSize() : getTotalRows() / getPageSize() + 1;
    }

    public int getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(int orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * 是否需要查询总条数，如果只需要查询固定几条，不需要再查询总条数，提升性能
     */
    public boolean getSelectTotalRows() {
        return selectTotalRows;
    }

    /**
     * 是否需要查询总条数，如果只需要查询固定几条，不需要再查询总条数，提升性能
     */
    public void setSelectTotalRows(boolean selectTotalRows) {
        this.selectTotalRows = selectTotalRows;
    }


    @Override
    public String toString() {
        return "Pager{" +
                "pageSize=" + pageSize +
                ", pageNo=" + pageNo +
                ", start=" + start +
                ", toUrl='" + toUrl + '\'' +
                ", result=" + result +
                ", totalRows=" + totalRows +
                ", orderBy=" + orderBy +
                ", condition=" + condition +
                '}';
    }

    private String adminId;

    public int getOrderBy2() {
        return orderBy2;
    }

    public void setOrderBy2(int orderBy2) {
        this.orderBy2 = orderBy2;
    }
}
