package com.junjun.lei.spi.impl;

import com.junjun.lei.spi.SpiService;

/**
 * @author junjun.lei
 * @create 2020-08-10 16:13
 */
public class OneSpiServiceImpl implements SpiService {
    @Override
    public void say() {
        System.out.println("SpiService接口的第一个实现类");
    }
}
