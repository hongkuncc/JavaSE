package com.hongkuncc.day03.demo05;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {

    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AB接口都有的抽象方法");
    }

    @Override
    public void methodDefault(){
        System.out.println("对多个接口当中冲突的方法进行覆盖");

    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }
}
