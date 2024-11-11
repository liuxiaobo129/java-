package org.example.mybatis;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCPConfig {

    public static HikariDataSource createDataSource() {
        // HikariCP Configuration
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/first_schema"); // Your DB URL
        hikariConfig.setUsername("root"); // DB username
        hikariConfig.setPassword("LXBrcs123!"); // DB password
        hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariConfig.setMaximumPoolSize(10); // Max pool size

        // Return HikariDataSource
        return new HikariDataSource(hikariConfig);
    }
}