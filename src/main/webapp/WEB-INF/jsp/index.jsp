<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sample Calculator</title>
    </head>

    <body>
    <div align="center">
    <form method="GET" action="calculator">
    <table border="0" cellpadding="10" cellspacing="0">
     <tr>
            <td align="center" colspan="2"><h2>Sample Calculator</h2></td>
     </tr>
      <tr>
            <td align="right">1st Number</td>
            <td><input 
                     name="num1" 
                     type="text" size="20" >
            </td>
      </tr>
      <tr>
            <td align="right">2nd Number:</td>
            <td><input 
                     name="num2" 
                     type="text" size="20" >
            </td>
      </tr>
      <tr>
            <td align="right">Result:</td>
            <td><input 
                     name="result" 
                     type="text" size="5" readonly
                     value='<%=request.getAttribute("result")%>' />
            </td>
      </tr>
      <tr>
            <td colspan="2"><hr></td>
      </tr>
      <tr>
            <td colspan="2" align="center">
              <input type="submit" name="submit" value="Calculate">  
              <select name="op" size="1">
                  <option SELECTED>Operation
                  <option>Add
                  <option>Subtract
                  <option>Multiply
                  <option>Divide
              </select>
              <br> 
            </td>
      </tr>
    </table>
    </form>
    </div>
    </body>
</html>
