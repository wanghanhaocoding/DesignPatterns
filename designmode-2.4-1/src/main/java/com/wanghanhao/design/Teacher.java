package com.wanghanhao.design;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 老师
 * @date 2024/6/29 14:27
 */
public class Teacher {

    private String name;//老师姓名

    private String clazz;//班级

    private static List<Student> studentList;//学生

    public Teacher() {
    }

    public Teacher(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static void setStudentList(List<Student> studentList) {
        Teacher.studentList = studentList;
    }

    static {
        studentList = new ArrayList<>();
        studentList.add(new Student("花花", 10, 589));
        studentList.add(new Student("豆豆", 54, 356));
        studentList.add(new Student("秋雅", 23, 439));
        studentList.add(new Student("皮皮", 2, 665));
        studentList.add(new Student("蛋蛋", 19, 502));
    }

    //总分
    public double clazzTotalScore(){
        double totalScore = 0;
        for (Student student : studentList){
            totalScore += student.getGrade();
        }
        return totalScore;
    }

    //平均分
    public double clazzAverageScore(){
        double totalScore = 0;
        for (Student student : studentList) {
            totalScore += student.getGrade();
        }
        return totalScore/studentList.size();
    }

    //班级人数
    public int clazzStudentCount(){
        return studentList.size();
    }
}
