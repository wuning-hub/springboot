package cn.iocoder.springboot.lab55.mapstructdemo;

import cn.iocoder.springboot.lab55.mapstructdemo.bo.InfoDetailBo;
import cn.iocoder.springboot.lab55.mapstructdemo.convert.InfoDetailBoConvert;
import cn.iocoder.springboot.lab55.mapstructdemo.dataobject.StudentDO;
import cn.iocoder.springboot.lab55.mapstructdemo.dataobject.UserDO;

public class InfoDetailBoTest {

    public static void main(String[] args) {
        UserDO userDO = UserDO.builder().id(2).username("降龙").build();
        StudentDO studentDO = StudentDO.builder().id(1).name("洪七").build();
        InfoDetailBo convert = InfoDetailBoConvert.INSTANCE.convert(studentDO, userDO);
        System.out.println(convert);
    }
}
