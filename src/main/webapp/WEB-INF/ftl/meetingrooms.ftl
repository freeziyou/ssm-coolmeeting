<!DOCTYPE html>
<html>
<head>
    <title>CoolMeeting会议管理系统</title>
    <link rel="stylesheet" href="/styles/common.css"/>
</head>
<body>

<#include 'includes/top.ftl'>

<div class="page-body">
    <#include 'includes/leftMenu.ftl'>

    <div class="page-content">
        <div class="content-nav">
            会议预定 > 查看会议室
        </div>
        <table class="listtable">
            <caption>所有会议室:</caption>
            <tr class="listheader">
                <th>门牌编号</th>
                <th>会议室名称</th>
                <th>容纳人数</th>
                <th>当前状态</th>
                <th>操作</th>
            </tr>
            <#if mrs??>
                <#list mrs as rm>
                    <tr>
                        <td>${rm.roomnum}</td>
                        <td>${rm.roomname}</td>
                        <td>${rm.capacity}</td>
                        <#if rm.status == 0>
                            <td>启用</td>
                        <#else >
                            <td>已占用</td>
                        </#if>
                        <#--                        <td>${(rm.status==0)? String('启用', '已占用')}</td>-->
                        <td>
                            <a class="clickbutton" href="/roomdetails?roomid=${rm.roomid}">查看详情</a>
                        </td>
                    </tr>
                </#list>
            </#if>
        </table>
    </div>
</div>
<div class="page-footer">
    <hr/>
    更多问题，欢迎联系<a href="mailto:webmaster@eeg.com">管理员</a>
    <img src="/images/footer.png" alt="CoolMeeting"/>
</div>
</body>
</html>