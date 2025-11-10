package com.itheima.d4_proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Star implements StarService {
    private String name;

    @Override
    public void sing(String name) {
        System.out.println(this.name + "演唱" + name);
    }

    @Override
    public String dance() {
        System.out.println(this.name+"跳舞，米米嘟");
        return "谢谢！谢谢！";
    }
}
