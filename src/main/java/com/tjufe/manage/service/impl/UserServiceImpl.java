package com.tjufe.manage.service.impl;

import com.tjufe.manage.dataObject.SellerInfo;
import com.tjufe.manage.mapper.SellerInfoMapper;
import com.tjufe.manage.service.UserService;
import com.tjufe.manage.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SellerInfoMapper sellerInfoMapper;

    @Override
    public List<SellerInfo> findAll() {
        return sellerInfoMapper.findAll();
    }

    @Override
    public List<SellerInfo> findSellerInfoPageList(Page page) {
        return sellerInfoMapper.findSellerInfoPageList(page);
    }
}
