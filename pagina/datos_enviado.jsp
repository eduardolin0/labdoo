<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="author" content="">


    <title>Práctica 1 - Lab de Diseño Orientado a Objetos</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>

    <!-- Custom styles for this template -->
    <link href="css/clean-blog.min.css" rel="stylesheet">

    <!-- Script para el datepicker -->

    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
      $( function() {
      $( "#datepicker" ).datepicker();
       } );
    </script>

    <!--- Estilos para el botón de input --->

    <style>
      .button {
      background-color: #4CAF50;
      border: none;
      color: white;
      padding: 15px 32px;
      text-align: center;
      text-decoration: none;
      display: inline-block;
      font-size: 16px;
      margin: 4px 2px;
      cursor: pointer;
      }
</style>

<style>
      .tg  {border-collapse:collapse;border-spacing:0;}
      .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}
      .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}
      .tg .tg-0lax{text-align:left;vertical-align:top}

    </style>

  </head>

  <body>

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
      <div class="container">
        <a class="navbar-brand" href="index.html">Lab de DOO</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          Menu
          <i class="fa fa-bars"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="index.html">Inicio</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="about.html">Acerca de</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="post.html">Publicación de ejemplo</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="contact.html">Contacto</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <!-- Page Header -->
    <header class="masthead" style="background-image: url('img/home-bg.jpg')">
      <div class="overlay"></div>
      <div class="container">
        <div class="row">
          <div class="col-lg-8 col-md-10 mx-auto">
            <div class="site-heading">
              <h1>Laboratorio de Diseño Orientado a Objetos</h1>
              <span class="subheading">Aplicación web creada por: Eduardo Lino</span>
            </div>
          </div>
        </div>
      </div>
    </header>

    <!-- Main Content -->
    <div class="container">
      <div class="row">
        <div class="col-lg-8 col-md-10 mx-auto">
          <div class="post-preview">
            <a href="post.html">
              <h2 class="post-title">
                Por favor, llene los siguientes datos:
              </h2>
            </a>
          </div>
          <div align="center">
              
              <%
                
              String nomb = request.getParameter("nombre");
              String carr = request.getParameter("carrera");
              String fechan = request.getParameter("fechanac");
              String pass = request.getParameter("passw");
              String correo = request.getParameter("correo");
              
              out.println("Su nombre es: " + nomb);
              out.println("<br>Su carrera es: " + carr);
              out.println("<br>Su fecha de nacimiento es: " + fechan);
              out.println("<br>Su contraseña es: " + pass);
              out.println("<br>Su correo es: " + correo);
                  
              %>
            <hr>
            <br>
            <center><h1>Tabla de horario</h1></center>
            <br>
            <table class="tg">
              <tr>
                <th>Lunes</th>
                <th>Martes</th>
                <th>Miércoles</th>
                <th>Jueves</th>
                <th>Viernes</th>
              </tr>
              <tr>
                <td>DOO</td>
                <td>TELE</td>
                <td>CÁLCULO</td>
                <td>ANÁLISIS DE <br>PROYECTOS</td>
                <td>PROGRAMACIÓN I</td>
              </tr>
              <tr>
                <td>DOO</td>
                <td>TELE</td>
                <td>CÁLCULO</td>
                <td>ANÁLISIS DE <br>PROYECTOS</td>
                <td>PROGRAMACIÓN I</td>
              </tr>
              <tr>
                <td>LDOO</td>
                <td>LTELE</td>
                <td>ÁLGREBRA</td>
                <td>ANÁLISIS DE<br>PROYECTOS</td>
                <td>SISTEMAS <br>OPERATIVOS</td>
              </tr>
              <tr>
                <td>LDOO</td>
                <td>LTELE</td>
                <td>ÁLGEBRA</td>
                <td>ANÁLISIS DE<br>PROYECTOS</td>
                <td>SISTEMAS <br>OPERATIVOS</td>
              </tr>
            </table>
            <br>
            <img src="http://www.regalodeempresagsr98.es/wp-content/uploads/Ejemplo-de-uso-del-portafolio-A4-Harvard-con-cremallera-y-anillas.jpg">
            <br>
            <input type="submit" class="button" value="Reiniciar">
            <br>
            <input type="submit" class="button" value="Cancelar">
            <br>
            <br>
            <iframe width="560" height="315" src="https://www.youtube.com/embed/WtP4Xeoa42k" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
          </div>
          <hr>
          <!-- Pager -->
        </div>
      </div>
    </div>

    <hr>

    <!-- Footer -->
    <footer>
      <div class="container">
        <div class="row">
          <div class="col-lg-8 col-md-10 mx-auto">
            <ul class="list-inline text-center">
              <li class="list-inline-item">
                <a href="#">
                  <span class="fa-stack fa-lg">
                    <i class="fa fa-circle fa-stack-2x"></i>
                    <i class="fa fa-twitter fa-stack-1x fa-inverse"></i>
                  </span>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <span class="fa-stack fa-lg">
                    <i class="fa fa-circle fa-stack-2x"></i>
                    <i class="fa fa-facebook fa-stack-1x fa-inverse"></i>
                  </span>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <span class="fa-stack fa-lg">
                    <i class="fa fa-circle fa-stack-2x"></i>
                    <i class="fa fa-github fa-stack-1x fa-inverse"></i>
                  </span>
                </a>
              </li>
            </ul>
            <p class="copyright text-muted">Copyright &copy; Your Website 2018</p>
          </div>
        </div>
      </div>
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Custom scripts for this template -->
    <script src="js/clean-blog.min.js"></script>

  </body>

</html>
