INSERT into author (id, firstname, lastname) VALUES
('1','G-J', 'Heireman'),
('2','Michael', 'Greefs'),
('3','Niels', 'Claeys');

INSERT into book_description (id, isbn, title, url) VALUES
('1','1', 'Lotr', 'https://images-na.ssl-images-amazon.com/images/I/51EstVXM1UL._SX331_BO1,204,203,200_.jpg'),
('2','2', '50 Shades','https://upload.wikimedia.org/wikipedia/en/b/b2/Fifty_Shades_triology_%28paperback%29_cover.jpg'),
('3','3', 'Harry Potter','https://ewedit.files.wordpress.com/2016/09/hpsorcstone.jpg?w=405');

INSERT into tag (id, name) VALUES
('1','Fantasy'),
('2','Drama'),
('3','Thriller');

INSERT into book (id, bookdescription_id) VALUES
('1','1'),
('2','2'),
('3','3'),
('4','3');

INSERT into bookdescription_tag (bookdescription_id, tag_id) VALUES
('1','1'),
('2','1'),
('2','2'),
('3','3');

INSERT into bookdescription_author (bookdescription_id, author_id) VALUES
('1','1'),
('2','2'),
('3','3');


