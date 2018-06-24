CREATE database projects

BEGIN TRANSACTION;


DROP TABLE department;
DROP TABLE job_title;
DROP TABLE employee;
DROP TABLE project;

CREATE TABLE department (
        id serial NOT NULL,
        name varchar(255) NOT NULL UNIQUE,
        CONSTRAINT pk_id PRIMARY KEY (id)   
    );  
    
 
 CREATE TABLE job_title (
        id serial,
        title varchar(255) NOT NULL UNIQUE,
        CONSTRAINT pk_job_title_id PRIMARY KEY (id)       
);

CREATE TABLE employee (
        id serial,
        first_name varchar(255) NOT NULL,
        last_name varchar(255) NOT NULL,
        gender char(1),
        birthday date,
        hireday date NOT NULL,
        department_id integer NOT NULL,
        job_title_id integer NOT NULL,
        CONSTRAINT pk_employee_id PRIMARY KEY (id),
        CONSTRAINT fk_job_title_id FOREIGN KEY (job_title_id) REFERENCES job_title(id),
        CONSTRAINT fk_department_id FOREIGN KEY (department_id) REFERENCES department(id)
);

  
CREATE TABLE project (
        id serial,
        name varchar(255) NOT NULL UNIQUE,
        employee_id integer NOT NULL,
        hireday date NOT NULL,
        CONSTRAINT pk_project_id PRIMARY KEY (id),
        CONSTRAINT fk_employee_id FOREIGN KEY (employee_id) REFERENCES employee(id)
);

INSERT INTO department(name) VALUES ('Command');
INSERT INTO department(name) VALUES ('Security');
INSERT INTO department(name) VALUES ('Engineering');
INSERT INTO department(name) VALUES ('Medical');
INSERT INTO department(name) VALUES ('MISC');


INSERT INTO job_title(title) VALUES ('Captain');
INSERT INTO job_title(title) VALUES ('Security Chief');
INSERT INTO job_title(title) VALUES ('Chief Engineer');
INSERT INTO job_title(title) VALUES ('1st Officer');
INSERT INTO job_title(title) VALUES ('2nd Officer');
INSERT INTO job_title(title) VALUES ('Conselor');
INSERT INTO job_title(title) VALUES ('Bartender');
INSERT INTO job_title(title) VALUES ('Chief Medical Officer');
  
INSERT INTO employee(first_name, last_name, hireday, department_id, job_title_id)
VALUES ('Jean-Luc', 'Picard', '2323-01-27', 1, 1);

INSERT INTO employee(first_name, last_name, hireday, department_id, job_title_id)
VALUES ('Worf', 'Son of Mogh', '2334-06-17', 2, 2);

INSERT INTO employee(first_name, last_name, hireday, department_id, job_title_id)
VALUES ('Geordi', 'LaForge', '2337-07-05', 3, 3);

INSERT INTO employee(first_name, last_name, hireday, department_id, job_title_id)
VALUES ('William', 'Riker', '2332-11-14', 1, 4);

INSERT INTO employee(first_name, last_name, hireday, department_id, job_title_id)
VALUES ('Mr.', 'Data', '2325-01-01', 1, 5);

INSERT INTO employee(first_name, last_name, hireday, department_id, job_title_id)
VALUES ('Deanna', 'Troi', '2335-09-18', 5, 6);

INSERT INTO employee(first_name, last_name, hireday, department_id, job_title_id)
VALUES ('Beverly', 'Crusher', '2327-11-29', 4, 8);

INSERT INTO employee(first_name, last_name, hireday, department_id, job_title_id)
VALUES ('Ms.', 'Guinan', '2200-01-03', 5, 7);

 
INSERT INTO project(name, employee_id, hireday)
VALUES ('Defeat The Borg', '1', '2323-01-27');
  
INSERT INTO project(name, employee_id, hireday)
VALUES ('Fix The Ship', '3', '2323-01-27');
  
INSERT INTO project(name, employee_id, hireday)
VALUES ('Give Bad Advice', '2', '2323-01-27');



select * from department
select * from job_title
select * from employee
select * from project


 COMMIT;
 ROLLBACK;