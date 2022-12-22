package com.example.Proyecto.Configuration;

import com.example.Proyecto.bean.NuevoBean;
import com.example.Proyecto.bean.NuevoBeanImplementado;
import com.example.Proyecto.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class ConfigurationProperties {
    @Value("${value.nombre}")
    private String nombre;

    @Value("${value.apellido}")
    private String apellido;

    @Value("${value.random}")
    private String random;





    @Bean
    public NuevoBean Function(){
        return new NuevoBeanImplementado(nombre, apellido);
    }

    @Bean
    public DataSource datasource(){
        DataSourceBuilder dataSourceBuilder=DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:mem:testdb");
        dataSourceBuilder.username("SA");
        dataSourceBuilder.password("");
        return dataSourceBuilder.build();

    }

}


