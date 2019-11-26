package com.itrip.biz.service.hotel;

import com.itrip.beans.pojo.Hotel;

import java.util.List;

/**
 * 旅店的业务逻辑层
 */
public interface HotelService {
    List<Hotel> getHotels();
}
