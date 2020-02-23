package io.netty.example.study.common.auth;


import io.netty.example.study.common.Operation;
import io.netty.example.study.common.OperationResult;
import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class AuthOperation extends Operation {
    private final String userName;
    private final String password;


    @Override
    public OperationResult execute() {
        if("admin".equals(userName)){
            return new AuthOperationResult(Boolean.TRUE);
        }
        return new AuthOperationResult(Boolean.FALSE);
    }
}
