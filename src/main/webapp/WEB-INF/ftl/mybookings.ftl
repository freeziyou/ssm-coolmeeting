<!DOCTYPE html>
<html>
<head>
    <title>CoolMeeting会议管理系统</title>
    <link rel="stylesheet" href="styles/common.css"/>
    <style type="text/css">

    </style>
</head>
<body>

<#include 'top.ftl'>

<div class="page-body">
    <div class="page-sidebar">
        <div class="sidebar-menugroup">
            <div class="sidebar-grouptitle">个人中心</div>
            <ul class="sidebar-menu">
                <li class="sidebar-menuitem"><a href="notifications.ftl">最新通知</a></li>
                <li class="sidebar-menuitem active"><a href="mybookings.ftl">我的预定</a></li>
                <li class="sidebar-menuitem"><a href="mymeetings.ftl">我的会议</a></li>
            </ul>
        </div>
        <div class="sidebar-menugroup">
            <div class="sidebar-grouptitle">人员管理</div>
            <ul class="sidebar-menu">
                <li class="sidebar-menuitem"><a href="departments.ftl">部门管理</></li>
                <li class="sidebar-menuitem"><a href="register.ftl">员工注册</a></li>
                <li class="sidebar-menuitem"><a href="approveaccount.ftl">注册审批</a></li>
                <li class="sidebar-menuitem"><a href="searchemployees.ftl">搜索员工</a></li>
            </ul>
        </div>
        <div class="sidebar-menugroup">
            <div class="sidebar-grouptitle">会议预定</div>
            <ul class="sidebar-menu">
                <li class="sidebar-menuitem"><a href="addmeetingroom.ftl">添加会议室</a></li>
                <li class="sidebar-menuitem"><a href="meetingrooms.ftl">查看会议室</a></li>
                <li class="sidebar-menuitem"><a href="bookmeeting.ftl">预定会议</a></li>
                <li class="sidebar-menuitem"><a href="searchmeetings.ftl">搜索会议</a></li>
            </ul>
        </div>
    </div>
    <div class="page-content">
        <div class="content-nav">
            个人中心 > 我的预定
        </div>
        <table class="listtable">
            <caption>我预定的会议：</caption>
            <tr class="listheader">
                <th>会议名称</th>
                <th>会议室名称</th>
                <th>会议开始时间</th>
                <th>会议结束时间</th>
                <th>会议预定时间</th>
                <th>操作</th>
            </tr>
            <tr>
                <td>业务洽谈会</td>
                <td>第一会议室</td>
                <td>2013-10-12 8:00</td>
                <td>2013-10-12 12:00</td>
                <td>2013-10-10 16:00</td>
                <td>
                    <a class="clickbutton" href="mymeetingdetails.ftl">查看/撤销</a>
                </td>
            </tr>
            <tr>
                <td>业务洽谈会</td>
                <td>第一会议室</td>
                <td>2013-10-12 8:00</td>
                <td>2013-10-12 12:00</td>
                <td>2013-10-10 16:00</td>
                <td>
                    <a class="clickbutton" href="mymeetingdetails.ftl">查看/撤销</a>
                </td>
            </tr>
            <tr>
                <td>业务洽谈会</td>
                <td>第一会议室</td>
                <td>2013-10-12 8:00</td>
                <td>2013-10-12 12:00</td>
                <td>2013-10-10 16:00</td>
                <td>
                    <a class="clickbutton" href="mymeetingdetails.ftl">查看/撤销</a>
                </td>
            </tr>
            <tr>
                <td>业务洽谈会</td>
                <td>第一会议室</td>
                <td>2013-10-12 8:00</td>
                <td>2013-10-12 12:00</td>
                <td>2013-10-10 16:00</td>
                <td>
                    <a class="clickbutton" href="mymeetingdetails.ftl">查看/撤销</a>
                </td>
            </tr>
            <tr>
                <td>业务洽谈会</td>
                <td>第一会议室</td>
                <td>2013-10-12 8:00</td>
                <td>2013-10-12 12:00</td>
                <td>2013-10-10 16:00</td>
                <td>
                    <a class="clickbutton" href="mymeetingdetails.ftl">查看/撤销</a>
                </td>
            </tr>
            <tr>
                <td>业务洽谈会</td>
                <td>第一会议室</td>
                <td>2013-10-12 8:00</td>
                <td>2013-10-12 12:00</td>
                <td>2013-10-10 16:00</td>
                <td>
                    <a class="clickbutton" href="mymeetingdetails.ftl">查看/撤销</a>
                </td>
            </tr>
            <tr>
                <td>业务洽谈会</td>
                <td>第一会议室</td>
                <td>2013-10-12 8:00</td>
                <td>2013-10-12 12:00</td>
                <td>2013-10-10 16:00</td>
                <td>
                    <a class="clickbutton" href="mymeetingdetails.ftl">查看/撤销</a>
                </td>
            </tr>
            <tr>
                <td>业务洽谈会</td>
                <td>第一会议室</td>
                <td>2013-10-12 8:00</td>
                <td>2013-10-12 12:00</td>
                <td>2013-10-10 16:00</td>
                <td>
                    <a class="clickbutton" href="mymeetingdetails.ftl">查看/撤销</a>
                </td>
            </tr>
            <tr>
                <td>业务洽谈会</td>
                <td>第一会议室</td>
                <td>2013-10-12 8:00</td>
                <td>2013-10-12 12:00</td>
                <td>2013-10-10 16:00</td>
                <td>
                    <a class="clickbutton" href="mymeetingdetails.ftl">查看/撤销</a>
                </td>
            </tr>
            <tr>
                <td>业务洽谈会</td>
                <td>第一会议室</td>
                <td>2013-10-12 8:00</td>
                <td>2013-10-12 12:00</td>
                <td>2013-10-10 16:00</td>
                <td>
                    <a class="clickbutton" href="mymeetingdetails.ftl">查看/撤销</a>
                </td>
            </tr>
        </table>
    </div>
</div>
<div class="page-footer">
    <hr/>
    更多问题，欢迎联系<a href="mailto:webmaster@eeg.com">管理员</a>
    <img src="images/footer.png" alt="CoolMeeting"/>
</div>
</body>
</html>