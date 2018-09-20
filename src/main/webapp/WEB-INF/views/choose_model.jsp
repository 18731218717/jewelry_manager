<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <%
        String base_path = request.getContextPath();
        pageContext.setAttribute("base_path", base_path);
    %>
    <title>珠宝管理</title>

    <link href="${base_path}/static/css/bootstrap.css" rel="stylesheet">
    <script src="${base_path}/static/js/jquery.min.js"></script>
    <script src="${base_path}/static/js/bootstrap.js"></script>
    <link rel="stylesheet" href="${base_path}/static/css/choose_model.css"/>
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">

        <div id="navbar" class="navbar-collapse collapse col-md-5 navbar-left">
            <ul class="nav navbar-nav navbar-left">
                <li class="dropdown profile_details_drop">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                        <div class="user-name">
                            <span id="model_choose">当前操作对象:成品</span>
                        </div>
                    </a>
                    <ul class="dropdown-menu drp-mnu">
                        <li>
                            <a id="finished_product" href="#"><i class="fa fa-cog"></i> 成品</a>
                        </li>
                        <li>
                            <a id="materials" href="#"><i class="fa fa-user"></i> 材料</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-left">
                <li>
                    <a href="" id="enter_commodity"><i class="fa fa-cog"></i> 成品进货</a>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-left">
                <li>
                    <a href="#" id="entrepot_commodity"><i class="fa fa-cog"></i>成品仓库</a>
                </li>
            </ul>

        </div>

        <div id="navbar" class="navbar-collapse collapse col-md-5 navbar-right">
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown profile_details_drop">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                        <div class="user-name">
                            <span>当前用户:郑凯</span>
                        </div>
                        <i class="fa fa-angle-down lnr"></i>
                        <i class="fa fa-angle-up lnr"></i>
                        <div class="clearfix"></div>
                    </a>
                    <ul class="dropdown-menu drp-mnu">
                        <li>
                            <a href="#"><i class="fa fa-cog"></i> 设置</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-user"></i> 账户</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-suitcase"></i> 利润 </a>
                        </li>

                        <li>
                            <a href="../../login.jsp"><i class="fa fa-sign-out"></i> 注销</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="输入关键字">
            </form>
        </div>

    </div>
</nav>
<br/>
<br/>
<div id="hereContent">
    <!--			<br />
    <br />
    <h1>内部显示不同的页面,删除成品与材料的功能嵌入到货物显示的界面</h1>
    <h1>默认显示成品的仓库界面</h1>
    <!--
                作者：offline
                时间：2018-09-12
                描述：此处可利用jstl判断用户的设置状态,根据用户的设置状态显示不同的页面
            -->

</div>
<script src="/static/js/myContentEdit.js"></script>
</body>

</html>