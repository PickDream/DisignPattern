# 策略模式
## 定义
定义了算法家族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化不会影响到使用算法的用户

## 适用场景
+ 系统有很多类，而他们的区别仅仅在于他们的行为不同
+ 一个系统需要动态地在集中算法中选择一种
## 优点
+ 符合开闭原则
+ 避免使用多重转移语句
+ 提供算法的保密性和安全性
## 源码中的实现
+ `Comparable` 就是一个接口，这是对算法策略的抽象，都是“比较”，具体实现的策略组合在类内部，受一些需要比较操作的方法调用
+ Spring中对数据源用`Resource`类进行抽象

