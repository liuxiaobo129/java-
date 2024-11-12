package org.example.mybatis;

import org.apache.ibatis.cache.impl.PerpetualCache;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;

public class MainProcess {


    public static void main(String[] args) {


//        SqlSession session;
//
//        Executor executor;
//
//        StatementHandler statementHandler;
//
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, null, dataSource);
//
//
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//
//        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
//
//        sessionFactoryBean.setDataSource(sqlSessionFactory.getConfiguration().getEnvironment().getDataSource());


//        PerpetualCache perpetualCache = new PerpetualCache();

//        MappedStatement m  ；

        MapperScannerConfigurer configurer = new MapperScannerConfigurer();

        }
}
