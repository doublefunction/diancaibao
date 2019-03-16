package com.tjufe.manage.mapper;

import com.tjufe.manage.dataObject.SellerInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SellerInfoMapperTest {
    @Autowired
    private SellerInfoMapper sellerInfoMapper;

    @Test
    public void testSelectAll(){
          List<SellerInfo> sellerInfoList = sellerInfoMapper.findAll();
        for (SellerInfo sellinfo:sellerInfoList) {
            System.out.println(sellinfo);
        }
    }

}