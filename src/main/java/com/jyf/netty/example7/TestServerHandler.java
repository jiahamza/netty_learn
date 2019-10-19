package com.jyf.netty.example7;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TestServerHandler extends SimpleChannelInboundHandler<MultiMessage.Who> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MultiMessage.Who msg) throws Exception {
        if (msg.getDataType() == MultiMessage.Who.DataType.StudentType) {
            MultiMessage.Student student = msg.getStudent();
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getAddress());
        } else if (msg.getDataType() == MultiMessage.Who.DataType.AnimalType) {
            MultiMessage.Animal animal = msg.getAnimal();
            System.out.println(animal.getName());
            System.out.println(animal.getAge());
        } else {
            MultiMessage.Plant plant = msg.getPlant();
            System.out.println(plant.getName());
            System.out.println(plant.getAge());
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
