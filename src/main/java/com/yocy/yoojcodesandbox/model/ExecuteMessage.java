package com.yocy.yoojcodesandbox.model;

import lombok.Data;

/**
 * 进程执行信息
 * 
 * @author <a href="https://github.com/youngccy">YounGCY</a>
 */
@Data
public class ExecuteMessage {
    private Integer exitValue;
    
    private String message;
    
    private String errorMessage;
    
    private Long time;
    
    private Long memory;
}
