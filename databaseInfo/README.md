| Tables in Database Store | 
| -------------------------|
| Users                    | 
| Posts                    |  

| *Users 		   | 
| -------------------------|
| id(->member_id)          | 
| name                     |
| countryCode              | 
| number                   |
| maybe *fullNumber        |  

| *Posts 		   | 
| -------------------------|
| member_id                | 
| title                    |
| images or image(blob)    | 
| description              |
| time                     |  


*fullNumber : ="+" + countryCode + number;

*Users : id - primary key, auto-incrementc;

link( id -> member id )

Добавление записи:

1) если нет такого имя и номера добавляем в таблицу 1, иначе добавляем запись в таблицу 2 с member_id = id из таблицы 1.

Удаление:

1) пользователь - с помощью join ; вначале из table 2, затем пользователя из table 1

2) объявление - по заголовку(title)

Материалы:

https://shra.ru/2017/09/sql-join-v-primerakh-s-opisaniem/
