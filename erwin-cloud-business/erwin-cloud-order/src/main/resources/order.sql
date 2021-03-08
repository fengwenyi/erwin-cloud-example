CREATE TABLE `order` (
                         `id` bigint(20) NOT NULL,
                         `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
                         `product_id` bigint(20) DEFAULT NULL COMMENT '产品id',
                         `count` int(11) DEFAULT NULL COMMENT '数量',
                         `money` decimal(11,0) DEFAULT NULL COMMENT '金额',
                         `status` tinyint(1) DEFAULT NULL COMMENT '订单状态。0：待支付；1：已支付。',
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;