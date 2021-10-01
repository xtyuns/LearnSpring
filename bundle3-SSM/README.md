### 整合步骤

1. 导入依赖：`mysql`、`mybatis`、`mybatis-spring`、`spring-jdbc`、`spring-webmvc`
2. 配置 Spring-Mybatis：`DriverManagerDataSource`、`SqlSessionFactoryBean`、`MapperScannerConfigure`
3. 配置 SpringMVC：配置注解扫描路径、开启 MVC 注解驱动
4. 将 SSM 接入 web.xml
   1. 使用 `ContextLoaderListener 监听器`通过 `contextConfigLocation 上下文参数`, 关联已配置完成的 Spring-MyBatis, 即可完成将 DAO 层接入 web 环境。
   2. 使用 `DispatherServlet` 通过 `contextConfigLocation 初始化参数`, 关联已配置完成的 SpringMVC, 并配置 ServletMapping,  即可将 DispatherServlet 接入到上一步所配置的 spring 环境中。
5. 编写测试文件, 测试各层功能是否正常（需要在 pom.xml 中配置 resources 防止 MyBatis 的 SQL 映射文件无法编译）
6. 配置其他内容: 如 Jackson、P6Spy、PageHelper...



### 可选配置
- 事务支持
- web.xml 配置编码过滤器: CharacterEncodingFilter:encoding
- SpringMVC 中配置视图解析器: InternalResourceViewResolver（视图解析器中的前后缀配置只对转发生效）
- Jackson、@ResponseBody、@RestController

