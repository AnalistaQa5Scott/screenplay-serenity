#@RegressionAnonymous
#Feature: Make purchases from eCommerce
#  In order to generate more sales
#  As a technology manager of Farmacias Peruanas
#  I want all users to be able to make their purchases from the Inkafarma eCommerce
#  Rule: Cliente no fidelizado realiza una compra en inakfarma atende
#  Scenario: Non-loyal customer places an order attended by the DeliveryCenter (DC) for today
#    Given Alex is a inkafarma client, I will place an order with my email
#    Then su historial de reservas debe contener:
#      | address    | delivery | typeDelivery |
#      | AvDiagonal | DC       | Despacho     |
#      | Av         | MiniDC   | Recojo       |
#    When he enter my email test.inkaclub@gmail.com and my password Inkaclub1234
##    Given Alex is a non-loyal customer and needs to place an order
##    And he searches, adds his products and buys now
##      | productName      | presentation | quantity |
###      | albisec Cápsulas | Caja         | 2        |
##      | panadol 500mg    | Unidad       | 3        |
##    And he enters his personal data Alexander, Garcia, Palacios, 71333594, 957281145, alexcgp94@gmail.com
###    And he enters his personal data
###      | fields         | description         |
###      | name           | Alexander           |
###      | fatherLastName | Garcia              |
###      | motherLastName | Palacios            |
###      | DNI            | 71333594            |
###      | phone          | 957281145           |
###      | eMail          | alexcgp94@gmail.com |
##    And he enters his address "<address>" and type of delivery 'DAD'
##    And he chooses a payment method <paymentMethode_Card>
##    When he finalizes his purchase accepting the terms and conditions
##    Then he should see the following message:
##         """
##         Tu pedido ha sido realizado satisfactoriamente. Te notificaremos cuando esté Programado
##         """
##    Examples:
##      | address                         | paymentMethode_Card |
##      | Óvalo de Miraflores 154         | POS, VISA           |
###      | Av Raul Ferrero 140 Molina, RET | POS, VISA           |
#
#
#
#
#
#
#
#
##Feature: Realizar compras desde el eCommerce
##  Con el fin de generar más ventas
##  Como gerente de tecnología de Farmacias Peruanas
##  Quiero que todos los usuarios puedan realizar sus compras desde el eCommerce Inkafarma
##
##    Background:
##      And the following information:
##        | address                   | delivery | typeDelivery                   |
##        | Av Diagonal 140, lima     | DC       | Despacho a domicilio (DAD)     |
##        | Av Raul Ferrero 140, lima | MiniDC   | Recojo en tienda (RET) y (DAD) |
##
##  Scenario Outline: Cliente no fidelizado realiza un pedido atendido por el Delivery Center (DC) para el dia de Hoy
##    Given Alex es un cliente no fidelizado y necesita realizar un pedido
##    And busca, agrega sus productos y compra ahora
##      | productName | presentation | quantity |
##      | panadol     | caja         | 10       |
##      | panadol     | caja         | 10       |
##      | panadol     | caja         | 10       |
##    And ingresa sus datos personales <fullName>, <DNI>, <phone> <eMail>
##    And él ingresa su direccion <address>, <typeDelivery>
##    And elige un metodo de pago <paymentMethode>, <nameCard_Cash>
##    When finaliza su compra aceptando los terminos y condiciones
##    Then el deberia visualizar el siguiente mensaje
##         """
##         Tu pedido ha sido realizado satisfactoriamente. Te notificaremos cuando esté Programado
##         """
##    Examples:
##      | address                   | typeDelivery | fullName    | DNI      | phone     | eMail               | paymentMethode | nameCard_Cash |
##      | Av Diagonal 140, lima     | DAD          | Alex Garcia | 71333594 | 957281145 | alexcgp94@gmail.com | POS            | Visa          |
##      | Av Raul Ferrero 140, lima | DAD          | Alex Garcia | 71333594 | 957281145 | alexcgp94@gmail.com | POS            | Amex          |
##      | Av Raul Ferrero 140, lima | RET          | Alex Garcia | 71333594 | 957281145 | alexcgp94@gmail.com | Cash           | 500           |
