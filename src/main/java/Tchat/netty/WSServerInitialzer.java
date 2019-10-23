package Tchat.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;

public class WSServerInitialzer extends ChannelInitializer<SocketChannel> {
	@Override
	protected void initChannel(SocketChannel ch) throws Exception {
		ChannelPipeline pipeline = ch.pipeline();
		// websocket 基于http协议，所以要有http编解码器
		pipeline.addLast(new HttpServerCodec());
		// 对大数据流的支持
		pipeline.addLast(new ChunkedWriteHandler());
		// 对httpMessage 进行聚合，聚合成FullHttpRequset或FullHttpResponse,
		// 几乎在netty中的编程都会用到此handler
		pipeline.addLast(new HttpObjectAggregator(1024 * 64));

		// -----------------以上是HTTP协议支持---------------------------

		// websocket 服务器处理的协议，用于指定给客户端连接访问的路由
		// 本handler 会帮你处理复杂的事，
		// 会帮你处理握手动作：handsharing（close，ping，pong） ping（请求）+pong（相应）=心跳
		// 对于websocket 来说，都是以frames进行传输，不同数据类型对应的frames也不同

		pipeline.addLast(new WebSocketServerProtocolHandler("/ws"));
		pipeline.addLast(new ChatHandler());

	}

}
