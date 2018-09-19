//				注册ajax
var model = "finished_product";
$("#finished_product").click(function () {
    model = "finished_product";
    document.getElementById("enter_commodity").innerHTML = "成品进货"
    document.getElementById("entrepot_commodity").innerHTML = "成品仓库"
    document.getElementById("model_choose").innerHTML = "当前操作对象:成品"
    var path = "stock_finished_product.do"
    $("#hereContent").load(path)
})
$("#materials").click(function () {
    model = "materials";
    document.getElementById("enter_commodity").innerHTML = "材料进货"
    document.getElementById("entrepot_commodity").innerHTML = "材料仓库"
    document.getElementById("model_choose").innerHTML = "当前操作对象:材料"
    var path = "stock_materials.do"
    $("#hereContent").load(path)
})
$("#enter_commodity").click(function () {
    var path
    if (model == "finished_product")
        path = "enter_finished_product.do"
    else
        path = "enter_materials.do"
    $("#hereContent").load(path)
    return false;
})
$("#entrepot_commodity").click(function () {
    var path
    if (model == "finished_product")
        path = "stock_finished_product.do"
    else
        path = "stock_materials.do"
    $("#hereContent").load(path)
    return false;
})
$(document).ready(function () {
    var path = "stock_finished_product.do"
    $("#hereContent").load(path)
});