# spring-aop
通过 xml 配置的方式使用 AOP


## 切入点表达式
Spring Doc: [AspectJ 5 pointcut expression](https://docs.spring.io/spring-framework/docs/5.2.17.RELEASE/spring-framework-reference/core.html#aop-pointcuts-examples)
```java
execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern) throws-pattern?)

/*
? 表示可选, 同时要遵守空格的位置
modifiers-pattern: 权限修饰符, 通配符: 直接省略即可, 不能使用 * 作为通配符
ret-type-pattern: 返回值类型, 通配符: *
declaring-type-pattern: 全限定类名, 通配符: *
name-pattern: 方法名, 通配符: *
param-pattern: 参数类型, () 空参、(..) 任意数量的参数、(*) 拥有一个任意类型的参数、(*,String) 拥有两个参数且第二个参数类型为 String
throws-pattern: 异常类型, 通配符: *
*/
```


## 通知的顺序
前置通知越先定义则越先执行, 而后置通知越后定义则越先执行
order 属性同理, 小 -> 大 -> method -> 大 -> 小

```java
环绕通知Begin(ProceedingJoinPoint);

前置通知();

try {
    hookMethod();
} catch (Exception e) {
    后置异常通知(e);
} finally {
    // 当 hookMethod 发生异常时, 后置返回通知无法执行。
    后置 返回/最终 通知();
}

环绕通知End();
```