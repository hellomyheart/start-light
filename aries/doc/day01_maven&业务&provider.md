## day01 maven&业务&provider

## maven

### maven的继承性：

#### pom的modules

模块,父项目可以使用modules把子项目包含进去。例如：

```xml
    <modules>
        <!--        依赖管理模块-->
        <module>aries-dependcies</module>
        <!--        提供者模块-->
        <module>aries-provider</module>
    </modules>
```

#### dependencyManagement

里面放依赖，但是依赖不会导入到项目中，只是预先定义了依赖和版本号，子模块使用里面的依赖可以不写版本号，继承父模块的版本号（子模块也可以使用不同于父模块的版本号，但一般不这样做）

#### dependencies

真正放依赖的地方，如果该模块有子模块，子模块会继承该模块的依赖。

#### maven的模块化开发

dependcies模块：项目的依赖管理模块，没有代码，只用来管理项目依赖。

provider模块：提供者模块，主要是mapper层和service层。所有服务的提供者的父模块，可以放所有提供者的公共依赖。

consumer模块：消费者模块，主要是controller层，所有服务的消费者的父模块，可以放所有消费者者的公共依赖。

......

## 微服务项目搭建

### 依赖模块

创建**星座-dependencies**模块，里面有一个pom.xml，示例代码如下：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <!--    父项目是spring-boot-starter-parent,标准的springboot项目-->
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.3.5.RELEASE</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.example</groupId>
    <artifactId>aries-dependcies</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>aries-dependcies</name>
    <description>依赖管理项目，主要用来管理项目依赖(限定版本号)</description>

    <properties>
        <java.version>1.8</java.version>
        <mybatis.version>2.1.3</mybatis.version>
        <nacos.version>2.1.0.RELEASE</nacos.version>
        <mysql.connector.version>8.0.21</mysql.connector.version>
        <druid.version>1.1.21</druid.version>
        <sentinel.version>2.2.1.RELEASE</sentinel.version>
        <spring.boot.version>2.3.5.RELEASE</spring.boot.version>
        <spring-cloud.version>Hoxton.SR8</spring-cloud.version>
    </properties>

    <!--    管理项目依赖 限定版本号-->
    <dependencyManagement>

        <dependencies>
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-web</artifactId>
                <version>${spring.boot.version}</version>
            </dependency>
            <dependency>
                <groupId>org.mybatis.spring.boot</groupId>
                <artifactId>mybatis-spring-boot-starter</artifactId>
                <version>${mybatis.version}</version>
            </dependency>

            <!--            springcloud依赖-->
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>${spring-cloud.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>


            <dependency>
                <groupId>com.alibaba.cloud</groupId>
                <artifactId>spring-cloud-alibaba-nacos-discovery</artifactId>
                <version>${nacos.version}</version>
            </dependency>
            <dependency>
                <groupId>mysql</groupId>
                <artifactId>mysql-connector-java</artifactId>
                <version>${mysql.connector.version}</version>
            </dependency>
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>druid</artifactId>
                <version>${druid.version}</version>
            </dependency>

            <!-- sentinel -->
            <dependency>
                <groupId>com.alibaba.cloud</groupId>
                <artifactId>spring-cloud-starter-alibaba-sentinel</artifactId>
                <version>${sentinel.version}</version>
            </dependency>

            <dependency>
                <groupId>com.alibaba.cloud</groupId>
                <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
                <version>${nacos.version}</version>
            </dependency>
        </dependencies>


    </dependencyManagement>
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>


</project>
```

### 生产者模块

该模块将会是所有生产者模块的父模块，示例代码如下：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <!--    ??????????-->
    <parent>
        <artifactId>aries-dependcies</artifactId>
        <groupId>com.example</groupId>
        <version>0.0.1-SNAPSHOT</version>
    </parent>
    <groupId>com.example</groupId>
    <artifactId>aries-provider</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>aries-provider</name>
    <packaging>pom</packaging>

    <description>?????</description>


    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>${mybatis.version}</version>
        </dependency>
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-alibaba-nacos-discovery</artifactId>
            <version>${nacos.version}</version>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid</artifactId>
        </dependency>

        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
            <version>2.2.1.RELEASE</version>
        </dependency>
    </dependencies>

    <modules>
        <!--        ????-->
        <module>aries-scheduling-provider-api</module>
        <module>aries-scheduling-provider-service</module>
    </modules>

</project>

```

主项目pom也可以更新：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>aries</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>aries</name>
    <description>?????</description>
    <packaging>pom</packaging>

    <modules>
        <!--        ??????-->
        <module>aries-dependcies</module>
        <!--        ?????-->
        <module>aries-provider</module>
    </modules>

</project>

```

