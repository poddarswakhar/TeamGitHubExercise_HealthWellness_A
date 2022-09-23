# TeamGitHubExercise_HealthWellness_A
This repo is the repo for team GitHub exercise - Health/Wellness - GroupA  
## Running the Program
To run this program please go to src/main file and run the program.
- Enter a password to validate the password
- If the password meets all the requirements it will inform the user as 
a "Valid Password", if not will inform the user "Invalid Password"
- The requirements of valid password are: 
Password must be at least 8 character long and should contain at least one uppercase, one number, and one special case [!@#$%&*()_+=|<>?{}\[\]~-]
## Method - authenticateLength():
- Takes in one parameter, a string for the password.
- The method checks that the length of the string meets the minimum requirement 8 characters and returns a boolean value depending on whether it passed the check.
## Method - specialCharacters():
- Takes in one parameter, a string for the password.
- The method checks that the string contains one of the following special characters [!@#$%&*()_+=|<>?{}\[\]~-] and returns true if at least one is found.
## Method - oneUpperCase():
- Takes in one parameter, a string for the password.
- The method checks if the password contains at least one upper case alphabet
## Method - hasNum():
- Takes in one parameter, a string for the password
- Checks each character of the string to see if it is a number, if it is then the method returns true if at least 1 is found
