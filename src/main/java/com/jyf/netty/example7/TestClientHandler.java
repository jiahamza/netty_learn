package com.jyf.netty.example7;

import com.jyf.netty.example6.DataInfo;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Random;

public class TestClientHandler extends SimpleChannelInboundHandler<DataInfo.Student> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DataInfo.Student msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        int randomInt = new Random().nextInt(3);
        MultiMessage.Who who = null;
        if (0 == randomInt) {
            who = MultiMessage.Who.newBuilder().
                    setDataType(MultiMessage.Who.DataType.StudentType).
                    setStudent(MultiMessage.Student.newBuilder()
                            .setName("学生")
                            .setAge(12)
                            .setAddress("深圳")
                            .build())
                    .build();
        } else if (1 ==randomInt) {
            who = MultiMessage.Who.newBuilder().
                    setDataType(MultiMessage.Who.DataType.AnimalType).
                    setAnimal(MultiMessage.Animal.newBuilder()
                            .setName("狗子")
                            .setAge(3)
                            .build())
                    .build();
        } else {
            who = MultiMessage.Who.newBuilder().
                    setDataType(MultiMessage.Who.DataType.PlantType).
                    setPlant(MultiMessage.Plant.newBuilder()
                            .setName("玉米")
                            .setAge(1)
                            .build())
                    .build();
        }
        ctx.writeAndFlush(who);
    }
}
