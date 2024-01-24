# [SOAP Web Service with Spring-WS Tutorial](https://www.youtube.com/playlist?list=PLPnaArAh2-4RDjqGHvu94EGLd_JoKWUqh)

### [pom.xml](pom.xml)

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

### [spring-ws-servlet.xml](src/main/webapp/WEB-INF/spring-ws-servlet.xml)
### [web.xml](src/main/webapp/WEB-INF/web.xml)
### [insuranceapplication.xml](src/main/resources/insuranceapplication.xml)
### [insuranceapplication.xsd](src/main/resources/insuranceapplication.xsd)
### [insuranceapplication.wsdl](src/main/resources/insuranceapplication.wsdl)

```shell
mvn clean package
```

```text
tomcat7:run
```

### [Click me after previous 2 steps](http://localhost:8081/spring-ws/getInsurance.wsdl)

# All works fine at this commit ! ! ! 
