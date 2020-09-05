package com.atguigu.designpattern.proxy.cglib;

import net.sf.cglib.proxy.*;

import java.lang.reflect.Method;


class MethodInterceptorImpl implements MethodInterceptor {

    private Object target;

    public MethodInterceptorImpl(Object target) {
        this.target = target;
    }

    //重写  intercept 方法，会调用目标对象的方法
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("Cglib代理模式 ~~ 开始");
        Object o = method.invoke(target, args);
        //Object o = methodProxy.invoke(target, args);
        //Object o = methodProxy.invokeSuper(proxy, args);
        System.out.println("Cglib代理模式 ~~ 提交");
        return o;
    }
}

public class ProxyFactory {

    //维护一个目标对象
    private Object target;

    //构造器，传入一个被代理的对象
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回一个代理对象:  是 target 对象的代理对象
    public Object getProxyInstance() {

        //1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置回调函数
        enhancer.setCallback(new MethodInterceptorImpl(target));
        //4. 创建子类对象，即代理对象
        return enhancer.create();


    }

    public Object getProxyInstance2() {
        CallbackHelper callbackHelper = new CallbackHelper(target.getClass(), new Class[0]) {
            @Override
            protected Object getCallback(Method method) {
                if (method.getDeclaringClass() == Object.class && method.getReturnType() == String.class) {
                    //Object中所有返回String的方法都拦截，返回 hello cglib
                    return new FixedValue() {
                        @Override
                        public Object loadObject() throws Exception {
                            return "Hello cglib";
                        }
                    };
                } else if (method.getDeclaringClass() == TeacherDao.class) {
                    //TeacherDao.class  中的方法用自己的拦截器
                    return new MethodInterceptorImpl(target);
                } else {
                    //其他的方法默认不用拦截
                    return NoOp.INSTANCE;
                }
            }
        };
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallbackFilter(callbackHelper);
        enhancer.setCallbacks(callbackHelper.getCallbacks());
        return enhancer.create();

    }


}
