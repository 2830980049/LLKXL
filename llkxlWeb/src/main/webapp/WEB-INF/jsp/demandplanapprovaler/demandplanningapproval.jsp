<%--
  Created by IntelliJ IDEA.
  User: TAHUN
  Date: 2019/11/15
  Time: 15:49
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../header.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta content="IE=edge" http-equiv="X-UA-Compatible">
    <title>需求计划审批</title>
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

        .main-footer {
            margin-bottom: 0px;
        }
    </style>
</head>

<body class="hold-transition skin-blue sidebar-mini">
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
                            <a href="../DemandPlan/YearPlantest.html">年度需求计划</a>
                        </li>
                        <li>
                            <a href="../DemandPlan/UrgentPlantest.html">紧急需求计划</a>
                        </li>
                        <li>
                            <a href="../DemandPlan/MonthPlantest.html">月度需求计划</a>
                        </li>
                        <li>
                            <a href="../DemandPlan/demandPlanningEnquiry.html">需求计划查询/修改</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </section>
        <!-- /.侧边栏描述 -->
    </aside>
    <!-- 内容包装器。包含页面内容 -->
    <div class="content-wrapper">

        <!-- 内容页眉(页眉） -->
        <section class="content-header">
            <h2 align="center">需求计划审批</h2>
        </section>
        <!-- 主要内容 -->
        <!--
          <section class="content">  -->
        <!--需求计划查询/修改面-->
        <div class="container-fluid">
            <div class="row">
                <!--分类查看表-->
                <div class="col-md-1">
                    <div>
                        <!-- Single button -->
                        <div class="btn-group">
                            <button aria-expanded="false" aria-haspopup="true" class="btn btn-default dropdown-toggle"
                                    data-toggle="dropdown" type="button">
                                分类查看 <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu">
                                <li><a href="#">待审批需求计划</a></li>
                                <li><a href="#">以审批需求计划</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <!--分类查看表end-->
                <!--表内容-->
                <div class="col-md-11">
                    <div>
                        <!--表格内容-->
                        <table class="table">
                            <tr>
                                <td>行号</td>
                                <td>选择</td>
                                <td>需求计划编码</td>
                                <td>需求计划类型</td>
                                <td>审批状态</td>
                                <td>需求计划状态</td>
                                <td>需求部门</td>
                                <td>需求计划月份</td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td><input id="select" type="checkbox" value="isTrue">
                                    <label for="select"></label></td>
                                <td><input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/></td>

                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td><input id="select" type="checkbox" value="isTrue">
                                    <label for="select"></label></td>
                                <td><input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/></td>

                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td><input id="select" type="checkbox" value="isTrue">
                                    <label for="select"></label></td>
                                <td><input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/></td>

                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td><input id="select" type="checkbox" value="isTrue">
                                    <label for="select"></label></td>
                                <td><input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/></td>

                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                                <td>
                                    <input id="" name="" readonly="readonly"
                                           style="width:65px;text-align:center;background:#0073B7;"
                                           type="text"/>
                                </td>
                            </tr>
                        </table>
                        <!--表格内容-->
                    </div>
                    <div align="center">
                        <ul class="pagination">
                            <li><a href="#">&laquo;</a></li>
                            <li><a href="#">1</a></li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li><a href="#">5</a></li>
                            <li><a href="#">&raquo;</a></li>
                        </ul>
                    </div>
                    <!--审批意见及提价按钮等等-->
                    <div align="center" style="margin-top:100px ;">
                        <div style="display:inline-block ;vertical-align: middle;">
                            <span>审批意见：</span>
                            <textarea placeholder="请不要超过100字" style="width: 500px; height: 100px;"
                                      v-model="texts"></textarea>
                        </div>
                        <div style="margin-left: 20px;">
                            <button class="btn btn-default" type="button">审批通过</button>
                            <button class="btn btn-default" type="button">审批退回</button>
                            <button class="btn btn-default" type="button">返回</button>

                        </div>
                    </div>
                    <!--审批意见及提价按钮等等end-->
                </div>
                <!--表内容end-->
            </div>


            <!-- /.主要内容end -->

        </div>
    </div>

    <!-- </section> -->
    <!-- /.尾部内容 -->
    <footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 3.0.0
        </div>
        <strong>CRAETE TO 2019.11.1AdminLLKXL.</strong> 保留所有权
    </footer>

    <script type="text/javascript">

    </script>
    <!-- ./包装器 -->
    <!-- jQuery 3 -->
    <script src="<%=ctxPath%>/src/res/js/jquery.min.js"></script>
    <!-- Bootstrap 3.3.7 -->
    <script src="<%=ctxPath%>/src/res/js/bootstrap.min.js"></script>
    <!-- 侧栏打开/关闭代码 -->
    <script src="<%=ctxPath%>/src/res/js/adminllkxl.min.js"></script>
</div>
</body>

</html>

