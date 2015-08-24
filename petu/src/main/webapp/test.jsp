<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-dojo-tags"  prefix="ss"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<ss:head />
<title>Insert title here</title>
<script src="js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
/*
 * MAP对象，实现MAP功能
 *
 * 接口：
 * size()     获取MAP元素个数
 * isEmpty()  判断MAP是否为空
 * clear()    删除MAP所有元素
 * put(key, value)   向MAP中增加元素（key, value) 
 * remove(key)    删除指定KEY的元素，成功返回True，失败返回False
 * get(key)    获取指定KEY的元素值VALUE，失败返回NULL
 * isContainsKey(key)  判断MAP中是否含有指定KEY的元素
 * isContainsValue(value) 判断MAP中是否含有指定VALUE的元素
 * valueArray()    获取MAP中所有VALUE的数组（ARRAY）
 * keyArray()     获取MAP中所有KEY的数组（ARRAY）
 *
 * 例子：
 * var map = new Map();
 *
 * map.put("key", "value");
 * var val = map.get("key")
 * ……
 *
 */

//定义map       
function Map()       
{        
this.container = {};        
} 
 

   
//将key-value放入map中       
Map.prototype.put = function(key,value){        
try{        
     
if(key!=null && key != "")       
 this.container[key] = value;        
   
}catch(e){        
return e;        
}        
};        
   
//根据key从map中取出对应的value       
Map.prototype.get = function(key){        
try{        
   
return this.container[key];        
   
}catch(e){        
return e;        
}        
};        
   
//判断map中是否包含指定的key       
Map.prototype.isContainsKey=function(key){       
   
try{       
for(var p in this.container)       
{       
   if(this.p==key)       
      return true;       
}       
   
return false;       
   
}catch(e){       
return e;       
}       
   
};       
   
//判断map中是否包含指定的value       
Map.prototype.isContainsValue = function(value){        
try{        
   
for(var p in this.container)       
{        
if(this.container[p] === value)        
  return true;        
}        
   
return false;        
   
}catch(e){        
return e;        
}        
};        
   
   
//删除map中指定的key       
Map.prototype.remove = function(key){        
try{        
   
delete this.container[key];        
   
}catch(e){        
return e;        
}        
};        
   
//清空map       
Map.prototype.clear = function(){        
try{        
delete this.container;        
this.container = {};        
   
}catch(e){        
 return e;        
}        
};  

   
 //判断map是否为空       
Map.prototype.isEmpty = function(){        
     
if(this.keyArray().length==0)       
 return true;       
else        
 return false;       
};        
   
//获取map的大小       
Map.prototype.size=function(){       
   
return this.keyArray().length;       
};       
   
//返回map中的key值数组       
Map.prototype.keyArray=function(){       
    
  var keys=new Array();       
  for(var p in this.container)       
  {       
      keys.push(p);       
  }       
      
  return keys;       
} 
   
//返回map中的value值数组       
Map.prototype.valueArray=function(){       
    
 var values=new Array();       
 var keys=this.keyArray();       
 for(var i=0;i<keys.length;i++)       
 {       
    values.push(this.container[keys[i]]);       
 }       
        
 return values;       
} ; 

var sum=0;
var type=1;
var rank=3;
var priceLow=1;
var priceHigh=100000;
var pageNumber=1;
var map=new Map();
map.put("typeIdStr",type);
map.put("rankIdStr",rank);
map.put("priceLowStr",priceLow);
map.put("priceHighStr",priceHigh);
map.put("pageNumberStr",pageNumber);

function doSearch(){
	
	var url="pageNumberStr";
	sum++;
	$('#data').load('CatListAction.do?pageNumberStr=1&typeIdStr=1&rankIdStr=2&priceLowStr=1&priceHighStr=100000');
}

function doPost(){
	
	for(var key in map.container){
		
		if(map.get(key)==""||map.get(key)==null){
			map.remove(key);
		}
	}
	
	$.post("CatListAction.do",map.container,
		   function(data){
			   
			   $('#data').html(data);
		   }
	);
}

$(document).ready(function(){
	
	 $('#data').load('CatListAction.do?pageNumberStr=1&typeIdStr=1&rankIdStr=1&priceLowStr=1&priceHighStr=100000');	
	 var a=document.getElementById ("a");
     a.innerHTML = "已存在!";
});

</script>
</head>
<body>

<div>
<ss:a onclick="doPost()" href="#" >查询数据</ss:a>
<ss:a onclick="doSearch()" href="#" >查询数据1</ss:a>
<span id="a"></span>
</div>

<div id="data"></div>

</body>
</html>