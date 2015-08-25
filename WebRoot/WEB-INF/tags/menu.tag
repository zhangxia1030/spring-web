<%--这是一个菜单的标签，只有一个属性，表示该菜单的唯一标号，我们用该编号比较，该菜单是否被点击了 --%>
<%@tag pageEncoding="UTF-8"%>

<%--定义一个属性：menuId --%>
<%@attribute name="menuId" required="true" type="java.lang.String"%>

<%--通过EL表达式取属性的值 --%>
<div class="menu"> 
<ul>  
<li class="${menuId eq 'menu1' ? 'active':'' }"><a href="index.jsp">菜单一</a></li>  
<li class="${menuId eq 'menu2' ? 'active':'' }"><a href="index2.jsp">菜单二</a></li>  
<li class="${menuId eq 'menu3' ? 'active':'' }"><a href="index3.jsp">菜单三</a></li> 
</ul>
</div>

<script type="text/javascript"> 
//这里还可以定义javascript脚本，这是JavaBean定义Tag所达不到的 function onclick() {   }
</script>
