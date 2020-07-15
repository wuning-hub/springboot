package cn.iocoder.springboot.lab55.mapstructdemo.bo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wn
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentBO {
    private Integer sid;
    private String name;
}
