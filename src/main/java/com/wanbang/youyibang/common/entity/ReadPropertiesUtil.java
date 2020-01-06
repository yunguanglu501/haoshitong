package com.wanbang.youyibang.common.entity;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author: wcy
 * @Date: 2019/8/24 12:50
 * @Description:
 */
public class ReadPropertiesUtil {
    public static Properties getProperties(String propertiesPath) {
        Properties properties = new Properties();
        try {
            ClassPathResource cl = new ClassPathResource(propertiesPath);
            InputStream inputStream = cl.getInputStream();
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}
