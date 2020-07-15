package cn.iocoder.springboot.lab55.mapstructdemo.dataobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wn
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDO {
    private Integer id;
    private String name;
    private String className;
}
