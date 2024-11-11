package org.example.mybatis;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.apache.ibatis.mapping.Environment;
import org.example.mybatis.mapper.UserMapper;

import java.io.InputStream;

public class MyBatisConfig {

    public static SqlSessionFactory buildSqlSessionFactory(HikariDataSource dataSource) {
        // MyBatis Configuration
        Configuration configuration = new Configuration();

        // Set the Environment for MyBatis
        Environment environment = new Environment(
                "development", // Environment name
                new JdbcTransactionFactory(), // Transaction factory
                dataSource // DataSource
        );
        configuration.setEnvironment(environment);


        configuration.addMapper(UserMapper.class);

        // Optionally add any custom mappers or settings here
        // configuration.addMapper(YourMapperClass.class);

        // Build SqlSessionFactory with configuration
        return new SqlSessionFactoryBuilder().build(configuration);
    }

    public static void main(String[] args) {
        // Create the DataSource
        HikariDataSource dataSource = HikariCPConfig.createDataSource();

        // Build the SqlSessionFactory with HikariCP
        SqlSessionFactory sqlSessionFactory = buildSqlSessionFactory(dataSource);

        // Create a SqlSession from the factory
        try (var session = sqlSessionFactory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            mapper.insertUser("John Doe", "john.doe@example.com");
            session.commit(); // Commit the transaction
            System.out.println("MyBatis connected successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}