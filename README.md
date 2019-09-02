# demo_java
Demo en java realizada para Hiberus siguiendo [esta prueba](https://github.com/ohierro/tecnara/tree/master/apps/uster).
## Introducción
Pequeño proyecto de Eclipse en el que se realizan las tareas de la prueba por consola.
## Utilización
El proyecto (carpeta "demo_java") se debe de abrir y ejecutar desde Eclipse.
Para la BBDD se ha utilizado MySQL. Se ha realizado un volcado de las tablas y los datos en el archivo "estructura_y_datos.sql".
Es posible que sea necesaria la modificación de la cadena de conexión SQL (se encuentra en el archivo "Utils.java").
## Modificación
Como vi que no afectaba a la prueba he decidido simplificar las relaciones que se daban, y he convertido la tabla "TRIP" en una relación
muchos a muchos entre "VEHICLE" y "DRIVER".
