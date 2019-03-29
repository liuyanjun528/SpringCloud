package com.example.demo.ApiFallbackerror;

import org.springframework.stereotype.Component;

/**
 * 
 * @author 刘彦军 在一个大型系统中，服务是部署在不同的服务器下面的，我们难免会遇到某一个服务挂掉或者请求不到的时候，
 *         如果不做任何处理，服务网关请求不到会抛出500错误，对用户是不友好的。 我们为了提供用户的友好性，需要返回友好性提示，zuul
 *         为我们提供了一个名叫 ZuulFallbackProvider 的接口， 通过它我们就可以对这些请求不到的服务进行错误处理。 新建一个类
 *         ApiFallbackProvider 并且实现 ZuulFallbackProvider 接口：
 */
@Component
public class ApiFallbackProvider {

}
