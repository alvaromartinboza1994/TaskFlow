# 🧠 TaskFlow — Task & Project Management App

TaskFlow is a **task management system** built with **Spring Boot**.  
Its goal is to provide an API for managing projects and their tasks, similar to Todoist or Trello, but designed as a learning and exploration project for backend architecture, clean code, and REST API design.

TaskFlow es un **sistema de gestión de tareas** construido con **Spring Boot**.  
Su objetivo es proveer un API para la gestión de proyectos y sus tareas, similar al funcionamiento de Todoist o Trello, pero diseñado como un proyecto personal para mi aprendizaje y exploración personal con una arquitectura backend, clean code y diseño de API REST. 

---

## ✨ **Project Overview**

**TaskFlow** allows users to:
- Create and manage projects.
- Add tasks to those projects.
- Track each task’s status, priority, and progress.
- Interact with a REST API designed with scalability and clarity.

This project is being built progressively to simulate a real-world development workflow.

**TaskFlow** permite a los usuarios:
- Crear y manejar proyectos.
- Añadir tareas a esos proyectos.
- Comprobar el estado, prioridad y progreso de cada tarea.
- Interactuar con un API REST diseñada con escalabilidad y claridad.  
Este proyecto está siendo construido progresivamente para simular un desarrollo de trabajo real.
---

## 🧩 **Main Features (Phase 1)**

- ✅ Create, update, and delete **Projects**
- ✅ Create, update, and delete **Tasks** within projects
- ✅ Manage **Task Status** (`Pending`, `In Progress`, `Completed`)
- ✅ Assign **Priorities** (`Low`, `Medium`, `High`)
- ✅ Retrieve all tasks and projects through REST endpoints


- ✅ Crear, actualizar y eliminar **Proyectos**
- ✅ Crear, actualizar y eliminar tareas en los proyectos
- ✅ Modificar **Estados de la tareas** (`Pending`, `In Progress`, `Completed`)
- ✅ Asignar **Prioridades** (`Low`, `Medium`, `High`)
- ✅ Recuperar todas las tareas y proyectos a través de endpoints REST

---

## 🧱 **Data Model**

### 🗂 `Task`
| Field | Type | Description                                                |
|-------|------|------------------------------------------------------------|
| `id` | `Long` | Task ID                                                    |
| `title` | `String` | Descriptive title                                          |
| `description` | `String` | Task details                                               |
| `status` | `TaskStatus` *(enum)* | Current task state (`PENDING`, `IN_PROGRESS`, `COMPLETED`) |
| `priority` | `TaskPriority` *(enum)* | Priority level (`LOW`, `MEDIUM`, `HIGH`)                   |
| `project` | `Project` *(optional)* | Associated project                                         |

### 📁 `Project`
| Field | Type | Description         |
|-------|------|---------------------|
| `id` | `Long` | Project ID          |
| `name` | `String` | Project name        |
| `description` | `String` | Project description |
| `tasks` | `List<Task>` | Linked tasks        |

### 🔢 Enums
- `TaskStatus`: `PENDING`, `IN_PROGRESS`, `COMPLETED`
- `TaskPriority`: `LOW`, `MEDIUM`, `HIGH`

---

## ⚙️ **Technologies Used**

| Category | Tools / Libraries |
|-----------|-------------------|
| **Backend** | Spring Boot 3.3.4 |
| **Database** | H2 (in-memory)    |
| **ORM** | Spring Data JPA   |
| **Language** | Java 21           |
| **Utilities** | Lombok            |
| **Build Tool** | Gradle            |
| **Testing** | Spring Boot Starter Test + Spock (Groovy-based testing framework)            |

---

## 🚀 **Planned Roadmap**

### **Phase 1 – Core Functionality (Current)**
- [x] Project and environment setup
- [ ] Basic entity creation (Task, Project, Enums)
- [ ] REST controllers and service layer
- [ ] Basic CRUD endpoints for Task & Project
- [ ] Exception handling and validation

### **Phase 2 – Enhancements**
- [ ] Pagination, sorting, and filtering
- [ ] Search by project or priority
- [ ] Relationship improvements (bidirectional mapping)

### **Phase 3 – Advanced Features**
- [ ] User authentication and roles
- [ ] Task deadlines and reminders
- [ ] Email or notification integration
- [ ] Frontend integration

---

## 🧪 **How to Run Locally**

### **Prerequisites**
- Java 21 or higher
- Gradle (or use the Gradle wrapper)

### **Steps**
1. Clone this repository
   ```bash
   git clone https://github.com/alvaromartinboza1994/TaskFlow.git
   
2. Build the project
    ```bash 
   ./gradlew build

3. Run the app
    ```bash 
    ./gradlew bootRun 

4.	Access the API at
      👉 http://localhost:8080

## 🧠 Author & Motivation

This project is developed by Álvaro Martín Boza, as part of a personal roadmap to strengthen backend development skills and prepare for future professional goals in software engineering and data-oriented projects.

Este proyecto está desarrollado por Álvaro Martín Boza, como parte de una hoja de ruta personal para fortalecer mis habilidades como backend y prepararme para objetivos profesionales futuros en la ingeniería del sofware y proyectos data-oriented.