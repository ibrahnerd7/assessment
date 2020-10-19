CREATE database IF NOT EXISTS education;

CREATE TABLE institution (
                             institution_id INT(11) NOT NULL AUTO_INCREMENT,
                             institution_name VARCHAR(250),
                             PRIMARY KEY(institution_id)
);

CREATE TABLE course(
                       course_id INT(11) NOT NULL AUTO_INCREMENT,
                       course_name VARCHAR(250),
                       institution INT(11),
                       PRIMARY KEY(course_id),
                       FOREIGN KEY(institution) REFERENCES institution(institution_id)
);

CREATE TABLE student(
                        student_id INT(11) NOT NULL AUTO_INCREMENT,
                        student_name VARCHAR(250),
                        course INT(11),
                        PRIMARY KEY(student_id),
                        FOREIGN KEY(course) REFERENCES course(course_id)
);

