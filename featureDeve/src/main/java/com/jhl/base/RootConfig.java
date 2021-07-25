package com.jhl.base;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations={"classpath:applicationContext.xml","classpath:mapper/*.xml"})
public class RootConfig {
}
