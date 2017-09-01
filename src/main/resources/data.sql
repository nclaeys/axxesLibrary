INSERT into author (id, firstname, lastname) VALUES
('1','G-J', 'Heireman'),
('2','Michael', 'Greefs'),
('3','Niels', 'Claeys');

INSERT into book_description (id, isbn, title, url) VALUES
('1','1', 'Lotr', 'https://images-na.ssl-images-amazon.com/images/I/51EstVXM1UL._SX331_BO1,204,203,200_.jpg'),
('2','2', '50 Shades','https://upload.wikimedia.org/wikipedia/en/b/b2/Fifty_Shades_triology_%28paperback%29_cover.jpg'),
('3','3', 'Harry Potter','https://ewedit.files.wordpress.com/2016/09/hpsorcstone.jpg?w=405'),
('4','4', 'Just Spring', 'https://images-na.ssl-images-amazon.com/images/I/51XfcEbbg6L._AC_UL320_SR244,320_.jpg'),
('5','5', 'Clean Code','https://images-na.ssl-images-amazon.com/images/I/41TINACY3hL._SX384_BO1,204,203,200_.jpg'),
('6','6', 'Java 8 Lambdas','http://cdn.journaldev.com/wp-content/uploads/2015/03/Java-8-Lambdas-343x450.jpg'),
('7','7', 'OCP Java SE 8 Programmer 2', 'https://2.bp.blogspot.com/-ZmSyMdEA-R4/WWtO033tfOI/AAAAAAAAJEI/qYTyokynpug8ARK6SL6qUMpyeATa90c4ACLcBGAs/s320/OCP%2BOracle%2BCertified%2BProfessional%2BJava%2BSE%2B8%2BProgrammer%2BII%2BStudy%2BGuide.png'),
('8','8', 'The mythical man-month','https://images.gr-assets.com/books/1419341264l/1904149.jpg'),
('9','9', 'Javascript: the good parts','https://images-na.ssl-images-amazon.com/images/I/81kqrwS1nNL.jpg'),
('10','10', 'Kotlin in action', 'https://kotlinlang.org/assets/images/kotlin-in-action.png'),
('11','11', 'Scala in action','https://images-na.ssl-images-amazon.com/images/I/41%2BSgkBKEBL._SX396_BO1,204,203,200_.jpg'),
('12','12', 'Clojure in action','https://images-na.ssl-images-amazon.com/images/I/41%2BSgkBKEBL._SX396_BO1,204,203,200_.jpg'),
('13','13', 'AngularJS Up & Running', 'https://covers.oreillystatic.com/images/0636920033486/lrg.jpg'),
('14','14', 'Haskell Programming from first principles','http://haskellbook.com/images/book_cover-min.png');

INSERT into tag (id, name) VALUES
('1','Fantasy'),
('2','Drama'),
('3','Thriller');

INSERT into book (id, bookdescription_id) VALUES
('1','1'),
('2','2'),
('3','3'),
('4','4'),
('5','5'),
('6','6'),
('7','7'),
('8','8'),
('9','9'),
('10','10'),
('11','11'),
('12','12'),
('13','13'),
('14','14');

INSERT into bookdescription_tag (bookdescription_id, tag_id) VALUES
('1','1'),
('2','1'),
('2','2'),
('3','3');

INSERT into bookdescription_author (bookdescription_id, author_id) VALUES
('1','1'),
('2','2'),
('3','3');


