package com.practice.service;
import com.practice.Dao.CourseDao;
import com.practice.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService
{
    @Autowired
    private CourseDao courseDao;
//    List<Course>list;
    public CourseServiceImpl(){
//        list=new ArrayList<>();
//        list.add(new Course(1,"Java","Java is famous language in technologes;"));
//        list.add(new Course(2,"C++","C++ is famous language in technologes;"));
        System.out.println("This Is my project");
        System.out.println(" this is second commit");
        System.out.println("This is third Commit");
    }
    @Override
    public List<Course> getAllCourse() {
//   return list;
        return courseDao.findAll();
    }

    @Override
    public Optional<Course> getCourse(long courseId) {

//      Course c=null;
//        for (Course course:list)
//        {
//           if(course.getId()==courseId){
//               c=course;
//               break;
//           }
//        }
     //   return c;
        return courseDao.findById(courseId);
    }
    @Override
    public Course addCourse(Course course) {
//       list.add(course);
//        return course;
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course)
    {
//        list.forEach(e->{
//            if(e.getId()==course.getId()){
//                e.setId(course.getId());
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });
//        return course;
        courseDao.save(course);
        return course;
    }
    @Override
    public void deleteCourse(long parseLong)
    {
//        list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
        Course entity=courseDao.getReferenceById(parseLong);
             courseDao.delete(entity);
    }
}
