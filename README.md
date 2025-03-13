![Screenshot (137)](https://github.com/user-attachments/assets/8acf67c9-601b-420b-b911-d33f03620573)# ToDo Web App

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

  ![Screenshot (135)](https://github.com/user-attachments/assets/5073c9af-a37c-4939-9128-2191a7b11a86)

1. **View All Tasks**: Display all tasks in a structured list, showing task details like title, date, and status.

  ![Screenshot (144)](https://github.com/user-attachments/assets/e3e63e0a-3b9a-4505-96bb-caee711b15b2)

2. **Add New Task**: Seamlessly add new tasks with relevant details such as title, date, and current status.

  ![Screenshot (136)](https://github.com/user-attachments/assets/b3b20198-299c-4416-9128-6490dd442a04)
  ![Screenshot (137)](https://github.com/user-attachments/assets/d76f32d7-eeef-45f6-b89d-510703635267)
  ![Screenshot (138)](https://github.com/user-attachments/assets/18351318-e053-422f-8fe1-22f1b6f53caa)

3. **Filter Tasks by Category**: Filter tasks based on specific categories (e.g., title, date, or status) to quickly find what you're looking for.

   ![Screenshot (142)](https://github.com/user-attachments/assets/7405bc3c-c837-4228-b2c8-6e1883de55b6)
    ![Screenshot (143)](https://github.com/user-attachments/assets/4637424a-f31d-4ec3-b178-264c38ff470c)


4. **Edit Task**: Update the details of an existing task, including modifying the title, date, or status to reflect any changes.

   ![Screenshot (145)](https://github.com/user-attachments/assets/d072840d-73d0-4d2e-b9e8-afaa49dc62b2)
   ![Screenshot (146)](https://github.com/user-attachments/assets/f783392d-b028-4df5-924e-ea913e70da1b)


6. **Delete Task**: Easily remove tasks from the list that are no longer needed or completed.

   ![Screenshot (148)](https://github.com/user-attachments/assets/b4620608-5586-4bf4-a6d5-8206e0a783d5)

7. **Mark Task as Completed**: Update the status of tasks to 'Completed' once finished, keeping your list organized and up-to-date.


## Contributing

If you'd like to contribute to this project, feel free to fork it and submit a pull request. Contributions are always welcome!

1. Fork the repository
2. Create your feature branch (`git checkout -b feature-name`)
3. Commit your changes (`git commit -am 'Add feature'`)
4. Push to the branch (`git push origin feature-name`)
5. Open a pull request

