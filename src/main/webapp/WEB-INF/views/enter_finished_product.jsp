<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("base_path", request.getContextPath());
%>
<script>

    $(function () {     //当页面加载完成时,简写 $(document).ready(function () {});
        $.ajax({
            url: "/pageLoaderController.do",
            type: "GET",
            success: function (result) {
                console.log(result)

                var finishedProductType = $("#select-finishedProductType");
                var posIndex = 0;
                $.each(result.extend.finishedProductType, function () {        //商品类型的遍历
                    var optionEle = $("<option></option>").append(this.finishedProductTypeName);
                    optionEle.appendTo(finishedProductType);
                    var inputHiddle = $("<input></input>").attr("id", "finishedProductType" + posIndex).attr("value", this.finishedProductTypeToken);
                    posIndex++;
                    inputHiddle.appendTo(finishedProductType);
                });


                var finishedProductBroadHeading = $("#select-finishedProductBroadHeading");
                posIndex = 0;     //初始化pos标记
                $.each(result.extend.finishedProductBroadHeading, function () {        //商品大类的遍历
                    var optionEle = $("<option></option>").append(this.finishedProductBroadHeadingName);
                    optionEle.appendTo(finishedProductBroadHeading);
                    var inputHiddle = $("<input></input>").attr("id", "finishedProductBroadHeading" + posIndex).attr("value", this.finishedProductBroadHeadingToken);
                    posIndex++;
                    inputHiddle.appendTo(finishedProductBroadHeading);
                });


                var finishedProductSubclass = $("#select-finishedProductSubclass");
                posIndex = 0;
                $.each(result.extend.finishedProductSubclass, function () {        //商品小类的遍历
                    var optionEle = $("<option></option>").append(this.finishedProductSubclassName);
                    optionEle.appendTo(finishedProductSubclass);
                    var inputHiddle = $("<input></input>").attr("id", "finishedProductSubclass" + posIndex).attr("value", this.finishedProductSubclassToken);
                    posIndex++;
                    inputHiddle.appendTo(finishedProductSubclass);
                });

                var finishedProductDiscern = $("#select-finishedProductDiscern");
                posIndex = 0;
                $.each(result.extend.finishedProductDiscern, function () {        //商品识别信息的遍历
                    var optionEle = $("<option></option>").append(this.finishedProductDiscernName);
                    optionEle.appendTo(finishedProductDiscern);
                    var inputHiddle = $("<input></input>").attr("id", "finishedProductDiscern" + posIndex).attr("value", this.finishedProductDiscernToken);
                    posIndex++;
                    inputHiddle.appendTo(finishedProductDiscern);
                });

                var texture = $("#select-texture");
                $.each(result.extend.texture, function () {        //商品材质的遍历
                    var optionEle = $("<option></option>").append(this.textureName);
                    optionEle.appendTo(texture);
                });

                var unit = $("#select-unit");
                $.each(result.extend.unit, function () {        //商品单位的遍历
                    var optionEle = $("<option></option>").append(this.unitName);
                    optionEle.appendTo(unit);
                });


                var currency = $("#select-currency");
                $.each(result.extend.currency, function () {        //币种的遍历
                    var optionEle = $("<option></option>").append(this.currencyName);
                    optionEle.appendTo(currency);
                });
            }
        });
    });
    var finishedProductCode = "";       //存储编码

    function finishedProductType(obj) {
        alert($("#finishedProductType" + obj.selectedIndex).val())
    }

    function finishedProductBroadHeading(obj) {
        alert($("#finishedProductBroadHeading" + obj.selectedIndex).val())
    }

    function finishedProductSubclass(obj) {
        alert($("#finishedProductSubclass" + obj.selectedIndex).val())
    }

    function finishedProductDiscern(obj) {
        alert($("#finishedProductDiscern" + obj.selectedIndex).val())
    }

    function texture(obj) {
    }

    function unit(obj) {
    }

    function currency(obj) {
    }
</script>
<link rel="stylesheet" href="${base_path}/static/css/enter_finished_product.css"/>
<h2>成品进货</h2>
<h3>样式信息</h3>

<div class="container">
    <div class="row">
        <div class="col-md-2">
            <select class="form-control" id="select-finishedProductType" onchange="finishedProductType(this)">
            </select>
        </div>
        <div class="col-md-2">
            <select class="form-control" id="select-finishedProductBroadHeading"
                    onchange="finishedProductBroadHeading(this)">
            </select>
        </div>
        <div class="col-md-2">
            <select class="form-control" id="select-finishedProductSubclass" onchange="finishedProductSubclass(this)">
            </select>
        </div>
        <div class="col-md-2">
            <select class="form-control" id="select-finishedProductDiscern" onchange="finishedProductDiscern(this)">
            </select>
        </div>
    </div>
</div>
<h3>基本信息</h3>
<div class="container">
    <div class="row">
        <div class="col-md-2">
            编码:<input type="text" size="5"/>
        </div>
        <div class="col-md-2">
            名称:<input type="text" size="5"/>
        </div>
        <div class="col-md-2">
            数量:<input type="text" size="5"/>
        </div>
    </div>
</div>

<h3>单位信息</h3>
<div class="container">
    <div class="row">
        <div class="col-md-2">
            <select class="form-control" id="select-unit" onchange="unit(this)">
            </select>
        </div>
        <div class="col-md-2">
            总重量:<input type="text" size="5"/>
        </div>
        <div class="col-md-2">
            均重:<input type="text" size="5"/>
        </div>
    </div>
</div>

<h3>材质信息</h3>
<div class="container">
    <div class="row">
        <div class="col-md-2">
            <select class="form-control" id="select-texture" onchange="texture(this)">
            </select>
        </div>
        <div class="col-md-2">
            重量:<input type="text" size="5"/>
        </div>
        <div class="col-md-2">
            单价:<input type="text" size="5"/>
        </div>
        <div class="col-md-2">
            总价:<input type="text" size="5"/>
        </div>
    </div>
</div>

<h3>价格信息</h3>
<div class="container">
    <div class="row">
        <div class="col-md-2">
            <select class="form-control" id="select-currency" onchange="currency(this)">
            </select>
        </div>
        <div class="col-md-2">
            克价:<input type="text" size="5"/>
        </div>
        <div class="col-md-2">
            总金额:<input type="text" size="5"/>
        </div>
        <div class="col-md-2">
            件价:<input type="text" size="5"/>
        </div>
    </div>
</div>
<h3>加工信息</h3>
<div class="container">
    <div class="row">
        <div class="col-md-2">
            加工单价:<input type="text" size="5"/>
        </div>
        <div class="col-md-2">
            加工总价:<input type="text" size="5"/>
        </div>
    </div>
</div>
<h3>其他信息</h3>
<div class="container">
    <div class="row">
        <div class="col-md-2">
            商品成本:<input type="text" size="5"/>
        </div>
        <div class="col-md-2">
            三折批发:<input type="text" size="5"/>
        </div>
        <div class="col-md-2">
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