package com.itrip.biz.service.users.impl;

import com.itrip.beans.pojo.Hotel;
import com.itrip.biz.service.hotel.HotelService;
import com.itrip.dao.hotel.HotelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 旅馆的业务逻辑层
 */
@Service
public class UserServiceImpl implements HotelService {
    @Autowired
    private HotelMapper hotelMapper;
    @Override
    public List<Hotel> getHotels() {
        return hotelMapper.getHotel();
    }
}
