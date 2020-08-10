package com.junjun.lei.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * SPI机制测试
 * @author junjun.lei
 * @create 2020-08-10 16:14
 */
public class Main {
    public static void main(String[] args) {
        ServiceLoader<SpiService> load = ServiceLoader.load(SpiService.class);
        Iterator<SpiService> iterator = load.iterator();
        while (iterator.hasNext()){
            SpiService spi = iterator.next();
            spi.say();
        }
    }
}
