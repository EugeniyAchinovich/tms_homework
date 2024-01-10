<!DOCTYPE html>
<html>
<head>
    <title>Форма заявки</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/validate-request" method="post">
    <label for="name">Имя:</label>
    <input type="text" id="name" name="name"><br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email"><br>
    <label for="description">Описание заявки:</label>
    <textarea id="description" name="description"></textarea><br>
    <input type="submit" value="Отправить заявку">
</form>

</body>
</html>
