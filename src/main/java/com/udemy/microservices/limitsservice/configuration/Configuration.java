package com.udemy.microservices.limitsservice.configuration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
@Data
@Builder
@AllArgsConstructor
public class Configuration {

    /**
     * minimum value will be read from properties file.
     */
    private int minimum;

    /**
     * maximum value will be read from properties file.
     */
    private int maximum;

    public Configuration(){}
}
