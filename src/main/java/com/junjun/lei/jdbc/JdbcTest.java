package com.junjun.lei.jdbc;

import org.junit.Test;

import java.sql.*;

/**
 * jdbc连接测试
 *
 * @author junjun.lei
 * @create 2020-08-10 15:03
 */
public class JdbcTest {

    /**
     *  jdbc连接步骤
     *
     *  1.加载驱动
     *  2.创建连接
     *  3.创建statement
     *  4.执行sql，获取resultSet结果集
     *  5.处理结果集
     *  6.关闭连接
     *
     * @throws Exception
     */
    @Test
    public void test01() throws Exception {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.建立连接
            con = DriverManager.getConnection("jdbc:mysql:///store_40?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "root");
            //3.创建Statement
            st = con.createStatement();
            String sql = "SELECT * FROM user";
            //4.执行SQL,得到ResultSet
            rs = st.executeQuery(sql);
            while (rs.next()) {
                int userId = rs.getInt("user_id");
                String userName = rs.getString("user_name");
                String password = rs.getString("password");
                System.out.println(userId+" "+userName+" "+" "+password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
