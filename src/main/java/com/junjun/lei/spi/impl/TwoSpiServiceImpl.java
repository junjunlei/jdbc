package com.junjun.lei.spi.impl;

import com.junjun.lei.spi.SpiService;

/**
 * @author junjun.lei
 * @create 2020-08-10 16:13
 */
public class TwoSpiServiceImpl implements SpiService {
    @Override
    public void say() {
        System.out.println("SpiService接口的第二个实现类");
    }
}
