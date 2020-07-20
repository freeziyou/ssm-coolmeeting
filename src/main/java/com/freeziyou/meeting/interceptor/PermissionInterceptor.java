package com.freeziyou.meeting.interceptor;

import com.freeziyou.meeting.model.Employee;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Dylan Guo
 * @date 7/20/2020 14:15
 * @description 权限控制
 */
public class PermissionInterceptor implements HandlerInterceptor {
    AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        String requestURI = request.getRequestURI();
        if ("/".equals(requestURI) || "/doLogin".equals(requestURI) || "/register".equals(requestURI) || "/doReg".equals(requestURI)) {
            return true;
        }
        HttpSession session = request.getSession(true);
        // 从 session 中获取用户
        Employee currentuser = (Employee) session.getAttribute("currentuser");
        // 拦截路径 /admin/**
        if (antPathMatcher.match("/admin/**", requestURI)) {
            // 管理员权限, role = 2
            if (currentuser.getRole() == 2) {
                return true;
            } else {
                // 非管理员
                response.getWriter().write("forbidden");
                return false;
            }
        } else {
            // 其他路径
            if (currentuser != null) {
                return true;
            }
        }
        // currentuser 为 null, 跳转首页
        response.sendRedirect("/");
        return false;
    }
}
