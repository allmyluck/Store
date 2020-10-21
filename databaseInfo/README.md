Tables in Database Store :Roles, Users, Posts, Images

| *Roles 		   |
| -------------------------|
| id                       | 
| role_name                |   



| *Users 		   |
| -------------------------|
| id                       | 
| role_id                  | 
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
| image(blob)              | 


---

Roles(id) -> Users(role_id) = OneToMany

Users(role_id) -> Roles(id) = ManyToOne

Posts(user_id) -> Users(id) = ManyToOne

Users(id) -> Posts(user_id) = OneToMany

Images(id) -> Posts(image_id) = ManyToOne

Posts(image_id) -> Images(id) = OneToMany

ALL ManyToOne = (CASCADE ON DELETE AND ON UPGRADE) 

***


