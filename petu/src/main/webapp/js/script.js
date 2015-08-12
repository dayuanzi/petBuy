$(document).ready(function(){
	
	var type="";
	var hair="";
	var rank="";
	
							
	$("#select1 dd").click(function () {
		$(this).addClass("selected").siblings().removeClass("selected");
		$(this).parent().siblings().children($("dd")).removeClass("selected");
		if ($(this).hasClass("select-all")) {
			$("#selectA").remove();
		} else {
			var copyThisA = $(this).clone();
			var title=copyThisA.children($("a")).attr("title");
			if ($("#selectA").length > 0) {
				$("#selectA a").html($(this).text()).attr("title",title);
				
			} else {
				$(".select-result dl").append(copyThisA.attr("id", "selectA"));
			}
		}
		type=$("#selectA a").attr("title");
		
		linkToUrl($(this).children());
	});
	
	
	
	$("#select2 dd").click(function () {
		$(this).addClass("selected").siblings().removeClass("selected");
		if ($(this).hasClass("select-all")) {
			$("#selectB").remove();
		} else {
			var copyThisB = $(this).clone();
			var title=copyThisB.children().attr("title");
			if ($("#selectB").length > 0) {
				$("#selectB a").html($(this).text()).attr("title",title);
				
			} else {
				$(".select-result dl").append(copyThisB.attr("id", "selectB"));
			}
		}
		hair=$("#selectB a").attr("title");
		linkToUrl($(this).children());
	});
	
	$("#select3 dd").click(function () {
		$(this).addClass("selected").siblings().removeClass("selected");
		if ($(this).hasClass("select-all")) {
			$("#selectC").remove();
		} else {
			var copyThisC = $(this).clone();
			var title=copyThisC.children().attr("title");
			if ($("#selectC").length > 0) {
				$("#selectC a").html($(this).text()).attr("title",title);
			} else {
				$(".select-result dl").append(copyThisC.attr("id", "selectC"));
			}
		}
		rank=$("#selectC a").attr("title");
		linkToUrl($(this).children());
	});
	
	$(document).on("click","#selectA",function () {
		type="";
		linkToUrl($("#selectA").children());
		$(this).remove();
		$("#select1 .select-all").addClass("selected").siblings().removeClass("selected");
		
		
	});
	
	$(document).on("click", "#selectB",function () {
		hair="";
		linkToUrl($("#selectB").children());
		$(this).remove();
		$("#select2 .select-all").addClass("selected").siblings().removeClass("selected");
		
		
	});
	
	$(document).on("click","#selectC", function () {
		rank="";
		linkToUrl($("#selectC").children());
		$(this).remove();
		$("#select3 .select-all").addClass("selected").siblings().removeClass("selected");
		
		
	});
	
	$(document).on("click", ".select dd",function () {
		if ($(".select-result dd").length > 1) {
			$(".select-no").hide();
		} else {
			$(".select-no").show();
		}
	});
	
	function linkToUrl(meth) {  
    var host = "http://www.baidu.com";  
    var Url;
    Url=host+"?"+"type="+type+"&"+"hair="+hair+"&"+"rank="+rank;
    //alert(Url);
    meth.attr("href",Url);
    } 
});

function showMore(){
	$("#typeMore").toggle("fast","linear");
    }