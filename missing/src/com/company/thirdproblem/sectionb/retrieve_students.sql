SELECT  institution_name, course_name, COUNT(students) AS NUMBER_OF_STUDENTS FROM
    (SELECT  institution.institution_name AS INSTITUTION_NAME, course.course_name AS COURSE_NAME, student.student_id AS students
        FROM course
        JOIN institution ON course.institution = institution.institution_id
        JOIN student ON course.course_id = student.course
        ) as custom
GROUP BY course_name;