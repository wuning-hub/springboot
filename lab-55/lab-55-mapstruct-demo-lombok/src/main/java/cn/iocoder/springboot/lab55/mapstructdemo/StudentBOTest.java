package cn.iocoder.springboot.lab55.mapstructdemo;

import cn.iocoder.springboot.lab55.mapstructdemo.bo.StudentBO;
import cn.iocoder.springboot.lab55.mapstructdemo.convert.StudentConvert;
import cn.iocoder.springboot.lab55.mapstructdemo.dataobject.StudentDO;

public class StudentBOTest {

    public static void main(String[] args) {
        StudentDO studentDO = StudentDO.builder()
                .id(1)
                .name("洪七")
                .className("丐帮")
                .build();
        StudentBO studentBO = StudentConvert.INSTANCE.convert(studentDO);
        System.out.println(studentBO.toString());
    }


}
