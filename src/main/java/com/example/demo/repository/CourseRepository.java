package com.example.demo.repository;

import com.example.demo.modal.Course;
import com.example.demo.modal.Instructor;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CourseRepository {
    List<Course> courses = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    // constructor
    public CourseRepository() {
        Course javaOne = Course.builder()
                .className("Java I")
                .instructor(new Instructor("Steve", "Jobs", "Phd", "TownHall201"))
                .startDate(new Date("8/1/2018"))
                .endDate(new Date("12/24/2018"))
                .timeFrame("8am-10am")
                .build();
        Course two= Course.builder()
                .className("Java II")
                .instructor(new Instructor("Edward", "Wang", "Phd", "TownHall201"))
                .startDate(new Date("8/1/2018"))
                .endDate(new Date("12/24/2018"))
                .timeFrame("8am-10am")
                .build();
        courses.add(javaOne);
        list.add(1);
        list.add(1);
        for (int i = 2; i < 7; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }
    }


    public List<Course> findAllClasses(){
        //链接数据库
        //返回数据库的信息
        return  courses;
    }

    public List<Course> findAllCourse(String searchByCourseName){

        return new ArrayList<Course>();
    }

    public List<Course> findCourseByName(String courseName) {
        if(courseName.equals("Java_I")) {
            return courses;
        }

        return new ArrayList<Course>();
    }
    public List<Integer> twoSum(Integer target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(target - list.get(i))) {
                result.add(map.get(target - list.get(i)));
                result.add(i);
                return result;
            } else {
                map.put(list.get(i), i);
            }
        }
        return result;
    }
    public List<Integer> showList(){
        //链接数据库
        //返回数据库的信息
        return  list;
    }
}
