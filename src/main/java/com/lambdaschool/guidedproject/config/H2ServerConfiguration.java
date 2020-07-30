package com.lambdaschool.guidedproject.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Configures H2 access through the JetBrains IntelliJ IDEA IDE.
 * <p>
 * Adapted from https://techdev.io/en/developer-blog/querying-the-embedded-h2-database-of-a-spring-boot-application
 * necessary for using the database tool built into intellij
 */
@Configuration
public class H2ServerConfiguration {
    /**
     * TCP port for remote connections, default 9092.
     */
    @Value("${h2.tcp.port:9092}")
    private String h2TcpPort;

    /**
     * Web port, default 8082.
     */
    @Value("${h2.web.port:8802}")
    private String h2WebPort;
}
