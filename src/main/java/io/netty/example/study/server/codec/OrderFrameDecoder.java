package io.netty.example.study.server.codec;

import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

/**
 * 处理 tcp 粘包 半包 首次处理器
 */
public class OrderFrameDecoder extends LengthFieldBasedFrameDecoder {

    public OrderFrameDecoder() {
        /**
         * 1.长度字段最长为多少
         * 2.长度字段的位移，从哪开始
         * 3.长度字段多长
         * 4.要不要调整字段长度
         * 5.要不要把头字段去掉
         */
        super(Integer.MAX_VALUE, 0,2, 0, 2);
    }
}
