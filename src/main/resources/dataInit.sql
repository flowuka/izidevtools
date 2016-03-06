INSERT INTO utilisateur (id, login, motDePasse) VALUES (1, 'uka', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO utilisateur (id, login, motDePasse) VALUES (2, 'zak', 'e10adc3949ba59abbe56e057f20f883e');

INSERT INTO typetodo (id, dateCreation, libelle, idCreateur) VALUES (1, '2016-03-06 22:55:32', 'Général', 1);
INSERT INTO typetodo (id, dateCreation, libelle, idCreateur) VALUES (2, '2016-03-06 23:21:32', 'Soccers-manage', 2);

INSERT INTO todo (id, dateCreation, description, libelle, idCreateur, idTypeTodo) VALUES ('1', '2016-03-06 23:21:32', 'Juste pour tester bla bla blabla1', 'Todo de test 1', '1', '1');
INSERT INTO todo (id, dateCreation, description, libelle, idCreateur, idTypeTodo) VALUES ('2', '2016-03-06 22:55:32', 'Juste pour tester bla bla blabla2', 'Todo de test 2', '2', '2');
