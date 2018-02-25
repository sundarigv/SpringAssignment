package com.project.springbootdemo.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class DBConfig {
//    private Object HIBERNATE_DIALECT;
//	private Object HIBERNATE_SHOW_SQL;
//	private Object HIBERNATE_HBM2DDL_AUTO;
	//@Bean
	public DataSource dataSource() {
	        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
	        dataSourceBuilder.driverClassName("org.sqlite.JDBC");
	        dataSourceBuilder.url("jdbc:sqlite:sample-data.db");
	   //     dataSourceBuilder.
	        System.out.println("this bean created");
	        return dataSourceBuilder.build();   
	}
//    @Bean
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
//        sessionFactoryBean.setDataSource(dataSource());
//        Properties hibernateProperties = new Properties();
//        hibernateProperties.put("hibernate.dialect", HIBERNATE_DIALECT);
//        hibernateProperties.put("hibernate.show_sql", HIBERNATE_SHOW_SQL);
//        hibernateProperties.put("hibernate.hbm2ddl.auto", HIBERNATE_HBM2DDL_AUTO);
//        sessionFactoryBean.setHibernateProperties(hibernateProperties);
//
//        return sessionFactoryBean;
//    }
}