package cn.iocoder.springboot.lab55.mapstructdemo.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InfoDetailBo {
    private Integer id;
    private String name;
    private String info;
}
