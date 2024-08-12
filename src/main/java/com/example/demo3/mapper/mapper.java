package com.example.demo3.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface mapper {
    /*
     * 쿼리를 작성하는 방법
     * 1. xml 파일 이용
     * 2. 어노테이션 이용
     */

     @Select("select sysdate from dual")
     String selctDate();
}
