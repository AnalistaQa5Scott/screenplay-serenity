#@Search
#Business Need: Search products by name, brand or sku
#  In order to sell more products
#  As a digital product manager
#  I want users to be able to find and see the detail of their products that best suits their needs
#
#  Rule: search for valid product names, brands or skus
#    @SearchProduct
#    Scenario Template: users can search products by name, brand or SKU
#      Given Alexander is a frequent customer and wants to search products
#      When he tries to search by name or brand "<product name, brand or SKU>"
#      Then he should see all the results for the matching products
#      Examples:
#        | product name, brand or SKU |
#        | Crema dental               |
#        | Huggies                    |
#        | 1080                       |
#
##Business Need: Search products by name, brand or sku
##  In order to sell more products
##  As a digital product manager
##  I want users to be able to find and see the detail of their products that best suits their needs
##
##  Rule: search for valid product names, brands or skus
##
##    Example: users can search products by name or brand
##      Given Alexander es un u
##
##    Fondo:
##      Given Tracy es un viajero frecuente registrado
##    Y Tracy ha iniciado sesión
##
##    Regla: los viajeros pueden buscar viajes sencillos o de ida y vuelta
##    Ejemplo: búsqueda de un solo viaje
##      Given Tracy quiere viajar de Nueva York a Londres en Economy
##    Cuando busca vuelos disponibles
##    Entonces se le deberían mostrar todos los vuelos coincidentes.
##
##    Regla: los viajeros pueden reservar un vuelo que hayan encontrado
##    @Actual
##    Ejemplo: Tracy reserva un vuelo que ha encontrado
##      Given Tracy ha encontrado un vuelo de Nueva York a Londres en Economy
##    Cuando reserva el vuelo
##    Entonces el vuelo debería aparecer en sus reservas.
##
###Feature: test inkafarma
####  @alex
####  @Manual
####  @Manual-result:failed
####  @Manual-test-evidence:https://prnt.sc/10q7ew5
####  Scenario: test 1
####  Failure: Issue 1
####    Given Clive has made a purchase
####    When he reviews his past orders
####    Then he should be able to download his invoice as an PDF file
####    In order to generate more sales
####    As a technology manager of Farmacias Peruanas
####    I want all users to be able to make their purchases from the Inkafarma eCommerce
###
####  @Anonymous
####  Scenario Outline: Non-loyal customer places an order attended by the DeliveryCenter (DC) or MiniDC
####    Given alex searches, adds his products <SKU_Quantity_Presentation> and buys now
####    And he enters his personal data Alexander Garcia, 71333594, 957281145, alexcgp94@gmail.com
####    And he enters his address <address> and type of delivery DAD, RET
####    And he selects 'today' and a type of voucher 'FACTRURA'
####    And he chooses a payment method <paymentMethode_Card>
####    When he finalizes his purchase accepting the terms and conditions
####    Then he should see the following message 'Tu pedido ha sido realizado satisfactoriamente. Te notificaremos cuando esté Programado'
####    Examples:
####      | SKU_Quantity_Presentation       | address                      | paymentMethode_Card |
####      | 108020_2_Pack, 009577_2_Blister | Diagonal 140 Miraflores, DAD | POS, VISA           |
###
###  Scenario Outline:
###    Given alex searches, adds his products <SKU_Quantity_Presentation> <presentation> and buys now
###    When he finalizes his purchase
###    Examples:
###      | SKU_Quantity_Presentation                                                                         |
###      | 006096_2_Sobre, 207146_4_Blister, 161001_2_Blister, 426144_2_Pack, 023740_2_Sobre, 005976_7_Sobre |
###      | 006096_2_Sobre, 207146_4_Blister                                                                  |
###      | 006096_2_Pack, 207146_1_Pack                                                                      |
###      | 006096_2_Pack, 207146_1_Pack                                                                      |
###      | 006096_2_Sobre, 207146_4_Blister                                                                  |
###      | 006096_2_Sobre, 207146_4_Blister                                                                  |
####
