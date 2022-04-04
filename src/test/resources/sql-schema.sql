DROP TABLE IF EXISTS `customers`;

CREATE TABLE IF NOT EXISTS `customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `item`;

CREATE TABLE IF NOT EXISTS `item` (
	`id` BIGINT AUTO_INCREMENT,
    `product_name` VARCHAR(64) NOT NULL UNIQUE,
    `price` DECIMAL(5,2) NOT NULL,
    PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
	`id` BIGINT AUTO_INCREMENT,
    `customer_id` BIGINT NOT NULL,
	PRIMARY KEY(id),
    CONSTRAINT `FK_cid_1` FOREIGN KEY(customer_id) REFERENCES customers (id)
);


DROP TABLE IF EXISTS `orders_items`;

CREATE TABLE `orders_items` (
	`order_id` BIGINT NOT NULL,
    `item_id` BIGINT NOT NULL,
	PRIMARY KEY (order_id, item_id),
    CONSTRAINT `FK_oid_1` FOREIGN KEY (order_id) REFERENCES orders(id),
    CONSTRAINT `FK_iid_1` FOREIGN KEY (item_id) REFERENCES item(id)
);




