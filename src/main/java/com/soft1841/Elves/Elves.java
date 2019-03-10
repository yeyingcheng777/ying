package com.soft1841.Elves;

/**
 * 实现精灵
 * @author 蔡一帆
 * 2019.3.10
 */

public class Elves {
    public static void main(String[] args) {
        MoveApp moveApp = new MoveApp();
        SingApp singApp = new SingApp();
        System.out.println("精灵会" + moveApp.move()+"和" + singApp.sing());
    }
}
