package com.nhnacademy.edu.springframework.project.repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CsvScores implements Scores {

    private CsvScores(){}

    /** TODO 2 :
     * Java Singleton 패턴으로 getInstance() 를 구현하세요.
     **/
    private static CsvScores csvScores = null;
    public static Scores getInstance() {
        if(csvScores == null){
            csvScores = new CsvScores();
        }
        return csvScores;
    }

    // TODO 5 : score.csv 파일에서 데이터를 읽어 멤버 변수에 추가하는 로직을 구현하세요.
    File csvFile;
    String filePath = "./src/main/resources/data/score.csv";
    @Override
    public void load() {
        csvFile = new File(filePath);
    }

    @Override
    public List<Score> findAll() {
        return null;
    }
}
