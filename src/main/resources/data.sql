INSERT INTO
INGREDIENTS(NAME, AMOUNT, SPICY, VEGGIE)
VALUES
('Cheese', 1.4, false, true),
('Ham', 0.7, false, false),
('Mushrooms', 0.4, false, true),
('Olives', 0.7, false, true),
('Chili', 0.4, true, true),
('Pepperoni', 0.6, true, false),
('Pineapple', 0.6, false, true),
('Parmesan', 0.6, false, true),
('Bacon', 0.6, false, true),
('Herbs', 0.6, false, true),
('Tomato sauce', 0.4, false, true),
('Eggs', 0.6, false, true);

INSERT INTO
PIZZAS(NAME, DESCRIPTION, VEGGIE)
VALUES
('Capriciosa', 'Classic choice', false),
('Pepperoni', 'The top choice comfort food', false),
('Margherita', 'Minimalism at its tastiest', true),
('Flambee', 'Mmmm bacon', false),
('Veggie', 'Healthy choice', true),
('Quattro Formagie', 'For the cheese lovers', true),
('Quattro Stagione', 'For the meat lovers', false),
('Alpolia', 'For the adventurists', true),
('Hawaiian', 'The ultimate debate', false),
('Vegan', 'For the picky eaters', true);


INSERT INTO
PIZZAS_INGREDIENTS(PIZZAS_NAME, INGREDIENTS_NAME)
VALUES
('Capriciosa', 'Ham'),
('Capriciosa', 'Cheese'),
('Capriciosa', 'Mushrooms'),
('Capriciosa', 'Tomato sauce'),
('Pepperoni', 'Tomato sauce' ),
('Pepperoni', 'Cheese'),
('Pepperoni', 'Pepperoni'),
('Margherita', 'Tomato sauce'),
('Margherita', 'Cheese'),
('Flambee', 'Tomato sauce'),
('Flambee','Bacon' ),
('Flambee', 'Eggs'),
('Flambee', 'Olives'),
('Veggie', 'Cheese'),
('Veggie', 'Tomato sauce'),
('Veggie', 'Olives'),
('Veggie', 'Mushrooms'),
('Veggie', 'Chili'),
('Quattro Formagie', 'Cheese'),
('Quattro Formagie', 'Tomato sauce'),
('Quattro Stagione', 'Tomato sauce'),
('Quattro Stagione', 'Pepperoni'),
('Quattro Stagione', 'Ham'),
('Quattro Stagione', 'Bacon'),
('Alpolia', 'Cheese'),
('Alpolia', 'Herbs'),
('Hawaiian', 'Tomato sauce'),
('Hawaiian', 'Cheese'),
('Hawaiian', 'Pineapple'),
('Vegan', 'Tomato sauce'),
('Vegan', 'Mushrooms');
