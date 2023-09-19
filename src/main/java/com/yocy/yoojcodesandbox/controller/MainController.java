package com.yocy.yoojcodesandbox.controller;

import com.yocy.yoojcodesandbox.CodeSandbox;
import com.yocy.yoojcodesandbox.JavaNativeCodeSandbox;
import com.yocy.yoojcodesandbox.model.ExecuteCodeRequest;
import com.yocy.yoojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author <a href="https://github.com/youngccy">YounGCY</a>
 */
@RestController("/")
public class MainController {
    
    // 建议鉴权请求头和密钥
    private static final String AUTH_REQUEST_HEADER = "auth";
    private static final String AUTH_REQUEST_SECRET = "secretKey";
    
    
    @Resource
    private JavaNativeCodeSandbox javaNativeCodeSandbox;
    
    @GetMapping("/health")
    public String healthCheck() {
        return "ok";
    }
    
    @PostMapping("/executeCode")
    public ExecuteCodeResponse executeCode(@RequestBody ExecuteCodeRequest executeCodeRequest, HttpServletRequest request,
                                           HttpServletResponse response) {
        // 基本的认证
        String authHeader = request.getHeader(AUTH_REQUEST_HEADER);
        if (!AUTH_REQUEST_SECRET.equals(authHeader)) {
            response.setStatus(403);
            return null;
        }
        if (executeCodeRequest == null) {
            throw new RuntimeException("请求参数为空");
        }
        ExecuteCodeResponse executeCodeResponse = javaNativeCodeSandbox.executeCode(executeCodeRequest);
        System.out.println(executeCodeResponse);
        return executeCodeResponse;
    }
}
