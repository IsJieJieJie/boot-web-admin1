package com.atguigu.boot.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@TableName("t_admin")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
