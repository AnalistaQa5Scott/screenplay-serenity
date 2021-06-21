@Search
Business Need: Search products by name, brand or sku
  In order to sell more products
  As a digital product manager
  I want users to be able to find and see the detail of their products that best suits their needs

  Rule: search for valid product names, brands or skus
    @SearchProduct
    Scenario Template: users can search products by name, brand or SKU
      Given Alexander is a frequent customer and wants to search products
      When he tries to search by name or brand "<product name, brand or SKU>"
      Then he should see all the results for the matching products
      Examples:
        | product name, brand or SKU |
        | Crema dental               |
        | Huggies                    |
        | 1080                       |