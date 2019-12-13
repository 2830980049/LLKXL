<%--
  Created by IntelliJ IDEA.
  User: TAHUN
  Date: 2019/11/15
  Time: 15:57
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../header.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta content="IE=edge" http-equiv="X-UA-Compatible">
    <title>物资供应方案维护</title>
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
                                <br><br>
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
                        <i class="fa fa-link"></i> <span>采购计划</span>
                        <span class="pull-right-container">
          <i class="fa fa-angle-left pull-right"></i>
        </span>
                    </a>
                    <ul class="treeview-menu" style="display: none;">
                        <li>
                            <a href="../purchasePlan/materialSupplyProgramMaintenanceInterface.html">物资供应方案维护</a>
                        </li>
                        <li>
                            <a href="procurementplan.html">采购计划主界面</a>
                        </li>
                        <li>
                            <a href="purchaseplancheckandchangeInterface.html">采购计划查改界面</a>
                        </li>
                    </ul>
                </li>

            </ul>
        </section>
        <!-- /.侧边栏描述 -->
    </aside>
    <!-- 内容包装器。包含页面内容 -->
    <div class="content-wrapper ">

        <div class="row" style="height: 100%;">
            <!-- 年份选择end -->
            <div style="width: 100px;color: #0a568c;">
                <ul class="sidebar" data-widget="tree">
                    <li class="header">年份选择</li>
                    <li class="treeview">
                        <a href="#">
                            <span style="color: #0a568c;">2018</span>
                            <span class="pull-right-container">
            </span>
                        </a>
                        <ul class="treeview-menu" style="display: none;">
                            <li>
                                <a href="#" style="color: #0a568c;">3月</a>
                            </li>
                            <li>
                                <a href="#" style="color: #0a568c;">4月</a>
                            </li>
                            <li>
                                <a href="#" style="color: #0a568c;">5月</a>
                            </li>
                        </ul>
                    </li>
                    <li class="treeview">
                        <a href="#">
                            <span style="color: #0a568c;">2019</span>
                            <span class="pull-right-container">
        </span>
                        </a>
                        <ul class="treeview-menu" style="display: none;">
                            <li>
                                <a href="#" style="color: #0a568c;">3月</a>
                            </li>
                            <li>
                                <a href="#" style="color: #0a568c;">4月</a>
                            </li>
                        </ul>
                    </li>
                </ul>

            </div>

            <!-- 物资需求表内容-->
            <div class="col-md-10 col-md-offset-1" style="text-align: center;">
                <!-- 标题 -->
                <!--
                <section class="content-header">
                    <h2 align="center">物资需求汇总表</h2>

                </section>
                            -->
                <!--按钮系列-->

                <div id="button-components">
                    <div aria-label="..." class="btn-group" role="group">
                        <button class="btn btn-default " type="button">合并</button>
                        <button class="btn btn-default " type="button">取消合并</button>
                        <button class="btn btn-default " onclick="window.print()" type="button">打印</button>
                        <button class="btn btn-default " type="button">导出</button>
                        <button class="btn btn-default " type="button">保存</button>
                        <button class="btn btn-default " type="button">拆分</button>
                        <button class="btn btn-default  " type="button">需求退回</button>
                        <button class="btn btn-default " type="button">生成采购计划</button>
                        <button class="btn btn-default " type="button">汇总规则设置</button>
                        <button class="btn btn-default  " type="button">关闭/退出</button>
                    </div>
                </div>
                <!--按钮系列end-->
                <div class="table-responsive">
                    <table class="table" id="tab_1">
                        <tr class="info">
                            <td class="info">行号</td>
                            <td class="info">物料分类编码</td>
                            <td class="info">物料分类名称</td>
                            <td class="info">物料编码</td>
                            <td class="info">物料名称</td>
                            <td class="info">规格</td>
                            <td class="info">型号</td>
                            <td class="info">单位</td>
                            <td class="info">需求数量</td>
                            <td class="info">需求月份</td>
                            <td class="info">需求日期</td>
                            <td class="info">货源是否确定</td>
                            <td class="info">期望供应商</td>
                            <td class="info">固定供应商</td>
                            <td class="info">所属需求计划编码</td>
                            <!--新增-->
                            <td class="info">供应方式</td>
                            <td class="info">供应数量</td>
                            <td class="info">可用库存</td>
                            <td class="info">在途数量</td>
                            <td class="info">已占库存</td>
                            <td class="info">库存总量</td>
                            <td class="info">采供提前期</td>
                            <td class="info">采购日期</td>
                            <td class="info">物料追踪码</td>
                        </tr>
                        <tr class="info">
                            <!-- 序号-->
                            <td class="info">
                                {{num}}
                            </td>
                            <td class="info">
                                <!--物料分类编码-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;" type="text" v-model="thingClassifyCode"/>
                            </td>
                            <td class="info">
                                <!--物料分类名称-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;" type="text" v-model="thingClassifyName"/>
                            </td>

                            <td class="info">
                                <!--物料编码-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;"
                                       type="text" v-model="thingCode"/>
                            </td>
                            <td class="info">
                                <!--物料名称-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;"
                                       type="text" v-model="thingName"/>
                            </td>
                            <td class="info">
                                <!--规格-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;"
                                       type="text" v-model="size"/>
                            </td>
                            <td class="info">
                                <!--型号-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;"
                                       type="text" v-model="type"/>
                            </td>
                            <td class="info">
                                <!--单位-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;"
                                       type="text" v-model="unit"/>
                            </td>
                            <td class="info">
                                <!--需求数量-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;"
                                       type="text" v-model="demandNum"/>
                            </td>
                            <td class="info">
                                <!--需求月份-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;"
                                       type="text" v-model="demandMonth"/>
                            </td>
                            <td class="info">
                                <!--需求日期-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;"
                                       type="text" v-model="demandDate"/>
                            </td>
                            <td class="info">
                                <!--货源是否确定-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;" type="text" v-model="resourceIsTrue"/>
                            </td>
                            <td class="info">
                                <!--固定供应商-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;"
                                       type="text" v-model="hardProvider"/>
                            </td>
                            <td class="info">
                                <!--期望供应商-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;" type="text" v-model="ecpectProvider"/>
                            </td>
                            <td class="info">
                                <!--需求所属需求部门财务部-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;"
                                       type="text" v-model="demandSection"/>
                            </td>
                            <!--新增-->
                            <td class="info">
                                <!--所属需求计划编码-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;"
                                       type="text" v-model="demandMonth"/>
                            </td>
                            <td class="info">
                                <!--供应方式-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;"
                                       type="text" v-model="demandDate"/>
                            </td>
                            <td class="info">
                                <!--供应数量-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;" type="text" v-model="resourceIsTrue"/>
                            </td>
                            <td class="info">
                                <!--可用库存-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;"
                                       type="text" v-model="hardProvider"/>
                            </td>
                            <td class="info">
                                <!--在途数量-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;" type="text" v-model="ecpectProvider"/>
                            </td>
                            <td class="info">
                                <!--已占库存-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;"
                                       type="text" v-model="demandSection"/>
                            </td>
                            <td class="info">
                                <!--库存总量-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;"
                                       type="text" v-model="demandDate"/>
                            </td>
                            <td class="info">
                                <!--采购提前期-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;" type="text" v-model="resourceIsTrue"/>
                            </td>
                            <td class="info">
                                <!--采购日期-->
                                <input name="" placeholder="不可编辑" readonly="readonly"
                                       style="width:69px;text-align:center;"
                                       type="text" v-model="hardProvider"/>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
            <!-- 物资需求表内容end-->
        </div>
        <!-- 主要内容结束 -->

    </div>
    <!-- /.尾部内容 -->
    <footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 3.0.0
        </div>
        <strong>CRAETE TO 2019.11.1AdminLLKXL.</strong> 保留所有权
    </footer>

    <script type="text/javascript">
        var table1 = new Vue({
            el: "#tab_1",
            data: {
                num: 1,//序号
                thingClassifyCode: "",//物料分类编码
                thingClassifyName: "",//物料分类名称
                thingCode: "",//物料编码
                thingName: "",//物料名称
                size: "",//规格
                type: "",//型号
                unit: "",//单位
                demandNum: "",//需求数量
                demandMonth: "",//需求月份
                demandDate: "",//需求日期
                resourceIsTrue: "",//货源是否确定
                ecpectProvider: "",//期望供应商
                hardProvider: "",//固定供应商
                demandPlanCode: "",//所属需求计划编码
                demandSection: "",//所属需求部门
            }
        })
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
