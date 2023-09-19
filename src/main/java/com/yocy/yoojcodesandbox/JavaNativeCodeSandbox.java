package com.yocy.yoojcodesandbox;

import com.yocy.yoojcodesandbox.model.ExecuteCodeRequest;
import com.yocy.yoojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/**
 * Java 原生实现代码沙箱（直接复用模板方法）
 * 
 * @author <a href="https://github.com/youngccy">YounGCY</a>
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}
