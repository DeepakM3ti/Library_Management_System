package com.library;

class DuplicateBookException extends Exception {

    public DuplicateBookException(String message) {
        super(message);
    }
}

class DuplicateStudentException extends Exception {

    public DuplicateStudentException(String message) {
        super(message);
    }
}

class BookNotFoundException extends Exception {

    public BookNotFoundException(String message) {
        super(message);
    }
}

class StudentNotFoundException extends Exception {

    public StudentNotFoundException(String message) {
        super(message);
    }
}

class OutOfStockException extends Exception {

    public OutOfStockException(String message) {
        super(message);
    }
}

class BookLimitExceededException extends Exception {

    public BookLimitExceededException(String message) {
        super(message);
    }
}

class InvalidUSNException extends Exception {

    public InvalidUSNException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {

    public InvalidPasswordException(String message) {
        super(message);
    }
}