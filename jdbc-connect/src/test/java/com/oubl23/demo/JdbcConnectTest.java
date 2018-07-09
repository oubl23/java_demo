package com.oubl23.demo;

import org.junit.Test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JdbcConnectTest {

    private String className = "";
    private String url = "";
    private String user = "";
    private String passwd = "";

    @Test
    public void jdbcTest() {
        JdbcConnect oracle = new JdbcConnect(className, url, user, passwd);
        Connection connection = oracle.getConnection();
        assertNotNull(connection);
    }

    @Test
    public void jdbcSelectTest() {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            conn = new JdbcConnect(className, url, user, passwd).getConnection();
            String sql = "select * from staff";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("STAFF_NAME"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
