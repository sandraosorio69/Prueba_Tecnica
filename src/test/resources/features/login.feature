#language: es

Característica:  Login


  Esquema del escenario: Iniciar sesion de forma exitosa
    Dado que sandra se encuentra en la pantalla del login
    Cuando ella diligencie los campos "<usuario>" y "<clave>"
    Entonces  ella deberia ver la pagina principal

    Ejemplos:
      |usuario | clave |
      |test | secret|


  Esquema del escenario: Realizar compra
      Dado que sandra se encuentra en la pantalla del login
      Cuando ella diligencie los campos "<usuario>" y "<clave>"
      Y ella ingrese los valores de los libros a comprar "<cantidadJava>","<cantidadRuby>" y "<cantidadPhyton>"
      Entonces ella deberia ver la suma total de su compra "<sumatoriatotal>"

    Ejemplos:
    |usuario | clave |cantidadJava|cantidadRuby|cantidadPhyton|sumatoriatotal|
    |test | secret|3           |5           |2             |2600|









