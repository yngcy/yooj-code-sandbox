package com.yocy.yoojcodesandbox.model;

import lombok.Data;

/**
 * 题目提交信息
 * 
 * @author <a href="https://github.com/youngccy">YounGCY</a>
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存
     */
    private Long memory;
    
    /**
     * 程序运行时间（ms）
     */
    private Long time;
}
