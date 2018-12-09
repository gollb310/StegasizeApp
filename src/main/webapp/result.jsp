<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Stegasize</title>
    <link rel="stylesheet" type="text/css" href="stegastyle.css">
</head>
<body>

<div>
    <h1>There is either an image here or plaintext based on whether the files were encoded or decoded.</h1>
</div>

<div>
<%
String result= (String) request.getAttribute("out");
Iterator it = result.iterator();

out.println("<br>We have <br><br>");
while(it.hasNext()){
out.println(it.next()+"<br>");
}
%>
</div>

</body>
</html>