If you cloned this Repository after 17-Jul-2020, you can access the
*.sql Archive on the folder 'SQL'

I added Auditory features, so all the tables schema is on there


I made the database in MySQL, attached * .sql file that contains
the table structure and some loaded data.
If there is an error in the import, create a default target
schema named ‘hospital_app’.

in . . \ src \ main \ resources \ application.properties of the backend application 
the following lines should be modified
spring.datasource.username = admin (User)
spring.datasource.password = admin (Password)
To start the server side .. \ src \ main \ java \ com \ digitalharbor \ test \ testserver \ Application.java

#################################################################################

si clonaste este repositorio despues del 17-jul-2020, puedes acceder al archivo
*.sql en el folder 'SQL'

añadi caracteristicas de auditoria despues de la fecha mencionada

La base de datos la hice en MySQL, ajunto archivo *.sql que contiene 
la estructura de tablas y algunos datos cargados. 
Si presentara algún error en la importación crear un default target 
schema de nombre ‘hospital_app’.

en . .\src\main\resources\application.properties de la aplicación de back-end 
las siguientes líneas deben ser modificadas 
spring.datasource.username=admin  (Usuario)
spring.datasource.password=admin  (Password)
Para iniciar el lado servidor .. \src\main\java\com\digitalharbor\test\testserver\Application.java


