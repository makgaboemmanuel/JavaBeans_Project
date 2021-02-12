<%-- 
    Document   : index
    Created on : 17 Aug 2018, 11:09:06 PM
    Author     : Mathekga M. Emmanuel
--%>

<%@page contentType="text/html" session="true" pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp"  %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculations: JSP Page</title>
    </head>
    <body>
        <h3>Calculations: JSP Page</h3>
        <jsp:useBean id="math" scope="session" class="beanfields.beans.MathBean"/>
        <jsp:useBean id="prim" scope="session" class="beanfields.beans.PrimeBean"/>
        <jsp:setProperty name="math" property="*"/>
        <jsp:setProperty name="prim" property="*"/> 
        <form name="form1" method="post">
            <table>
                <tr>
                    <td>a:</td>
                    <td> <input type="text" name="arga" value="${math.arga}" style="width:120px"/> </td>
                </tr>
                
                <tr>
                    <td>b:</td>
                    <td> <input type="text" name="argb" value="${math.argb}" style="width:120px"/> </td>
                </tr>
                
                <tr>
                    <td colspan="2" text="text-align: right"><input type="submit" value="OK"/> </td>
                </tr>
            </table> 
        </form>
                <table>
                    <tr>
                        <td>Sum</td><td>${math.add()}</td>
                    </tr>
                    <tr>
                        <td>Difference&nbsp;&nbsp;</td><td>${math.subtract()}</td>
                    </tr>
                    <tr>
                        <td>Product</td><td>${math.multiply()}</td>
                    </tr>
                     <tr>
                        <td>Quotient</td><td>${math.divide()}</td>
                    </tr>
                    <tr>
                        <td>Modulus</td><td>${math.modulus()}</td>
                    </tr>
                </table>
                   <form name="form2" method="post">
                        <input type="text" name="prime" value="${prim.prime}"/> &nbsp;&nbsp;
                        <input type="submit" value="OK"/>
                    </form>
                        <p><a href="Primes?arg=next">Next Prime<a/></p>
                        <p><a href="Primes?arg=prev">Previous Prime<a/></p>
                     
    </body>
</html>
