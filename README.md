# ProjectShag
Приложение имеет БЕТА версию. Суть его- из базы данных посредством чекбоксов выбираются ингредиенты и пр нажатии на кнопку "Создать коктейль(Create Cocktail) выбираются подходящие коктейли.

Параметры проетка в настройке IDEA Ultimate: SDK-1.8; Java Language level 17.
FRONT- Руцкий Кирилл
BACK-Бондарчик Игорь

В файле application.yaml указать свои логин/пароль для MySQL базы данных.

Для примера команды заполнить БД:
(для удобства выделит все, вставить с блокнот) 

INSERT INTO light_drink (id,name) VALUES (1,'вода');
INSERT INTO light_drink (id,name) VALUES (2,'кола');
INSERT INTO light_drink (id,name) VALUES (3,'апельсиновый сок');
INSERT INTO light_drink (id,name) VALUES (4,'содовая');
INSERT INTO light_drink (id,name) VALUES (5,'лаймовый сок');
INSERT INTO light_drink (id,name) VALUES (6,'сахарный сироп');
INSERT INTO light_drink (id,name) VALUES (7,'гренадин');
INSERT INTO light_drink (id,name) VALUES (8,'тоник');
INSERT INTO light_drink (id,name) VALUES (9,'яблочный сок');
INSERT INTO light_drink (id,name) VALUES (10,'лимонный сок');
INSERT INTO midle_drink (id, name) VALUES (1,'лайм');
INSERT INTO midle_drink (id, name) VALUES (2,'оливки');
INSERT INTO midle_drink (id, name) VALUES (3,'лед');
INSERT INTO midle_drink (id, name) VALUES (4,'ананас');
INSERT INTO midle_drink (id, name) VALUES (5,'яблоко');
INSERT INTO midle_drink (id,name) VALUES (6,'мята');

INSERT INTO strong_drink (id,name) VALUES (1,'айриш крим');
INSERT INTO strong_drink (id,name) VALUES (2,'трипл сек');
INSERT INTO strong_drink (id,name) VALUES (3,'персиковый ликер');
INSERT INTO strong_drink (id,name) VALUES (4,'красный вермут');
INSERT INTO strong_drink (id,name) VALUES (5'красный биттер');
INSERT INTO strong_drink (id,name) VALUES (6,'белый ром');
INSERT INTO strong_drink (id,name) VALUES (7,'ликер амаретто');
INSERT INTO strong_drink (id,name) VALUES (8,'кофейный ликер');
INSERT INTO strong_drink (id,name) VALUES (9,'сухой вермут');
INSERT INTO strong_drink (id,name) VALUES (10,'сухой джин');
INSERT INTO strong_drink (id,name) VALUES (11,'золотой ром');
INSERT INTO strong_drink (id,name) VALUES (12,'серебряная текила');
INSERT INTO strong_drink (id,name) VALUES (13,'просекко');
INSERT INTO strong_drink (id,name) VALUES (14,'апероль');
INSERT INTO strong_drink (id,name) VALUES (15,'водка');
INSERT INTO strong_drink (id,name) VALUES (16,'ром');
INSERT INTO strong_drink (id,name) VALUES (17,'виски');
INSERT INTO strong_drink (id,name) VALUES (18,'джин');

INSERT INTO cocktail (id,name,description,structure,link) VALUES (1,'Джин тоник','Наполни хайбол кубиками льда доверху. Налей джин 50 мл. Долей тоник доверху и аккуратно размешай коктейльной ложкой. Укрась кружками лайма.','сухой джин, тоник, лайм, лед','https://www.youtube.com/embed/F_QUp1Mr5-c');
INSERT INTO cocktail (id,name,description,structure,link) VALUES (2,'Апероль Шприц','Наполни бокал для вина льдом. Налей в бокал просекко 100 мл и апероль 100 мл. Добавь сплэш содовой и размешай коктейльной ложкой. Укрась долькой апельсина.','апероль, просекко, содовая, апельсин, лед','https://www.youtube.com/embed/R3hRraKZVzA');
INSERT INTO cocktail (id,name,description,structure,link) VALUES (3,'Дайкири','Налей в шейкер лаймовый сок 30 мл, сахарный сироп 15 мл и белый ром 60 мл. Наполни шейкер кубиками льда и взбей. Перелей через стрейнер в охлажденное шампанское блюдце.','белый ром, сахарный сироп, лаймовый сок, лед','https://www.youtube.com/embed/POkFkx1_8VA');
INSERT INTO cocktail (id,name,description,structure,link) VALUES (4,'Текила санрайз','Наполни хайбол кубиками льда доверху. Налей гренадин 10 мл и серебряную текилу 50 мл. Долей апельсиновый сок доверху и аккуратно размешай коктейльной ложкой. Укрась кружком апельсина.','серебряная текила, гренадин, апельсиновый сок, апельсин, лед','https://www.youtube.com/embed/0xh-0ou9dMk');
INSERT INTO cocktail (id,name,description,structure,link) VALUES (5,'Куба либре','Наполни хайбол кубиками льда доверху. Налей лаймовый сок 10 мл и золотой ром 50 мл. Долей колу доверху и аккуратно размешай коктейльной ложкой. Укрась кружками лайма.','золотой ром, лаймовый сок, кола, лайм, лед','https://www.youtube.com/embed/S-FskdyyYAQ');
INSERT INTO cocktail (id,name,description,structure,link) VALUES (6,'Отвертка','Наполни коллинз кубиками льда доверху. Налей водку 50 мл. Долей апельсиновый сок доверху и аккуратно размешай коктейльной ложкой. Укрась долькой апельсина.','водка, апельсиновый сок, апельсин, лед','https://www.youtube.com/embed/VEAWZXt_uqs');
INSERT INTO cocktail (id,name,description,structure,link) VALUES (7,'Драй мартини','Налей в стакан для смешивания сухой вермут 15 мл. и джин 75 мл. Наполни стакан кубиками льда и размешай коктейльной ложкой. Перелей через стрейнер в охлажденный коктейльный бокал. Укрась оливкой на шпажке.','сухой джин, сухой вермут, оливки, лед','https://www.youtube.com/embed/BadZNQLN5y4');
INSERT INTO cocktail (id,name,description,structure,link) VALUES (8,'Виски кола','Наполни хайбол кубиками льда доверху. Налей американский виски 50 мл. Долей колу доверху и аккуратно размешай коктейльной ложкой.','виски, кола, лед','https://www.youtube.com/embed/MIX_tnvRZWg');
INSERT INTO cocktail (id,name,description,structure,link) VALUES (9,'Черный русский','Наполни рокс кубиками льда доверху. Налей кофейный ликер 25 мл, водку 50 мл и размешай коктейльной ложкой.','водка, кофейный ликер, лед',https://www.youtube.com/embed/XQB4dNPheB4');
INSERT INTO cocktail (id,name,description,structure,link) VALUES (10,'Мимоза','Налей в охлажденный бокал флюте апельсиновый сок 90 мл. Долей просекко доверху и аккуратно размешай коктейльной ложкой.','просекко, апельсиновый сок',https://www.youtube.com/embed/kG9nQEwOI90');
INSERT INTO cocktail (id,name,description,structure,link) VALUES (11,'Крестный отец','Налей в охлажденный бокал флюте апельсиновый сок 90 мл. Долей просекко доверху и аккуратно размешай коктейльной ложкой.','виски, ликер амаретто, лед','https://www.youtube.com/embed/6IQrNvLegk8');
INSERT INTO cocktail (id,name,description,structure,link) VALUES (12,'Ром кола','Наполни хайбол кубиками льда доверху. Налей лаймовый сок 10 мл. и белый ром 50 мл. Долей колу доверху и аккуратно размешай коктейльной ложкой. Укрась 2 кружочками лайма.','белый ром, лаймовый сок, кола, лайм, лед','https://www.youtube.com/embed/2v_HiT6U9yA');
INSERT INTO cocktail (id,name,description,structure,link) VALUES (13,'Кампари тоник','Наполни бокал для вина льдом. Налей красный биттер 50 мл и тоник доверху. Аккуратно размешай коктейльной ложкой. Укрась долькой лайма.','красный биттер, тоник, лайм, лед','https://www.youtube.com/embed/IW1x8QqeS_A');
INSERT INTO cocktail (id,name,description,structure,link) VALUES (14,'Яблочный мартини','Налейте в шейкер водку, яблочный и лимонный сок, заполните доверху льдом и встряхните, чтобы смесь охладилась. Процедите в бокал для мартини и украсьте долькой яблока.','водка, яблочный сок, лимонный сок, лед, долька яблока','https://www.youtube.com/embed/hKvdiKgvmJg');
INSERT INTO cocktail (id,name,description,structure,link) VALUES (15,'Manhattan','Налейте в шейкер или любую емкость для смешивания бурбон и красный вермут в пропорции 3:1. Заполните шейкер кубиками льда и хорошо размешайте коктейль. Перелейте «Манхэттен» в коктейльную рюмку и гарнируйте вишенкой. Кстати, если заменить бурбон на виски, то получится коктейль Rob Roy — еще один мировой алкогольный шедевр.','бурбон, красный вермут, коктейльная вишня, лед','https://www.youtube.com/embed/SciW4bSs1jA');
INSERT INTO cocktail (id,name,description,structure,link) VALUES (16,'Мохито','Положи в хайбол лайм 3 дольки и подави мадлером. Возьми мяту 10 листиков в одну руку и хлопни по ним другой рукой.Положи мяту в хайбол.Наполни бокал дробленым льдом доверху.Добавь сахарный сироп 15 мл и белый ром 50 мл. Долей содовую доверху и аккуратно размешай коктейльной ложкой.Досыпь немного дробленого льда.Укрась веточкой мяты и долькой лайма.','белый ром, сахарный сироп, содовая, лайм, мята, дробленый лед','https://www.youtube.com/embed/96WxQYF_BrU');
INSERT INTO cocktail (id,name,description,structure,link) VALUES (17,'Секс на пляже','Наполни слинг кубиками льда доверху. Налей в шейкер клюквенный сок 40 мл, ананасовый сок 40 мл, персиковый ликер 25 мл. и водку 50 мл. Наполни шейкер кубиками льда и взбей. Перелей через стрейнер в слинг. Укрась кусочком ананаса и коктейльной вишней на шпажке.','водка, персиковый ликер, клюквенный сок, ананасовый сок, ананас,  коктейльная вишня, лед',https://www.youtube.com/embed/eW0Gw3iFg0k');
INSERT INTO cocktail (id,name,description,structure,link) VALUES (18,'Б-52','Налей в стопку кофейный ликер 15 мл. Используя коктейльную ложку, уложи слой айриш крим 15 мл. и слой ликера трипл сек 15 мл. Поджигай, вооружайся трубочками и угощай!','кофейный ликер, айриш крим, трипл сек','https://www.youtube.com/embed/Q19-Z4GZO5M');
