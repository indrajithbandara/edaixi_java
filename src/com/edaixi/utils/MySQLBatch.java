package com.edaixi.utils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLBatch {
    public static  Connection conn=null;
    
	public MySQLBatch() throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://10.10.3.13/new_lxyy_db?useUnicode=true&characterEncoding=UTF-8&rewriteBatchedStatements=true";
	String user="root";
	String password="dsideal";

	conn= DriverManager.getConnection(url,user,password); 
	}
    public static void insert() {  
        // 开时时间  
        //Long begin = new Date().getTime();  
        // sql前缀  
        String prefix = "INSERT INTO tb_big_data (count, create_time, random) VALUES ";  
        try {  
            // 保存sql后缀  
            StringBuffer suffix = new StringBuffer();  
            // 设置事务为非自动提交  
            conn.setAutoCommit(false);  
            // Statement st = conn.createStatement();  
            // 比起st，pst会更好些  
            PreparedStatement pst = conn.prepareStatement("");  
            // 外层循环，总提交事务次数  
            for (int i = 1; i <= 100; i++) {  
                // 第次提交步长  
                for (int j = 1; j <= 10000; j++) {  
                    // 构建sql后缀  
                    suffix.append("(" + j * i + ", SYSDATE(), " + i * j  
                            * Math.random() + "),");  
                }  
                // 构建完整sql  
                String sql = prefix + suffix.substring(0, suffix.length() - 1);  
                // 添加执行sql  
                pst.addBatch(sql);  
                // 执行操作  
                pst.executeBatch();  
                // 提交事务  
                conn.commit();  
                // 清空上一次添加的数据  
                suffix = new StringBuffer();  
            }  
            // 头等连接  
            pst.close();  
            conn.close();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
        // 结束时间  
        //Long end = new Date(end).getTime();  
        // 耗时  
        //System.out.println("cast : " + (end - begin) / 1000 + " ms");  
    }  
    
}
