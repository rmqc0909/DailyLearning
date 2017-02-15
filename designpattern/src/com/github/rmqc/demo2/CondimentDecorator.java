package com.github.rmqc.demo2;

/**
 * Created by xiedan11 on 2017/2/15.
 * 必须让CondimentDecorator能取代Beverage，所以将CondimentDecorator扩展自Beverage类
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * 所有的调料装饰者都必须重新实现getDescription()方法
      * @return
     */
    public abstract String getDescription();
}
