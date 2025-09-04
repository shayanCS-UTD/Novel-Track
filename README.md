📚 NovelTrack

NovelTrack is a full-stack web application for tracking books, writing reviews, and managing your personal reading journey. Built with Spring Boot (Java) for the backend and React for the frontend, NovelTrack helps readers stay organized while sharing their thoughts on books with others.

🚀 Features

  User Management: Create and manage user accounts.
  
  Book Tracking: Add books to your personal reading list and update their progress.
  
  Reviews: Write, view, and manage book reviews.
  
  Search & Browse: Explore books and track items easily.
  
  Responsive UI: Built with React for a smooth user experience.

🛠️ Tech Stack

Backend

  Java 17
  
  Spring Boot
  
  MySQL (for persistent data storage)
  
  JPA / Hibernate
  
  Frontend
  
  React
  
  React Router
  
  Material UI + Tailwind (for styling)
  
  Axios (for API calls)

⚙️ Setup & Installation

Backend

Navigate to the backend folder:

  cd backend


Update application.properties with your MySQL configuration:

  spring.datasource.url=jdbc:mysql://localhost:3306/noveltrack
  spring.datasource.username=your_username
  spring.datasource.password=your_password
  spring.jpa.hibernate.ddl-auto=update


Run the backend:

  ./mvnw spring-boot:run

Frontend

Navigate to the frontend folder:

  cd frontend


Install dependencies:

  npm install


Run the frontend:

  npm start

🌐 API Endpoints
Users

  POST /api/users → Create new user

  GET /api/users/{id} → Get user by ID

Reviews

  POST /api/reviews/{bookId} → Add review to book

  GET /api/reviews/{bookId} → Get reviews for a book

Track Items
  POST /api/track/{userId} → Add book to user’s track list

  GET /api/track/{userId} → Get user’s tracked books
POST /api/track/{userId} → Add book to user’s track list

GET /api/track/{userId} → Get user’s tracked books
