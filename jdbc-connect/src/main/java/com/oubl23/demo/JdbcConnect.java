package com.oubl23.demo;

import java.sql.*;

public class JdbcConnect {

    private String className = "";
    private String url = "";
    private String user = "";
    private String passwd = "";

    public JdbcConnect(String className, String url, String user, String passwd) {
        this.className = className;
        this.url = url;
        this.user = user;
        this.passwd = passwd;
    }

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(this.className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = null;
            conn = DriverManager.getConnection(this.url, this.user, this.passwd);
            System.out.println("���ݿ����ӳɹ�");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;//������Ҫ�󷵻�һ��Connection����
    }

}
