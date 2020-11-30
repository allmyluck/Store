Tables in Database Store :Users, Posts, Images


| *Users 		   |
| -------------------------|
| user_id                  |
| name                     |
| countryCode              | 
| number                   |
| role_name                |
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


Posts(user_id) -> Users(user_id) = ManyToOne

Users(user_id) -> Posts(user_id) = OneToMany

Images(image_id) -> Posts(image_id) = ManyToOne

Posts(image_id) -> Images(image_id) = OneToMany

ALL ManyToOne = (CASCADE ON DELETE AND ON UPGRADE) 

***


