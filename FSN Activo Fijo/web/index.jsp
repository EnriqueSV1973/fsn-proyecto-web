<%-- 
    Document   : index
    Created on : 10-20-2014, 10:45:56 AM
    Author     : Miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
xmlns:h="http://java.sun.com/jsf/html">


  <head>
  <link rel="stylesheet" type="text/css" href="default.css" media="screen" />
  <link rel="stylesheet" type="text/css" href="styles/componentes.css" media="screen" />
  <link rel="stylesheet" type="text/css" href="styles/navstyle.css" media="screen" />
   
    <!--[if lt IE 9]> 
			<script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script> 
		< ![endif]-->
	
    <title>Federación Salvadoreña de Natación</title>
 
  </head>
  <body>
  		<div id="wrapper">
      		<header>
    				<div id="logo"></div>
    				<h1>Control de Activos Fijos</h1>
    		   		
            		<nav>
        				 <div id="cssmenu">
                			 <ul>
            	 				 <li>
                				 	  <a href='index.html' class='icon-home' title ='inicio'><span>Inicio</span></a>
            					 </li>
                                 <li class='has-sub'>
                       					<a href="paginas/producto_leche.html" class='icon-productos'><span>Nuestros Productos</span></a>
                                 </li>
        						 <li class="has-sub"><a href='DEFAULT.ASP' class="icon-usuario"><span>Usuario </span></a>
                                    <ul>
                                        <li class='last'><a href='logindialog.html'><span>Hola. Inicia Sesion</span></a></li>
                                       <li class='last'><a href="paginas/nuevousuario.html"><span>Registrarme</span></a></li>
                                    </ul>
                                 </li>
                          		
                   			 </ul>
        				 </div>
            		</nav>
    		</header>
			<article>
    				 <aside>
					 		<div id="divname">
								 Menú
								<hr/>
							</div>
    				 	usuario 
    				 </aside>
    				 <section>
					 	<div id="divname"> 
    				 		  contenido
					    </div>
							 
							 <form method="post" action="recoger_datos.php">
					<label for="nombres" >Nombres</label>
						<input type="text" size="60" name="nombres" class="rounded"/>
                                                
					<label for="apellidos">Apellidos</label>
						<input type="text" size="60" name="apellidos" />
					<label for="genero">G&eacute;nero</label>
						<select  name="genero"  >
							<option>Masculino</option>
							<option>Femenino</option>
						</select></br>
					<label for="dui">Dui</label>
						<input type="text" size="20" name="dui" />
					<label for="email">E-mail </label>	
						<input type="text" size="20" name="email"/>
					<label for="direccion">Direcci&oacute;n</label>
						<input type="text" size="100" name="direccion" />
					<label for="departamento">Departamento<label>
						<select  name="departamento" >
							<option>Ahuachapan</option>
							<option>Santa Ana</option>
							<option>Sonsonate</option>
							<option>La Libertad </option>
							<option>San Salvador</option>
						</select> </br>
					<label for="municipio">Municipio</label>
						<input type="text" name="municipio" />
                                                <h:input
					<label for="telefono">Tel&eacute;fono</label>
						<input type="text" name="telefono" />
					<label for="celular">Celular </label>
						<input type="text" name="celular" />
					<label for="usuario">Usuario </label>
						<input type="text" name="nomusua" />
					<label for ="contrasena">Contrase&ntilde;a</label>
						<input type="password" name="password" />
					<label for="ncuenta">No. Cuenta </label>
						<input type="text" name="nocuenta"/>
					<!-- <button type="button"> -->
                                    
					<input type="submit" align="center" value="Aceptar"/>
					<input type="reset" align="center" value="Cancelar" />						
				</form>
							 
    				 </section>
					  <div id="aux">
							  	  <div id="cssmenu">
        			 <ul>
    	 				
                         <li class='has-sub'>
               					<a href="#" class='icon-productos'><span>Opcion1</span></a>
                         </li>
						 <li class="has-sub">
						 	 	<a href="#" class="icon-usuario"><span>Opcion2 </span></a>
                            	<ul>
                                	<li class='last'><a href='logindialog.html'><span>Opcion 2.a</span></a></li>
									<li class='last'><a href="paginas/nuevousuario.html"><span>Opcion 2.b</span></a></li>
                                </ul>
                         </li>
							  </div>
    		</article>
    		<footer>
			asdfklsjf
			</footer>
		</div>
  </body>
</html>