package com.example.module1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.lang.NonNull;

import java.sql.DriverManager;
import java.sql.SQLException;


@SpringBootApplication
public class Application1 {


    private static final String p = "123456";
    @NonNull
    private String command;

    public static void main(String[] args) {
        SpringApplication.run(Application1.class, args);
    }

    public static void test() throws SQLException {
        String url = "jdbc:mysql://localhost/test";
        String u = "admin";
        getConn(url, u, p);
    }

    public static void getConn(String url, String v, String q) throws SQLException {
        DriverManager.getConnection(url, v, q);
    }

}
