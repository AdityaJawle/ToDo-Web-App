# ToDo Web App

A simple, yet professional, ToDo application for software developers. This application helps you manage your daily tasks, from coding tasks to project management activities. The app allows you to add, edit, mark tasks as completed, and search through them based on different categories like title, status, and date.

## Features

- **Task Management**: Create, update, and delete tasks.
- **Task Categories**: Filter tasks by category (Title, Date, Status).
- **Task Search**: Search tasks by title, status, or date.
- **Mark as Completed**: Mark tasks as completed to track your progress.
- **User-Friendly Interface**: Built using Thymeleaf and Bootstrap for a responsive design.
  
## Technologies Used

- **Backend**: 
  - Java (Spring Boot)
  - Spring Data JPA (for database interactions)
  - MySQL Database (database for simplicity)
  
- **Frontend**:
  - Thymeleaf (Template Engine)
  - Bootstrap (for styling)
  
- **Build Tool**:
  - Maven

## Installation

Follow these steps to set up the project locally:

1. Clone the repository:
    ```bash
    git clone https://github.com/AdityaJawle/ToDo-Web-App.git
    ```

2. Navigate to the project directory:
    ```bash
    cd ToDo-Web-App
    cd todo
    ```

3. Build and run the application using Maven:
    ```bash
    i. Windows
        mvn spring-boot:run
    ii. Linux
        ./mvn spring-boot:run
    ```

4. Open your browser and visit:
    ```url
    http://localhost:8080
    ```

## Features Walkthrough

- **Home Page**: Displays all tasks in a table. You can see the task ID, title, date, status, and options to mark the task as completed, edit, or delete it.
- **Task Search**: The search bar allows you to filter tasks by category (Title, Status, or Date). This helps you to quickly find specific tasks.
- **Add Task**: You can add a new task by clicking on the "Add Todo" button. You can specify the title, date, and status of the task.

## Screenshots

# To-Do Management Application

This To-Do Management Application provides an efficient and user-friendly way to manage your tasks with the following core features:

  ![Screenshot (135)](https://github.com/user-attachments/assets/d7891521-1061-470f-a723-6af1070f8f74)

1. **View All Tasks**: Display all tasks in a structured list, showing task details like title, date, and status.

  ![Screenshot (144)](https://github.com/user-attachments/assets/4ca3f6b6-cfad-4dc7-b150-9552ba17bb2c)

2. **Add New Task**: Seamlessly add new tasks with relevant details such as title, date, and current status.

  ![Screenshot (138)](https://github.com/user-attachments/assets/e3489781-55c2-4d4d-bc1a-187c5f04ebdf)
  ![Screenshot (137)](https://github.com/user-attachments/assets/a918f611-4fff-46af-9582-e0ccdaf3e289)
  ![Screenshot (136)](https://github.com/user-attachments/assets/76f89c51-1ce1-4642-84f6-38ed1be30064)

3. **Filter Tasks by Category**: Filter tasks based on specific categories (e.g., title, date, or status) to quickly find what you're looking for.

   ![Screenshot (142)](https://github.com/user-attachments/assets/5b99ca8b-b7d7-40a0-9693-9d5fb625acf9)
   ![Screenshot (143)](https://github.com/user-attachments/assets/349a5b44-9bb9-4542-bcd7-a48e614d3664)

4. **Edit Task**: Update the details of an existing task, including modifying the title, date, or status to reflect any changes.

   ![Screenshot (145)](https://github.com/user-attachments/assets/979fc243-2c97-4c7f-8923-74cb13fdd83a)
   ![Screenshot (146)](https://github.com/user-attachments/assets/936f41da-9ec1-4e5d-9455-7e42678ade55)

6. **Delete Task**: Easily remove tasks from the list that are no longer needed or completed.

   ![Screenshot (148)](https://github.com/user-attachments/assets/4214f15d-90c8-4254-b713-e320c540bf05)

7. **Mark Task as Completed**: Update the status of tasks to 'Completed' once finished, keeping your list organized and up-to-date.


## Contributing

If you'd like to contribute to this project, feel free to fork it and submit a pull request. Contributions are always welcome!

1. Fork the repository
2. Create your feature branch (`git checkout -b feature-name`)
3. Commit your changes (`git commit -am 'Add feature'`)
4. Push to the branch (`git push origin feature-name`)
5. Open a pull request

