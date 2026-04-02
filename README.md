                                                                                                                        
                                                                                                                        
             /#######                                                                                                   
         ########&@######,                                                                                              
       (#((((((@@@((((((#((    %@@@@   &@@@@  ,@@@.  @@@%  @@@@&    ((((#(((   *#((  (((( ((((((#  *(((  (((*           
       ((((((((@@@(((((((((,    /@@@   @@@@@@  @@@@ @@@@  @@@@@@    (((( ((((  *(((  (((( (((/     *(((  (((*           
       (((((((@@@((((((((((,    /@@@  @@@.@@@@  @@@@@@@  @@@@ @@@   (((((((((  *(((  ((((  /(((((( *((((((((*           
       ((((((((@@@(((((((((, %@@@@@@ @@@@@@@@@( ,@@@@@% *@@@@@@@@@  (((((((     ((((((((,.(((/(((( *(((  (((*           
       *(((((((%@@(((((((((  @@@@@  &@@@    @@@  @@@@@  @@@    @@@@ (((/ ((((((( ,((((*   (((((((  *(((  (((*           
          /(((((((((((((                                                                                                
              .((((/                                                                                                    
                                                                                                                        


---

# 🎮 RPG Admin Backend (Hibernate)

Hibernate-based RPG admin backend with MySQL persistence.
The project is fully implemented and ready to run — only database connection settings need to be adjusted.

---

## 🚀 Tech Stack

* Java 8
* Maven
* Hibernate
* MySQL 8
* Spring

---

## ⚙️ Quick Start

### 1. Clone the repository

```bash
git clone https://github.com/wladimir-schneider/project-hibernate-1.git
cd project-hibernate-1
```

---

### 2. Configure Database Connection

Update the database URL in the project (e.g. in `PlayerRepositoryDB`):

```java
properties.put(Environment.URL, "jdbc:mysql://<YOUR_DB_HOST>:3306/rpg");
```

Replace `<YOUR_DB_HOST>` with your database IP (e.g. `localhost`).

---

### 3. Create Database

```sql
CREATE SCHEMA rpg;
```

---

### 4. (Optional) Load Test Data

Run:

```
src/main/resources/init.sql
```

---

### 5. Build & Run

```bash
mvn clean install
```

Then start the application via your IDE.

---

## 🗄️ Database

* Schema: `rpg`
* Tables are created automatically by Hibernate
* No manual table setup required

---

## 🔧 Features

* Hibernate-based repository layer
* Pagination support
* Native & Named queries
* Transaction handling
* Clean shutdown with resource release

---

## ✅ Status

✔ Fully implemented
✔ Ready to run
✔ Only DB connection needs configuration

---

## 📌 Note

Designed as a learning project.
In real-world applications, Hibernate is typically used via **Spring Data JPA**.
