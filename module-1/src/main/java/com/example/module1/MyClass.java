package com.example.module1;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import java.sql.DriverManager;
import java.sql.SQLException;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyClass {
    private static final String p = "123456";

    @NonNull
    private String command;


    public static void test() throws SQLException {
        String url = "jdbc:mysql://localhost/test";
        String u = "admin";
        getConn(url, u, p);
    }

    public static void getConn(String url, String v, String q) throws SQLException {
        DriverManager.getConnection(url, v, q);
    }


}
