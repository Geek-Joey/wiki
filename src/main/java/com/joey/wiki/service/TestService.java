package com.joey.wiki.service;

import com.joey.wiki.entity.TestEntity;
import com.joey.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author joey
 * @create 2022-05-06 2:42 下午
 */
@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<TestEntity> list() {
        return testMapper.list();
    }
}
