package com.ecommerce.admin.vojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author yousabla
 */
@Data
public class ParInfoVO {
    @ApiModelProperty(value = "主键")
    private Integer parId;

    @ApiModelProperty(value = "参数主键")
    private String parCd;

    @ApiModelProperty(value = "参数值")
    private String parValue;

    @ApiModelProperty(value = "参数说明")
    private String description;
}
