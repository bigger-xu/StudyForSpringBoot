package com.cto.study.service.impl;

import com.cto.study.dao.UserMapper;
import com.cto.study.entity.User;
import com.cto.study.entity.vo.UserVo;
import com.cto.study.service.UserService;
import com.cto.study.service.base.BaseServiceImpl;
import com.cto.study.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhang Yongwei
 * @version 1.0
 * @date 2019-03-20
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserMapper getNameSpace() {
        return userMapper;
    }

    @Override
    public User selectByUserName(String userName) {
        return userMapper.selectByUserName(userName);
    }

    @Override
    public Page<User> selectPage(UserVo userVo) {
        Page<User> page = new Page<>(userMapper.selectPageCount(userVo), userVo.getPageSize(), userVo.getPageNum());
        List<User> result = userMapper.selectPageList(userVo);
        page.setRows(result == null ? new ArrayList<>() : result);
        return page;
    }
}
