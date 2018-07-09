CREATE TABLE `book_user` (
  user_id INT(11) NOT NULL AUTO_INCREMENT,
  user_name VARCHAR(50) COLLATE utf8_unicode_ci NOT NULL,
  user_password CHAR(10) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`user_id`),
  KEY `user_name` (`user_name`)
) ENGINE=INNODB AUTO_INCREMENT=10000003 DEFAULT CHARSET=utf8 ;

COLLATE=utf8_unicode_ci
 
INSERT INTO book_user(user_name, user_password) VALUES('user1', 'user1.'),('user2', 'user2.');