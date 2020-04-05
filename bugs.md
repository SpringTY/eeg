### 遇到的一些问题

#### 1. 把值放入Map中 js读不到
> th:incline 
> 看看是否访问到了 RequestMapping

#### 2. LocalDate 减法操作

#### 3. mysql 数据库与mybatis 中的输入日期不一致:

很可能是因为没有设置时区的问题

#### 4. mysql 数据库乱码 
在url指定标签还不够 记得在服务器端口指定my.cnf 还是my.ini中指定utf8
而且数据库也要是utf的

#### 4. MBG 操作
https://blog.csdn.net/fly_fly_fly_pig/article/details/81592432 

mbg 发生过一次错误 是由于第一次连接数据库比较慢,导致运行两次generator
然后xml文件是追加形式 所以xml 中有两个id相同的方法
发生错误为 mybatis 绑定错误
然后如果把文件夹移动到mapper 文件夹会让mapper bean无法生成
导致其他mapper bean 也不行
解决与预防建议 在其他project生成mapper文件 复制到目标工程

数据库中单位是秒