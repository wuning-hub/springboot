package cn.iocoder.springboot.lab55.mapstructdemo.convert;

import cn.iocoder.springboot.lab55.mapstructdemo.bo.InfoDetailBo;
import cn.iocoder.springboot.lab55.mapstructdemo.dataobject.StudentDO;
import cn.iocoder.springboot.lab55.mapstructdemo.dataobject.UserDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InfoDetailBoConvert {

    InfoDetailBoConvert INSTANCE=Mappers.getMapper(InfoDetailBoConvert.class);


    @Mappings({
            @Mapping(source = "studentDO.id",target = "id"),
            @Mapping(source = "studentDO.name",target = "name"),
            @Mapping(source = "userDO.username",target = "info")
    })
    InfoDetailBo convert(StudentDO studentDO, UserDO userDO);


}
