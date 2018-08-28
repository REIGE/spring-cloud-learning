# spring-cloud-learning
Some examples of learning Spring Cloud
## chapter1
* 将服务`service-hi`注册到`eureka-server`上
* eureka-server控制台：[http://localhost:8761/](http://localhost:8761/)
## chapter2
* 通过ribbon调用 ribbon+restTemplate 调用`service-hi`上的服务
* ribbon地址 [http://localhost:8764/](http://localhost:8764/)
## chapter3
* 通过feign，访问 rest service
## chapter4 
* ribbon Hystrix
* feign Hystrix
* 断路打开后，可用避免连锁故障，fallback方法可以直接返回一个固定值。
## chapter5
* zuul