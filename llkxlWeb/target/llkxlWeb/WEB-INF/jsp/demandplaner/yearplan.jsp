<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: TAHUN
  Date: 2019/11/15
  Time: 15:41
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../header.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta content="IE=edge" http-equiv="X-UA-Compatible">
    <title>需求计划-年度计划界面</title>
    <!-- 告诉浏览器响应屏幕宽度 -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.7 -->
    <link href="<%=ctxPath%>/src/res/css/bootsrap.min.css" rel="stylesheet">
    <!-- 象形异体字 -->
    <link href="<%=ctxPath%>/src/res/fonts/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- 主题风格 -->
    <link href="<%=ctxPath%>/src/res/css/AdminLLKXL.min.css" rel="stylesheet">
    <!-- 皮肤 -->
    <link href="<%=ctxPath%>/src/res/css/_all-skins.min.css" rel="stylesheet">
    <!--谷歌字体 -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic"
          rel="stylesheet">
    <!--导入vue.js有网的时候推荐-->
    <script charset="UTF-8" src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
    <!--没网的时候-->
    <!--script src="<%=ctxPath%>/src/js/vue.js" type="text/javascript" charset="UTF-8"></script-->
    <style type="text/css">
        #mian-components {
            text-align: center;

        }

        .btn-default {
            margin-top: 10px;

            margin-right: 35px;
        }

        .table {
            text-align: center;
        }

        .table-mess {
            width: 300px;
            text-align: center;
        }

        .system-mess {
            width: 600px;
            text-align: center;
        }

    </style>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<%
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost/db_llkxl?serverTimezone=UTC","root","3228516");
    Statement statement=con.createStatement();
    ResultSet rs=statement.executeQuery("SELECT * FROM tb_department");
    List<String> list1=new ArrayList<String>();
    try{
        while(rs.next()){
            list1.add(rs.getString("dt_name"));
        }
    }catch(SQLException ex){
        System.out.println(ex.getMessage());
    }
    rs.close();
    con.close();
    statement.close();
%>

<div class="wrapper">
    <header class="main-header">
        <!-- Logo -->
        <a class="logo" href="#">
            <!-- 迷你标志为侧栏迷你50x50像素 -->
            <span class="logo-mini"><b>L</b>B</span>
            <!-- 常规状态和移动设备的徽标 -->
            <span class="logo-lg">LLKXL智能制造系统</span>
        </a>
        <!-- 标题导航栏:样式可以在Header .less中找到 -->
        <nav class="navbar navbar-static-top">
            <!-- 侧边栏切换按钮-->
            <a class="sidebar-toggle" data-toggle="push-menu" href="#" role="button">
                <span class="sr-only">Toggle navigation</span>
            </a>
            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- 用户帐号:风格可以在dropdown.less中找到 -->
                    <li class="dropdown user user-menu">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <span class="hidden-xs">琳琳开心力</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- User image -->
                            <li class="user-header">
                                <br>
                                <br>
                                <p>
                                    琳琳开心力 - web开发人员
                                    <small>2019.11.1</small>
                                </p>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
    <!-- 左列。包含徽标和边栏 -->
    <aside class="main-sidebar">
        <!-- 侧栏:style可以在sidebar.less中找到 -->
        <section class="sidebar">
            <!-- 侧栏菜单::style可以在sidebar.less中找到-->
            <ul class="sidebar-menu" data-widget="tree">
                <li class="header">主要导航</li>
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-link"></i> <span>需求计划</span>
                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu" style="display: none;">
                        <li>
                            <a href="./yearplan.jsp">年度需求计划</a>
                        </li>
                        <li>
                            <a href="urgentplantest.html">紧急需求计划</a>
                        </li>
                        <li>
                            <a href="monthplantest.html">月度需求计划</a>
                        </li>
                        <li>
                            <a href="demandplanningenquiry.html">需求计划查询/修改</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </section>
        <!-- /.侧边栏描述 -->
    </aside>
    <form id="fm-register" action="admin.do" class="content" method="post">
    <!-- 内容包装器。包含页面内容 -->
        <form form-control>
    <div class="content-wrapper">

        <!-- 内容页眉(页眉） -->
        <section class="content-header">
            <h2 align="center">年度计划</h2>
        </section>
        <!-- 主要内容 -->
        <section class="content">
            <!--年度计划界面-->
            <div id="mian-components">
                <!--按钮-->
                <div id="button-components">
                    <div aria-label="..." class="btn-group" role="group">
                        <input class="btn btn-default" id="bt-register" type="button" value="保存" onclick="sub();"/>
                        <button class="btn btn-default" type="button" >复制</button>
                        <button class="btn btn-default" type="button">提交</button>
                        <button class="btn btn-default"
                                onclick="window.location.href='requirementsPlanPrintPreviewAndExportPage.html?pname=年度'"
                                type="button">
                            打印
                        </button>
                        <button class="btn btn-default" type="button">导出</button>
                        <button class="btn btn-default" type="button">附件</button>
                        <button class="btn btn-default" type="button">提醒</button>
                        <button class="btn btn-default" type="button">删除</button>
                        <button class="btn btn-default" type="button">关闭/退出</button>
                    </div>
                </div>
                <!--/按钮-->
                <hr/>
                <!--信息输入界面-->
                <div class="input-components" id="input-components">
                    <table class="table  table-condensed table-responsive">
                        <tr>
                            <td>需求计划类型</td>
                            <td>
                                <input  id="plan_type" name="plan_type" readonly="readonly"  type="text" value="年度计划" required/>
                                <span class="msg-success"></span>
                            </td>

                            <td>需求计划编码</td>
                            <td>
                                <input id="num" name="num" readonly="readonly"  type="text" required/>
                                <span class="msg-success"></span>
                            </td>

                            <td>需求计划名称</td>
                            <td>
                                <input id="plan_name" name="plan_name"  type="text" required/>
                                <span class="msg-default">请输入需求计划名称</span>
                            </td>

                            <td>备注</td>
                            <td>
                                <input id="remark" name="remark"  type="text" maxlength="100" required/>
                                <span class="msg-success"></span>
                            </td>
                        </tr>
                        <tr>
                            <td>需求部门</td>
                            <td>
                                <select id="dtName" name="dtName">
                                <%for(int i=0;i<list1.size();i++){%>
                                <option><%=list1.get(i)%></option>
                                <%}%>
                            </select>
                            </td>
                            <td>需求人员</td>
                            <td>
                                <input id="need_man" name="need_man"  type="text" minlength="1" maxlength="10" required/>
                                <span class="msg-default">请输入需求人员</span>
                            </td>
                            <td>需求计划状态</td>
                            <td>
                                <input id="av_status" name="av_status" readonly="readonly"  type="text" required/>
                                <span class="msg-success"></span>
                            </td>
                            <td>审批状态</td>
                            <td>
                                <input id="av_status" name="av_status" readonly="readonly" type="text" required/>
                                <span class="msg-success"></span>
                            </td>
                        </tr>
                        <tr>
                            <td>是否预算内计划</td>
                            <td>
                                <input id="budget" name="budget" type="checkbox" value="false" required/>
                                <span class="msg-success"></span>
                            </td>
                        </tr>
                    </table>
                </div>
                <!--/信息输入界面-->
                <!--标签页-->
                <div class="labelPage">
                    <ul class="nav nav-tabs">
                        <li class="active">
                            <a @click="isBasicInformation" class="tab-default" data-toggle="tab" href="#tab_1">基本信息</a>
                        </li>
                        <li>
                            <a @click="isProcessnIformation" data-toggle="tab" href="#tab_2">流程信息</a>
                        </li>
                        <li>
                            <a @click="isSystemInformation" data-toggle="tab" href="#tab_3">系统信息</a>
                        </li>
                    </ul>
                    <!-- end 导航条 -->
                    <!-- begin 导航条下方的内容 -->
                    <div class="tab-content">
                        <div class="tab-pane active" id="tab_1">
                            <div>
                                <table class="table">
                                    <tr>
                                        <td>行号</td>
                                        <td>物料分类编码</td>
                                        <td>物料分类名称</td>
                                        <td>物料编码</td>
                                        <td>物料名称</td>
                                        <td>规格</td>
                                        <td>型号</td>
                                        <td>单位</td>
                                    </tr>
                                    <tr>
                                        <td>1</td>
                                        <td>
                                            <select  style="width: 60%;height: 25px ;font-size: 15px" id="mr_cf_num"  name="mr_cf_num"  onchange="changeNum()">
                                                <option  >请选择</option>
                                                  <c:forEach items="${mr_cf_nums}" var="lc">
                                                    <option value="${lc.mrCfNum }"> ${lc.mrCfNum }</option>
                                                   </c:forEach>
                                            </select>
                                        </td>
                                        <td>
                                         <input  style="width: 60%;height: 25px ;text-align:center" type="text"  name="mr_cf_name" id="mr_cf_name" readonly required>
                                            <span class="msg-success"></span>
                                        </td>
                                        <td>
                                            <select style="width: 60%;height: 25px ;" id="mr_num"  name="mr_num"  onchange="changeNum1()">
                                                <option>请选择</option>
                                            </select>
                                        </td>
                                        <td>
                                            <input  style="width: 60%;height: 25px ;text-align:center" type="text"  name="mr_name" id="mr_name" readonly required>
                                            <span class="msg-success"></span>
                                        </td>
                                        <td>
                                            <input  id="specification" name="specification" maxlength="20" style="width:60%;text-align:center;height: 25px" type="text" required/>
                                            <span class="msg-default hidden">请输入规格</span>
                                        </td>
                                        <td>
                                            <input  style="height: 25px;width: 60%;text-align:center" id="type" name="type" maxlength="10" type="text" required/>
                                            <span class="msg-default hidden">请输入型号</span>
                                        </td>
                                        <td>
                                            <select  style="width: 40%;height: 25px ;" id="page"  name="page">
                                                <option  >请选择</option>
                                                  <c:forEach items="${tbUnits}" var="lc">
                                                    <option value="${lc.pages }"> ${lc.pages }</option>
                                                   </c:forEach>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td></td>
                                        <td>需求数量</td>
                                        <td>需求月份</td>
                                        <td>需求日期</td>
                                        <td>货源是否确定</td>
                                        <td>期望供应商</td>
                                        <td>固定供应商</td>
                                        <td>备注</td>
                                        <td>物料追踪码</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>
                                            <input  style="width: 50%;height:  25px;text-align:center" type="text"  name="need_num" id="need_num" maxlength="8" required>
                                            <span class="msg-default hidden">请输入需求数量</span>
                                        </td>
                                        <td>
                                            <input   style="width: 70%;height: 25px;text-align:center"  type="month"  name="need_month" id="need_month" required/>
                                            <span class="msg-default hidden">请选择需求月份</span>
                                        </td>
                                        <td>
                                            <input   style="width: 70%;height: 25px;text-align:center"  type="date" name="need_time"  id="need_time" required/>
                                            <span class="msg-default hidden">请选择需求日期</span>
                                        </td>
                                        <td>
                                            <select style="height:25px;width:  30%" name="budget" id="budget">
                                                <option value="0">否</option>
                                                <option value="1">是</option>
                                            </select>
                                        </td>
                                        <td>
                                            <select  style="width: 60%;height: 25px ;" id="supply1"  name="supply1">
                                            <option  >请选择</option>
                                              <c:forEach items="${tbsupplies}" var="lc">
                                                <option value="${lc.supply }"> ${lc.supply }</option>
                                               </c:forEach>
                                            </select>
                                        </td>
                                        <td>
                                            <select  style="width: 60%;height: 25px ;" id="supply2"  name="supply2">
                                                <option  >请选择</option>
                                                  <c:forEach items="${tbsupplies}" var="lc">
                                                    <option value="${lc.supply }"> ${lc.supply }</option>
                                                   </c:forEach>
                                            </select>
                                        </td>
                                        <td>
                                            <input  id="remarks" name="remarks" style="width:60%;text-align:center;height: 25px" type="text" maxlength="100" required />
                                            <span class="msg-success"></span>
                                        </td>
                                        <td>
                                            <input id="mr_trace" name="mr_trace" readonly="readonly" style="width:80%;text-align:center;background:#0073B7;height: 25px" type="text" required/>
                                            <span class="msg-success"></span>
                                        </td>
                                    </tr>
                                </table>

                            </div>
                        </div>
                        <div class="tab-pane fade" id="tab_2">
                            <div>
                                <table class="table-mess">
                                    <tr>
                                        <th></th>
                                        <th>审批人</th>
                                        <th>审批时间</th>
                                        <th>审批意见</th>
                                        <th>说明</th>
                                    </tr>
                                    <tr>
                                        <td>1</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                        <div class="tab-pane fade" id="tab_3">
                            <div class="system-mess">
                                <span>编制人<input id="createman" name="createman" readonly="readonly" style="text-align:center;background:#0073B7;" type="text" required/>
                                    <span class="msg-success"></span>
                                </span>
                                <span>编制时间<input id="createtime" name="createtime" readonly="readonly" style="text-align:center;background:#0073B7;" type="text" required/>
                                <span class="msg-success"></span>
                                </span>
                                <br><br>
                                <span>修改人<input id="updataman" name="updataman" readonly="readonly" style="text-align:center;background:#0073B7;" type="text" required/>
                                <span class="msg-success"></span>
                                </span>
                                <span>修改时间<input id="updatatime" name="updatatime" readonly="readonly" style="text-align:center;background:#0073B7;" type="text" required/>
                                    <span class="msg-success">
                                    </span>
                                </span>
                                <br> <br>
                                <span>修改原因<input id="cause" name="cause" readonly="readonly" style="text-align:left; background:#0073B7;" type="text" required/>
                                    <span class="msg-success"></span>
                                </span>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /导航条下方的内容 -->
                <!--/标签页-->
                <!--/年度计划界面-->
            </div>
        </section>
    </div>
        </form>
    </form>
    <!-- /.主要内容 -->
    <footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 3.0.0
        </div>
        <strong>CRAETE TO 2019.11.1AdminLLKXL.</strong> 保留所有权
    </footer>


<%--    <script type="text/javascript">--%>
<%--        var mianComponent = new Vue({--%>
<%--            el: '#mian-components',--%>
<%--            data: {--%>
<%--                demandPlan: '年度计划', //需求计划类型--%>
<%--                demandPlanCode: '', //需求计划编码--%>
<%--                demandPlanName: ' ', //需求计划名称--%>
<%--                demandPlanNote: '', //备注--%>
<%--                departmentOfDemand: '', //需求部门--%>
<%--                departmentOfPeaple: '', //需求人员--%>
<%--                demandPlanState: '', //需求状态--%>
<%--                examinationState: '', //审批状态--%>
<%--                demandPlanningMonth: '', //需求计划月份--%>
<%--                plannedBudget: false, //是否预算内计划--%>
<%--                materialClassificationCode: '', //物料分类编码--%>
<%--                materialClassificationName: '', //物料分类名称--%>
<%--                materialName: '', //物料名称--%>
<%--                specifications: '', //规格--%>
<%--                model: '', //型号--%>
<%--                unit: '', //单位--%>
<%--                quantityDemanded: '', //需求数量--%>
<%--                demandMonth: '', //需求月份--%>
<%--                demandData: '', //需求日期--%>
<%--                isGoodsConfirmed: '', //货源是否确定--%>
<%--                expectedSupplier: '', //期望供应商--%>
<%--                fixedSupplier: '', //固定供应商--%>
<%--                note: '', //备注--%>
<%--                materialTrackingCode: '', //物料追踪码--%>
<%--                editPeo: '',//编辑人--%>
<%--                editTime: '',//编辑时间--%>
<%--                changePeo: '',//修改人--%>
<%--                changeTime: '',//修改时间--%>
<%--                changeCause: '',//修改原因--%>
<%--                obj: {--%>
<%--                    display: 'none'--%>
<%--                },--%>
<%--                isGoodsConfirmedList: [],--%>
<%--                expectedSupplierList: [],--%>
<%--                fixedSupplierList: [],--%>
<%--            },--%>
<%--            methods: {--%>
<%--                isProcessnIformation: function () {--%>
<%--                    this.obj.display = 'inline';--%>
<%--                },--%>
<%--                isBasicInformation: function () {--%>
<%--                    this.obj.display = 'none';--%>
<%--                },--%>
<%--                isSystemInformation: function () {--%>
<%--                    this.obj.display = 'inline';--%>
<%--                },--%>
<%--            }--%>

<%--        });--%>
<%--    </script>--%>
    <!-- ./包装器 -->
    <!-- jQuery 3 -->
    <script src="<%=ctxPath%>/src/res/js/jquery.min.js"></script>
    <!-- Bootstrap 3.3.7 -->
    <script src="<%=ctxPath%>/src/res/js/bootstrap.min.js"></script>
    <!-- 侧栏打开/关闭代码 -->
    <script src="<%=ctxPath%>/src/res/js/adminllkxl.min.js"></script>
</div>

<script type="text/javascript">
    function sub() {
        var inputs = document.getElementsByTagName("input");
        var count = 0;
        alert(inputs.length);
        for (var i = 0; i < inputs.length ; i++) {
            alert(inputs[i].nextElementSibling.className+" "+i)
            var msg = inputs[i].nextElementSibling;
            if (msg.className == "msg-success") {
                count++;
            }
        }
        alert(count)
        if (count == 22) {
            alert(count)
            document.getElementById("fm-register").submit();
        } else {
            alert("请完善信息！");
        }
    }
</script>

<script type="javascript">

    $('#need_man').blur(function () {
        if (this.validity.valueMissing) {
            this.nextElementSibling.innerHTML = '需求人员不能为空';
            this.nextElementSibling.className = 'msg-error';
            this.setCustomValidity('需求人员不能为空');
            alert("需求人员不能为空")
        }
            else if (this.validity.tooShort) {
            this.nextElementSibling.innerHTML = '姓名长度在1到10位之间';
            this.nextElementSibling.className = 'msg-error';
            this.setCustomValidity('姓名长度在1到10位之间');
        }
        else {
            this.nextElementSibling.className = 'msg-success';
            this.setCustomValidity('');
        }
    });

    $('#need_man').focus(function () {
        this.nextElementSibling.className = 'msg-default';
        alert("需求人员不能为空")
    });

    $('#specification').blur(function () {
        if (this.validity.valueMissing) {
            this.nextElementSibling.innerHTML = '规格不能为空';
            this.nextElementSibling.className = 'msg-error';
            this.setCustomValidity('规格不能为空');
        } else {
            this.nextElementSibling.className = 'msg-success';
            this.setCustomValidity('');
        }
    });
    $('#specification').focus(function () {
        this.nextElementSibling.className = 'msg-default';
    });

    $('#type').blur(function () {
        if (this.validity.valueMissing) {
            this.nextElementSibling.innerHTML = '型号不能为空';
            this.nextElementSibling.className = 'msg-error';
            this.setCustomValidity('型号不能为空');
        } else {
            this.nextElementSibling.className = 'msg-success';
            this.setCustomValidity('');
        }
    });
    $('#type').focus(function () {
        this.nextElementSibling.className = 'msg-default';
    });

    $('#need_num').blur(function () {
        if (this.validity.valueMissing) {
            this.nextElementSibling.innerHTML = '需求数量不能为空';
            this.nextElementSibling.className = 'msg-error';
            this.setCustomValidity('需求数量不能为空');
        } else {
            this.nextElementSibling.className = 'msg-success';
            this.setCustomValidity('');
        }
    });
    $('#need_num').focus(function () {
        this.nextElementSibling.className = 'msg-default';
    });

    $('#need_month').blur(function () {
        if (this.validity.valueMissing) {
            this.nextElementSibling.innerHTML = '需求月份不能为空';
            this.nextElementSibling.className = 'msg-error';
            this.setCustomValidity('需求月份不能为空');
        } else {
            this.nextElementSibling.className = 'msg-success';
            this.setCustomValidity('');
        }
    });
    $('#need_month').focus(function () {
        this.nextElementSibling.className = 'msg-default';
    });

    $('#need_time').blur(function () {
        if (this.validity.valueMissing) {
            this.nextElementSibling.innerHTML = '需求日期不能为空';
            this.nextElementSibling.className = 'msg-error';
            this.setCustomValidity('需求日期不能为空');
        } else {
            this.nextElementSibling.className = 'msg-success';
            this.setCustomValidity('');
        }
    });
    $('#need_time').focus(function () {
        this.nextElementSibling.className = 'msg-default';
    });
</script>

<script type="text/javascript">
    function changeNum(){
        var mr_cf_num = document.getElementById("mr_cf_num").value
        $.ajax({
            type:'POST',
            dataType:'text',
            url:'<%=ctxPath%>/add/addName',
            data:{
                mr_cf_num : mr_cf_num
            },

            success:function(data){
                var secondCategoryObj = document.getElementById("mr_num");
                secondCategoryObj.innerHTML = "<option value=''>请选择</option>";
                //解析json为数组
                var data = eval("("+data+")");
                var dataList = data.tasks;
                if (dataList!= null) { //如果没有这一步，js会报length null之类的
                    for (var i = 0; i < dataList.length; i++)//遍历
                    {
                        var MObj = dataList[i];
                        var mr_num = MObj.id;
                        var mr_cf_name = MObj.name;
                        //进行添加到标签里
                        var value = document.getElementById("mr_cf_name");
                        value.value = mr_cf_name;
                        secondCategoryObj.innerHTML = secondCategoryObj.innerHTML + "<option value='" + mr_num + "'>" + mr_num + "</option>";
                    }
                }
            }
        });
    }

    function changeNum1(){
        var mr_num = document.getElementById("mr_num").value
        $.ajax({
            type:'POST',
            dataType:'text',
            url:'<%=ctxPath%>/add/addName',
            data:{
                mr_num : mr_num
            },

            success:function(data){
                var secondCategoryObj = document.getElementById("mr_name");
                secondCategoryObj.innerHTML = "<option value=''>请选择</option>";
                //解析json为数组
                var data = eval("("+data+")");
                var dataList = data.tasks;
                if (dataList!= null) { //如果没有这一步，js会报length null之类的
                    for(var i=0;i<dataList.length;i++)//遍历
                    {
                        var MObj = dataList[i];
                        var mr_name = MObj.name;
                        //进行添加到标签里
                        var value = document.getElementById("mr_name");
                        value.value = mr_name;
                    }
                }
            }
        });
    }

    function changeNums(){
        var need_month = document.getElementById("need_month").value
        alert("need_month"+need_month)
        var time="";
        $.ajax({
            type:'POST',
            dataType:'text',
            url:'<%=ctxPath%>/add/updataTime',
            data:{
                need_month : need_month
            },
            success:function(data){
                var secondCategoryObj = document.getElementById("need_month");
                //解析json为数组
                var data = eval("("+data+")");
                var dataList = data.tasks;
                if (dataList!= null) { //如果没有这一步，js会报length null之类的
                    var MObj = dataList[0];
                    time = MObj.time;
                    //进行添加到标签里
                    var value = document.getElementById("need_month");
                    alert("time"+time)
                    value.value(time)
                    //value.value = time;
                }
            }
        });
    }

</script>


</body>
</html>
