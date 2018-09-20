<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String base_path = request.getContextPath();
    pageContext.setAttribute("base_path", base_path);
%>
<script>
    /*    function loadXMLDoc() {
            var xmlhttp;
            if (window.XMLHttpRequest) {
                // IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
                xmlhttp = new XMLHttpRequest();
            }
            else {
                // IE6, IE5 浏览器执行代码
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
            xmlhttp.onreadystatechange = function () {
                if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                    alert(xmlhttp.responseText);
                }
            }
            xmlhttp.open("GET", "/pageLoaderController.do?t=" + Math.random(), true);
            xmlhttp.send();
        }
    */
    $(document).ready(function () {
        $.ajax({
            url: "/pageLoaderController.do",
            type: "GET",
            success: function (result) {
                alert("有反应")
                console.log(result)
                alert(result)
            }
        });
    });
</script>
<link rel="stylesheet" href="${base_path}/static/css/enter_finished_product.css"/>
<h2>成品进货</h2>
<h3>样式信息</h3>

<div class="container">
    <div class="row">
        <div class="col-md-3">
            <div class="dropdown">
                <button type="button" class="btn dropdown-toggle" data-toggle="dropdown">商品类型
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">首饰类</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">观赏类</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="col-md-3">
            <div class="dropdown">
                <button type="button" class="btn dropdown-toggle" id="dropdownMenu" data-toggle="dropdown">商品大类
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">B 手脚链</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">E 耳环</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">H 头饰</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">I 首饰三件套</a>
                    </li>
                </ul>
            </div>

        </div>
        <div class="col-md-3">
            <div class="dropdown">
                <button type="button" class="btn dropdown-toggle" data-toggle="dropdown">商品小类
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">A 紫水金</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">B 黑星光宝石</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">C 电气石</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">F 海蓝宝石</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">G 石榴石</a>
                    </li>
                </ul>
            </div>

        </div>
        <div class="col-md-3">
            <div class="dropdown">
                <button type="button" class="btn dropdown-toggle" data-toggle="dropdown">商品识别
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">1 红色</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">2 金色</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">3 黄色</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <h5>此处存在一个商品编号的信息,该信息可系统自动生成</h5>
</div>
<h3>基本信息</h3>
<div class="container">
    <div class="row">
        <div class="col-md-4">
            编码:<input type="text" size="5"/>
        </div>
        <div class="col-md-4">
            名称:<input type="text"/>
        </div>
        <div class="col-md-4">
            数量:<input type="text" size="5"/>
        </div>
    </div>
</div>

<h3>单位信息</h3>
<div class="container">
    <div class="row">
        <div class="col-md-1">
            <div class="dropdown">
                <button type="button" class="btn dropdown-toggle" data-toggle="dropdown">单位
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">g</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">kg</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="col-md-3">
            总重量:<input type="text" size="5"/>
        </div>
        <div class="col-md-3">
            均重:<input type="text" size="5"/>
        </div>
    </div>
</div>

<h3>材质信息</h3>
<div class="container">
    <div class="row">
        <div class="col-md-1">
            <div class="dropdown">
                <button type="button" class="btn dropdown-toggle" data-toggle="dropdown">材质
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">宝石</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">银</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="col-md-3">
            重量:<input type="text" size="5"/>
        </div>
        <div class="col-md-3">
            单价:<input type="text" size="5"/>
        </div>
        <div class="col-md-3">
            总价:<input type="text" size="5"/>
        </div>
    </div>
</div>

<h3>价格信息</h3>
<div class="container">
    <div class="row">
        <div class="col-md-1">
            <div class="dropdown">
                <button type="button" class="btn dropdown-toggle" data-toggle="dropdown">币种
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">人民币</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">尼克</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="col-md-3">
            克价:<input type="text" size="5"/>
        </div>
        <div class="col-md-3">
            总金额:<input type="text" size="5"/>
        </div>
        <div class="col-md-3">
            件价:<input type="text" size="5"/>
        </div>
    </div>
</div>
<h3>加工信息</h3>
<div class="container">
    <div class="row">
        <div class="col-md-4">
            加工单价:<input type="text" size="5"/>
        </div>
        <div class="col-md-6">
            加工总价:<input type="text" size="5"/>
        </div>
    </div>
</div>
<h3>其他信息</h3>
<div class="container">
    <div class="row">
        <div class="col-md-4">
            商品成本:<input type="text" size="5"/>
        </div>
        <div class="col-md-4">
            三折批发:<input type="text" size="5"/>
        </div>
        <div class="col-md-4">
            标签价格:<input type="text" size="5"/>
        </div>
    </div>
</div>
<hr>
<div>
    <div class="row">
        <div class="col-md-1 col-md-offset-5">
            <input type="button" name="" value="信息提交"/>
        </div>
        <div class="col-md-1">
            <input type="reset" name="" value="取消"/>
        </div>
    </div>
</div>
<br>
<br>
<br>
<br>
<br>