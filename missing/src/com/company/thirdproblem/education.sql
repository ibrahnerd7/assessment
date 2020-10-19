CREATE database education;

CREATE TABLE institution (
institutionid INT(11) NOT NULL AUTO_INCREMENT,
name VARCHAR(250),
PRIMARY KEY(institutionid)
);

CREATE TABLE course(
courseid INT(11) NOT NULL AUTO_INCREMENT,
name VARCHAR(250),
institution INT(11),
PRIMARY KEY(courseid),
FOREIGN KEY(institutionid) REFERENCES institution(institutionid)
);

CREATE TABLE student(
studentid INT(11) NOT NULL AUTO_INCREMENT,
name VARCHAR(250),
courseid INT(11),
PRIMARY KEY(studentid),
FOREIGN KEY(courseid) REFERENCES course(courseid)
);

