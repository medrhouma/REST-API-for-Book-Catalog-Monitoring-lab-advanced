    # 📚 Book Catalog API

Une API REST simple développée avec **Spring Boot** permettant de gérer un catalogue de livres (CRUD).

## 🚀 Technologies utilisées

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 (base de données en mémoire)
- Maven

---

## 📁 Structure du projet

```
src
├── main
│   ├── java
│   │   └── com.example.bookcatalog
│   │       ├── controller
│   │       │   └── BookController.java
│   │       ├── model
│   │       │   └── Book.java
│   │       ├── repository
│   │       │   └── BookRepository.java
│   │       └── BookCatalogApplication.java
│   └── resources
│       ├── application.properties
│       └── data.sql (optionnel)
```

---

## 📚 Endpoints de l’API

| Méthode | Endpoint             | Description                        |
|--------|----------------------|------------------------------------|
| GET    | `/api/books`         | Récupère la liste de tous les livres |
| GET    | `/api/books/{id}`    | Récupère un livre par son ID       |
| POST   | `/api/books`         | Crée un nouveau livre              |
| PUT    | `/api/books/{id}`    | Met à jour un livre existant       |
| DELETE | `/api/books/{id}`    | Supprime un livre                  |

---

## 🔧 Exemple de requête POST

```json
POST /api/books
Content-Type: application/json

{
  "title": "Le Petit Prince",
  "author": "Antoine de Saint-Exupéry"
}
```

---

## 🛠 Configuration

Fichier `application.properties` :
```properties
spring.datasource.url=jdbc:h2:mem:bookdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.show-sql=true
```

Accès à la console H2 : `http://localhost:8080/h2-console`

---

## ▶️ Lancer le projet

### Avec Maven :
```bash
mvn spring-boot:run
```

### Ou avec un IDE :
Lancer la classe `BookCatalogApplication.java`.

---

## 🧪 Tester l’API

- Utilise [Postman](https://www.postman.com/) ou [cURL](https://curl.se/)
- Accède à `http://localhost:8080/api/books`

---

## ✨ Auteur

- Mohamed Rhouma  
- Étudiant à l’ISET Tozeur  
- [LinkedIn](https://www.linkedin.com/in/rhouma-mohamed-6291b02b4)  
- [GitHub](https://github.com/medrhouma)



    

