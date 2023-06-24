package com.evalcony;

import org.noear.solon.Solon;

public class App {
    public static void main(String[] args) {    //这是程序入口
        //
        // 在main函数的入口处，通过 Solon.start(...) 启动Solon的容器服务，进而启动它的所有机能
        //
        Solon.start(App.class, args);
    }

}
