package org.ruoyi.chat.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.ruoyi.chat.enums.TaskAction;


@Data
@ApiModel("变化任务提交参数")
@EqualsAndHashCode(callSuper = true)
public class SubmitChangeDTO extends BaseSubmitDTO {

	@ApiModelProperty(value = "任务ID", required = true, example = "\"1320098173412546\"")
	private String taskId;

	@ApiModelProperty(value = "UPSCALE(放大); VARIATION(变换); REROLL(重新生成)", required = true,
			allowableValues = "UPSCALE, VARIATION, REROLL", example = "UPSCALE")
	private TaskAction action;

	@ApiModelProperty(value = "序号(1~4), action为UPSCALE,VARIATION时必传", allowableValues = "range[1, 4]", example = "1")
	private Integer index;

}
