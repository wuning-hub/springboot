package cn.iocoder.springboot.lab55.mapstructdemo.convert;

import cn.iocoder.springboot.lab55.mapstructdemo.bo.StudentBO;
import cn.iocoder.springboot.lab55.mapstructdemo.dataobject.StudentDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author wn
 */
@Mapper
public interface StudentConvert {

   StudentConvert INSTANCE= Mappers.getMapper(StudentConvert.class);

    /**
     * 转换
     * @param studentDO  s
     * @return  StudentBO
     */
    @Mappings({@Mapping(source = "id",target = "sid")})
   StudentBO convert(StudentDO studentDO);
}
