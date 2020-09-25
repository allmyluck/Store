| id(int) | name(varchar) | countryCode(int) |  number(int) | maybe fullNumber = + countryCode number| -> table 1(authors) id - primary key, auto-increment

link( id -> member id )

| member_id(int) | title(varchar) | images(blob) | description(text) | time(время, когда было выложено объявление)(datetime) | -> table 2(publications)

Добавление записи:

1) если нет такого имя и номера добавляем в таблицу 1, иначе добавляем запись в таблицу 2 с member_id = id из таблицы 1.

Удаление:

1) пользователь - с помощью join ; вначале из table 2, затем пользователя из table 1

2) объявление - по заголовку(title)

Материалы:

https://shra.ru/2017/09/sql-join-v-primerakh-s-opisaniem/
