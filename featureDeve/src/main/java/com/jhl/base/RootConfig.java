package com.jhl.base;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import java.beans.PropertyVetoException;
import java.io.IOException;

@Configuration
@ImportResource(locations = {"classpath:applicationContext.xml", "classpath:mapper/*.xml"})
@PropertySource("classpath:application.properties")
public class RootConfig {

    @Value("${db.driver}")
    private String dbDriver;
    @Value("${db.url}")
    private String dbUrl;
    @Value("${db.user}")
    private String dbUser;
    @Value("${db.password}")
    private String dbPassword;
    @Value("18")
    private Integer dbInitialPoolSize;

    /**
     * @Description javaconfig读取不到properties，暂时先使用xml配置
     * @Author jhl
     * @Date 2021/10/5 10:47
     * @Version 1.0
     */
/*    @Bean
    public PropertyPlaceholderConfigurer appProperty(){
        PropertyPlaceholderConfigurer propertyPlaceholderConfigurer=new PropertyPlaceholderConfigurer();
        Resource resource=new ClassPathResource("application.properties");
        propertyPlaceholderConfigurer.setLocations(resource);
        return propertyPlaceholderConfigurer;
    }*/
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    @Bean
    public ComboPooledDataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(dbDriver);
        comboPooledDataSource.setJdbcUrl(dbUrl);
        comboPooledDataSource.setUser(dbUser);
        comboPooledDataSource.setPassword(dbPassword);
        comboPooledDataSource.setInitialPoolSize(dbInitialPoolSize);
        return comboPooledDataSource;
    }



    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws IOException, PropertyVetoException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String packageXMLConfigPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX +"mapper/*.xml";
        // 设置MyBatis 配置文件的路径
//        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(myBatisConfigPath));
        // 设置mapper 对应的XML 文件的路径
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(packageXMLConfigPath));
        sqlSessionFactoryBean.setDataSource(dataSource());
        // 设置mapper 接口所在的包
        sqlSessionFactoryBean.setTypeAliasesPackage("com.jhl.entity.pojo");
        return sqlSessionFactoryBean;
    }
    @Bean
    public SqlSessionTemplate sqlSession() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory().getObject());
    }

    @Bean
    public DataSourceTransactionManager transactionManager() throws PropertyVetoException {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource());
        return dataSourceTransactionManager;
    }


}
