package com.oujiong.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oujiong.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: 用户mapper
 *
 * @author xub
 * @date 2019/10/8 下午9:23
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}