package org.example.confile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataEnvironmentPostProcessor;
import org.springframework.boot.env.OriginTrackedMapPropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ConfigReader {

    private final Environment environment;

    @Autowired
    public ConfigReader(Environment environment) {
        this.environment = environment;

        String appName = environment.getProperty("server.port");
    }

    public void printConfig() {
        // 获取配置项
        String appName = environment.getProperty("server.port");
        System.out.println("App Name: " + appName);
        ConfigDataEnvironmentPostProcessor a;
        OriginTrackedMapPropertySource c;
    }
}