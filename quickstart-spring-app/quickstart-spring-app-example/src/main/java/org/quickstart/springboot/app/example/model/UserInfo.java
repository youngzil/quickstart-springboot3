package org.quickstart.springboot.app.example.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


/**
 * @author yangzl
 * @description TODO
 * @createTime 2020/4/20 22:53
 */
@Data
public class UserInfo {
  @NotBlank(message = "年龄不为空")
  @Max(value = 18, message = "不能超过18岁")
  private String age;
  @NotBlank(message = "性别不能为空")
  private String gender;
}
