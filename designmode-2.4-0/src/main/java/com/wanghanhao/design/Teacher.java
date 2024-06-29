package com.wanghanhao.design;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 老师
 * @date 2024/6/26 22:39
 */
public class Teacher {

    private String name; //老师名称

    private String clazz;//班级

    private static List<Student> studentList;//学生列表

    public Teacher() {
    }

    public Teacher(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public String getClazz() {
        return clazz;
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    static{
        studentList = new ArrayList<>();
        studentList.add(new Student("花花", 10, 589));
        studentList.add(new Student("豆豆", 54, 356));
        studentList.add(new Student("秋雅", 23, 439));
        studentList.add(new Student("皮皮", 2, 665));
        studentList.add(new Student("蛋蛋", 19, 502));
    }
}
