# Eduardo Salinas
SalinasEASWE@gmail.com
[GitHub](https://github.com) | [LinkedIn](https://linkedin.com)

---

## EDUCATION

**Bachelor of Science, Software Engineering**
*Western Governors University* | Millcreek, UT
*Graduation: June 2026*
- **Awarded Micro-Credentials:** Front-End Developer (2025) and Back-End Developer (2026).
- **Certifications:** AWS Certified Cloud Practitioner, ITIL IT Service Management.

**Bachelor of Science, Psychology**
*University of Texas Rio Grande Valley* | Edinburg, TX
*Graduation: Dec 2022*

---

## SKILLS

- **Programming Languages:** Java | Python | SQL (PostgreSQL/MySQL/SQLite) | JavaScript | TypeScript | HTML/CSS
- **Technologies:** AWS (Beanstalk, S3) | Spring Boot/Security/Data JPA | Three.js | Vite | Angular | Docker | Git | Node.js | Thymeleaf
- **Concepts:** REST APIs | JWT Auth | Rate Limits | BCrypt Hash | CORS | Data Structures & Algos | UI/UX | WebGL/3D Rendering
- **Tools:** IntelliJ IDEA | VS Code | DBeaver | Blender | Postman | JUnit 5 | Mockito | Maven | GitLab

---

## EXPERIENCE

**The Law Office of Rubio O. Salinas Jr.** | Edinburg, Texas
*Legal Information Specialist* | Oct 2025 - Present
- Digitized and indexed high-volume client discovery materials using OCR to significantly improve document searchability and retrieval speeds for legal teams.
- Developed automated data processing workflows to synthesize complex case information into concise summaries for efficient attorney review.
- Optimized case preparation by managing the transition of physical records into structured digital formats, ensuring data integrity and streamlined access.

**The Law Office of Rubio O. Salinas Jr.** | Edinburg, Texas
*Finance Manager* | March 2017 - Aug 2021
- Developed and implemented standard operating procedures that optimized payment collection efficiency and refined the client invoicing process.
- Leveraged Microsoft Excel for data organization and financial reporting to streamline daily administrative tasks and track overdue accounts.

---

## TECHNICAL PROJECTS

### Holonode: Interactive 3D Avatar Customizer
*Full Stack Software Engineer* | Remote
*Technologies: Spring Boot, Three.js, TypeScript, AWS*
- Architected and deployed a full stack web application featuring a real-time 3D avatar customization engine built with Three.js and WebGL, achieving 60 FPS rendering with dynamic lighting, shadow mapping, and GLB model loading.
- Engineered a stateless JWT authentication system using Spring Security with HMAC SHA-512 token signing with frontend JWT expiration detection, debounced real-time search, persistent color customization via localStorage, BCrypt password hashing, and a dual-bucket IP-based rate limiting strategy using Bucket4j to prevent brute force attacks.
- Designed a scalable RESTful API with Spring Boot implementing full CRUD operations for user accounts and outfit configurations, backed by a SQLite database managed through Hibernate JPA with single-table inheritance for extensible outfit types.
- Validated backend integrity through JUnit 5 unit tests using Mockito to mock rate limiting dependencies, verifying JWT token lifecycle and BCrypt password hashing behavior.
- Deployed the backend JAR to AWS Elastic Beanstalk and the compiled frontend to AWS S3 static website hosting, configuring environment-based secrets management and CORS policies for cross-origin security.

### Vacation Booking Backend MVP
*Full Stack Developer* | Remote
*Technologies: Spring Boot, MySQL, Angular*
- Ported a legacy vacation booking system to a modern Spring Boot architecture, implementing domain entities and repositories with full CORS support.
- Built a secure transactional checkout service utilizing UUID order tracking for unique identification and data integrity.
- Implemented idempotent customer seeding and request validation to ensure the stability and reliability of the backend database.
- Verified full-stack performance through end-to-end testing with an Angular frontend, confirming consistent database persistence.

### Mobile Vacation Scheduler
*Android Developer* | Remote
*Technologies: Java, Room/SQLite, Android Studio*
- Developed a native Android application using the Room Framework to manage vacation itineraries with persistent local data storage.
- Implemented complex UI validation logic to ensure correct date formatting and maintain referential integrity across database records.
- Integrated system-level notifications for schedule alerts and built sharing features to export itineraries via Email and SMS.

### Customer Retention Analytics
*Backend/Database Developer* | Remote
*Technologies: PostgreSQL, PL/pgSQL*
- Designed high-level customer retention metrics in PostgreSQL using PL/pgSQL to track 90-day re-rental patterns across multiple locations.
- Implemented database triggers and scheduled refresh procedures via pgAgent to maintain real-time accuracy of analytical reports.
