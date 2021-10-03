# 事务

在 spring 中配置事务, 核心的 bean 对象是 `org.springframework.jdbc.datasource.DataSourceTransactionManager`
然后是基于该对象配置事务管理的方法, 可以通过 xml 配置实现(AOP), 也可以使用注解实现。