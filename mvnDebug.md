
### debug mvn plugin

0. mvn install插件到本地仓库
1. 命令行用mvnDebug代替mvn执行命令
2. 然后远程调试，绑定8000端口


### disable mvn plugin

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-enforcer-plugin</artifactId>
    <configuration>
        <skip>true</skip>
    </configuration>
</plugin>
```