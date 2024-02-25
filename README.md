E-commerce Wishlist Management 

users to create and manage their product wishlists. Your task is to design and
implement the backend functionality for wishlist management.

*******************
- Requirements:
User Authentication:
- ● Implement user authentication using Spring Security.
- ● Allow users to sign up and log in to the system securely.
Wishlist Management:
  - Design and implement RESTful API endpoints for wishlist management:
  - /api/wishlists: GET endpoint to retrieve a user's wishlist.
  - /api/wishlists: POST endpoint to create a new wishlist item.
  - /api/wishlists/{id}: DELETE endpoint to remove a wishlist item by ID.
  - Ensure that only authenticated users can access and manage their wishlists.
- Database Integration:
    - Integrate the application with a relational database using Spring DataJPA.
    - Design the database schema to store user information and wishlist items.
    - Implement repository interfaces for CRUD operations on wishlist entities.

- Unit Testing:

    - Write unit tests to validate the functionality of wishlist-related components, including controllers, services, and repositories.
    - Aim for adequate test coverage to ensure the reliability of the application.
- Documentation:
    - Provide clear documentation on how to set up and run the application locally.
    - Include instructions for running the unit tests and any additional considerations for deployment.
