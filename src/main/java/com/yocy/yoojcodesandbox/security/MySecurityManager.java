package com.yocy.yoojcodesandbox.security;

import java.security.Permission;

/**
 * @author <a href="https://github.com/youngccy">YounGCY</a>
 */
public class MySecurityManager extends SecurityManager {

    // 检测所有权限
    @Override
    public void checkPermission(Permission perm, Object context) {
        super.checkPermission(perm, context);
    }

    // 检测程序是否可执行文件
    @Override
    public void checkExec(String cmd) {
        throw new SecurityException("checkExec 权限异常：" + cmd);
    }

    // 检测程序是否允许读文件
    @Override
    public void checkRead(String file) {
        throw new SecurityException("checkRead 权限异常：" + file);
    }

    // 检测程序是否允许写文件
    @Override
    public void checkWrite(String file) {
        throw new SecurityException("checkWrite 权限异常：" + file);
    }

    // 检测程序是或否允许删除文件
    @Override
    public void checkDelete(String file) {
        throw new SecurityException("checkDelete 权限异常：" + file);
    }

    // 检测程序是否连接网络
    @Override
    public void checkConnect(String host, int port) {
        throw new SecurityException("checkConnect 权限异常：" + host + ":" + port);
    }

    // 检查所有权限
    @Override
    public void checkPermission(Permission perm) {
        System.out.println("默认不做任何权限限制");
        super.checkPermission(perm);
    }
    
    
    
}
