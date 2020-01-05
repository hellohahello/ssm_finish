package com.bishe.dao.usermapper;

import com.bishe.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: yuanyuanAndDuxiaoyue
 * @Date: 2020-01-05 12:34
 * @Description:
 */
public interface UserMapper {
    public abstract User findById(@Param("id")String id);
}
