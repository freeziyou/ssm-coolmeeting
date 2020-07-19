<!DOCTYPE html>
<html>
<head>
    <title>CoolMeeting会议管理系统</title>
    <link rel="stylesheet" href="styles/common.css"/>
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
            会议预定 > 修改会议室信息
        </div>
        <form>
            <fieldset>
                <legend>会议室信息</legend>
                <table class="formtable">
                    <tr>
                        <td>门牌号:</td>
                        <td>
                            <input id="roomnumber" type="text" value="201" maxlength="10"/>
                        </td>
                    </tr>
                    <tr>
                        <td>会议室名称:</td>
                        <td>
                            <input id="capacity" type="text" value="第一会议室" maxlength="20"/>
                        </td>
                    </tr>
                    <tr>
                        <td>最多容纳人数：</td>
                        <td>
                            <input id="roomcapacity" type="text" value="15"/>
                        </td>
                    </tr>
                    <tr>
                        <td>当前状态：</td>
                        <td>
                            <input type="radio" id="status" name="status" checked="checked" value="1"/><label
                                    for="status">启用</label>
                            <input type="radio" id="status" name="status"/><label for="status" value="0">停用</label>
                            <input type="radio" id="status" name="status"/><label for="status" value="-1">删除</label>
                        </td>
                    </tr>
                    <tr>
                        <td>备注：</td>
                        <td>
                            <textarea id="description" maxlength="200" rows="5" cols="60">本会议室配备了投影、幕布、音响设备。</textarea>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" class="command">
                            <input type="submit" value="确认修改" class="clickbutton"/>
                            <input type="button" class="clickbutton" value="返回" onclick="window.history.back();"/>
                        </td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </div>
</div>
<div class="page-footer">
    <hr/>
    更多问题，欢迎联系<a href="mailto:webmaster@eeg.com">管理员</a>
    <img src="images/footer.png" alt="CoolMeeting"/>
</div>
</body>
</html>