package com.tjufe.manage.mapper;

import com.tjufe.manage.dataObject.SellerInfo;
import com.tjufe.manage.utils.Page;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SellerInfoMapper {

    List<SellerInfo> findAll();

    int deleteByPrimaryKey(String sellerId);

    int insert(SellerInfo record);

    int insertSelective(SellerInfo record);

    SellerInfo selectByPrimaryKey(String sellerId);

    int updateByPrimaryKeySelective(SellerInfo record);

    int updateByPrimaryKey(SellerInfo record);

    List<SellerInfo> findSellerInfoPageList(Page page);
}