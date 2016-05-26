com.stip.dbase

Connection getConn()

int addPerson(String desitination)

String updatePerson(String name,String desitination)

String findPerson(String name)

<<<<<<< HEAD
=======
- [管理文档](https://github.com/Gavin96/SoftwareReuse/blob/master/Document/%E7%AE%A1%E7%90%86%E6%96%87%E6%A1%A3.pdf)
- [测试文档](https://github.com/Gavin96/SoftwareReuse/blob/master/Document/%E6%B5%8B%E8%AF%95%E6%96%87%E6%A1%A3.pdf)
- [程序文档](https://github.com/Gavin96/SoftwareReuse/blob/master/Document/%E7%A8%8B%E5%BA%8F%E6%96%87%E6%A1%A3.pdf)
- [复用文档](https://github.com/Gavin96/SoftwareReuse/blob/master/Document%2F%E5%A4%8D%E7%94%A8%E6%96%87%E6%A1%A3.pdf)
- [构件测试文档](https://github.com/Gavin96/SoftwareReuse/blob/master/Document%2F%E6%9E%84%E4%BB%B6%E6%B5%8B%E8%AF%95%E6%96%87%E6%A1%A3.pdf)
- [重构复用文档](https://github.com/Gavin96/SoftwareReuse/tree/master/Document/%E9%87%8D%E6%9E%84%E7%A8%8B%E5%BA%8F%E6%96%87%E6%A1%A3)
- [实践6测试文档](https://github.com/Gavin96/SoftwareReuse/blob/master/Document%2F%E5%AE%9E%E8%B7%B56%E6%B5%8B%E8%AF%95%E6%96%87%E6%A1%A3.pdf)
- [实践7测试文档](https://github.com/Gavin96/SoftwareReuse/blob/master/Document%2F%E5%AE%9E%E8%B7%B57%E6%B5%8B%E8%AF%95%E6%96%87%E6%A1%A3.pdf)
- [实践8测试文档](https://github.com/Gavin96/SoftwareReuse/blob/master/Document%2F%E5%AE%9E%E8%B7%B58%E6%B5%8B%E8%AF%95%E6%96%87%E6%A1%A3.pdf)
- [实践9测试文档](https://github.com/Gavin96/SoftwareReuse/blob/master/Document%2F%E5%AE%9E%E8%B7%B59%E6%B5%8B%E8%AF%95%E6%96%87%E6%A1%A3.pdf)
- [ActiveMQ 消息持久化说明](https://github.com/Gavin96/SoftwareReuse/blob/master/%E6%8C%81%E4%B9%85%E5%8C%96%E8%AF%B4%E6%98%8E.md)
>>>>>>> e97d6530682e8fbeea882d2934d870b09e7da4c0

com.stip.face

int detection(String url)

void putFace(String url,String name)

String compareFace(String url)

Servlet�ӿ�

DbaseServlet

request.getParameter("method"); //the name od Dbase method

method:updatePerson,findPerson

request.getParameter("name"); //people's name
 
request.getParameter("destination"); //people's destination


<<<<<<< HEAD
FaceServlet

request.getPararment("method");//the name of Face method
=======
### 使用方法(Install)
> 本项目依赖Activemq框架，因此需要引入activemq的jar包，[下载jar](http://www.apache.org/dyn/closer.cgi?path=/activemq/5.13.2/apache-activemq-5.13.2-bin.zip).
> 并需要开启JMX监听，具体开启方法如下:

#### Windows User:
- 解压apache-activemq-5.12.1-bin.Zip
- 进入conf/activemq.xml进行修改
   - 在``<broker >``里面添加上 ``useJmx="true"``
   - 将``managementContext createConnector="false"``的``false``置为``true``
- 启动activemq,进入bin文件夹，进入win32/win64，双击activemq.bat，若出现: ``access to all MBeans is allowed``表明开启成功，注意这个控制台程序不能在运行时关闭.
- 此时进入http://localhost:8161/admin(用户名admin，密码admin）

```xml
<broker xmlns="http://activemq.apache.org/schema/core" brokerName="localhost" useJmx="true" dataDirectory="${activemq.data}">
>>>>>>> e97d6530682e8fbeea882d2934d870b09e7da4c0

method:addPerson,comparePerson

<<<<<<< HEAD
request.getParameter("name"); //people's name
 
request.getParameter("destination"); //people's destination

request.getParameter("image");//the url of people's face  


ע��

com.stip.face   Face.pathΪ����Ĭ������·������Ҫ�޸�

com.stip.dbase  Dbase���ݿ����������Ҫ�޸�

=======
```
#### Mac OS X User:
 
- 使用homebrew安装ActiveMQ
  
```bash
$ /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)" 
//如果你没有安装homebrew，执行上一条，否则跳过
$ brew install activemq
```
   - 配置JMX监制
```bash
$ cd usr/local/Cellar/activemq/5.11.2/libexec/conf
$ vi activemq.xml
//修改的地方同windows
```
   - 开启ActiveMQ
```bash
$ cd 
$ activemq start 
```
   - 将项目clone到本地:
```bash 
$ git clone https://github.com/Gavin96/SoftwareReuse.git
//🍺=>然后你就可以运行了
```

====

Copyright 2016 &copy;  Group 3
>>>>>>> e97d6530682e8fbeea882d2934d870b09e7da4c0
