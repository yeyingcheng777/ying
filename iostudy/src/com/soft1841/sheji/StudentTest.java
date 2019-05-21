package com.soft1841.sheji;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println("大家好，我是练习时长两年半的个人练习生");
        Student student = new Student() {
            @Override
            public void sing() {
                System.out.println("我会唱");
            }
        };
        student.sing();
        Student student1 = new Student() {
            @Override
            public void dance() {
                System.out.print("我会跳,");
            }
            @Override
            public void rap(){
                System.out.print("rap,");
            }
            @Override
            public void playBasketball(){
                System.out.print("还有篮球");
            }
        };
        student1.dance();
        student1.rap();
        student1.playBasketball();
    }
}
