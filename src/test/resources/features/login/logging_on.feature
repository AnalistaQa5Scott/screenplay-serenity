@Login
Business Need: Logging on
  As a digital product manager
  I want users to be able to login with their account
  to buy new items and access your order history

  Background:
    Given Alexander is a loyal customer


  Rule: Users must enter a correct email and password to connect
    @LoginWithFacebook
    Example: Alexander login with correct credentials
      When he tries to login with facebook with the following details:
        | Email                      | Password   |
        | pruebascindi00@hotmail.com | Pruebas123 |
      Then he should be able to log in and see his name

    Scenario Template: Alexander logs in with multiple accounts
      When he tries to login with "<RedSocial>" as "<Email>" with password "<Password>"
      Then he should be able to log in and see his name in the application
      Examples:
        | RedSocial | Email                      | Password   |
        | Facebook  | pruebascindi00@hotmail.com | Pruebas123 |
        | Google    | pruebascindi@gmail.com     | Pruebas123 |


#  Rule: Los usuarios deben ingresar un email y contraseña correctos para conectarse
#    Scenario Template: Trixie ingresa credenciales incorrectas
#    El mensaje de error no debe decirle al usuario qué campo es incorrecto por razones de seguridad.
#
#      When Trixie intenta iniciar sesión como "<email>" con la contraseña "<password>"
#      Then ella no debería poder iniciar sesión
#      And debería aparecer un mensaje de error que contenga "Correo electrónico o contraseña no válidos".
#      Examples:
#        | email              | password         |
#        | wrong-username     | correct-password |
#        | trixie@example.org | wrong-password   |
#
#  Rule: el nombre de usuario y la contraseña no pueden estar vacíos
#    Scenario Template: Trixie se olvida de ingresar un nombre de usuario o una contraseña
#
#      When Trixie intenta iniciar sesión como "<correo electrónico>" con la contraseña "<contraseña>"
#      Then ella no debería poder iniciar sesión
#      And le deberían decir "<mensaje>" sobre <campo>
#      Examples:
#        | email              | password     | field    | message                    |
#        |                    | any-password | email    | Please enter your email    |
#        | trixie@example.org |              | password | Please enter your password |
#
#
#
#
#
#
#
#    @Login
#    @Manual
#    @Manual-result:passed
#    @Manual-test-evidence:https://prnt.sc/10q7ew5
#    Business Need: Loggin on
#    New Frequent Flyer members need to register to book a flight
#
#    Background:
#      Given Trixie is a Frequent Flyer member with the following details:
#        | email    | trixie@example.org |
#        | password | correct-password   |
#
#  Rule: Users must enter a correct username and password to connect
#    Scenario Template: Trixie enters incorrect credentials
#    The error message should not tell the user which field is incorrect for security reasons.
#
#      When Trixie attempts to log on as "<email>" with password "<password>"
#      Then she should not be able to log in
#      And she should be presented with an error message containing "Invalid email or password"
#      Examples:
#        | email              | password         |
#        | wrong-username     | correct-password |
#        | trixie@example.org | wrong-password   |
#
#  Rule: Username and password cannot be empty
#    Scenario Template: Trixie forgets to enter a username or a password
#
#      When Trixie attempts to log on as "<email>" with password "<password>"
#      Then she should not be able to log in
#      And she should be told "<message>" about <field>
#      Examples:
#        |                    | any-password | email    | Please enter your email    |
#        | email              | password     | field    | message                    |
#        | trixie@example.org |              | password | Please enter your password |
