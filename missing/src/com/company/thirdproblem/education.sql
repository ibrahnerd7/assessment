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

