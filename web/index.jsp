<%-- 
    Document   : index
    Created on : 09-04-2017, 02:07:32 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos Empleado</h1>
        <form action="procesarEmpleado" method="post">
            <table border="4">
                <tr>
                    <th colspan="2">Empleado</th> 
                </tr>
                <tr>
                    <td>Codigo</td>
                    <td><input type="number" name="txtCodigo"></td>
                </tr>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="txtNom"></td>
                </tr>
                <tr><td>Edad</td>
                    <td><input type="number" name="txtEdad"></td>
                </tr>
                <tr><td>Genero</td>
                    <td>Femenino<input type="radio" name="genero" value="Femenino" checked/>
                        Masculino<input type="radio" name="genero" value="Masculino"/>
                    </td>
                </tr>
                <tr><td>Cargo</td>
                    <td><select name="cargo">
                            <option>Seleccione</option>
                            <option>Programador</option>
                            <option>Analsista</option>
                            <option>DBA</option>
                            <option>Tester</option>
                        </select>
                    </td>
                </tr>
                <tr><td>Intereses</td>
                    <td>
                        Musica<input type="checkbox" name="interes" value="Musica">
                        Ver Anime<input type="checkbox" name="interes" value="Anime">
                        Leer<input type="checkbox" name="interes" value="leer">
                        Programar<input type="checkbox" name="interes" value="programar">  
                    </td>
                </tr>
                <tr><td>Sueldo</td>
                    <td><input type="text" name="txtSueldo"></td>  
                </tr>   
                <tr>
                    <td colspan="2">
                       <center>
                        <input type="submit" value="enviar" name="btnEnviar"/>
                        <input type="reset" value="Cancelar"/>
                       </center>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
