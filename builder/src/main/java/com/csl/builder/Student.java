package com.csl.builder;

import lombok.Data;

/**
 * 模仿 lombok 中 {@link lombok.Builder} 注解生成的建造者
 *
 * @author MaoLongLong
 */
@Data
public class Student {

    private Integer id;
    private String name;
    private Integer age;

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
    }

    public static Student.Builder builder() {
        return new Student.Builder();
    }

    public static class Builder {

        private Integer id;
        private String name;
        private Integer age;

        public Student.Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Student.Builder name(String name) {
            this.name = name;
            return this;
        }

        public Student.Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
