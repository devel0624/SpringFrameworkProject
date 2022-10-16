package com.nhnacademy.edu.springframework.project.repository;

import com.nhnacademy.edu.springframework.project.service.Student;

import java.io.File;
import java.util.Collection;




public class CsvStudents implements Students {


    /** TODO 3 :
     * Java Singleton 패턴으로 getInstance() 를 구현하세요.
     **/
    private static CsvStudents csvStudents;
    public static Students getInstance() {
        if(csvStudents == null){
            csvStudents = new CsvStudents();
        }
        return csvStudents;
    }

    // TODO 7 : student.csv 파일에서 데이터를 읽어 클래스 멤버 변수에 추가하는 로직을 구현하세요.
    // 데이터를 적재하고 읽기 위해서, 적절한 자료구조를 사용하세요.
    File csvFile;
    String filePath = "./src/main/resources/data/student.csv";
    @Override
    public void load() {
        csvFile = new File(filePath);
    }

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    /**
     * TODO 8 : students 데이터에 score 정보를 추가하세요.
     * @param scores
     */
    @Override
    public void merge(Collection<Score> scores) {

        csvStudents.findAll().
                forEach(student -> ());
    }
}
