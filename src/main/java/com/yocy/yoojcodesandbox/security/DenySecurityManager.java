package com.yocy.yoojcodesandbox.security;

import java.security.Permission;

/**
 * @author <a href="https://github.com/youngccy">YounGCY</a>
 */
public class DenySecurityManager extends SecurityManager {
    
    // 检查所有权限
    @Override
    public void checkPermission(Permission perm) {
       throw new SecurityException("权限异常" + perm.toString());
    }
}
