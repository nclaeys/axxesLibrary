INSERT into author (id, firstname, lastname) VALUES
('1','G-J', 'Heireman'),
('2','Michael', 'Greefs'),
('3','Niels', 'Claeys');

INSERT into book_description (id, isbn, title) VALUES
('1','1', 'Lotr'),
('2','2', '50 Shades'),
('3','3', 'Harry Potter');

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


