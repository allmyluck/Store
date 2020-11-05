Tables in Database Store :Roles, Users, Posts, Images

| *Roles 		   |
| -------------------------|
| id                       |
| user_id                  |
| role_name                |   



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
| image_id                 | 
| description              |
| price                    |
| time                     |  



| Images 		   | 
| -------------------------|
| id                       |
| image_id                 | 
| image(blob)              | 


---

Users(user_id) -> Roles(user_id) = OneToMany

Roles(user_id) -> Users(user_id) = ManyToOne

Posts(user_id) -> Users(user_id) = ManyToOne

Users(user_id) -> Posts(user_id) = OneToMany

Images(image_id) -> Posts(image_id) = ManyToOne

Posts(image_id) -> Images(image_id) = OneToMany

ALL ManyToOne = (CASCADE ON DELETE AND ON UPGRADE) 

***


