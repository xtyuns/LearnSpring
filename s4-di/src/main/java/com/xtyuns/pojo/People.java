package com.xtyuns.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class People {
    private String name;

    @Autowired
    // 由于本类中提供了 setPet() 方法, 所以这里的注解将通过 setter 注入
    // 也可以直接在 setter 方法上添加该注解, 更加明确的指定为 setter 注入
    // 如果没有提供 setter 方法, 则会使用基于字段的依赖注入(反射), 在 spring 中这是不推荐使用的
    private Dog pet;

    public People() {
    }

    public People(String name, Dog pet) {
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getPet() {
        return pet;
    }

//    @Autowired
    public void setPet(Dog pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", pet=" + pet +
                '}';
    }
}
