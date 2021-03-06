package com.junjun.lei.spi;

/**
 * spi机制
 *
 * SPI ，全称为 Service Provider Interface，是一种服务发现机制。
 * 它通过在ClassPath路径下的META-INF/services文件夹查找文件，自动加载文件里所定义的类。
 *
 * @author junjun.lei
 * @create 2020-08-10 16:11
 */
public interface SpiService {
    void say();
}
