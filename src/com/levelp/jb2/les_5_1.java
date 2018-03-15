package com.levelp.jb2;

public class les_5_1 {
    public static void main(String[] args) {
        byte oper1, oper2;
        int res;

        oper1=127;
        oper2=1;

        res=oper1 & oper2;

        System.out.println(" res=oper1 & oper2; = " + res);

        oper1=2;
        oper2=1;

        res=oper1 | oper2;

        System.out.println(" res=oper1 | oper2; = " + res);

        oper1=3;
        oper2=1;

        res=oper1 ^ oper2;

        System.out.println(" res=oper1 ^ oper2; = " + res);
    }
}
