package com.esurovskiy;

/**
 * @author Evgeniy Surovskiy
 */
public class SwitchExample {
    int field;
    Object o;
    static Integer integer;
    public static void main(String[] args) {
        int x = 0;
        switch (x) {
            case 1:
            case 2:
            default:
        }
        new SwitchExample().test(integer);
    }

    public void test(int i) {
        field++;
//        return "0";
    }
}
