# BorutoServer 🥷

A lightweight Ktor backend server built with Kotlin, featuring a simple hero API inspired by the Boruto universe.

This project is designed to demonstrate clean backend architecture, including routing, repositories, serialization, and plugin configuration.

## 🚀 Features
- Hero data model with a repository layer
- Endpoints for
  - Fetching all heroes
  - Searching heroes by name
  - Root endpoint for basic health/info
- Structured routing with Ktor DSL
- Clean logging and error handling via status pages
  
## 🔌 Plugins

| Name                                                                   | Description                                                                        |
| ------------------------------------------------------------------------|------------------------------------------------------------------------------------ |
| [Content Negotiation](https://start.ktor.io/p/content-negotiation)     | Provides automatic content conversion according to Content-Type and Accept headers |
| [Routing](https://start.ktor.io/p/routing)                             | Provides a structured routing DSL                                                  |
| [kotlinx.serialization](https://start.ktor.io/p/kotlinx-serialization) | Handles JSON serialization using kotlinx.serialization library                     |
| [Call Logging](https://start.ktor.io/p/call-logging)                   | Logs client requests                                                               |

## 🛠️ Building & Running

To build or run the project, use one of the following tasks:

| Task                                    | Description                                                          |
| -----------------------------------------|---------------------------------------------------------------------- |
| `./gradlew test`                        | Run the tests                                                        |
| `./gradlew build`                       | Build everything                                                     |
| `./gradlew run`                         | Run the server                                                       |

If the server starts successfully, you'll see the following output:

```
2024-12-04 14:32:45.584 [main] INFO  Application - Application started in 0.303 seconds.
2024-12-04 14:32:45.682 [main] INFO  Application - Responding at http://0.0.0.0:8080
```

## 📡 Endpoints

| Endpoint                | Method | Description                |
| ------------------      | ------ | -------------------------- |
| `/`                     | GET    | Root endpoint, server info |
| `/heroes`               | GET    | Get all heroes             |
| `/heroes?name=heroName` | GET    | Search heroes by name      |

## 🧱 Project Structure
```
BorutoServer/
├─ src/
│  ├─ main/
│  │  ├─ kotlin/
│  │  │  └─ com/
│  │  │     └─ personalproject/
│  │  │        ├─ di/            # Dependency injection
│  │  │        ├─ models/        # Data models (Hero, etc.)
│  │  │        ├─ plugins/       # Installed Ktor plugins (routing, serialization...)
│  │  │        ├─ repository/    # Data source / business logic
│  │  │        ├─ routes/        # API endpoints
│  │  │        └─ Application.kt # Main application entry point
│  │  └─ resources/          
│  └─ test/                  
├─ .gitignore
```
## 🕹️ Example fetch
<img width="1784" height="763" alt="image" src="https://github.com/user-attachments/assets/bba5bfd4-6f8b-41c4-92a4-5b3d0c3908a0" />
