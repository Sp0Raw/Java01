package com.levelp.jb2;

import java.util.Scanner;

public class les4_4 {
    public static void main(String[] args) {
        String login ="Admin";
        String password ="P@ssw0rd";

        Scanner sc =new Scanner(System.in);

        System.out.println("Login:");

        String userLogin=sc.next();

        if (login.equals(userLogin)){
            System.out.println("password:");
            String userPassword=sc.next();
            if (password.equals(userPassword)){
                System.out.println("Привет "+userLogin);
            }else{
                System.out.println("неправильный пароль!");
            }
        }
        else{
            System.out.println("bad login");
        }

    }
}
