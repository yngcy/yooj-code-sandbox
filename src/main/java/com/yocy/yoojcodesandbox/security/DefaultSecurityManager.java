package com.yocy.yoojcodesandbox.security;

import java.security.Permission;

/**
 * @author <a href="https://github.com/youngccy">YounGCY</a>
 */
public class DefaultSecurityManager extends SecurityManager {
    
    // 检查所有权限
    @Override
    public void checkPermission(Permission perm) {
        System.out.println("默认不做任何权限限制");
        super.checkPermission(perm);
    }
    
    
}
