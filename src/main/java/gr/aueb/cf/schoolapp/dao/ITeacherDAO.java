package gr.aueb.cf.schoolapp.dao;

import gr.aueb.cf.schoolapp.dao.exception.TeachersDaoException;
import gr.aueb.cf.schoolapp.model.Teacher;

import java.util.List;

public interface ITeacherDAO {

    Teacher insert(Teacher teacher) throws TeachersDaoException;
    Teacher update(Teacher teacher) throws TeachersDaoException;
    void delete(Integer id) throws TeachersDaoException;
    Teacher getById(Integer id) throws TeachersDaoException;
    List<Teacher> getByLastname(String lastname) throws TeachersDaoException;
}
