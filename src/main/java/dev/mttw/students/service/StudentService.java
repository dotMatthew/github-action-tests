package dev.mttw.students.service;

import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
public class StudentService {

    public int addition(String numberOne, String numberTwo) {
        int nOneInt = Integer.parseInt(numberOne);
        int nTwoInt = Integer.parseInt(numberTwo);

        return nOneInt + nTwoInt;
    }
}
