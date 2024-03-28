package gr.aueb.cf.schoolapp.dao;

import gr.aueb.cf.schoolapp.dao.exception.TeachersDaoException;
import gr.aueb.cf.schoolapp.model.Teacher;

import java.util.List;

public class TeacherDAOImpl implements ITeacherDAO{
    @Override
    public Teacher insert(Teacher teacher) throws TeachersDaoException {
        return null;
    }

    @Override
    public Teacher update(Teacher teacher) throws TeachersDaoException {
        return null;
    }

    @Override
    public void delete(Integer id) throws TeachersDaoException {

    }

    @Override
    public Teacher getById(Integer id) throws TeachersDaoException {
        return null;
    }

    @Override
    public List<Teacher> getByLastname(String lastname) throws TeachersDaoException {
        return null;
    }
}
