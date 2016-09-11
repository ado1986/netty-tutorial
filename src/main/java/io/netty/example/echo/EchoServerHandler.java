package io.netty.example.echo;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/**
 * 回写到客户端
 * 
 * @author ado1986
 *
 * @create_time 2016年9月11日 下午9:28:36
 */
public class EchoServerHandler extends ChannelHandlerAdapter {
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		ctx.write(msg);
		ctx.flush();
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		cause.printStackTrace();
		ctx.close();
	}
}
