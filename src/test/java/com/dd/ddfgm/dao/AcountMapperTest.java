package com.dd.ddfgm.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AcountMapperTest {
    @Autowired
    AcountMapper acountMapper;

    public void findAcount() {
    }

    @Test
    public void getAcountNum() {
        System.out.println(acountMapper.getAcountNum());
    }
}