package com.itrip.dao.user;

import com.itrip.beans.pojo.Hotel;
import com.itrip.beans.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户的数据访问接口
 */
public interface UserMapper {
    /**
     * 根据用户编号查询用户信息
     */
    User getUsers(@Param("userCode")String userCode);
}
