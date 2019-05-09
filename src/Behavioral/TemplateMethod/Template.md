# 模板方法模式
## 定义
+ 定义一个算法的骨架，并允许子类为一个或者多个步骤提供实现
+ 使子类可以在不改变算法结构的情况下，重新定义算法细节

## 使用场景

+ 一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现

+ 各个子类公共的行为被提取出来并集中到一个公共的父类当中，从而避免代码重复
## 优点
+ 提高复用性

+ 提高扩展性

+ 符合开闭原则
## 缺点
+ 增加系统复杂度
+ 类数目增加
+ 继承关系自身的缺点，如果父类添加新的抽象方法，所有的子类都要改写一遍

## 模板方法的扩展
### 钩子方法
子类通过覆写这个方法来更灵活的控制模板规定的行为

## 在源码中的体现
+ `Servlet`中的HttpServlet中的Service方法等待
+ `MyBatis`中的Executor
+ `Collection`API中抽象类中定义的方法
