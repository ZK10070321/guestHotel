package com.ruoyi.hotel.mapper;

import com.ruoyi.hotel.domain.StarBookings;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StarhotelRoomBookingsMapper {
    /**
     * 新增星级酒店预订信息
     *
     * @return 结果
     */
    public int insertStarhotelBookingMsg(StarBookings starBookings);
}
