package com.ruoyi.hotel.domain;

import com.ruoyi.common.core.web.domain.BaseEntity;

public class NonstarhotelRooms extends BaseEntity {
    /** 非星级酒店房间ID */
    private Long id;
    /** 非星级酒店ID */
    private Long hotel_id;
    /** 非星级酒店房间name */
    private String name;
    /** 非星级酒店房间价格 */
    private Long price;
    /** 非星级酒店房间剩余量 */
    private Long quantity;
    /** 非星级酒店房间营销量 */
    private Long sales;
    /** 非星级酒店房间图片 */
    private String imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Long hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getSales() {
        return sales;
    }

    public void setSales(Long sales) {
        this.sales = sales;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
