package com.ami.tech.Springboot.error;

public class DepartmentNotFoundException extends Exception {

public DepartmentNotFoundException(){
    super();
}
public DepartmentNotFoundException(String message)
{
    super(message);
}
public DepartmentNotFoundException(String message, Throwable cause)
{
    super(message, cause);
}

}
