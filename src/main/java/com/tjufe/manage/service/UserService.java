package com.tjufe.manage.service;

import com.tjufe.manage.dataObject.SellerInfo;
import com.tjufe.manage.utils.Page;

import java.util.List;

public interface UserService {
    List<SellerInfo> findAll();

    List<SellerInfo> findSellerInfoPageList(Page page);
}
