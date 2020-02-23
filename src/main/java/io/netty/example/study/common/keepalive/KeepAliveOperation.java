package io.netty.example.study.common.keepalive;

import io.netty.example.study.common.Operation;
import io.netty.example.study.common.OperationResult;
import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class KeepAliveOperation extends Operation {

    private long time;

    public KeepAliveOperation(){this.time = System.nanoTime();}


    @Override
    public OperationResult execute() {
        return new KeepAliveOperationResult(time);
    }
}
