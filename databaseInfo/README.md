Tables in Database Store : Users, Posts

| *Users 		   |
| -------------------------|
| user_id                  | 
| name                     |
| countryCode              | 
| number                   |
| maybe *fullNumber        |  

---

*fullNumber : ="+" + countryCode + number;

*Users : user_id - primary key, auto-incrementc;

***

| *Posts 		   | 
| -------------------------|
| user_id                  | 
| title                    |
| image_id*                | 
| description              |
| price                    |
| time                     |  


---

*Posts : link( Users.user_id -> Posts.user_id ); link(Posts.image_id -> Images.image_id)


***

| Images 		   | 
| -------------------------|
| image_id                 | 
| image(blob)              |


---

Examle:

1)INSERT INTO Users(.(1)#, 'Gena', 375, 275303032, 375275303032 || +375275303032(text));

2)INSERT INTO Posts(1##, 'Beer',.(1)!, 'good Beer', 500, 21:9:2020 16:32:00);

3)INSERT INTO Images(1!!, picture1.png);

4)INSERT INTO Images(1##, picture2.png);

.(x) - x auto_increment and maybe primary;

link(#, ##) -> link(Users.user_id(unique) -> Posts.user_id). 

link(!, !!) -> link(Posts.image_id(unique) -> Images.image_id).

***



Добавление записи:

1) если нет такого имя и номера добавляем в таблицу 1, иначе добавляем запись в таблицу 2 с member_id = id из таблицы 1.

Удаление:

1) пользователь - с помощью join ; вначале из table 2, затем пользователя из table 1

2) объявление - по заголовку(title)

Материалы:

https://shra.ru/2017/09/sql-join-v-primerakh-s-opisaniem/
