Tables in Database Store :Users, Posts, Images


| *Users 		   |
| -------------------------|
| user_id                  |
| login                    |
| code_country             | 
| password                 |
| role_name                |
| number                   |  

---

*fullNumber : ="+" + countryCode + number;

*Users : user_id - primary key, auto-incrementc;

***

| *Posts 		   | 
| -------------------------|
| post_id                  | 
| title                    |
| user_id                  | 
| description              |
| price                    |
| time                     |  



| Images 		   | 
| -------------------------|
| id                       |
| image_id                 | 
| image(blob)              | 


---


Posts(user_id) -> Users(user_id) = ManyToOne

Users(user_id) -> Posts(user_id) = OneToMany

Images(image_id) -> Posts(image_id) = ManyToOne

Posts(image_id) -> Images(image_id) = OneToMany

ALL ManyToOne = (CASCADE ON DELETE AND ON UPGRADE) 

***


