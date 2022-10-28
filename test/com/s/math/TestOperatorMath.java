package com.s.math;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestOperatorMath {
    @Before
    public void testBefore() {
        System.out.println("\n单元测试预处理");
    }

    @After
    public void testAfter(){
        System.out.println("单元测试处理结束");
    }

    @Test
    public void testAdd(){
        System.out.println("测试Add方法");
        OperatorMath operatorMath =new OperatorMath();
        int res =operatorMath.add(3,5);
        Assert.assertEquals(8,res);
    }

    @Test
    public void testMultiply(){
        System.out.println("测试Multipy方法");
        OperatorMath operatorMath=new OperatorMath();
        int res=operatorMath.multiply(3,5);
        Assert.assertEquals(15,res);
    }

    @Test
    public void testDiv(){
        System.out.println("测试div方法");
        OperatorMath operatorMath=new OperatorMath();
        int res=operatorMath.div(3,1);
        Assert.assertEquals(3,res);
    }
}
