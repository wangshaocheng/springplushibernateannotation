com.sxt项目的注解版本
这个项目是基于spring2.5.6+hibernate3的annotation配置来进行IOC注入的


hibernate的core/common-annotation/annotation版本和springmvc1项目的完全一致
注意：
hibernate的3个jar是手动添加到本地的maven repo中的，从repo.maven.apache.org中是下载不到符合compatible matrix的core和对应的annotation的jar的。

开发步骤：
spring2.5mvc + hibernate3配置文件
业务逻辑代码
运行Junit进行业务逻辑单元测试
页面请求Controller并调用业务逻辑


