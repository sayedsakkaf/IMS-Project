



INSERT INTO `customers` (`id`, `first_name`, `surname`) VALUES (1, 'jordan', 'harrison');
INSERT INTO `customers` (`id`, `first_name`, `surname`) VALUES (2, 'chris', 'perrins');




INSERT INTO `item` (`id`, `product_name`, `price`) VALUES (1, 'Cupboard', 120);


   

INSERT INTO `item` (`id`, `product_name`, `price`) VALUES (2, 'Chair', 150);
INSERT INTO `item` (`id`, `product_name`, `price`) VALUES (4, 'Chair', 150);
UPDATE item SET product_name = 'Laptop' , price = 200 WHERE id = 4;


SELECT * FROM item;
			   




INSERT INTO `order` (`item_id`, `customer_id`) VALUES (1, 1);
INSERT INTO `order` (`item_id`, `customer_id`) VALUES (2 ,2);
INSERT INTO `order` (`item_id`, `customer_id`) VALUES (1, 3);

INSERT INTO `orders_items` (`id`, `first_name`, `surname`, `product_name`) VALUES 
(1, `Sayed`, `Sakkaf`, `Television`),
(2, `James`, `Brown`, `Book`),
(3, `Jordan`, `Harrison`, `Television`);


