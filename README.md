\documentclass[12pt]{article}
\usepackage[margin=1in]{geometry}
\usepackage{hyperref}
\usepackage{enumitem}

\title{\textbf{NovelTrack}}
\date{}

\begin{document}

\maketitle

\section*{Overview}
NovelTrack is a full-stack web application for tracking books, writing reviews, and managing your personal reading journey. Built with \textbf{Spring Boot (Java)} for the backend and \textbf{React} for the frontend, NovelTrack helps readers stay organized while sharing their thoughts on books with others.

\section*{Features}
\begin{itemize}[leftmargin=*]
    \item \textbf{User Management:} Create and manage user accounts.
    \item \textbf{Book Tracking:} Add books to your personal reading list and update their progress.
    \item \textbf{Reviews:} Write, view, and manage book reviews.
    \item \textbf{Search \& Browse:} Explore books and track items easily.
    \item \textbf{Responsive UI:} Built with React for a smooth user experience.
\end{itemize}

\section*{Tech Stack}
\subsection*{Backend}
\begin{itemize}[leftmargin=*]
    \item Java 17
    \item Spring Boot
    \item MySQL (for persistent data storage)
    \item JPA / Hibernate
\end{itemize}

\subsection*{Frontend}
\begin{itemize}[leftmargin=*]
    \item React
    \item React Router
    \item Material UI + Tailwind (for styling)
    \item Axios (for API calls)
\end{itemize}

\section*{Setup \& Installation}
\subsection*{Backend}
\begin{enumerate}[leftmargin=*]
    \item Navigate to the backend folder:
    \begin{verbatim}
    cd backend
    \end{verbatim}
    \item Update \texttt{application.properties} with your MySQL configuration:
    \begin{verbatim}
    spring.datasource.url=jdbc:mysql://localhost:3306/noveltrack
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    \end{verbatim}
    \item Run the backend:
    \begin{verbatim}
    ./mvnw spring-boot:run
    \end{verbatim}
\end{enumerate}

\subsection*{Frontend}
\begin{enumerate}[leftmargin=*]
    \item Navigate to the frontend folder:
    \begin{verbatim}
    cd frontend
    \end{verbatim}
    \item Install dependencies:
    \begin{verbatim}
    npm install
    \end{verbatim}
    \item Run the frontend:
    \begin{verbatim}
    npm start
    \end{verbatim}
\end{enumerate}

\section*{API Endpoints}
\subsection*{Users}
\begin{itemize}[leftmargin=*]
    \item \texttt{POST /api/users} \(\rightarrow\) Create new user
    \item \texttt{GET /api/users/\{id\}} \(\rightarrow\) Get user by ID
\end{itemize}

\subsection*{Reviews}
\begin{itemize}[leftmargin=*]
    \item \texttt{POST /api/reviews/\{bookId\}} \(\rightarrow\) Add review to book
    \item \texttt{GET /api/reviews/\{bookId\}} \(\rightarrow\) Get reviews for a book
\end{itemize}

\subsection*{Track Items}
\begin{itemize}[leftmargin=*]
    \item \texttt{POST /api/track/\{userId\}} \(\rightarrow\) Add book to user’s track list
    \item \texttt{GET /api/track/\{userId\}} \(\rightarrow\) Get user’s tracked books
\end{itemize}

\section*{Future Improvements}
\begin{itemize}[leftmargin=*]
    \item Authentication \& JWT-based security
    \item Book metadata integration with external APIs (e.g., Google Books API)
    \item Sorting \& filtering for reviews and tracked items
    \item Social features (friend lists, reading challenges, etc.)
\end{itemize}

\section*{Contributing}
Contributions are welcome! Please fork the repo and submit a pull request.

\section*{License}
This project is licensed under the MIT License.

\end{document}
