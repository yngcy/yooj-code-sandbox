package com.yocy.yoojcodesandbox;

import com.yocy.yoojcodesandbox.model.ExecuteCodeRequest;
import com.yocy.yoojcodesandbox.model.ExecuteCodeResponse;

/**
 * @author <a href="https://github.com/youngccy">YounGCY</a>
 */
public interface CodeSandbox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
