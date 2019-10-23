package Tchat.netty;

import java.time.LocalDateTime;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * 处理消息的handler TextWebSocketFrame：在netty中，是用于websorket专门处理文本的对象，frame事消息的载体
 *
 */
public class ChatHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

	private static ChannelGroup clients = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {

		// 获取客户端传过来的消息
		String content = msg.text();
		System.out.println("接收到的数据：" + content);
		for (Channel channle : clients) {
			channle.writeAndFlush(new TextWebSocketFrame("[时间：]" + LocalDateTime.now() + "消息为" + content));
		}

		// 这个方法 和上面的for一致
//		 clients.writeAndFlush(new
//		 TextWebSocketFrame("[时间：]"+LocalDateTime.now())+"消息为"+content);
	}

	/**
	 * 当客户端连接服务端之后（打开连接） 获取客户端的channle，并且放到channelGroup中管理
	 */
	@Override
	public void handlerAdded(ChannelHandlerContext ctx) throws Exception {

		clients.add(ctx.channel());

	}

	@Override
	public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
//当触发handlerRemoved，channelgroup会自动移除客户端的channle
		// clients.remove(ctx.channel());
		System.out.println("客户端断开");
//		System.out.println(ctx.channel().id());
//		System.out.println(ctx.channel().id().asLongText());
//		System.out.println(ctx.channel().id().asShortText());
	}

}
