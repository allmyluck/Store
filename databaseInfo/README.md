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

*Posts : link( Users.user_id -> Posts.user_id ); link(Images.image_id -> Posts.image_id)


***

| Images 		   | 
| -------------------------|
| image_id                 | 
| image(blob)              |



Добавление записи:

1) если нет такого имя и номера добавляем в таблицу 1, иначе добавляем запись в таблицу 2 с member_id = id из таблицы 1.

Удаление:

1) пользователь - с помощью join ; вначале из table 2, затем пользователя из table 1

2) объявление - по заголовку(title)

Материалы:

https://shra.ru/2017/09/sql-join-v-primerakh-s-opisaniem/
