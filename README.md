[SOAP Web Service with Spring-WS Tutorial](https://www.youtube.com/playlist?list=PLPnaArAh2-4RDjqGHvu94EGLd_JoKWUqh)

### pom.xml

```xml
    <dependencies>
        <dependency>
            <groupId>org.springframework.ws</groupId>
            <artifactId>spring-ws-core</artifactId>
            <version>2.1.4.RELEASE</version>
        </dependency>
    </dependencies>
```

```xml
    <build>
        <finalName>spring-ws</finalName>
        <plugins>
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <source>1.7</source>
                    <target>1.7</target>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.tomcat.maven</groupId>
                <artifactId>tomcat7-maven-plugin</artifactId>
                <version>2.2</version>
            </plugin>
        </plugins>
    </build>
```