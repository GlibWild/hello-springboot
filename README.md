### 最基础的springboot测试项目，包含对注解的解释
```
    1.运行代码
    2.访问路径：
    http://127.0.0.1:8911/hello/config
    其余路径自行查看controller
```

#### mybatis测试内容
```
    1.启动mysql服务
    2.运行目录下hello.sql
    3.修改application.properties下关于数据库连接配置
    4.mybatis基础配置很简单。
        1). resources/mapper/UserMapper.xml 用于配置sql语句实现
        2). 在UserMapper.xml中指定的位置处添加UserMapper的接口
        3). 依赖注入即可调用UserMapper中的接口
    如需查看完整配置，请自行查看 https://mybatis.net.cn/index.html
```